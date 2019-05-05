/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.LeerJSON;
import Controlador.LeerXML;
import Modelo.Audio;
import Modelo.Lista;
import Modelo.Playlist;
import java.util.ArrayList;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class VistaReproductor extends javax.swing.JFrame {

    private ArrayList<Object> columna = new ArrayList<Object>();
    private Playlist PlaylistActual = new Playlist();

    /**
     * Creates new form VistaReproductor
     */
    public VistaReproductor() {
        columna.add("Nom");
        columna.add("Autor");
        columna.add("Album");
        columna.add("durada");
        columna.add("ruta");
        setResizable(false);

        initComponents();
        this.rellenar("");
        this.extensible();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCanciones = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<String>();
        btnSiguiente = new javax.swing.JButton();
        txtPlaylist = new javax.swing.JLabel();
        imgPlaylist = new javax.swing.JLabel();
        sliderCancion = new javax.swing.JSlider();
        lblDescripcion = new javax.swing.JLabel();
        btnContinuar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCancion = new javax.swing.JLabel();
        txtAutor = new javax.swing.JLabel();
        txtAlbum = new javax.swing.JLabel();
        btnReproducir = new javax.swing.JButton();
        btnPausa = new javax.swing.JButton();
        btnAnterior = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tableCanciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nom", "Autor", "Album", "Durada", "Ruta"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCanciones);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sin playlist" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        btnSiguiente.setText("Siguiente");

        txtPlaylist.setText("[NOMBRE DE PLAYLIST]");

        imgPlaylist.setText("Descripción Playlist :");

        btnContinuar.setText("Continuar");

        jLabel1.setText("Canción :");

        jLabel2.setText("Autor :");

        jLabel3.setText("Álbum:");

        txtCancion.setText(" ");

        txtAutor.setText(" ");

        txtAlbum.setText(" ");

        btnReproducir.setText("Reproducir");

        btnPausa.setText("Pausa");

        btnAnterior.setText("Anterior");

        btnStop.setText("Stop");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(22, 22, 22)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtPlaylist)
                                            .addComponent(imgPlaylist, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(0, 93, Short.MAX_VALUE)
                                                .addComponent(btnReproducir)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnPausa)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnContinuar)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnStop)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnSiguiente))
                                            .addComponent(sliderCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addContainerGap())))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAutor))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtCancion))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnAnterior))
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPlaylist)
                        .addGap(46, 46, 46)
                        .addComponent(imgPlaylist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCancion))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAutor))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtAlbum))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSiguiente)
                            .addComponent(btnContinuar)
                            .addComponent(btnReproducir)
                            .addComponent(btnPausa)
                            .addComponent(btnAnterior)
                            .addComponent(btnStop))
                        .addGap(35, 35, 35)
                        .addComponent(sliderCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(55, 55, 55))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        String s = (String) jComboBox1.getSelectedItem();

        System.out.println(s);

        switch (s) {
            case "Sin playlist":
                rellenar("");
                break;
            default:
                rellenar(LeerXML.getLectorInstance().getUbiFichero(s));
                break;

        }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void inicio() {
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
            java.util.logging.Logger.getLogger(VistaReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaReproductor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                VistaReproductor vr = new VistaReproductor();
                
                vr.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnterior;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnPausa;
    private javax.swing.JButton btnReproducir;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel imgPlaylist;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JSlider sliderCancion;
    private javax.swing.JTable tableCanciones;
    private javax.swing.JLabel txtAlbum;
    private javax.swing.JLabel txtAutor;
    private javax.swing.JLabel txtCancion;
    private javax.swing.JLabel txtPlaylist;
    // End of variables declaration//GEN-END:variables

    public JButton getPlay() {
        return btnReproducir;
    }

    public JButton getStop() {
        return btnStop;
    }

    public JButton getAnterior() {
        return btnAnterior;
    }

    public JButton getSiguiente() {
        return btnSiguiente;
    }
    
    public JButton getPausa(){
        return btnPausa;
    }
    
    public JButton getContinuar(){
        return btnContinuar;
    }
    
    public void CancionSeleccionadaEnLayout(Audio audio){
        this.txtCancion.setText(audio.getNom());
        this.txtAutor.setText(audio.getAutor());
        this.txtAlbum.setText(audio.getAlbum());
    }

    public void rellenar(String nombre) {
        ArrayList<Object[]> lista = new ArrayList<Object[]>();
        if (nombre.equals("")) {
            Map<Integer, Audio> audios = LeerXML.getLectorInstance().getAudios();
            for (Map.Entry<Integer, Audio> entry : audios.entrySet()) {
                Object[] audio = {entry.getValue().getNom(), entry.getValue().getAutor(), entry.getValue().getAlbum(), entry.getValue().getDurada(), entry.getValue().getRuta()};
                txtPlaylist.setText("Sin Playlist seleccionada");
                lblDescripcion.setText("No tienes ninguna playlist seleccionada.");
                lista.add(audio);
            }
            PlaylistActual = LeerJSON.getlJSONInstance().SeleccionarPlaylist("audios/todas.json");
        } else {
            PlaylistActual = LeerJSON.getlJSONInstance().SeleccionarPlaylist(nombre);

            for (int i = 0; i < PlaylistActual.getPlaylist().length; i++) {
                Audio entry = LeerXML.getLectorInstance().getAudio(PlaylistActual.getPlaylist()[i]);
                Object[] audio = {entry.getNom(), entry.getAutor(), entry.getAlbum(), entry.getDurada(), entry.getRuta()};
                txtPlaylist.setText(PlaylistActual.getNombre());
                lblDescripcion.setText(PlaylistActual.getDescripcion());
                lista.add(audio);
            }
        }
        DefaultTableModel modeloLista = new DefaultTableModel();
        for (Object col : columna) {
            modeloLista.addColumn(col);
        }
        this.tableCanciones.setModel(modeloLista);
        for (Object[] entry : lista) {
            modeloLista.addRow(entry);
        }
        tableCanciones.setModel(modeloLista);

    }

    public void extensible() {
        Map<Integer, Lista> playlists = LeerXML.getLectorInstance().getListas();
        for (Map.Entry<Integer, Lista> entry : playlists.entrySet()) {
            jComboBox1.addItem(entry.getValue().getNom());
        }

    }
}
