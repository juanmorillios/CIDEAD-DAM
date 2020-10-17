(:A partir del fichero impresoras.xml, escribe consultas XQuery que devuelvan
10. Modelo de las impresoras en red.:)

for $x in db:open("tarea06")/impresoras/impresora
where $x/enred
return  ($x/modelo)