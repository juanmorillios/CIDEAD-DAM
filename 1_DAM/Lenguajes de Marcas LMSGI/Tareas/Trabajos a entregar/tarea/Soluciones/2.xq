(:El títullo (sin etiquetas) de todos los libros de menos de 100 páginas.
Para hacer comparaciones con números, lo mejor es convertir los datos con la función number para evitar problemas de tipo de dato o que los compare como cadenas.:)

for $x in doc("libros.xml")/biblioteca/libros/libro
where number($x/paginas) < 100
return data($x/titulo)