/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupolisp.pokemon.model.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author César Olivera
 */
public class Entrenador {
    protected int id;
    protected String nombre;
    protected int batallas_ganadas;
    private int batallas_perdidas;
    protected Date fechaReg;
    private List<Pokemon> pokemons = new ArrayList<Pokemon>();
    
    public void addPokemon(Pokemon pokemon){
            pokemon.setEn_combate(true);
            pokemons.add(pokemon);
    }
    public List<Pokemon> getPokemon() {
            return pokemons;
    }
    
    public int getId() {
            return id;
    }
    public void setId(int id) {
            this.id = id;
    }
    public String getNombre() {
            return nombre;
    }
    public void setNombre(String nombre) {
            this.nombre = nombre;
    }
    public int getBatallas_ganadas() {
            return batallas_ganadas;
    }
    public void setBatallas_ganadas(int batallas_ganadas) {
            this.batallas_ganadas = batallas_ganadas;
    }
    public Date getRegDate() {
            return fechaReg;
    }
    public void setRegDate(Date fechaReg) {
            this.fechaReg = fechaReg;
    }
    public Pokemon getPokemonByName(String name){
        Pokemon pokemon=null;
        for(int i=0;i<this.getPokemon().size();i++){
                if(this.getPokemon().get(i).getNombre().equals(name))
                        pokemon=this.getPokemon().get(i);
        }
        return pokemon;
    }
    /**
     * @return the batallas_perdidas
     */
    public int getBatallas_perdidas() {
        return batallas_perdidas;
    }

    /**
     * @param batallas_perdidas the batallas_perdidas to set
     */
    public void setBatallas_perdidas(int batallas_perdidas) {
        this.batallas_perdidas = batallas_perdidas;
    }
}
