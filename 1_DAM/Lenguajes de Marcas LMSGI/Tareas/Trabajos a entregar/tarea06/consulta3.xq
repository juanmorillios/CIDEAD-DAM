(:A partir del fichero artistas.xml, escribe consultas XQuery que devuelvan:
Nombre de los artistas para los que no hay año de fallecimiento.:)

for $na in doc("artistas.xml")/artistas/artista
  where not(number($na/fallecimiento)) 
 return $na/nombreCompleto