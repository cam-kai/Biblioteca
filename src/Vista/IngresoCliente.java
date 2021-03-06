/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DAO.ClientesDAO;
import Entidades.Cliente;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.scripts.JO;

/**
 *
 * @author camila
 */
public class IngresoCliente extends javax.swing.JFrame {

    /**
     * Creates new form IngresoTrabajador
     */
    public IngresoCliente() {
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
        txtFechaNacimiento = new javax.swing.JTextField();
        txtDigitoVerificador = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        txtTelefono = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel1.setText("Ingrese cliente");

        jLabel2.setText("Rut ");

        jLabel3.setText("Apellido Paterno");

        jLabel4.setText("Nombre");

        jLabel5.setText("Apellido Materno");

        jLabel6.setText("Dirección ");

        jLabel7.setText("Fecha de nacimiento");

        txtRut.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtRutFocusLost(evt);
            }
        });

        txtFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoActionPerformed(evt);
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

        jLabel10.setText("Telefono ");

        jLabel11.setText("Correo ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(btnSalir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar)
                .addGap(43, 43, 43)
                .addComponent(btnAgregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(181, 181, 181)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(15, 15, 15))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addGap(38, 38, 38))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(38, 38, 38)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtCorreo, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtApellidoMaterno, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtApellidoPaterno, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(txtRut, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtDigitoVerificador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(txtNombre, javax.swing.GroupLayout.Alignment.TRAILING)))))
                .addContainerGap(235, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnLimpiar)
                    .addComponent(btnSalir))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        
        Cliente cliente = new Cliente();
        String fechaN =txtFechaNacimiento.getText();
        String rut = txtRut.getText();
        String dV = txtDigitoVerificador.getText();
        String nombre = txtNombre.getText();
        String apellidoP =txtApellidoPaterno.getText();
        String apellidoM = txtApellidoMaterno.getText();
        String direccion = txtDireccion.getText();
        String correo= txtCorreo.getText();
        String telefono = txtTelefono.getText();
        
        boolean fueModificado = false;
        boolean fueAgregado = false;
        
        LocalDate hoy = LocalDate.now();
        DateTimeFormatter form = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String fechaActual = String.valueOf(hoy.format(form));
        int anioActual = Integer.parseInt(fechaActual.substring(7,10));
        int anioIngresado = Integer.parseInt(fechaN.substring(7,10));
        int anios = anioActual-anioIngresado;
        
        
        ArrayList<String> errores = new Utilidades.Generales().validacionesClienteTrabajador(fechaN, rut, dV, nombre, apellidoP, apellidoM, direccion, correo, telefono);
        if(anios < 18){
            String error = "Se deben ingresar solo personas de 18 años en adelante";
            errores.add(error);
        }
        String[] mensaje = new String[errores.size()];
        if(errores.size()>0){
            int contadorE = 0;
            for (String error : errores) {
                mensaje[contadorE]= " - " + error ;
                contadorE ++ ;
            }
            JOptionPane.showMessageDialog(null, mensaje, "Usted tiene los siguientes errores:",JOptionPane.ERROR_MESSAGE);
        }else{
            int rutC = Integer.parseInt(rut);
            
            boolean valido = new Utilidades.Generales().verificarRut(rutC, dV);
            if (valido == true) {

                cliente.setRut(rutC);
                cliente.setDigitoVerificador(dV);
                cliente.setNombre(nombre);
                cliente.setApellido_paterno(apellidoP);
                cliente.setApellido_materno(apellidoM);
                cliente.setDireccion(direccion);
                cliente.setCorreo(correo);
                cliente.setTelefono(Integer.parseInt(telefono));
                SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
                try {
                    cliente.setFechaNacimiento(df.parse(fechaN));
                } catch (ParseException ex) {
                    Logger.getLogger(IngresoCliente.class.getName()).log(Level.SEVERE, null, ex);
                }
                Cliente clienteExiste = new ClientesDAO().buscarPorRut(rutC);
                if(clienteExiste != null){
                    cliente.setId_cliente(clienteExiste.getId_cliente());
                    fueModificado = new ClientesDAO().modificarClientes(cliente);
                    if (fueModificado==true){
                        fueAgregado=true;
                    }
                }else{
                    fueAgregado = new ClientesDAO().agregarClientes(cliente);
                }
            }else{
                JOptionPane.showMessageDialog(null, "El rut del cliente no es valido");
            }
            if (fueAgregado == true) {
                JOptionPane.showMessageDialog(this, "El cliente fue agregado correctamente");

            } else {
                JOptionPane.showMessageDialog(null, "El cliente no ha podido ser agregado");
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    
    private void txtRutFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtRutFocusLost
        int rutABuscar = Integer.parseInt(txtRut.getText());
        Cliente cliente = new ClientesDAO().buscarPorRut(rutABuscar);
        txtRut.enable(false);
        txtDigitoVerificador.setText(cliente.getDigitoVerificador());
        txtNombre.setText(cliente.getNombre());
        txtApellidoPaterno.setText(cliente.getApellido_paterno());
        txtApellidoMaterno.setText(cliente.getApellido_materno());
        txtDireccion.setText(cliente.getDireccion());
        txtCorreo.setText(cliente.getCorreo());
        txtTelefono.setText(Integer.toString(cliente.getTelefono()));
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        txtFechaNacimiento.setText(df.format(cliente.getFechaNacimiento()));
        
        
        
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
        txtFechaNacimiento.setText("");
        
        
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(IngresoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDigitoVerificador;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
