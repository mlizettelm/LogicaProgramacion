from PIL import Image, ImageOps

def crear_icono(ruta_entrada, ruta_salida, tamano_icono=64):
    """
    Crea un ícono cuadrado y centrado a partir de una imagen,
    redimensionándola proporcionalmente sin recortarla.
    
    :param ruta_entrada: Ruta de la imagen JPG original.
    :param ruta_salida: Ruta donde se guardará el ícono (se recomienda PNG).
    :param tamano_icono: El tamaño en píxeles (ej. 64 para 64x64).
    """
    try:
        # 1. Abrir la imagen
        with Image.open(ruta_entrada) as img:
            # 2. Convertir a RGBA si es necesario (para soportar transparencia en el fondo si la imagen no es cuadrada)
            if img.mode not in ('L', 'RGB', 'RGBA'):
                img = img.convert('RGBA')
            
            # 3. Redimensionar proporcionalmente para que quepa dentro del tamaño deseado
            # ImageOps.fit hace esto automáticamente, centrando el resultado y rellenando si es necesario,
            # pero para asegurar que NADA se corte, usamos thumbnail primero.
            
            # Creamos una copia para trabajar con ella
            img_copia = img.copy()
            
            # Redimensionamos proporcionalmente el lado más largo al tamaño del ícono
            img_copia.thumbnail((tamano_icono, tamano_icono), Image.Resampling.LANCZOS)
            
            # 4. Crear una nueva imagen cuadrada vacía (transparente) del tamaño deseado
            icono_final = Image.new('RGBA', (tamano_icono, tamano_icono), (255, 255, 255, 0)) # Fondo transparente
            
            # 5. Calcular la posición para centrar la imagen redimensionada dentro del cuadrado
            offset_x = (tamano_icono - img_copia.width) // 2
            offset_y = (tamano_icono - img_copia.height) // 2
            
            # 6. Pegar la imagen redimensionada en el centro del ícono final
            icono_final.paste(img_copia, (offset_x, offset_y), img_copia if img_copia.mode == 'RGBA' else None)
            
            # 7. Guardar el resultado como PNG (formato ideal para íconos con transparencia)
            icono_final.save(ruta_salida, "PNG")
            print(f"¡Ícono generado con éxito en: {ruta_salida} (Tamaño: {tamano_icono}x{tamano_icono})!")
            
    except IOError:
        print(f"Error: No se pudo abrir la imagen en '{ruta_entrada}'.")
    except Exception as e:
        print(f"Ocurrió un error inesperado: {e}")

# Ejemplo de uso:
# Crea un ícono de 64x64 píxeles a partir de tu foto original
crear_icono("img/hogar.jpg", "img/hogar.png", tamano_icono=64)