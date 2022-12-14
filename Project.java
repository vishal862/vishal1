
//import com.sun.jdi.connect.spi.Connection;
import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Vishal
 */
public class Project extends javax.swing.JFrame {

    
    
    /**
     * Creates new form Project
     */
    public Project() {
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        dur = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        update = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton5.setText("Add ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 179, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jLabel2.setText("Project Details");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(327, 16, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("Project ID");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel4.setText("Duration");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel5.setText("Project Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));
        getContentPane().add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 110, 133, -1));
        getContentPane().add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 70, 133, -1));
        getContentPane().add(dur, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 150, 133, -1));

        jTable1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P_ID", "Project Name", "Duration"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTable1ComponentAdded(evt);
            }
        });
        jTable1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jTable1AncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 179, 580, 337));

        jButton1.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 229, -1, -1));

        update.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 279, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton3.setText("Print");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 329, -1, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 379, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(624, 429, -1, -1));

        jPanel3.setBackground(new java.awt.Color(204, 204, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 50, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 50));

        jPanel4.setBackground(new java.awt.Color(25, 149, 173));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(625, 428, -1, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 770, 480));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
      
       
       try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","vishal");
            String s="insert into Project (P_ID,Proj_Name,Duration) values (?,?,?)";
            PreparedStatement ptst= conn.prepareStatement(s);
            ptst.setString(1,id.getText());
            ptst.setString(2,name.getText());
            ptst.setString(3,dur.getText());
     
            ptst.execute();
            JOptionPane.showMessageDialog(this,"Added Succesfully");
            Statement st = conn.createStatement();
            String sql= "Select * from Project";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            tblModel.setRowCount(0);
            while(rs.next()){
                String P_ID = String.valueOf(rs.getInt("P_ID"));
                String Proj_Name = rs.getString("Proj_Name");
                String Duration = rs.getString("Duration");
               
                String tbData[] = {P_ID,Proj_Name,Duration};

                tblModel.addRow(tbData);
            }
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
        id.setText("");
        name.setText("");
        dur.setText("");
       
        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        String ID = (String) jTable1.getModel().getValueAt(i, 0);
        String sql= "Delete FRom Project where P_ID="+ID;
        try{
               Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","vishal");
PreparedStatement ptst= conn.prepareStatement(sql);
ptst.execute();
       JOptionPane.showMessageDialog(this, "deleted succesfully");
DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        
        if(jTable1.getSelectedRowCount()==1)
        {
            tblModel.removeRow(jTable1.getSelectedRow());
        }
        else
        {
            if(jTable1.getSelectedRowCount()==0)
            {
                 JOptionPane.showMessageDialog(this, "table is empty");
            }
            else
            {
                 JOptionPane.showMessageDialog(this, "please select single Row to delete");

            }
        }
        }catch(Exception e){
                JOptionPane.showMessageDialog(this,e);
                }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
    
  
      try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","vishal");
            
           int i = jTable1.getSelectedRow();
           String P_ID = (jTable1.getModel().getValueAt(i, 0).toString());
           String Query = "update Project set Proj_Name=?,Duration=? where P_id="+P_ID;
            PreparedStatement ptst= conn.prepareStatement(Query);
            // ptst.setString(1,id.getText());
             ptst.setString(1,name.getText());
            ptst.setString(2,dur.getText());
            
            ptst.execute();
            
            JOptionPane.showMessageDialog(this,"Updated Succesfully");
           
             Statement st = conn.createStatement();
             String sql= "Select * from Project";
             ResultSet rs = st.executeQuery(sql);
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
              tblModel.setRowCount(0);
              
             while(rs.next()){
                  P_ID = String.valueOf(rs.getInt("P_ID"));
                 String Emp_Name = rs.getString("Proj_Name");
                  String City = rs.getString("Duration");
                 
                 String tbData[] = {P_ID,Emp_Name,City}; 
 
                 tblModel.addRow(tbData);     
                         }
              }
    
             
      catch(Exception e){
         JOptionPane.showMessageDialog(this, e);
      }
  
  
                                

     
    

    }//GEN-LAST:event_updateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
                  DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
                  
                  String tblid = tblModel.getValueAt(jTable1.getSelectedRow(),0).toString();
                  String tblname = tblModel.getValueAt(jTable1.getSelectedRow(),1).toString();
                  String tbldur = tblModel.getValueAt(jTable1.getSelectedRow(),2).toString();
                  
                  id.setText(tblid);
                  name.setText(tblname);
                  dur.setText(tbldur);
                  
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         MessageFormat header = new MessageFormat("Printing in Progress");
        MessageFormat footer = new MessageFormat("Page{0,number,integer}");
        
        try
        {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        }
        catch(java.awt.print.PrinterException e)
        {
            System.err.format("No printer found",e.getMessage());
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        id.setText("");
        name.setText("");
        dur.setText("");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit","MySql Connector",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here: 
        Admin addd = new Admin();
        addd.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
          try{
                    java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","vishal");
        Statement st = conn.createStatement();
             String sql= "Select * from Project";
             ResultSet rs = st.executeQuery(sql);
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
              tblModel.setRowCount(0);
             while(rs.next()){
                 String P_ID = String.valueOf(rs.getInt("P_ID"));
                 String Emp_Name = rs.getString("Proj_Name");
                  String City = rs.getString("Duration");
               
                 String tbData[] = {P_ID,Emp_Name,City};
 
                 tblModel.addRow(tbData);    
                         }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
           
    }//GEN-LAST:event_jTable1AncestorAdded

    private void jTable1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable1ComponentAdded
        // TODO add your handling code here:
          try
        {  Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn = java.sql.DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","vishal");
         String sql = "select * from Project";
        PreparedStatement ptst= conn.prepareStatement(sql); 
        ptst.execute();
         DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        String P_ID = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
                  String Proj_Name = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
                  String Duration = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
                  
                  id.setText(P_ID);
                  name.setText(Proj_Name);
                  dur.setText(Duration);
                  
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
    
    }//GEN-LAST:event_jTable1ComponentAdded

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
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Project.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Project().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField dur;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable1;
    private javax.swing.JTextField name;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables

    private static class DriverManager {

        private static Connection getConnection(String jdbcmysqllocalhost3306Employee, String root, String vishal) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public DriverManager() {
        }
    }
}
