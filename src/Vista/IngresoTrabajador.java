/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;


import DAO.TrabajadorDAO;
import Entidades.Trabajador;
import java.sql.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author camila
 */
public class IngresoTrabajador extends javax.swing.JFrame {

    /**
     * Creates new form IngresoTrabajador
     */
    public IngresoTrabajador() {
        initComponents();
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
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtApellidoPaterno = new javax.swing.JTextField();
        txtApellidoMaterno = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtFechaContratacion = new javax.swing.JTextField();
        txtDigitoVerificador = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel1.setText("Ingrese trabajador ");

        jLabel2.setText("Rut ");

        jLabel3.setText("Apellido Paterno");

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido Materno");

        jLabel6.setText("Dirección ");

        jLabel7.setText("Fecha Contratación");

        txtRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRutFocusLost(evt);
            }
        });

        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });

        txtApellidoPaterno.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoPaternoFocusLost(evt);
            }
        });

        txtDireccion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDireccionFocusLost(evt);
            }
        });

        txtFechaContratacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtFechaContratacionFocusLost(evt);
            }
        });
        txtFechaContratacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaContratacionActionPerformed(evt);
            }
        });

        txtDigitoVerificador.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDigitoVerificadorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDigitoVerificadorFocusLost(evt);
            }
        });
        txtDigitoVerificador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDigitoVerificadorActionPerformed(evt);
            }
        });

        jLabel8.setText("-");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
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

        txtTelefono.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTelefonoFocusLost(evt);
            }
        });

        jLabel9.setText("Telefono ");

        txtCorreo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCorreoFocusLost(evt);
            }
        });

        jLabel10.setText("Correo ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(20, 20, 20))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(10, 10, 10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel9))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtDireccion)
                                    .addComponent(txtApellidoMaterno)
                                    .addComponent(txtApellidoPaterno)
                                    .addComponent(txtNombre)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(txtRut, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtDigitoVerificador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(txtCorreo)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(27, 27, 27)
                                .addComponent(txtFechaContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(160, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(43, 43, 43)
                .addComponent(btnAgregar)
                .addGap(92, 92, 92))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDigitoVerificador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaContratacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalir))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaContratacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaContratacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaContratacionActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        
        
        Trabajador trabajador = new Trabajador();
        String fechaC =txtFechaContratacion.getText();
        String rut = txtRut.getText();
        String dV = txtDigitoVerificador.getText();
        String nombre = txtNombre.getText();
        String apellidoP =txtApellidoPaterno.getText();
        String apellidoM = txtApellidoMaterno.getText();
        String direccion = txtDireccion.getText();
        String correo= txtCorreo.getText();
        String telefono = txtTelefono.getText();
        
        ArrayList<String> errores = new Utilidades.Generales().validacionesClienteTrabajador(fechaC, rut, dV, nombre, apellidoP, apellidoM, direccion, correo, telefono);
        String[] mensaje = new String[errores.size()];
        if(errores.size()>0){
            int contadorE = 0;
            for (String error : errores) {
                mensaje[contadorE]= " - " + error ;
                contadorE ++ ;
            }
            JOptionPane.showMessageDialog(null, mensaje, "Usted tiene los siguientes errores:",JOptionPane.ERROR_MESSAGE);
        } else {
            int rutT = Integer.parseInt(rut);
            
            boolean valido = new Utilidades.Generales().verificarRut(rutT, dV);
            if(valido == true){
                trabajador.setRutT(rutT);
                trabajador.setDigitoVerificadorT(dV);
                trabajador.setNombreT(nombre);
                trabajador.setApellido_paternoT(apellidoP);
                trabajador.setApellido_maternoT(apellidoM);
                trabajador.setDireccionT(direccion);
                trabajador.setCorreoT(correo);
                trabajador.setTelefonoT(Integer.parseInt(telefono));
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    trabajador.setFechaContrato(df.parse(fechaC));
                } catch (ParseException ex) {
                    Logger.getLogger(IngresoTrabajador.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                boolean fueAgregado = false;

                try {

                    Trabajador trabajadorExiste = new TrabajadorDAO().buscarPorRut(rutT);

                    if (trabajadorExiste != null) {
                        trabajador.setId_trabajador(trabajadorExiste.getId_trabajador());
                        fueAgregado = new TrabajadorDAO().modificarTrabajador(trabajador);

                    } else {

                        fueAgregado = new TrabajadorDAO().agregarTrabajador(trabajador);
                    }

                } catch (Exception e) {
                    System.out.println("" + e.getMessage());
                }

                if (fueAgregado == true) {
                    JOptionPane.showMessageDialog(this, "El trabajador fue agregado correctamente");

                } else {
                    JOptionPane.showMessageDialog(null, "El trabajador no ha podido ser agregado");
                }


            }else{
                JOptionPane.showMessageDialog(null, "El rut es invalido");
            }
            
        }
    
        
        
            
        
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    
    private void txtRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutFocusLost
                
        int rutABuscar = Integer.parseInt(txtRut.getText());
        Trabajador trabajador = new TrabajadorDAO().buscarPorRut(rutABuscar);
        txtRut.enable(false);
        txtDigitoVerificador.setText(trabajador.getDigitoVerificadorT());
        txtNombre.setText(trabajador.getNombreT());
        txtApellidoPaterno.setText(trabajador.getApellido_paternoT());
        txtApellidoMaterno.setText(trabajador.getApellido_maternoT());
        txtDireccion.setText(trabajador.getDireccionT());
        txtCorreo.setText(trabajador.getCorreoT());
        txtTelefono.setText(Integer.toString(trabajador.getTelefonoT()));
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        txtFechaContratacion.setText(df.format(trabajador.getFechaContrato()));
        
        
        
    }//GEN-LAST:event_txtRutFocusLost

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtRut.setText("");
        txtRut.enable(true);
        txtDigitoVerificador.setText("");
        txtNombre.setText("");
        txtApellidoPaterno.setText("");
        txtApellidoMaterno.setText("");
        txtDireccion.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtFechaContratacion.setText("");
        
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtDigitoVerificadorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDigitoVerificadorFocusLost

    }//GEN-LAST:event_txtDigitoVerificadorFocusLost

    private void txtDigitoVerificadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDigitoVerificadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDigitoVerificadorActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        
        
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtApellidoPaternoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoPaternoFocusLost
        
    }//GEN-LAST:event_txtApellidoPaternoFocusLost

    private void txtDireccionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDireccionFocusLost
       
    }//GEN-LAST:event_txtDireccionFocusLost

    private void txtCorreoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCorreoFocusLost
    
    }//GEN-LAST:event_txtCorreoFocusLost

    private void txtTelefonoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTelefonoFocusLost
               
    }//GEN-LAST:event_txtTelefonoFocusLost

    private void txtFechaContratacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtFechaContratacionFocusLost
//        if(txtFechaContratacion.getText().isBlank() == true){
//            JOptionPane.showMessageDialog(null, "Debe ingresar una fecha de contratación");
//        }else if(txtFechaContratacion.getText().contains("/")== false){
//            JOptionPane.showMessageDialog(null, "Debe ingresar la fecha en el siguiente formato : dia/mes/año");
//        }
    }//GEN-LAST:event_txtFechaContratacionFocusLost

    private void txtDigitoVerificadorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDigitoVerificadorFocusGained
        if(Utilidades.Generales.isBlank2(txtRut.getText())){
            JOptionPane.showMessageDialog(null, "Debe ingresar un rut");
        }else if(txtRut.getText().matches("[0-9]+")== false){
            JOptionPane.showMessageDialog(null, "Debe ingresar el rut sin puntos");
        }
    }//GEN-LAST:event_txtDigitoVerificadorFocusGained

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained

    }//GEN-LAST:event_txtNombreFocusGained

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
            java.util.logging.Logger.getLogger(IngresoTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDigitoVerificador;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaContratacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
