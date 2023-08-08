/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
import Conexion_Base.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author kevin
 */
public class Crud_Nuevo extends javax.swing.JFrame {

    Conexion con = new Conexion();
    Connection cn = con.getConnection();
    Statement st;
    ResultSet rs;
    DefaultTableModel modelo;
    int id;
    
    
    
    
    
    public Crud_Nuevo() {
        initComponents();
        setLocationRelativeTo(null);
        listar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMat = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSem = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtNam = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        FondoCero = new javax.swing.JLabel();
        FondoUno = new javax.swing.JLabel();
        FondoDos = new javax.swing.JLabel();
        Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, -1));

        txtID.setEditable(false);
        txtID.setEnabled(false);
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 30, -1));

        jLabel3.setText("Matricula");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, 20));
        jPanel1.add(txtMat, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, 120, -1));

        jLabel4.setText("Semestre");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));
        jPanel1.add(txtSem, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 120, -1));

        jLabel5.setText("Nombre");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));
        jPanel1.add(txtNam, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 120, -1));

        btnAgregar.setBackground(new java.awt.Color(0, 204, 51));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, -1, -1));

        btnNuevo.setBackground(new java.awt.Color(51, 255, 102));
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        jPanel1.add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, 80, -1));

        btnEliminar.setBackground(new java.awt.Color(255, 51, 51));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        btnModificar.setBackground(new java.awt.Color(255, 255, 51));
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        jPanel1.add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        TablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_Alumno", "Matricula", "Semestre", "Nombre"
            }
        ));
        TablaDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaDatos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 310, 320));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_linea_1.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 190, 10));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_linea_1.jpg"))); // NOI18N
        jLabel6.setText("jLabel1");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 190, 10));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jLabel7.setText("Acciones");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 90, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 2, 18)); // NOI18N
        jLabel8.setText("Informacion General");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, 170, 40));

        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 250, 150, -1));

        FondoCero.setBackground(new java.awt.Color(255, 255, 255));
        FondoCero.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo_w.jpg"))); // NOI18N
        jPanel1.add(FondoCero, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 190, 230, 150));

        FondoUno.setBackground(new java.awt.Color(255, 255, 255));
        FondoUno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo_w.jpg"))); // NOI18N
        jPanel1.add(FondoUno, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, 230, 150));

        FondoDos.setBackground(new java.awt.Color(255, 255, 255));
        FondoDos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo_w.jpg"))); // NOI18N
        jPanel1.add(FondoDos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 230, 310));

        Titulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo_prin.jpg"))); // NOI18N
        jPanel1.add(Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 370));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 862, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
       agregar();
       limpiartabla();
       listar();
        //try {//
            //PreparedStatement pps = cn.prepareStatement("INSERT INTO alumnos(Matricula,Semestre,Nombre) VALUES (?,?,?,?)");
           // pps.setString(1, txtMat.getText());
           // pps.setString(1, txtSem.getText());
          //  pps.setString(1, txtNam.getText());
          //  int executeUpdate = pps.executeUpdate();
        //    JOptionPane.showMessageDialog(null,"Alumno Agregado Con exito");
                
        //} catch (SQLException ex) {
       //     Logger.getLogger(Crud_Nuevo.class.getName()).log(Level.SEVERE, null, ex);
      //  }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       eliminar();
       limpiartabla();
       listar();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
      modificar();
      limpiartabla();
      listar();
       
    }//GEN-LAST:event_btnModificarActionPerformed

    private void TablaDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaDatosMouseClicked
        int fila=TablaDatos.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(null,"No seleccion");
        }else{
            id=Integer.parseInt((String)TablaDatos.getValueAt(fila, 0).toString());
            String matricula=(String)TablaDatos.getValueAt(fila, 1);
            String semestre=(String)TablaDatos.getValueAt(fila, 2);
            String nombre=(String)TablaDatos.getValueAt(fila, 3);
            txtID.setText(""+id);
            txtMat.setText(""+matricula);
            txtSem.setText(""+semestre);
            txtNam.setText(""+nombre);
        }
    }//GEN-LAST:event_TablaDatosMouseClicked

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(Crud_Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crud_Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crud_Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crud_Nuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crud_Nuevo().setVisible(true);
            }
        });
    }
    
    void listar(){
        String sql="select * from alumnos";
        try {
            cn=con.getConnection();
            st=cn.createStatement();
            rs=st.executeQuery(sql);
            Object[]alumnos=new Object[4];
            modelo=(DefaultTableModel)TablaDatos.getModel();
            while (rs.next()){
                alumnos[0]=rs.getInt("ID_Alumno");
                alumnos[1]=rs.getString("Matricula");
                alumnos[2]=rs.getString("Semestre");
                alumnos[3]=rs.getString("Nombre");
                modelo.addRow(alumnos);
            }
            TablaDatos.setModel(modelo);
        }catch (Exception e){
        }
    }
    
    void agregar(){
        String matricula=txtMat.getText();
        String semestre=txtSem.getText();
        String nombre=txtNam.getText();
        if(matricula.equals("")||semestre.equals("")||nombre.equals("")){
            JOptionPane.showMessageDialog(null,"Cuadros de texto vacíos");
            
        }else{
            String sql="insert into alumnos(Matricula,Semestre,Nombre)values('"+matricula+"','"+semestre+"','"+nombre+"')";
            try {
                cn=con.getConnection();
                st=cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Alumno agregado con éxito");
                
            }catch (Exception e){}
        }
        
    }
    
    void modificar(){
        String matricula=txtMat.getText();
        String semestre=txtSem.getText();
        String nombre=txtNam.getText();
        String sql = "update alumnos set Matricula='"+matricula+"',Semestre='"+semestre+"',Nombre='"+nombre+"'where ID_Alumno='"+id+"'";
        
        if(matricula.equals("")||semestre.equals("")||nombre.equals("")){
            JOptionPane.showMessageDialog(null,"debe ingresar datos");
            
        }else{
             try {
                cn=con.getConnection();
                st=cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"Alumno Modificado Con exito");
                limpiartabla();
            }catch (Exception e){}
        }
    }
    
    void eliminar(){
        int filaselec=TablaDatos.getSelectedRow();
        if(filaselec == -1){
            JOptionPane.showMessageDialog(null,"seleccione una fila");
        }else{
            String sql="delete from alumnos where ID_Alumno='"+id+"'";
            try{
                cn = con.getConnection();
                st = cn.createStatement();
                st.executeUpdate(sql);
                JOptionPane.showMessageDialog(null,"alumno eliminado");
                limpiartabla();
            }catch (Exception e){
            }
        }
    }
    void nuevo(){
        txtID.setText("");
        txtMat.setText("");
        txtSem.setText("");
        txtNam.setText("");
        txtMat.requestFocus();
    }
    public void limpiartabla(){
    DefaultTableModel temp = (DefaultTableModel) TablaDatos.getModel();
    int filas = TablaDatos.getRowCount();

    for (int a = 0; filas > a; a++) {
        temp.removeRow(0);
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FondoCero;
    private javax.swing.JLabel FondoDos;
    private javax.swing.JLabel FondoUno;
    private javax.swing.JTable TablaDatos;
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtMat;
    private javax.swing.JTextField txtNam;
    private javax.swing.JTextField txtSem;
    // End of variables declaration//GEN-END:variables

   
}
