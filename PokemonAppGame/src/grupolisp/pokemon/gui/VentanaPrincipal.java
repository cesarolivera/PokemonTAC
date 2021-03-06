/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupolisp.pokemon.gui;

import grupolisp.pokemon.controller.PokemonManager;
import grupolisp.pokemon.model.bean.Batalla;
import grupolisp.pokemon.model.bean.Entrenador;
import grupolisp.pokemon.model.bean.Pokemon;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author César Olivera
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    Entrenador entrenador=new Entrenador();
    Entrenador entrenador_op = null;
    Batalla batalla=new Batalla();
    DataGame formDataGame = new DataGame();
    ChosePokemons formChosePok = new ChosePokemons();
    VentanaDatosOp formop = new VentanaDatosOp();
    BatallaPokemon formbatalla = new BatallaPokemon();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        modobatalla = new javax.swing.ButtonGroup();
        dificultadgroup = new javax.swing.ButtonGroup();
        escritorio = new javax.swing.JDesktopPane();
        btnbatalla = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newgame = new javax.swing.JMenuItem();
        chosepokemons = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        escritorio.setBackground(new java.awt.Color(255, 255, 255));

        btnbatalla.setText("Empezar la batalla");
        btnbatalla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatallaActionPerformed(evt);
            }
        });

        escritorio.setLayer(btnbatalla, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, escritorioLayout.createSequentialGroup()
                .addContainerGap(316, Short.MAX_VALUE)
                .addComponent(btnbatalla, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(248, 248, 248))
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(escritorioLayout.createSequentialGroup()
                .addGap(161, 161, 161)
                .addComponent(btnbatalla, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(238, Short.MAX_VALUE))
        );

        jMenu1.setText("Juego");

        newgame.setText("Nuevo Juego");
        newgame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newgameActionPerformed(evt);
            }
        });
        jMenu1.add(newgame);

        chosepokemons.setText("Elegir pokemons");
        chosepokemons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chosepokemonsActionPerformed(evt);
            }
        });
        jMenu1.add(chosepokemons);

        exit.setText("Salir");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opciones");

        jMenuItem1.setText("jMenuItem1");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void newgameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newgameActionPerformed
        //Empieza la batalla
        batalla.setId(1);
        

        try {
            //Se prepara al oponente
            entrenador_op=PokemonManager.queryByNameOfEntrenador("Equipo Rocket");
            entrenador_op.addPokemon(PokemonManager.queryByNameOfPokemon("Pikachu"));
            batalla.setHp_oponente(PokemonManager.queryByNameOfPokemon("Pikachu").getHp());
            entrenador_op.addPokemon(PokemonManager.queryByNameOfPokemon("Bulbasaur"));
            batalla.setHp_oponente(batalla.getHp_oponente()+PokemonManager.queryByNameOfPokemon("Bulbasaur").getHp());
            entrenador_op.addPokemon(PokemonManager.queryByNameOfPokemon("Charmander"));
            batalla.setHp_oponente(batalla.getHp_oponente()+PokemonManager.queryByNameOfPokemon("Charmander").getHp());
            //Se añade movimientos a cada pokemon (4 por pokemon)
            for(int i=0;i<entrenador_op.getPokemon().size();i++)
            PokemonManager.addMovimientos(entrenador_op.getPokemon().get(i));
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        escritorio.add(formop);
        formop.show();
        formop.lblnopentrenador.setText(entrenador_op.getNombre());
        formop.lblnumvictorias.setText(""+entrenador_op.getBatallas_ganadas());
        formop.lblnumderrotas.setText(""+entrenador_op.getBatallas_perdidas());

        //mostrar pokemons
        ImageIcon icon1=new ImageIcon(entrenador_op.getPokemon().get(0).getImage());
        formop.nombPokemon1.setText(entrenador_op.getPokemon().get(0).getNombre());
        formop.lblpokemon1.setIcon(icon1);

        ImageIcon icon2=new ImageIcon(entrenador_op.getPokemon().get(1).getImage());
        formop.nombPokemon2.setText(entrenador_op.getPokemon().get(1).getNombre());
        formop.lblpokemon2.setIcon(icon2);

        ImageIcon icon3=new ImageIcon(entrenador_op.getPokemon().get(2).getImage());
        formop.nombPokemon3.setText(entrenador_op.getPokemon().get(2).getNombre());
        formop.lblpokemon3.setIcon(icon3);
        
        
        //Se prepara el entrenador
        
        
        escritorio.add(formDataGame);
        formDataGame.show();
        
        
        
        
    }//GEN-LAST:event_newgameActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_exitActionPerformed

    private void chosepokemonsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chosepokemonsActionPerformed
        
        escritorio.add(formChosePok);
        formChosePok.show();
        
        entrenador.setNombre(formDataGame.getNombEntrenador());
        entrenador.setBatallas_ganadas(0);
        entrenador.setBatallas_perdidas(0);
        entrenador.setRegDate(new Date());
        try {
            PokemonManager.addEntrenador(entrenador);
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        formChosePok.lblnentrenador.setText("Bienvenido entrenador "+entrenador.getNombre());
        
        int []poks=new int[3];
        List<Pokemon> listPokemon = null;
        try {
            listPokemon = PokemonManager.queryAllPokemon();
        } catch (SQLException ex) {
            Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        for(int i=0;i<listPokemon.size();i++){
            formChosePok.tablepokemon.setValueAt(listPokemon.get(i).getNombre(), i, 0);
            formChosePok.tablepokemon.setValueAt(listPokemon.get(i).getTipo(), i, 1);
//            ImageIcon icon=new ImageIcon(listPokemon.get(i).getImage());
//            formChosePok.tablepokemon.setValueAt(icon.getImage(), i, NORMAL);
        }
        
        
        
    }//GEN-LAST:event_chosepokemonsActionPerformed

    private void btnbatallaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatallaActionPerformed
        //Setear pokemons del entrenador
        for(int i=0;i<formChosePok.tablepokemon.getRowCount();i++){ 
            if(String.valueOf(formChosePok.tablepokemon.getValueAt(i, 2))=="true"){
                String nomPokemon=String.valueOf(formChosePok.tablepokemon.getValueAt(i, 0));
                try {
                    Pokemon pokemon=PokemonManager.queryByNameOfPokemon(nomPokemon);
                    entrenador.addPokemon(pokemon);
                    batalla.setHp_entrenador(batalla.getHp_entrenador()+pokemon.getHp());
                } catch (SQLException ex) {
                    Logger.getLogger(VentanaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
  
        escritorio.add(formbatalla);
        formbatalla.show();
        //Setear datos del entrenador
        //Progress bar (HP)
        formbatalla.hpentrenador.setMaximum(batalla.getHp_entrenador());
        formbatalla.hpentrenador.setValue(batalla.getHp_entrenador());
        formbatalla.hpentrenador.setStringPainted(true);
        formbatalla.hpentrenador.setString("HP: "+batalla.getHp_entrenador());
        
        formbatalla.lblentrenador.setText(entrenador.getNombre());
        formbatalla.pokemon1.setText(entrenador.getPokemon().get(0).getNombre());
        formbatalla.pokemon2.setText(entrenador.getPokemon().get(1).getNombre());
        formbatalla.pokemoncurrent.setText(entrenador.getPokemon().get(2).getNombre());
        
        ImageIcon icon=new ImageIcon(entrenador.getPokemon().get(2).getImage());
        formbatalla.imgcurrpokemon.setIcon(icon);
        
        //Setear datos del entrenador oponente
        formbatalla.hpentrenadorop.setMaximum(batalla.getHp_oponente());
        formbatalla.hpentrenadorop.setValue(batalla.getHp_oponente());
        formbatalla.hpentrenadorop.setStringPainted(true);
        formbatalla.hpentrenadorop.setString("HP: "+batalla.getHp_oponente());
        
        formbatalla.lblopentrenador.setText(entrenador_op.getNombre());
        formbatalla.pokemonop1.setText(entrenador_op.getPokemon().get(0).getNombre());
        formbatalla.pokemonop2.setText(entrenador_op.getPokemon().get(1).getNombre());
        formbatalla.pokemoncurrentop.setText(entrenador_op.getPokemon().get(2).getNombre());
        
        ImageIcon iconop=new ImageIcon(entrenador_op.getPokemon().get(2).getImage());
        formbatalla.imgcurrpokemonop.setIcon(iconop);
        
        
    }//GEN-LAST:event_btnbatallaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnbatalla;
    private javax.swing.JMenuItem chosepokemons;
    private javax.swing.ButtonGroup dificultadgroup;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.ButtonGroup modobatalla;
    private javax.swing.JMenuItem newgame;
    // End of variables declaration//GEN-END:variables
}
