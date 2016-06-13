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
public class Movimiento {
    private int id;
    private String nombre;
    private int base_power;
    private int accuracy;
    private String type;

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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the base_power
     */
    public int getBase_power() {
        return base_power;
    }

    /**
     * @param base_power the base_power to set
     */
    public void setBase_power(int base_power) {
        this.base_power = base_power;
    }

    /**
     * @return the acurracy
     */
    public int getAccuracy() {
        return accuracy;
    }

    /**
     * @param acurracy the acurracy to set
     */
    public void setAccuracy(int acurracy) {
        this.accuracy = accuracy;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
}
