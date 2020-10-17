(:El número de  libros de menos de 100 páginas.
Utilizamos la función count():)

for $x in doc("libros.xml")/biblioteca/libros
let $y := $x/libro[number(paginas) < 100]
return count($y)