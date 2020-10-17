(:A partir del fichero artistas.xml, escribe consultas XQuery que devuelvan:
2. El nombre (sin etiquetas) de los artistas que nacieron antes de 1500.:)

for $ns in doc("artistas.xml")/artistas/artista
  where  number($ns/nacimiento) < 1500
  return data($ns/nombreCompleto)