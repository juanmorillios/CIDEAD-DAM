(:Buscar Título y editorial de todos los libros:)
for $x in doc("libros.xml")/biblioteca/libros/libro
return <libro>{$x/titulo,$x/editorial}</libro>