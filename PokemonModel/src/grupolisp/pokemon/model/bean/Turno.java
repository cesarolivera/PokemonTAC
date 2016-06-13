/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupolisp.pokemon.model.bean;

/**
 *
 * @author César Olivera
 */
public class Turno {
    private int id;
    private Batalla batalla;
    private Entrenador entrenador;//Entrenador que hace el turno  
    private Pokemon pokemon_Entrenador;//Pokemon que hace el turno
    private Movimiento movimiento;//Movimento que hace el pokemon en el turno
    private int damage;

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
     * @return the batalla
     */
    public Batalla getBatalla() {
        return batalla;
    }

    /**
     * @param batalla the batalla to set
     */
    public void setBatalla(Batalla batalla) {
        this.batalla = batalla;
    }

    /**
     * @return the entrenador
     */
    public Entrenador getEntrenador() {
        return entrenador;
    }

    /**
     * @param entrenador the entrenador to set
     */
    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    /**
     * @return the pokemon_Entrenador
     */
    public Pokemon getPokemon() {
        return pokemon_Entrenador;
    }

    /**
     * @param pokemon_Entrenador the pokemon_Entrenador to set
     */
    public void setPokemon(Pokemon pokemon_Entrenador) {
        this.pokemon_Entrenador = pokemon_Entrenador;
    }

    /**
     * @return the movimiento
     */
    public Movimiento getMovimiento() {
        return movimiento;
    }

    /**
     * @param movimiento the movimiento to set
     */
    public void setMovimiento(Movimiento movimiento) {
        this.movimiento = movimiento;
    }

    /**
     * @return the damage
     */
    public int getDamage() {
        return damage;
    }

    /**
     * @param damage the damage to set
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }
    
    
}
