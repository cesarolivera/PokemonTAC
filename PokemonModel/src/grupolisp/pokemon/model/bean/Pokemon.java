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
public class Pokemon {
    protected int id;
    protected String nombre;
    protected String tipo;
    private int hp;
    private int ataque;
    private int defensa;
    private int velocidad;
    private boolean en_combate;
    private List<Movimiento> movimientos = new ArrayList<Movimiento>();
    
    public void addMovimiento(Movimiento mov){	
            movimientos.add(mov);
    }
    public List<Movimiento> getMovimientos() {
            return movimientos;
    }
    
    
    private byte[] image;
	
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
    public String getTipo() {
            return tipo;
    }
    public void setTipo(String tipo) {
            this.tipo = tipo;
    }
    /**
     * @return the hp
     */
    public int getHp() {
        return hp;
    }

    /**
     * @param hp the hp to set
     */
    public void setHp(int hp) {
        this.hp = hp;
    }

    /**
     * @return the ataque
     */
    public int getAtaque() {
        return ataque;
    }

    /**
     * @param ataque the ataque to set
     */
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    /**
     * @return the defensa
     */
    public int getDefensa() {
        return defensa;
    }

    /**
     * @param defensa the defensa to set
     */
    public void setDefensa(int defensa) {
        this.defensa = defensa;
    }

    /**
     * @return the velocidad
     */
    public int getVelocidad() {
        return velocidad;
    }

    /**
     * @param velocidad the velocidad to set
     */
    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }
    public byte[] getImage() {
            return image;
    }
    
    public void setImage(byte[] image) {
            this.image = image;
    }

    /**
     * @return the en_combate
     */
    public boolean isEn_combate() {
        return en_combate;
    }

    /**
     * @param en_combate the en_combate to set
     */
    public void setEn_combate(boolean en_combate) {
        this.en_combate = en_combate;
    }
}
