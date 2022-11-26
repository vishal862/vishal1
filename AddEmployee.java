/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Vishal
 */
import java.awt.HeadlessException;
import java.sql.*;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
//import com.sun.jdi.connect.spi.Connection;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.util.*;
import javax.swing.JTextField;
public class AddEmployee extends javax.swing.JFrame {

   
/*    private String Emp_Name;
    private String City;
    private int Age;
    private String Email;
    private String Relationship_status;
    private int Mobile;
    private int Salary;
    private String Gender;
    private String DOJ;
    private String Designation;
   // private Object ID;
    */

    /**
     * Creates new form AddEmployee
     */
    public String gender;
    public AddEmployee() {
        initComponents();
      //  String gender ="male";
       // String gender ="female";
       

        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        gender1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        empn = new javax.swing.JTextField();
        city = new javax.swing.JTextField();
        age = new javax.swing.JTextField();
        sal = new javax.swing.JTextField();
        mob = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        date = new com.toedter.calendar.JDateChooser();
        ckbox = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        rln = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        jLabel12.setIcon(new javax.swing.ImageIcon("C:\\Users\\Vishal\\OneDrive\\Documents\\company2.jpg")); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setText("Employee Information");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(711, 6, 390, 54));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel2.setText("Employee Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel3.setText("City");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 160, 37, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("Age");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 204, 37, -1));

        gender1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        gender1.setText("Gender");
        jPanel1.add(gender1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 239, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel6.setText("DOJ");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 279, 37, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel7.setText("Designation");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 317, 117, 22));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel8.setText("Salary");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 360, 60, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel9.setText("Mobile");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 398, 123, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("Rln Status");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 438, 140, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel11.setText("Email");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 478, 43, -1));
        jPanel1.add(empn, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 118, 202, -1));

        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 158, 202, -1));

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 198, 202, -1));
        jPanel1.add(sal, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 358, 168, -1));

        mob.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobActionPerformed(evt);
            }
        });
        jPanel1.add(mob, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 398, 168, -1));

        email.setToolTipText("");
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        jPanel1.add(email, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 478, 174, -1));

        date.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 277, 140, -1));

        ckbox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Developer", "Engineer", "Programmer", "Manager" }));
        jPanel1.add(ckbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 318, 106, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(111, 554, -1, -1));

        buttonGroup1.add(male);
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        jPanel1.add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 238, 98, -1));

        buttonGroup1.add(female);
        female.setText("Female");
        female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleActionPerformed(evt);
            }
        });
        jPanel1.add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(256, 238, 98, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Emp_Name", "City", "Age", "Gender", "DOJ", "Designation", "Salary", "Mobile", "Rln_Status", "Email"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true, true, true, true
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
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jTable1MouseEntered(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 70, 901, 526));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel13.setText("Employee ID");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 80, -1, -1));
        jPanel1.add(id, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 78, 202, -1));

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton1.setText("Add User");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1309, 120, -1, -1));

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1309, 194, 145, -1));

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 350, -1, -1));

        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton5.setText("Remove");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 430, -1, -1));

        jButton6.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton6.setText("Exit");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 500, -1, -1));

        jButton7.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jButton7.setText("Print");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 270, -1, -1));

        rln.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Married", "Not Married" }));
        jPanel1.add(rln, new org.netbeans.lib.awtextra.AbsoluteConstraints(152, 438, -1, -1));

        jPanel2.setBackground(new java.awt.Color(204, 204, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1470, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1470, 70));

        jPanel3.setBackground(new java.awt.Color(25, 149, 173));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1470, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1470, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
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
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:

        frame = new JFrame("Exit");
        if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit","MySql Connector",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            System.exit(0);
        }
        // if((JOptionPane.showConfirmDialog(frame, "Confirm if you want to Exit","MySql Connector",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
         int i = jTable1.getSelectedRow();
        String ID = (String) jTable1.getModel().getValueAt(i, 0);
        String sql= "Delete FRom EmployeeInfo where ID="+ID;
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
        
              
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        id.setText("");
        empn.setText("");
        city.setText("");
        age.setText("");
        ckbox.setSelectedIndex(0);
        sal.setText("");
        mob.setText("");
        rln.setSelectedIndex(0);
        date.setCalendar(null);
      
        male.setSelected(false);
        female.setSelected(false);
        email.setText("");

    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
      
      try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","vishal");
            
           int i = jTable1.getSelectedRow();
           String ID = (jTable1.getModel().getValueAt(i, 0).toString());
           String Query = "update EmployeeInfo set Emp_Name=?,City=?,Age=?,Gender=?,DOJ=?,Designation=?,Salary=?,Mobile=?,Relationship_status=?,email=? where id="+ID;
            PreparedStatement ptst= conn.prepareStatement(Query);
            // ptst.setString(1,id.getText());
             ptst.setString(1,empn.getText());
            ptst.setString(2,city.getText());
              ptst.setString(3,age.getText());
                
            ptst.setString(4, gender);
            ptst.setString(5, ((JTextField)date.getDateEditor().getUiComponent()).getText());

            String desg;
            desg = ckbox.getSelectedItem().toString();
            ptst.setString(6, desg);
            ptst.setString(7, sal.getText());
            ptst.setString(8, mob.getText());
            String status1;
            status1 = rln.getSelectedItem().toString();
            ptst.setString(9, status1);
            ptst.setString(10, email.getText());

            ptst.execute();
            
            JOptionPane.showMessageDialog(this,"Updated Succesfully");
           
             Statement st = conn.createStatement();
             String sql= "Select * from EmployeeInfo";
             ResultSet rs = st.executeQuery(sql);
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
              tblModel.setRowCount(0);
              
             while(rs.next()){
                  ID = String.valueOf(rs.getInt("ID"));
                 String Emp_Name = rs.getString("Emp_Name");
                  String City = rs.getString("City");
                 String Age = String.valueOf(rs.getInt("Age"));
                 String Gender = rs.getString("Gender");
                
                 String DOJ = String.valueOf(rs.getDate("DOJ"));
                 String Designation = rs.getString("Designation");
                 String Salary = String.valueOf(rs.getInt("Salary"));
                  String Mobile = String.valueOf(rs.getLong("Mobile"));
                  String Relationship_status = rs.getString("Relationship_status");
                   String Email = rs.getString("Email");
                 
                 String tbData[] = {ID,Emp_Name,City,Age,Gender,DOJ,Designation,Salary,Mobile,Relationship_status,Email}; 
 
                 tblModel.addRow(tbData);     
                         }
              }
    
             
      catch(Exception e){
         JOptionPane.showMessageDialog(this, e);
      }
  
  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

    
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","vishal");
            String s="insert into Employeeinfo (ID,Emp_Name,City,Age,Gender,DOJ,Designation,Salary,Mobile,Relationship_status,Email) values (?,?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ptst= conn.prepareStatement(s);
            ptst.setString(1,id.getText());
            ptst.setString(2,empn.getText());
            ptst.setString(3,city.getText());
            ptst.setString(4,age.getText());
            ptst.setString(5, gender);
            ptst.setString(6, ((JTextField)date.getDateEditor().getUiComponent()).getText());

            String desg;
            desg = ckbox.getSelectedItem().toString();
            ptst.setString(7, desg);
            ptst.setString(8, sal.getText());
            ptst.setString(9, mob.getText());
            // String status1;
            String reln;
            reln= rln.getSelectedItem().toString();
            ptst.setString(10, reln);
            //ptst.setString(10, status1);
            ptst.setString(11, email.getText());

            ptst.execute();
            JOptionPane.showMessageDialog(this,"Added Succesfully");
            Statement st = conn.createStatement();
            String sql= "Select * from Employeeinfo";
            ResultSet rs = st.executeQuery(sql);
            DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
            tblModel.setRowCount(0);
            while(rs.next()){
                String ID = String.valueOf(rs.getInt("ID"));
                String Emp_Name = rs.getString("Emp_Name");
                String City = rs.getString("City");
                String Age = String.valueOf(rs.getInt("Age"));
                String Gender = rs.getString("Gender");

                String DOJ = String.valueOf(rs.getDate("DOJ"));
                String Designation = rs.getString("Designation");
                String Salary = String.valueOf(rs.getInt("Salary"));
                String Mobile = String.valueOf(rs.getLong("Mobile"));
                String Relationship_status = rs.getString("Relationship_status");
                String Email = rs.getString("Email");

                String tbData[] = {ID,Emp_Name,City,Age,Gender,DOJ,Designation,Salary,Mobile,Relationship_status,Email};

                tblModel.addRow(tbData);
            }
            conn.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,e);
        }
        id.setText("");
        empn.setText("");
        age.setText("");
        city.setText("");
        email.setText("");
        sal.setText("");
        mob.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseEntered

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       
    
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        String ID = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
                  String Emp_Name = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
                  String City = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
                  String Age = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
                  String Gender = tblModel.getValueAt(jTable1.getSelectedRow(), 4).toString();
                  if(Gender.equals("Male")){
                      male.setSelected(true);
                  }else
                      female.setSelected(true);
                  
                  String DOJ = tblModel.getValueAt(jTable1.getSelectedRow(), 5).toString();
                  String Designation = tblModel.getValueAt(jTable1.getSelectedRow(), 6).toString();
                  String Salary = tblModel.getValueAt(jTable1.getSelectedRow(), 7).toString();
                  String Mobile = tblModel.getValueAt(jTable1.getSelectedRow(), 8).toString();
                  String Relationship_status = tblModel.getValueAt(jTable1.getSelectedRow(), 9).toString();
                  String Email = tblModel.getValueAt(jTable1.getSelectedRow(), 10).toString();
                 
                  id.setText(ID);
                  empn.setText(Emp_Name);
                  age.setText(Age);
                  gender.compareTo(Gender);
                  city.setText(City);
                  date.setDateFormatString(DOJ);
                  ckbox.setSelectedItem(Designation);
                  sal.setText(Salary);
                  mob.setText(Mobile);
                  rln.setSelectedItem(Relationship_status);
                  email.setText(Email);
       
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void femaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleActionPerformed
        // TODO add your handling code here:
        gender ="female";
    }//GEN-LAST:event_femaleActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
        gender ="male";
    }//GEN-LAST:event_maleActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Admin add = new Admin();
        add.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
        //  JTextField t1 = new JTextField();
        //   t1.setText("name.surname@doj");
    }//GEN-LAST:event_emailActionPerformed

    private void mobActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mobActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mobActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void jTable1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTable1ComponentAdded
        // TODO add your handling code here:
        try
        {  Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","vishal");
         String sql = "select * from EmployeeInfo";
        PreparedStatement ptst= conn.prepareStatement(sql); 
        ptst.execute();
         DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
        String ID = tblModel.getValueAt(jTable1.getSelectedRow(), 0).toString();
                  String Emp_Name = tblModel.getValueAt(jTable1.getSelectedRow(), 1).toString();
                  String City = tblModel.getValueAt(jTable1.getSelectedRow(), 2).toString();
                  String Age = tblModel.getValueAt(jTable1.getSelectedRow(), 3).toString();
                  String Gender = tblModel.getValueAt(jTable1.getSelectedRow(), 4).toString();
                  if(Gender.equals("Male")){
                      male.setSelected(true);
                  }else
                      female.setSelected(true);
                  
                  String DOJ = tblModel.getValueAt(jTable1.getSelectedRow(), 5).toString();
                  String Designation = tblModel.getValueAt(jTable1.getSelectedRow(), 6).toString();
                  String Salary = tblModel.getValueAt(jTable1.getSelectedRow(), 7).toString();
                  String Mobile = tblModel.getValueAt(jTable1.getSelectedRow(), 8).toString();
                  String Relationship_status = tblModel.getValueAt(jTable1.getSelectedRow(), 9).toString();
                  String Email = tblModel.getValueAt(jTable1.getSelectedRow(), 10).toString();
                 
                  id.setText(ID);
                  empn.setText(Emp_Name);
                  age.setText(Age);
                  gender.compareTo(Gender);
                  city.setText(City);
                  date.setDateFormatString(DOJ);
                  ckbox.setSelectedItem(Designation);
                  sal.setText(Salary);
                  mob.setText(Mobile);
                  rln.setSelectedItem(Relationship_status);
                  email.setText(Email);
        
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jTable1ComponentAdded

    private void jTable1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jTable1AncestorAdded
        // TODO add your handling code here:
         try{
                    Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee","root","vishal");
        Statement st = conn.createStatement();
             String sql= "Select * from EmployeeInfo";
             ResultSet rs = st.executeQuery(sql);
        DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
              tblModel.setRowCount(0);
             while(rs.next()){
                 String ID = String.valueOf(rs.getInt("ID"));
                 String Emp_Name = rs.getString("Emp_Name");
                  String City = rs.getString("City");
                 String Age = String.valueOf(rs.getInt("Age"));
                 String Gender = rs.getString("Gender");
                
                 String DOJ = String.valueOf(rs.getDate("DOJ"));
                 String Designation = rs.getString("Designation");
                 String Salary = String.valueOf(rs.getInt("Salary"));
                  String Mobile = String.valueOf(rs.getLong("Mobile"));
                  String Relationship_status = rs.getString("Relationship_status");
                   String Email = rs.getString("Email");
                 
                 String tbData[] = {ID,Emp_Name,City,Age,Gender,DOJ,Designation,Salary,Mobile,Relationship_status,Email};
 
                 tblModel.addRow(tbData);    
                         }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_jTable1AncestorAdded

    //Connection conn;m
//PreparedStatement insert;
        private JFrame frame;
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
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddEmployee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField age;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField city;
    private javax.swing.JComboBox<String> ckbox;
    private com.toedter.calendar.JDateChooser date;
    private javax.swing.JTextField email;
    private javax.swing.JTextField empn;
    private javax.swing.JRadioButton female;
    private javax.swing.JLabel gender1;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField mob;
    private javax.swing.JComboBox<String> rln;
    private javax.swing.JTextField sal;
    // End of variables declaration//GEN-END:variables

    private static class DbUtils {

        private static TableModel resultSetToTableModel(ResultSet Rs) {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }

        public DbUtils() {
        }
    }
}
