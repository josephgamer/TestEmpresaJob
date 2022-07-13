
create table automovil(
    codigo varchar(30) NOT NULL PRIMARY KEY,
    color varchar(30),
    puertas INT,
    annio INT,
    modelo varchar(30),
    marca varchar(30),
    tipo varchar(30),
    tecnologia varchar(30)
);


insert into automovil values('123','Amarillo',4,2018,'Hilux','Toyota',
                            'Combustible','Automovil');
select * from automovil;