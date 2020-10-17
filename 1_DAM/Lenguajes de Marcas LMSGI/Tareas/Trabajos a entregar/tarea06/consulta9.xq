(:A partir del fichero impresoras.xml, escribe consultas XQuery que devuelvan
9. Marca y modelo de las impresoras con tamaño A3 como único tamaño.:)

for $mmi in doc("impresoras.xml")/impresoras/impresora
where $mmi/tamaño="A3"
return  <ul> {$mmi/marca, $mmi/modelo}</ul>