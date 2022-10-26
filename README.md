i. Clases: Jugadores, Partidos, Goles.

Relaciones:
Jugadores----Partidos (Asociación)(n a n)

Goles--->Partidos (Agregación)(n a 1)

Jugadores--->Goles (Asociación) (1 a n)


ii. Clases: Buques, Astillero, Empresa

Relaciones:

Buques-->Empresa (Agregación)(10 a 1)
Empresa---Artillero (Asociación)(0..* a 1)

iii. Clases: Pedidos, Meseros

Relaciones:

Mesero--->Pedidos (Asociación) (1 a n)

iv. Clases: Equipos, Jugadores, Capitan

Relaciones:

Jugador--->Equipos  (Agregación)(1..* a 1)

Capitan---->Jugador  (Agregación) (1 a 0)

Capitan--->Equipos (Agregación)(1 a 1)

v. Clases: Evento, Eventos

Relaciones:

Evento--->Eventos (Agregación) (0..1 a 1) 