Algoritmo CalcualadoraSimple
	Escribir "Intro operando1:"
	Leer operando1
	Escribir "Intro operando2:"
	Leer operando2
	
	Repetir
		Escribir "Intro operandor (+, -, *, /):"
		Leer operador
	Hasta Que (operador=='+' || operador=='-' ||operador=='*' ||operador=='/' )
	
	resultado<-0
	Segun operador Hacer
		'+':
			resultado<-operando1+operando2
		'-':
			resultado<-operando1-operando2
		'*':
			resultado<-operando1*operando2
		De Otro Modo:
			resultado<-operando1/operando2
	Fin Segun
	
	Escribir "Resultado: ", resultado
FinAlgoritmo
