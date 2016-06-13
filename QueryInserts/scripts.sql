CREATE TABLE movimiento (id INT NOT NULL AUTO_INCREMENT, nombre VARCHAR(15) NOT NULL, base_power INT NOT NULL, acurracy INT NOT NULL, PRIMARY KEY (id));
--Pikachu
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Thunder', 110, 70);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Slam', 80, 75);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Thunder Shock', 40, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Quick Attack', 40, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Thunderbolt', 90, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Discharge', 80, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Spark', 80, 75);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Feint', 30, 100);



--Bulbasour

INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Vine Whip', 45, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Take Down', 90, 85);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Razor Leaf', 55, 95);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Double-Edge', 120, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Seed Bomb', 80, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Poison Powder', 0, 75);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Leech Seed', 0, 90);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Tackle', 50, 100);

--Charmander

INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Scratch', 40, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Ember', 40, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Smokeescreen', 0, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Dragon Rage', 0, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Fire Fang', 65, 95);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Inferno', 100, 50);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Flamethrower', 90, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Flame Burst', 70, 100);



--Squirtle 25

INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Water Gun', 40, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Bubble', 40, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Bite', 60, 100);	
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Rapid Spin', 20, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Water Pulse', 60, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Aqua Tail', 90, 90);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Hydro Pump', 110, 80);
	

--Pidgey
	
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Gust', 40, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Twister', 40, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Wing Attack', 60, 100);	
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Air Slash', 75, 95);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Hurricane', 110, 70);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Mirrow Move', 0, 32);
	
	
--Rattata 38
	

INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Pursuit', 40, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Hyper Fang', 80, 90);	
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Sucker Puch', 80, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Crunch', 80, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Assuraance', 60, 100);
	

/***--butterfree
	

INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Pursuit', 43, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Hyper Fang', 80, 90);	
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Sucker Puch', 80, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Crunch', 80, 100);
INSERT INTO pokemondb.movimiento (nombre, base_power, accuracy) 
	VALUES ('Assuraance', 60, 100);

	
	/***/
--Tipos de movimientos
INSERT INTO pokemondb.type (nombre) 
	VALUES ('Electric');
INSERT INTO pokemondb.type (nombre) 
	VALUES ('Special');
INSERT INTO pokemondb.type (nombre) 
	VALUES ('Normal');
INSERT INTO pokemondb.type (nombre) 
	VALUES ('Grass');
INSERT INTO pokemondb.type (nombre) 
	VALUES ('Physical');
INSERT INTO pokemondb.type (nombre) 
	VALUES ('Poison');
INSERT INTO pokemondb.type (nombre) 
	VALUES ('Status');
INSERT INTO pokemondb.type (nombre) 
	VALUES ('Fire');
INSERT INTO pokemondb.type (nombre) 
	VALUES ('Dragon');
INSERT INTO pokemondb.type (nombre) 
	VALUES ('Water');
INSERT INTO pokemondb.type (nombre) 
	VALUES ('Dark');
INSERT INTO pokemondb.type (nombre) 
	VALUES ('Steel');
INSERT INTO pokemondb.type (nombre) 
	VALUES ('Flying');
--INSERT INTO pokemondb.type (nombre) 
	--VALUES ('Dragon');

--Relación Tipo x Movimiento

--Pikachu
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (1,1);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,1);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,2);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,2);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (1,3);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,3);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,4);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,4);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (1,5);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,5);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (1,6);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,6);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (1,7);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,7);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,8);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,8);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,8);


--Bulbasour

INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (4,9);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,9);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,10);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,10);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (4,11);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,11);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,12);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,12);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (4,13);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,13);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (6,14);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (7,14);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (4,15);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (7,15);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,16);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,16);

--Charmander

INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,17);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,17);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (8,18);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,18);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,19);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,19);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (9,20);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,20);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (8,21);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,21);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (8,22);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,22);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (8,23);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,23);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (8,24);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,24);


--squirtle


INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,25);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,25);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,26);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,26);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (11,27);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,27);	
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,28);	
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,28);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,29);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,29);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,30);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,30);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,31);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,31);	
	
	
	

--Pidgey


INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (9,32);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,32);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,33);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,33);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (9,34);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,34);	
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,35);	
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (13,35);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (13,36);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,36);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (13,37);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (6,37);

	
	
	
	
--Rattata



INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (11,38);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,38);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,39);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,39);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (11,40);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,40);	
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (11,41);	
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,41);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (11,42);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,42);


	
	/***

--Butterfree


INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,25);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,25);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,26);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,26);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (11,27);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,27);	
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,28);	
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,28);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,29);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,29);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,30);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,30);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,31);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,31);
	
	
	
	
--Raichu



INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,25);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,25);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,26);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,26);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (11,27);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,27);	
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,28);	
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,28);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,29);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,29);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,30);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,30);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,31);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,31);

	
--Machamp


INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,25);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,25);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,26);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,26);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (11,27);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,27);	
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,28);	
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,28);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,29);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,29);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,30);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,30);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,31);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,31);
	
	
	
	
--Poliwarg



INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,25);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,25);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,26);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,26);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (11,27);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,27);	
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (3,28);	
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,28);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,29);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,29);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,30);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (5,30);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (10,31);
INSERT INTO pokemondb.typexmovimiento (id_type,id_movimiento) 
	VALUES (2,31);	**/

	
--movimientoxpokemon
--Pikachu
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (1,1,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (1,2,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (1,3,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (1,4,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (1,5,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (1,6,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (1,7,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (1,8,1);

--Bulbasour
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (2,9,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (2,10,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (2,11,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (2,12,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (2,13,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (2,14,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (2,15,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (2,16,1);


--Charmander
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (3,17,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (3,18,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (3,19,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (3,20,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (3,21,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (3,22,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (3,23,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (3,24,1);





--Squartle

INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (4,16,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (4,25,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (4,26,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (4,27,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (4,28,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (4,29,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (4,30,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (4,31,1);


--Pidgey

INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (5,16,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (5,4,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (5,32,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (5,33,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (5,34,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (5,35,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (5,36,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (5,37,1);


--Rattata

INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (6,16,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (6,4,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (6,27,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (6,38,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (6,39,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (6,40,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (6,41,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (6,42,1);
	
	/**
--butterfree

INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (7,16,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (7,25,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (7,26,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (7,27,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (7,28,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (7,29,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (7,30,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (7,31,1);
	

--Raichu

INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (8,16,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (8,25,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (8,26,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (8,27,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (8,28,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (8,29,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (8,30,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (8,31,1);


--Machamp

INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (9,16,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (9,25,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (9,26,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (9,27,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (9,28,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (9,29,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (9,30,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (9,31,1);

	
--Poliwag

INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (10,16,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (10,25,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (10,26,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (10,27,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (10,28,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (10,29,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (10,30,1);
INSERT INTO pokemondb.movimientoxpokemon (id_pokemon,id_movimiento,status) 
	VALUES (10,31,1);


/***









