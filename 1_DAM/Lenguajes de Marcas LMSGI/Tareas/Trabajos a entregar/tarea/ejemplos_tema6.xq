(: Título y editorial de todos los libros :)
for $x in doc("libros.xml")/biblioteca/libros/libro
return <libro>{$x/titulo, $x/editorial}</libro>,

(:El títullo (sin etiquetas) de todos los libros de menos de 100 páginas. :)
for $x in doc("libros.xml")/biblioteca/libros/libro
where number($x/paginas) < 100
return data($x/titulo),

(:El número de  libros de menos de 100 páginas. :)
for $x in doc("libros.xml")/biblioteca/libros
let $y := $x/libro[number(paginas) < 100]
return count($y),

(:Una lista HTML con el título de los libros de la editorial “O'Reilly” ordenados por título. :)
<ul>
{
for $x in doc("libros.xml")/biblioteca/libros/libro
where $x/editorial = "O'Reilly"
order by $x/titulo
return <li>{data($x/titulo)}</li>
}
</ul>,

(:Título y editorial de los libros de 2002 :)
for $x in doc("libros.xml")/biblioteca/libros/libro
where $x[@publicacion="2002"]
return <libro>{$x/titulo, $x/editorial}</libro>,

(:Título y editorial de los libros con más de un autor. :)
for $x in doc("libros.xml")/biblioteca/libros/libro
where count($x/autor)>1
return <libro>{$x/titulo, $x/editorial}</libro>,

(:Título y editorial de los libros que tienen versión electrónica. :)
for $x in doc("libros.xml")/biblioteca/libros/libro
where $x/versionElectronica
return <libro>{$x/titulo, $x/editorial}</libro>,

(: Título de los libros que no tienen versión electrónica. :)
for $x in doc("libros.xml")/biblioteca/libros/libro
where not($x/versionElectronica)
return$x/titulo







