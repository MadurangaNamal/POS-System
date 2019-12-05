/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hp
 */
public class Customer_Management extends javax.swing.JInternalFrame {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());
      
    
    
    
      Connection con=null;
    PreparedStatement pst=null;
   ResultSet rs=null;
   
    public Customer_Management() {
        initComponents();
        con=DBConnect.connect();
        tableload();
        
    }

    
    public void tableload()
{
  try {
         String sql= "select customerid,nic ,customername,caddress,sname,saddress,regno,telno,regdate from customer";
   pst=con.prepareStatement(sql);
   rs=pst.executeQuery();
   
   jTable1.setModel(DbUtils.resultSetToTableModel(rs));
   
   
  } catch (Exception e) {
    }
  
  
    
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField10 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton8 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(1414, 670));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Customer Registeration");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(440, 40, 240, 20);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Registeration date");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 480, 130, 14);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ID");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(70, 100, 11, 15);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("NIC");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 140, 34, 14);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Customer name");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 180, 100, 14);

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Customer address");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(40, 230, 120, 14);

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Shop name");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(40, 270, 120, 14);

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Shop address");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(40, 320, 120, 14);

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Shop registeration  no");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(40, 370, 130, 14);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Telephone no");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(30, 430, 130, 14);

        jLabel12.setForeground(new java.awt.Color(0, 153, 102));
        jLabel12.setText("jLabel12");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(190, 100, 40, 14);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(190, 130, 160, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(190, 180, 160, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(190, 220, 160, 30);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(190, 270, 160, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(190, 320, 160, 30);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(190, 370, 160, 30);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField7);
        jTextField7.setBounds(190, 420, 160, 30);
        getContentPane().add(jTextField9);
        jTextField9.setBounds(720, 120, 130, 30);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Search by id");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(920, 120, 130, 30);
        getContentPane().add(jTextField10);
        jTextField10.setBounds(720, 200, 130, 30);

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Search by name");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(920, 200, 130, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(430, 280, 840, 200);

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("Customer report");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(740, 550, 130, 23);

        jButton4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton4.setText("Register");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(50, 570, 90, 23);

        jButton5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton5.setText("Update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(180, 570, 73, 23);

        jButton6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(280, 570, 80, 23);

        jButton7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton7.setText("Refresh");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(400, 570, 100, 23);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(190, 480, 140, 30);

        jButton8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton8.setText("Package");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(940, 550, 90, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\POS\\src\\pos\\aaaaa.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 1398, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
          String cid=jLabel12.getText();
        String nic=jTextField1.getText();
         String cname=jTextField2.getText();
        String caddress=jTextField3.getText();
        String sname=jTextField4.getText();
        String saddress=jTextField5.getText();
        String regno=jTextField6.getText();
        String telno=jTextField7.getText();
        
        String idate=sdf.format(jDateChooser1.getDate());
       
      

       
        try {
                  String h="SELECT customername  FROM customer where customername  ='"+ cname+"'";
           pst=con.prepareStatement(h);
           rs=pst.executeQuery();
           
           if(rs.next())
           
         
           {
               
               JOptionPane.showMessageDialog(null,"this customer already exist");
           }
            
              
           else
           {
               
                String sql= "INSERT INTO customer(nic ,customername,caddress,sname,saddress,regno,telno,regdate)values('"+nic+"','"+ cname+"','"+caddress+"','"+sname+"','"+saddress+"','"+regno+"','"+telno+"','"+idate+"')";     
                pst=con.prepareStatement(sql);
              pst.execute();
             tableload();
           }
           
        } catch (SQLException | HeadlessException e) {
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         int x=   JOptionPane.showConfirmDialog(null,"do you really want to update");
        
        
          String cid=jLabel12.getText();
        String nic=jTextField1.getText();
         String cname=jTextField2.getText();
        String caddress=jTextField3.getText();
        String sname=jTextField4.getText();
        String saddress=jTextField5.getText();
        String regno=jTextField6.getText();
        String telno=jTextField7.getText();
        String idate=sdf.format(jDateChooser1.getDate());
        
         try {
             
             
              String sql="UPDATE customer set customerid  = '"+ cid+"',sid = '"+ nic+"' ,sid = '"+ cname+"' ,sid = '"+ caddress+"' ,sid = '"+ sname+"' ,sid = '"+ saddress+"' ,sid = '"+ regno+"' ,sid = '"+ telno+"' ,sid = '"+ idate+"'";
             
               pst=con.prepareStatement(sql);
             pst.execute();
             tableload(); 
                 
    } catch (Exception e) {
         }
      
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
          int x=JOptionPane.showConfirmDialog(null, "do you really want to delete");
        
    if(x==0)
    {
        
        String id=jLabel12.getText();
        
      try {
          String sql="DELETE from customer where customerid='"+ id+"'";
        
          pst=con.prepareStatement(sql);
        pst.execute();
         tableload(); 
      
      } catch (Exception e) {
        }
        
    }    
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
         jLabel12.setText(null);
         jTextField1.setText(null);
         jTextField2.setText(null);
         jTextField3.setText(null);
        jTextField4.setText(null);
        jTextField5.setText(null);
        jTextField6.setText(null);
        jTextField7.setText(null);
        jDateChooser1.setDate(null);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String id=jTextField9.getText();
    
        
        try {
            
        String sql= "select customerid,nic ,customername,caddress,sname,saddress,regno,telno,regdate from customer where customerid='"+id +"' ";
        pst= con.prepareStatement(sql);
        rs=pst.executeQuery();
       
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
   
       } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
          String name=jTextField10.getText();
    
        
        try {
            
        String sql= "select customerid,nic ,customername,caddress,sname,saddress,regno,telno,regdate from customer where customername='"+name +"%' ";
        pst= con.prepareStatement(sql);
        rs=pst.executeQuery();
       
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
   
       } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
               
     Reports r=new Reports("C:\\Users\\PCnet Computers\\Desktop\\system\\report1.jasper");
     r.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
          try {
             int row=jTable1.getSelectedRow();
       String table=jTable1.getModel().getValueAt(row, 0).toString();
        String sql="select * from customer where customerid= '"+ table+"'";
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        
        if(rs.next())
        {
            
             
          String cid=rs.getString("customerid");  
          jLabel12.setText(cid);
           String nic=rs.getString("nic");  
         jTextField2.setText(nic);
          String cname=rs.getString("customername");  
         jTextField4.setText(cname);
         String caddress=rs.getString("caddress");  
         jTextField1.setText(caddress);
         String sname=rs.getString("sname");  
         jTextField7.setText(sname);
         String saddress=rs.getString("saddress");  
         jTextField6.setText(saddress);
         String regno=rs.getString("regno");  
         jTextField3.setText(regno);
         String telno=rs.getString("telno");  
         jTextField5.setText(telno);
           String add1=rs.getString("regdate");
          ((JTextField)jDateChooser1.getDateEditor().getUiComponent()).setText(add1);
        
        }
        
            
        } catch (Exception e) {
        } 
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        cus_package ob = new cus_package();
        ob.setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
