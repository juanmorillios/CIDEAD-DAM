(:A partir del fichero impresoras.xml, escribe consultas XQuery que devuelvan:
6. Modelo de las impresoras de tiop “láser”.:)

for $mi in doc("impresoras.xml")/impresoras/impresora
where  $mi[@tipo ="láser"] 
return ($mi/modelo)