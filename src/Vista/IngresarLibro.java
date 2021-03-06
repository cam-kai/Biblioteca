/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import DAO.AutorDAO;
import DAO.CategoriaDAO;
import DAO.EditorialDAO;
import DAO.EstadoDAO;
import DAO.IdiomasDAO;
import DAO.LibrosDAO;
import DAO.RelLibroAutorDAO;
import DAO.RelLibroCategoriaDAO;
import DAO.RelLibroIdiomaDAO;
import DAO.StockDAO;
import Entidades.Autores;
import Entidades.Categorias;
import Entidades.Editorial;
import Entidades.Estado;
import Entidades.Idiomas;
import Entidades.Libro;
import Entidades.StockLibro;
import Utilidades.IEntitySave;
import Utilidades.SuperList;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.ListModel;
import javax.swing.event.ListDataListener;

/**
 *
 * @author camila
 */
public class IngresarLibro extends javax.swing.JFrame implements IEntitySave{
    SuperList<Autores> autores = new AutorDAO().listarAutores();
    SuperList<Idiomas> idiomas = new IdiomasDAO().listarIdiomas();
    SuperList<Categorias> categorias = new CategoriaDAO().listarCategorias();
   
    
    
    /**
     * Creates new form IngresarLibro
     */
    public IngresarLibro() {
        initComponents();
        modificarCboEstado();
        modificarCboEditorial();
        ListAutores.setListData(autores.getArray());
        ListCategorias.setListData(categorias.getArray());
        ListIdiomas.setListData(idiomas.getArray());
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
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListAutores = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        ListIdiomas = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        ListCategorias = new javax.swing.JList<>();
        AgregarAutor = new javax.swing.JButton();
        AgregarIdioma = new javax.swing.JButton();
        AgregarCategoria = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Noto Sans", 0, 24)); // NOI18N
        jLabel1.setText("Ingresar Libro");
        jLabel1.setToolTipText("");

        jLabel2.setText("Numero de serie :");

        txtNumeroSerie.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNumeroSerieFocusLost(evt);
            }
        });
        txtNumeroSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroSerieActionPerformed(evt);
            }
        });

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

        jLabel9.setText("Autor : ");

        jLabel10.setText("Idioma : ");

        jLabel11.setText("Categoria : ");

        ListAutores.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(ListAutores);

        ListIdiomas.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(ListIdiomas);

        ListCategorias.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(ListCategorias);

        AgregarAutor.setText("Agregar");
        AgregarAutor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarAutorActionPerformed(evt);
            }
        });

        AgregarIdioma.setText("Agregar");
        AgregarIdioma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarIdiomaActionPerformed(evt);
            }
        });

        AgregarCategoria.setText("Agregar");
        AgregarCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCategoriaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtAnioPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cboEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(btnAgregarEditorial)
                                .addGap(50, 50, 50)
                                .addComponent(jLabel6)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel9)
                                .addGap(336, 336, 336))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnSalir)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(AgregarIdioma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(AgregarCategoria))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(btnLimpiar)
                                    .addGap(122, 122, 122)
                                    .addComponent(btnGuardar))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(27, 27, 27)
                .addComponent(AgregarAutor)
                .addGap(55, 55, 55))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNumeroPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPrecioReferencial, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(0, 208, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrecioReferencial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel3)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(cboEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregarEditorial)
                    .addComponent(jLabel6)
                    .addComponent(cboEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAnioPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel8)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(AgregarAutor))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(AgregarIdioma)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel11)
                    .addComponent(AgregarCategoria))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalir, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnLimpiar)
                            .addComponent(btnGuardar))
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
        txtNumeroSerie.setText("");
        txtNumeroPaginas.setText("");
        txtTitulo.setText("");
        txtPrecioReferencial.setText("");
        txtAnioPublicacion.setText("");
        cboEstado.setSelectedIndex(0);
        cboEditorial.setSelectedIndex(0);
        ListAutores.clearSelection();
        ListCategorias.clearSelection();
        ListIdiomas.clearSelection();
                
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
        StockLibro stock = new StockLibro();
        Libro id_libro = new LibrosDAO().buscarPorISBN(Integer.parseInt(txtNumeroSerie.getText()));
        stock.setId_libro(id_libro.getId_libro());
        stock.setStock_libro(0);
        boolean agregarRelacionStock = new StockDAO().agregarStock(stock);
        
        
        int[] autores =ListAutores.getSelectedIndices();
        if(autores.length==0){
            JOptionPane.showMessageDialog(null, "Seleccione al menos un autor");
        }else{
            int[] ids = new int[autores.length];
            int i =0;
            for (int autore : autores) {
                ids[i] = this.autores.get(autore).getId_autores();
                libro = new LibrosDAO().buscarPorISBN(Integer.parseInt(txtNumeroSerie.getText()));
                boolean agregadaRelLibroAutores = new RelLibroAutorDAO().agregarLibroAutor(libro, ids[i]);
                
                i++;
                
            }
            
        }
        
        int[] indIdiomas = ListIdiomas.getSelectedIndices();
        if(indIdiomas.length==0){
            JOptionPane.showMessageDialog(null, "Seleccione al menos un idioma");
        }else{
            int[] ids = new int[indIdiomas.length];
            int i = 0;
            for (int indice : indIdiomas) {
                ids[i] = this.idiomas.get(indice).getId_idiomas();
                libro = new LibrosDAO().buscarPorISBN(Integer.parseInt(txtNumeroSerie.getText()));
                boolean agregadaRelLibroIdioma = new RelLibroIdiomaDAO().agregarRelLibroIdioma(libro, ids[i]);
                 
                i++;
            }
        }
        

        int[] indCategoria = ListCategorias.getSelectedIndices();
        if(indCategoria.length==0){
            JOptionPane.showMessageDialog(null, "Seleccione al menos una categoria");
        }else{
            int[] ids = new int[indCategoria.length];
            int i=0;
            for (int indice : indCategoria) {
                ids[i]= this.categorias.get(indice).getId_categoria();
                libro = new LibrosDAO().buscarPorISBN(Integer.parseInt(txtNumeroSerie.getText()));
                boolean agregadaRelLibroCategoria = new RelLibroCategoriaDAO().agregarRelLibroCategoria(libro, ids[i]);
                
                i++;
                
            }
        }
        
        
        
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void cboEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEditorialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboEditorialActionPerformed

    private void btnAgregarEditorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarEditorialActionPerformed
        // TODO add your handling code here:
        IngresarEditorial agregar = new IngresarEditorial();
        agregar.setVisible(true);
        agregar.setiEntitySave(this);
        
    }//GEN-LAST:event_btnAgregarEditorialActionPerformed

    private void txtNumeroSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroSerieActionPerformed

    private void txtNumeroSerieFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNumeroSerieFocusLost
        // TODO add your handling code here:
        if(txtNumeroSerie.getText().equalsIgnoreCase("")){
            JOptionPane.showMessageDialog(null, " El campo numero de serie no puede estar vacio");
        }else{
        
        int numeroSerie=Integer.parseInt(txtNumeroSerie.getText());
        boolean existe = (new LibrosDAO().buscarPorISBN(numeroSerie)!=null);
        if(existe == true){
            JOptionPane.showMessageDialog(null, "Ese numero de sarie ya existe");
        }
        }
    }//GEN-LAST:event_txtNumeroSerieFocusLost

    private void AgregarAutorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarAutorActionPerformed
        // TODO add your handling code here:
        IngresarAutor agregarAutor =  new IngresarAutor();
        agregarAutor.setVisible(true);
        agregarAutor.setiEntitySave(this);
    }//GEN-LAST:event_AgregarAutorActionPerformed

    private void AgregarIdiomaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarIdiomaActionPerformed
        // TODO add your handling code here:
        IngresarIdioma agregarIdioma = new IngresarIdioma();
        agregarIdioma.setVisible(true);
        agregarIdioma.setiEntitySave(this);
    }//GEN-LAST:event_AgregarIdiomaActionPerformed

    private void AgregarCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCategoriaActionPerformed
        // TODO add your handling code here:
        IngresarCategoria agregarCategoria = new IngresarCategoria();
        agregarCategoria.setVisible(true);
        agregarCategoria.setiEntitySave(this);
    }//GEN-LAST:event_AgregarCategoriaActionPerformed

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
    private javax.swing.JButton AgregarAutor;
    private javax.swing.JButton AgregarCategoria;
    private javax.swing.JButton AgregarIdioma;
    private javax.swing.JList<String> ListAutores;
    private javax.swing.JList<String> ListCategorias;
    private javax.swing.JList<String> ListIdiomas;
    private javax.swing.JButton btnAgregarEditorial;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cboEditorial;
    private javax.swing.JComboBox<String> cboEstado;
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
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtAnioPublicacion;
    private javax.swing.JTextField txtNumeroPaginas;
    private javax.swing.JTextField txtNumeroSerie;
    private javax.swing.JTextField txtPrecioReferencial;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables

    @Override
    public void afterSave() {
                
        cboEditorial.removeAllItems();
        cboEditorial.addItem("Seleccione");
        modificarCboEditorial();
        
        SuperList<Autores> autores = new AutorDAO().listarAutores();
        ListAutores.setListData(autores.getArray());
        
        SuperList<Idiomas> idiomas = new IdiomasDAO().listarIdiomas();
        ListIdiomas.setListData(idiomas.getArray());
        
        SuperList<Categorias> categoria =  new CategoriaDAO().listarCategorias();
        ListCategorias.setListData(categoria.getArray());
    }
}
