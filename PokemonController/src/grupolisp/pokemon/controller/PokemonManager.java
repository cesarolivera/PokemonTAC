/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupolisp.pokemon.controller;
import grupolisp.pokemon.model.bean.Pokemon;
import grupolisp.pokemon.model.bean.Batalla;
import grupolisp.pokemon.model.bean.Entrenador;
import grupolisp.pokemon.model.bean.Movimiento;
import com.mysql.jdbc.Driver;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import java.util.Calendar;
import java.util.Random;
/**
 *
 * @author César Olivera
 */

public class PokemonManager {
    private static int getNumPokemonsEnCombate(Entrenador entrenador){
        int numPok=0;
        
        for(int i=0;i<entrenador.getPokemon().size();i++)
            if(entrenador.getPokemon().get(i).isEn_combate())
                numPok++;
        return numPok;
    }
    private static int getHP_afterAtack(int hp_op,Pokemon pokemon,int indexMov,Pokemon pokemon_op){
        
        int damage=getDamage(pokemon.getAtaque(),pokemon_op.getDefensa(),
                            pokemon.getMovimientos().get(indexMov).getBase_power(),
                            pokemon_op.getVelocidad());
        
        
        if(damage>=pokemon_op.getHp())damage=pokemon_op.getHp();
        System.out.println("El hp despues del ataque: "+(hp_op-damage));
        return hp_op-damage;
    }

    private static int [] generarIndicesMiniMax(Batalla batalla,Entrenador entrenador_op,Pokemon pokemon,int indexMov){
        int []numMiniMax=new int[2];
        int max_dif_hp=-100;
        int max_indexPokemon=1;
        int max_indexMov=1;
        int hp_ent,hp_op;
        
        int numPokemons=getNumPokemonsEnCombate(entrenador_op);
         
        for(int i=0;i<numPokemons;i++){
            Pokemon pokemon_op=entrenador_op.getPokemon().get(i);        
            for(int j=0;j<pokemon.getMovimientos().size();j++){
                System.out.println("Es el oponente:"+"Coord:("+i+","+j);
                hp_op=getHP_afterAtack(batalla.getHp_oponente(),pokemon,j,pokemon_op);
                System.out.println("Es el entrenador:"+"Coord:("+i+","+j);
                hp_ent=getHP_afterAtack(batalla.getHp_entrenador(),pokemon_op,indexMov,pokemon);
                
                if((hp_op-hp_ent)>max_dif_hp){
                    max_dif_hp=hp_op-hp_ent;
                    max_indexPokemon=i;
                    max_indexMov=j;
                }
            }
       
        }
        numMiniMax[0]=max_indexPokemon;
        numMiniMax[1]=max_indexMov;
        
        System.out.println("indice de pokemon max:"+max_indexPokemon+"---inidice de movimiento max:"+max_indexMov);
        
        return numMiniMax;
    }
    
    private static int [] generarAleatorios(int cant){
        Calendar calendario = Calendar.getInstance();
        int minutos, segundos;
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
//        System.out.println(minutos + ":" + segundos);
        
        int []numRand=new int[2];
        Random rnd = new Random((minutos*100+segundos*10)*123);
        numRand[0]=rnd.nextInt(cant)+1;
        rnd.setSeed((minutos*100+segundos*10)*123);
        numRand[1]=rnd.nextInt(4)+1;
       
        return numRand;
    }
    private static int getDamage(int atack, int def_op,int base_power,int speed_op){
        int damage=0;
        damage=((atack/def_op)*base_power)-speed_op;
        
        if(damage<=0){
            damage=0;
        }
        System.out.println(damage);
        return damage;
        
    }
    public static void ataquePokemon(Batalla batalla,Pokemon pokemon,int indexMov,Entrenador entrenador_op){
        //Escojer movimoentos aleatorios
        int numRand[]=generarAleatorios(entrenador_op.getPokemon().size());
        //int numRand[]=generarIndicesMiniMax(batalla,entrenador_op,pokemon,indexMov);//MiniMAx
        int indexPokemon = numRand[0]; //Aleatorio
        int indexMovimiento = numRand[1]; //Aleatorio
        //int indexPokemon = numRand[0]+1; //MiniMax
        //int indexMovimiento = numRand[1]+1; //MiniMax
        //int contador=0;
//        for(int i=0;i<entrenador_op.getPokemon().size();i++)
//            if(entrenador_op.getPokemon().get(i).isEn_combate()) contador++;
//        while(!entrenador_op.getPokemon().get(indexPokemon-1).isEn_combate()){
//            numRand=generarAleatorios(contador);
//            indexPokemon = numRand[0];
//        }
        //int numRand2[]=generarIndicesMiniMax(batalla,entrenador_op,pokemon,indexMov); //MiniMax
        
//        System.out.println("******************************************************"); //MiniMax
//                System.out.println("!¡¡¡"+entrenador_op.getPokemon().get(numRand2[0]).getNombre()+" realizó "+entrenador_op.getPokemon().get(numRand2[0]).getMovimientos().get(numRand2[1]).getNombre()+"!!!");
//        System.out.println("******************************************************"); //MiniMax
        
        Pokemon pokemon_op=entrenador_op.getPokemon().get(indexPokemon-1);
        
        System.out.println(entrenador_op.getNombre()+":"+pokemon_op.getNombre()+" realizó el movimiento "+entrenador_op.getPokemon().get(indexPokemon-1).getMovimientos().get(indexMovimiento-1).getNombre());
        System.out.println("Tu "+pokemon.getNombre()+" realizó el movimiento "+pokemon.getMovimientos().get(indexMov).getNombre());
        System.out.print("Damage que el oponente recibió:");
       
        int damage_op=getDamage(pokemon.getAtaque(),pokemon_op.getDefensa(),
                            pokemon.getMovimientos().get(indexMov).getBase_power(),
                            pokemon_op.getVelocidad());
        System.out.print("Damage que recibí:");
        
        int damage=getDamage(pokemon_op.getAtaque(),pokemon.getDefensa(),
                            pokemon_op.getMovimientos().get(indexMovimiento-1).getBase_power(),
                            pokemon.getVelocidad());
        
        if(damage_op>0){
            if(pokemon_op.getHp()<=damage_op){ 
                pokemon_op.setEn_combate(false);
                batalla.setHp_oponente(batalla.getHp_oponente()-pokemon_op.getHp());
                pokemon_op.setHp(0);
                System.out.println("******************************************************");
                System.out.println("!¡¡¡"+entrenador_op.getNombre()+":"+pokemon_op.getNombre()+" está fuera de combate!!!");
                System.out.println("******************************************************");
            }
            else{
                batalla.setHp_oponente(batalla.getHp_oponente()-damage_op);
                pokemon_op.setHp(pokemon_op.getHp()-damage_op);                
            }
        }
        if(damage>0){
            if(pokemon.getHp()<=damage){     
                pokemon.setEn_combate(false);
                batalla.setHp_entrenador(batalla.getHp_entrenador()-pokemon.getHp());
                pokemon.setHp(0);
                System.out.println("******************************************************");
                System.out.println("¡¡¡Tu "+pokemon.getNombre()+" está fuera de combate!!!");
                System.out.println("******************************************************");
            }
            else{      
                batalla.setHp_entrenador(batalla.getHp_entrenador()-damage);
                pokemon.setHp(pokemon.getHp()-damage);
            }
        }
    }
    
    public static void addMovimientos(Pokemon pokemon) throws SQLException{
        Connection conn=null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Calendar calendario = Calendar.getInstance();
        int minutos, segundos;
        minutos = calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND);
        Random rnd = new Random((minutos*100+segundos*10)*123);
        try{
            //Paso 1. Obtener la conexion
            //Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PokemonDB","root","");
            //Paso 2. Preparar la sentencia
            String sqlString = "SELECT * FROM pokemondb.movimiento WHERE id in (SELECT id_movimiento FROM pokemondb.movimientoxpokemon WHERE id_pokemon=?);";
            pstmt = conn.prepareStatement(sqlString);
            pstmt.setInt(1, pokemon.getId());
            //Paso 3. Ejecutar la sentencia
            rs = pstmt.executeQuery();

            int cantMov=0;
            int []movs=new int[8];
            for(int i=0;i<8;i++)movs[i]=0;
            while (cantMov!=4){
                int num=rnd.nextInt(8)+1;
                boolean esta=false;
                if(movs[num-1]!=0)esta=true;
                if(!esta){
                    movs[num-1]=1; 
                    cantMov++; 
                }
            }
            int cont=1;
            while (rs.next()){
                if(movs[cont-1]==1) {
                    Movimiento movimiento=new Movimiento();

                    movimiento.setId(rs.getInt("id"));
                    movimiento.setNombre(rs.getString("nombre"));
                    movimiento.setBase_power(rs.getInt("base_power"));
                    movimiento.setAccuracy(rs.getInt("accuracy"));
                    
                    pokemon.addMovimiento(movimiento);
                }
                cont++;
            }
        }
        catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                throw e;
        } finally {
                //Paso 6. CERRAR LA CONEXIoN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                try {if (pstmt != null) pstmt.close();} catch (SQLException e) {e.printStackTrace();}
                try {if (conn != null) conn.close();} catch (SQLException e) {e.printStackTrace();}
        }
    }
    
    public static void addEntrenador(Entrenador entrenador) throws SQLException{
        Connection conn=null;
        PreparedStatement pstmt = null;
        try{
            //Paso 1. Obtener la conexion
            //Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PokemonDB","root","");
            //Paso 2. Preparar la sentencia
            String sqlString = "INSERT INTO Entrenador(nombre, batallas_ganadas,batallas_perdidas, fechaReg) VALUES (?,?,?,?)";
            pstmt = conn.prepareStatement(sqlString);
            //pstmt.setInt(1,);
            pstmt.setString(1, entrenador.getNombre());
            pstmt.setInt(2, entrenador.getBatallas_ganadas());
            pstmt.setInt(3, entrenador.getBatallas_perdidas());
            java.sql.Date sqlDate = new java.sql.Date(entrenador.getRegDate().getTime()); 
            pstmt.setDate(4,sqlDate);
            //Paso 3. Ejecutar la sentencia
            pstmt.executeUpdate();
        }
        catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                throw e;
        } finally {
                //Paso 6. CERRAR LA CONEXIoN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                try {if (pstmt != null) pstmt.close();} catch (SQLException e) {e.printStackTrace();}
                try {if (conn != null) conn.close();} catch (SQLException e) {e.printStackTrace();}
        }
    }
    public static List<Pokemon> queryAllPokemon() throws SQLException{
        Connection conn=null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List<Pokemon> listPokemon = new ArrayList<Pokemon>();
        try{
            //Paso 1. Obtener la conexion
            //Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PokemonDB","root","");
            //Paso 2. Preparar la sentencia
            String sqlString = "SELECT DISTINCT* FROM Pokemon";
            pstmt = conn.prepareStatement(sqlString);
            //Paso 3. Ejecutar la sentencia
            rs = pstmt.executeQuery();
            while (rs.next()){
                Pokemon pokemon=new Pokemon();
                
                pokemon.setId(rs.getInt("id"));
                pokemon.setNombre(rs.getString("nombre"));
                pokemon.setTipo(rs.getString("tipo"));
                pokemon.setHp(rs.getInt("hp"));
                pokemon.setAtaque(rs.getInt("ataque"));
                pokemon.setDefensa(rs.getInt("defensa"));
                pokemon.setVelocidad(rs.getInt("velocidad"));
                
                listPokemon.add(pokemon);
            }
        }
        catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                throw e;
        } finally {
                //Paso 6. CERRAR LA CONEXIoN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                try {if (pstmt != null) pstmt.close();} catch (SQLException e) {e.printStackTrace();}
                try {if (conn != null) conn.close();} catch (SQLException e) {e.printStackTrace();}
        }
        return listPokemon;
    }
    public static Pokemon queryByNameOfPokemon(String pokemonName) throws SQLException{
        Connection conn=null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Pokemon pokemon = null;
        try{
            //Paso 1. Obtener la conexion
            //Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PokemonDB","root","");
            //Paso 2. Preparar la sentencia
            String sqlString = "SELECT * FROM Pokemon WHERE nombre=?";
            pstmt = conn.prepareStatement(sqlString);
            pstmt.setString(1, pokemonName);
            //Paso 3. Ejecutar la sentencia
            rs = pstmt.executeQuery();
            if (rs.next()){
                pokemon=new Pokemon();
                
                pokemon.setId(rs.getInt("id"));
                pokemon.setNombre(rs.getString("nombre"));
                pokemon.setTipo(rs.getString("tipo"));
                pokemon.setHp(rs.getInt("hp"));
                pokemon.setAtaque(rs.getInt("ataque"));
                pokemon.setDefensa(rs.getInt("defensa"));
                pokemon.setVelocidad(rs.getInt("velocidad"));
                
            }
        }
        catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                throw e;
        } finally {
                //Paso 6. CERRAR LA CONEXIoN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                try {if (pstmt != null) pstmt.close();} catch (SQLException e) {e.printStackTrace();}
                try {if (conn != null) conn.close();} catch (SQLException e) {e.printStackTrace();}
        }
        return pokemon;
    }
    public static Entrenador queryByNameOfEntrenador(String EntrenadorName) throws SQLException{
        Connection conn=null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        Entrenador entrenador = null;
        try{
            //Paso 1. Obtener la conexion
            //Class.forName("com.mysql.jdbc.Driver");
            DriverManager.registerDriver(new Driver());
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PokemonDB","root","");
            //Paso 2. Preparar la sentencia
            String sqlString = "SELECT * FROM Entrenador WHERE nombre=?";
            pstmt = conn.prepareStatement(sqlString);
            pstmt.setString(1, EntrenadorName);
            //Paso 3. Ejecutar la sentencia
            rs = pstmt.executeQuery();
            if (rs.next()){
                entrenador=new Entrenador();
                
                //entrenador.setId(rs.getInt("id"));
                entrenador.setNombre(rs.getString("nombre"));
                entrenador.setBatallas_ganadas(rs.getInt("batallas_ganadas"));
                entrenador.setBatallas_perdidas(rs.getInt("batallas_perdidas"));
                entrenador.setRegDate(rs.getDate("fechaReg"));
            }
        }
        catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                throw e;
        } finally {
                //Paso 6. CERRAR LA CONEXIoN!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
                try {if (pstmt != null) pstmt.close();} catch (SQLException e) {e.printStackTrace();}
                try {if (conn != null) conn.close();} catch (SQLException e) {e.printStackTrace();}
        }
        return entrenador;
    }
    
}
