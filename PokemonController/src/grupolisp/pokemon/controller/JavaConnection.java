/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupolisp.pokemon.controller;

import java.sql.*;
/**
 *
 * @author César Olivera
 */
public class JavaConnection {
    private static Connection conn;
  
    public JavaConnection(){
        try{
            System.out.println("Estoy intentando conectarme a la base de datos");
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/PokemonDB","root","");
            if(conn!=null)
                System.out.println("Conexión Establecida..");
        }
        catch(SQLException e){
            System.out.println("Error de MySQL");
        }
        catch(ClassNotFoundException e){
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println("Se ha encontrado el siguiente error: "+e.getMessage());
        }
    }
    public Connection getConnection(){
        return conn;
    }
    public void desconectar(){
        conn=null;
        if(conn==null){
            System.out.println("Conexión Terminada..");
        }
    }
}
