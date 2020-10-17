(:A partir del fichero artistas.xml, escribe consultas XQuery que devuelvan:
El número de artistas nacidos antes de 1600.:)

for $na in doc("artistas.xml")/artistas
  let $resultado := $na/artista[number(nacimiento) < 1600]
 
  return 
       <nacidoAntes>El total Artistas nacido antes de 1600 es: {count($resultado)}
       </nacidoAntes> 

