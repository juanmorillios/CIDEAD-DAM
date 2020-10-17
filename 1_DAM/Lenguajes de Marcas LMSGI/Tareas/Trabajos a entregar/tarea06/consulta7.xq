(:A partir del fichero impresoras.xml, escribe consultas XQuery que devuelvan:
7. Marca y modelo de las impresoras con más de un tamaño .:)

for $mm in doc("impresoras.xml")/impresoras/impresora
where count($mm/tamaño)>1
return ($mm/marca, $mm/modelo)