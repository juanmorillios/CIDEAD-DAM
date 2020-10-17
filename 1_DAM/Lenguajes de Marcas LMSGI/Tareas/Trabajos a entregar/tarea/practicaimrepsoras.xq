
for $peso in doc("impresoras.xml")//impresora/peso
where $peso >3.5
return $peso