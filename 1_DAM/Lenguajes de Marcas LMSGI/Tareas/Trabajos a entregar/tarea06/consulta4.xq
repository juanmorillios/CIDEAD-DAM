(:A partir del fichero artistas.xml, escribe consultas XQuery que devuelvan:
Una lista HTML con el nombre de los artistas nacidos en España.:)

for $n in doc("artistas.xml")/artistas/artista
where ($n/pais = "España")
return <nacidoEnEspaña>{$n/nombreCompleto}</nacidoEnEspaña> 