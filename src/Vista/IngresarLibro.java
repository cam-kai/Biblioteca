/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DAO.EditorialDAO;
import DAO.EstadoDAO;
import DAO.LibrosDAO;
import Entidades.Editorial;
import Entidades.Estado;
import Entidades.Libro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author camila
 */
public class IngresarLibro extends javax.swing.JFrame {

    /**
     * Creates new form IngresarLibro
     */
    public IngresarLibro() {
        initComponents();
        modificarCboEstado();
        modificarCboEditorial();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNumeroSerie = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtNumeroPaginas = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPrecioReferencial = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cboEditorial = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        txtAnioPublicacion = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnAgregarEditorial = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel1.setText("Ingresar Libro");
        jLabel1.setToolTipText("");

        jLabel2.setText("Numero de serie :");

        jLabel3.setText("Titulo :");

        txtTitulo.setToolTipText("");

        jLabel4.setText("Numero de Páginas :");

        jLabel5.setText("Precio Referencial :");

        jLabel6.setText("Estado :");

        cboEstado.setModel(cboEstado.getModel());
        cboEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstadoActionPerformed(evt);
            }
        });

        jLabel7.setText("Editorial : ");

        cboEditorial.setModel(cboEditorial.getModel());
        cboEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEditorialActionPerformed(evt);
            }
        });

        jLabel8.setText("Año de publicación :");

        txtAnioPublicacion.setToolTipText("");

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnAgregarEditorial.setText("Agregar");
        btnAgregarEditorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarEditorialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLimpiar)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPrecioReferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtNumeroPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTitulo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(31, 31, 31)
                                        .addComponent(txtNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel8)
                                            .addComponent(btnSalir))
                                        .addGap(18, 18, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(cboEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(cboEditorial, 0, 151, Short.MAX_VALUE))
                                            .addComponent(txtAnioPublicacion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarEditorial)
                    .addComponent(btnGuardar))
                .addGap(55, 55, 55))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtNumeroPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtPrecioReferencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarEditorial))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtAnioPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGuardar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalir))
                .addGap(27, 27, 27))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void cboEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstadoActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_cboEstadoActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        boolean fueAgregado = false;
        Libro libro = new Libro();
        libro.setNumeroSerie(Integer.parseInt(txtNumeroSerie.getText()));
        libro.setTitulo(txtTitulo.getText());
        libro.setNumeroPaginas(Integer.parseInt(txtNumeroPaginas.getText()));
        libro.setPrecioReferencial(Integer.parseInt(txtPrecioReferencial.getText()));
        
        int id =cboEstado.getSelectedIndex();
        if(id==0){
            JOptionPane.showMessageDialog(null, "Seleccione un Estado");
        }else if( id != 0){
            Estado estado= new EstadoDAO().buscarPorID(id);
            libro.setEstado(estado);
        }
        int idEd = cboEditorial.getSelectedIndex();
        if(idEd == 0){
            JOptionPane.showMessageDialog(null, "Seleccione una editorial");
        } else if (idEd!= 0){
            Editorial editorial = new EditorialDAO().buscarPorId(idEd);
            libro.setEditorial(editorial);
        }
        libro.setAnio_publicacion(Integer.parseInt(txtAnioPublicacion.getText()));
        
        fueAgregado = new LibrosDAO().agregarLibro(libro);
        if(fueAgregado = true){
            JOptionPane.showMessageDialog(null, "El libro fue agregado correctamente");
        }else{
            JOptionPane.showMessageDialog(null, "El libro no ha podido ser agregado");
            
        }
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cboEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEditorialActionPerformed

    private void btnAgregarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEditorialActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnAgregarEditorialActionPerformed

    public void modificarCboEstado(){
        EstadoDAO estadoDao = new EstadoDAO();
        ArrayList<Estado> estados = estadoDao.listarEstados();
        
        cboEstado.addItem("Seleccionar");
        for (Estado estado : estados) {
            cboEstado.addItem(estado.getEstado());
            
        }
    }
    
    public void modificarCboEditorial(){
        EditorialDAO editorialDao = new EditorialDAO();
        ArrayList<Editorial> editoriales = editorialDao.listarEditoriales();
        cboEditorial.addItem("Seleccionar");
        for (Editorial editorial : editoriales) {
            cboEditorial.addItem(editorial.getEditorial());
        }
    }
    
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
            java.util.logging.Logger.getLogger(IngresarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresarLibro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresarLibro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarEditorial;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboEditorial;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtAnioPublicacion;
    private javax.swing.JTextField txtNumeroPaginas;
    private javax.swing.JTextField txtNumeroSerie;
    private javax.swing.JTextField txtPrecioReferencial;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}