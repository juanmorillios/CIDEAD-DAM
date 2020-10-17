(:A partir del fichero artistas.xml, escribe consultas XQuery que devuelvan:
1. Nombre y país de todos los artistas.:)

for $np in doc("artistas.xml")/artistas/artista
  return  ($np/nombreCompleto, $np/pais)
  
  