(:A partir del fichero impresoras.xml, escribe consultas XQuery que devuelvan
8. Marca y modelo de las impresoras con tamaño A3 (pueden tener otros).:)

for $mmi in doc("impresoras.xml")/impresoras/impresora
where $mmi/tamaño="A3" or  $mmi/tamaño=""
return  ($mmi/marca, $mmi/modelo)
