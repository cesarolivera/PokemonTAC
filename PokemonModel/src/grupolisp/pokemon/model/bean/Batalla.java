/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupolisp.pokemon.model.bean;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author César Olivera
 */
public class Batalla {
    private int id;
    private int hp_entrenador;
    private int hp_oponente;
    private List<Entrenador> entrenadores = new ArrayList<Entrenador>();
    private List<Turno> turnos = new ArrayList<Turno>();
    
    public void addEntrenador(Entrenador entrenador){
        entrenadores.add(entrenador);
    }
    
    public List<Entrenador> getEntrenadores() {
            return entrenadores;
    }
    
    
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the hp_entrenador
     */
    public int getHp_entrenador() {
        return hp_entrenador;
    }

    /**
     * @param hp_entrenador the hp_entrenador to set
     */
    public void setHp_entrenador(int hp_entrenador) {
        this.hp_entrenador = hp_entrenador;
    }

    /**
     * @return the hp_oponente
     */
    public int getHp_oponente() {
        return hp_oponente;
    }

    /**
     * @param hp_oponente the hp_oponente to set
     */
    public void setHp_oponente(int hp_oponente) {
        this.hp_oponente = hp_oponente;
    }
}
