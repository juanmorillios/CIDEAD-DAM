create table Empleados (
	codigo		number(5,0),
	nombre		varchar2(30) not null,
	hijos		number(2,0) not null,
	retencion	number(2,0) not null,
	cuenta		char(20) not null unique,
	fnac date,
	primary key (codigo));
create table Departamentos (
	codigo		number(5,0),
	nombre		varchar2(20) not null unique,
	primary key (codigo));
create table Trabajan (
	cod_emp		number(5,0),
	cod_dep		number(5,0),
	funcion		varchar2(30) not null,
	primary key (cod_emp, cod_dep),
	foreign key (cod_emp) references Empleados(codigo),
	foreign key (cod_dep) references Departamentos(codigo));
create table Just_nominas (
	mes		number(2,0),
	ejercicio	number(4,0),
	ingreso		number(8,0) not null,
	descuento	number(8,0) not null,
	cod_emp		number(5,0),
	primary key (mes, ejercicio, cod_emp),
	foreign key (cod_emp) references Empleados(codigo));
create table Lineas (
	numero		number(5,0),
	cantidad	number(8,0) not null,
	base		number(8,0),
	porcentaje	number(2,0),
	mes		number(2,0),
	ejercicio	number(4,0),
	cod_emp		number(5,0),
	primary key (numero, mes, ejercicio, cod_emp),
	foreign key (mes, ejercicio, cod_emp) references Just_nominas(mes, ejercicio, cod_emp));
