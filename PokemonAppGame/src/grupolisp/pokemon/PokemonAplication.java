/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupolisp.pokemon;
import grupolisp.pokemon.controller.PokemonManager;
import grupolisp.pokemon.model.bean.Entrenador;
import grupolisp.pokemon.model.bean.Batalla;
import grupolisp.pokemon.model.bean.Pokemon; 
import grupolisp.pokemon.gui.VentanaPrincipal;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author César Olivera
 */
public class PokemonAplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        VentanaPrincipal ventana=new VentanaPrincipal();
        ventana.setVisible(true);
        Scanner in=new Scanner(System.in);
        Batalla batalla=new Batalla();
        batalla.setId(1);
        
        //Se crea a un entrenador oponente y se le asigna aleatoriamente sus pokemones
        List<Pokemon> listPokemonOp = PokemonManager.queryAllPokemon();
        
        Entrenador entrenador_op=PokemonManager.queryByNameOfEntrenador("Equipo Rocket");   
        entrenador_op.addPokemon(PokemonManager.queryByNameOfPokemon("Pikachu"));
        batalla.setHp_oponente(PokemonManager.queryByNameOfPokemon("Pikachu").getHp());
        entrenador_op.addPokemon(PokemonManager.queryByNameOfPokemon("Bulbasaur"));
        batalla.setHp_oponente(batalla.getHp_oponente()+PokemonManager.queryByNameOfPokemon("Bulbasaur").getHp());
        entrenador_op.addPokemon(PokemonManager.queryByNameOfPokemon("Charmander"));
        batalla.setHp_oponente(batalla.getHp_oponente()+PokemonManager.queryByNameOfPokemon("Charmander").getHp());
        
        
        //Se añade movimientos a cada pokemon (4 por pokemon)
        for(int i=0;i<entrenador_op.getPokemon().size();i++)
            PokemonManager.addMovimientos(entrenador_op.getPokemon().get(i));  
        
        System.out.println("Datos del entrenador Oponente");
        System.out.println("=============================");
        System.out.println("Nombre del entrenador oponente:" + entrenador_op.getNombre());
        System.out.println("Batallas ganadas:" + entrenador_op.getBatallas_ganadas());
        System.out.println("Batallas perdidas:" + entrenador_op.getBatallas_perdidas());
        System.out.println("=============================");
        for(int i=0;i<entrenador_op.getPokemon().size();i++){
            System.out.println("Pokemon N"+(i+1)+" :"+entrenador_op.getPokemon().get(i).getNombre());
            System.out.println("Movimientos:");
            for(int j=0;j<entrenador_op.getPokemon().get(i).getMovimientos().size();j++){
                System.out.println("Movimiento N"+(j+1)+": "+entrenador_op.getPokemon().get(i).getMovimientos().get(j).getNombre());
            }
            System.out.println("=============================");
        }
        
        System.out.println("=============================");      
        Entrenador entrenador=new Entrenador();
        System.out.print("Ingrese su nombre de entrenador pokemon:");
        entrenador.setNombre(in.next());
        entrenador.setBatallas_ganadas(0);
        entrenador.setBatallas_perdidas(0);
        entrenador.setRegDate(new Date());
        PokemonManager.addEntrenador(entrenador);
        
        
        System.out.println("Elija una opción: (1) Batalla 3 vs 3   |  (2) Batalla 4 vs 4");
        //List <Pokemon> pokemons = new ArrayList<Pokemon>();
        if(in.nextInt()==1){  
            int num_pokemons=0;
            int []poks=new int[3];    
            List<Pokemon> listPokemon = PokemonManager.queryAllPokemon();
            while(num_pokemons<3){
                boolean pokemonesta;
                System.out.println("Elija un pokemon: ");
                for(int i=0;i<listPokemon.size();i++){
                    pokemonesta=false;
                    for(int j=0;j<poks.length;j++){
                        if(i+1==poks[j]) pokemonesta=true;
                    }
                    if(!pokemonesta) System.out.println("("+(i+1)+") "+listPokemon.get(i).getNombre());
                }
                System.out.print("Ingrese la opción: ");
           
                int opcion=in.nextInt();
                pokemonesta=false;
                for(int j=0;j<poks.length;j++){
                    if(opcion==poks[j]) pokemonesta=true;
                }
                if(!pokemonesta){
                    switch(opcion){
                        case 1:
                            System.out.println("Elegiste a Pikachu");
                            poks[num_pokemons]=opcion;num_pokemons++;  
                            Pokemon pika=PokemonManager.queryByNameOfPokemon("Pikachu");
                            entrenador.addPokemon(pika);
                            System.out.println("El pokemon es "+pika.getNombre()+" con Hp de "+
                                                pika.getHp()+" y ataque de "+pika.getAtaque());
                            batalla.setHp_entrenador(batalla.getHp_entrenador()+pika.getHp());
                            break;
                        case 2:
                            System.out.println("Elegiste a Bulbasaur");
                            poks[num_pokemons]=opcion;num_pokemons++;
                            Pokemon bulba=PokemonManager.queryByNameOfPokemon("Bulbasaur");
                            entrenador.addPokemon(bulba);
                            System.out.println("El pokemon es "+bulba.getNombre()+" con Hp de "+
                                                bulba.getHp()+" y ataque de "+bulba.getAtaque());
                            batalla.setHp_entrenador(batalla.getHp_entrenador()+bulba.getHp());
                            break;
                        case 3:
                            System.out.println("Elegiste a Charmander");
                            poks[num_pokemons]=opcion;num_pokemons++;
                            Pokemon charm=PokemonManager.queryByNameOfPokemon("Charmander");
                            entrenador.addPokemon(charm);
                            System.out.println("El pokemon es "+charm.getNombre()+" con Hp de "+
                                                charm.getHp()+" y ataque de "+charm.getAtaque());
                            batalla.setHp_entrenador(batalla.getHp_entrenador()+charm.getHp());
                            break;
                        case 4: 
                            System.out.println("Elegiste a Squirtle");
                            poks[num_pokemons]=opcion;num_pokemons++;
                            Pokemon squirtle=PokemonManager.queryByNameOfPokemon("Squirtle");
                            entrenador.addPokemon(squirtle);
                            System.out.println("El pokemon es "+squirtle.getNombre()+" con Hp de "+
                                                squirtle.getHp()+" y ataque de "+squirtle.getAtaque());
                            batalla.setHp_entrenador(batalla.getHp_entrenador()+squirtle.getHp());
                            break;
                        case 5: 
                            System.out.println("Elegiste a Pidgey");
                            poks[num_pokemons]=opcion;num_pokemons++;
                            Pokemon pidgey=PokemonManager.queryByNameOfPokemon("Pidgey");
                            entrenador.addPokemon(pidgey);
                            System.out.println("El pokemon es "+pidgey.getNombre()+" con Hp de "+
                                                pidgey.getHp()+" y ataque de "+pidgey.getAtaque());
                            batalla.setHp_entrenador(batalla.getHp_entrenador()+pidgey.getHp());
                            break;
                        case 6: 
                            System.out.println("Elegiste a Rattata");
                            poks[num_pokemons]=opcion;num_pokemons++;
                            Pokemon rat=PokemonManager.queryByNameOfPokemon("Rattata");
                            entrenador.addPokemon(rat);
                            System.out.println("El pokemon es "+rat.getNombre()+" con Hp de "+
                                                rat.getHp()+" y ataque de "+rat.getAtaque());
                            batalla.setHp_entrenador(batalla.getHp_entrenador()+rat.getHp());
                            break;
                        default:
                            break;
                    }
                }
                else{
                    System.out.println("El pokemon "+listPokemon.get(opcion-1).getNombre()+" ya fue elegido, elija otro pokemon");
                }
            }
            //Se añade movimientos a cada pokemon (4 por pokemon)
                for(int i=0;i<entrenador.getPokemon().size();i++){
                    PokemonManager.addMovimientos(entrenador.getPokemon().get(i));  
                }
                for(int i=0;i<entrenador.getPokemon().get(1).getMovimientos().size();i++){
                    System.out.println("Movimiento N"+(i+1)+": "+entrenador.getPokemon().get(1).getMovimientos().get(i).getNombre());
                }
            //Añadido de movimientos por pokemon finalizado
            
            System.out.println("********************************************************");
            System.out.println("***************COMENZÓ LA BATALLA POKEMON***************");
            System.out.println("********************************************************");
            int turn=0;
            while(batalla.getHp_entrenador()!=0 && batalla.getHp_oponente()!=0){
                turn++;
                System.out.println("*********************TURNO "+turn+"*********************");
                System.out.println("HP de "+entrenador.getNombre()+" : "+batalla.getHp_entrenador());
                System.out.println("HP de "+entrenador_op.getNombre()+" : "+batalla.getHp_oponente());
                System.out.println("********************************************************");
                System.out.println("Elija un pokemon:");
                for(int i=0;i<entrenador.getPokemon().size();i++){
                    if(entrenador.getPokemon().get(i).isEn_combate())
                        System.out.println("("+(i+1)+") "+entrenador.getPokemon().get(i).getNombre());     
                }
                System.out.print("Ingrese la opción: ");
                int indexPokemon=in.nextInt();
                while(!entrenador.getPokemon().get(indexPokemon-1).isEn_combate()){
                    System.out.print(entrenador.getPokemon().get(indexPokemon-1).getNombre()+" está fuera de combate, por favor elija otro pokemon:");
                    indexPokemon=in.nextInt();
                }
                
                System.out.println("Elija un movimiento:");
                for(int i=0;i<entrenador.getPokemon().get(indexPokemon-1).getMovimientos().size();i++){
                    System.out.println("("+(i+1)+") "+entrenador.getPokemon().get(indexPokemon-1).getMovimientos().get(i).getNombre());
                }
                System.out.print("Ingrese la opción: ");
                int indexMovimiento=in.nextInt();
                
                PokemonManager.ataquePokemon(batalla,entrenador.getPokemon().get(indexPokemon-1),indexMovimiento-1,entrenador_op);
   
            }
            
            System.out.println("********************************************************");
            System.out.println("************LA BATALLA POKEMON HA FINALIZADO************");
            System.out.println("********************************************************");
            System.out.println("*********************RESULTADOS*************************");
            System.out.println("HP de "+entrenador.getNombre()+" : "+batalla.getHp_entrenador());
            System.out.println("HP de "+entrenador_op.getNombre()+" : "+batalla.getHp_oponente());
            System.out.println("********************************************************");
            System.out.println("********************************************************");
            batalla.addEntrenador(entrenador);
            batalla.addEntrenador(entrenador_op);
            
            if(batalla.getHp_entrenador()==0){
                entrenador_op.setBatallas_ganadas(entrenador_op.getBatallas_ganadas()+1);
                entrenador.setBatallas_perdidas(entrenador.getBatallas_perdidas()+1);
                System.out.println("*******************"+entrenador_op.getNombre()+" HA GANADO*******************");
            }
            else{
                entrenador.setBatallas_ganadas(entrenador.getBatallas_ganadas()+1);
                entrenador_op.setBatallas_perdidas(entrenador_op.getBatallas_perdidas()+1);
                System.out.println("*****************"+entrenador.getNombre()+" HA GANADO*****************");
            }
            System.out.println("********************************************************");
            System.out.println("********************************************************");
            
        }
        else{
            System.out.println("****PROXIMAMENTE ESTARÄ DISPONIBLE ESTE MODO DE JUEGO*****");
        }
          

    }
    
}
