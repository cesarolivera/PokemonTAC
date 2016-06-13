# PokemonTAC

                                                            Tarea Académica 2
                                                            Pokémon Inf & Tac
1. Objetivo
  Aprender como modelar de un problema de búsqueda con adversario, reforzar el aprendizaje del algoritmo Minimax y verificar la utilidad de algoritmos evolutivos para la mejora del comportamiento de las máquinas en juegos.
2. Especificaciones
A) Configuraciones
  Seleccionar 20 pokémon (al menos) de la siguiente página (http://pokémonshowdown.com/dex/pokémon/).
  Considerar los siguientes atributos por cada pokémon:
     Hit Points (HP): Son los puntos de golpe. Al llegar a 0 el pokémon queda fuera de combate. En el caso que todos los pokémon lleguen a HP igual a 0. El juego termina.
     Ataque: Este atributo mide la capacidad de ataque del pokémon.
     Defensa: Este atributo mide la capacidad de defensa del pokémon.
     Velocidad: Este atributo mide la velocidad de un pokémon, puede ser útil para determinar quién comienza una partida y para escapar de ataques.
Considerar 8 tipos de posibles movimientos por cada pokémon (de la página antes mencionada). Considerar los atributos que contienen estos movimientos (Base Power, Accuracy, Type) y otros poderes que puedan tener (disminuir la velocidad del oponente, dormirlo por 1 turno, entre otros).
Crear una función de daño usando la información del oponente y el movimiento seleccionado por el pokémon. Por ejemplo,
Damage = (Atck/Def_op)*base_power – speed_op*10
Donde:
     Atck es el poder de ataque del pokémon
     Def_op es el poder de defensa del pokémon del oponente
     Base_power es la fuerza del movimiento realizado por el pokémon
     Speed_op es la velocidad que tiene el pokémon del oponente (le ayudará a esquivar el ataque y no dañarse tanto)
B) Sobre los combates
     Los combates son de 3 contra 3 o 4 contra 4 pokémon
     Cada pokémon podrá ejecutar 4 de los 8 movimientos posibles. La selección de los 4 movimientos será aleatoria.
     Se pueden hacer cambios de pokémon durante la batalla.
     El combatiente que se quede sin pokémon activos pierde la partida (todos los HP son 0).
Considerar los siguientes niveles:
   Nivel 1: Comportamiento aleatorio
En este comportamiento el computador debe escoger un movimiento de manera aleatoria entre los movimientos posibles, sin considerar si es mejor o peor.
   Nivel 2: Heurística 1
La heurística viene dada por la diferencia de HP entre el computador y el humano.
   Nivel 3: Heurística 2
Esta heurística es formada por la suma ponderada de diferentes factores. Algunos ejemplos pueden ser. “la cantidad de pokémon vivos” + “la velocidad del pokémon activo en relación al pokémon del oponente”, 
entre otros. (Recomendación: Los valores de cada factor deben estar dentro de un mismo rango. Por ejemplo, si el factor velocidad está entre los valores 0 a 1, la cantidad de pokémons tendría que estar en ese 
rango, pudiendo cambiar a #pokémon_vivos/4)
      3. Forma de Evaluación
                a) Juego + Comportamiento Aleatorio               2 puntos
                b) Juego + Heurística 1                           4 puntos
                c) Juego + Heurística 2                           5 puntos
                  -Selección de pesos manualmente                 1 punto
                  -Usando algoritmos evolutivos                   5 puntos
                d) Interfaz Gráfica                               4 puntos
                e) Artículo Científico con el estudio realizado   5 puntos
                  Total                                           20 puntos

4. Detalles de la Entrega

31/05/2016 Evaluación de puntos (a) y (b)
21/06/2016 Entrega Final – Evaluación de puntos (c), (d) y (e)
El artículo científico debe contar con las siguientes secciones:
         Resumen
         Introducción
         Explicación de los algoritmos usados, profundidad de búsqueda y la función de evaluación en el juego para cada heurística
         Resultados obtenidos
         Discusión de resultados
         Conclusiones
         Referencias Bibliográficas
