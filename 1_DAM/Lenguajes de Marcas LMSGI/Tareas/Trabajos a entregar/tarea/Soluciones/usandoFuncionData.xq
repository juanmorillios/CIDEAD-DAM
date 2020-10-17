(:Ejemplousando la función Data() ->Esta consulta devuelve todos los títulos, incluyendo las etiquetas:)

for $x in doc("libros.xml")/biblioteca/libros/libro/titulo
return data($x)