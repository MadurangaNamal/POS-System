/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author hp
 */
public class cus_package extends javax.swing.JFrame {
 
      Connection con=null;
    PreparedStatement pst=null;
   ResultSet rs=null;
   
    public cus_package() {
        initComponents();
        con=DBConnect.connect();
        tableload4();
        tableload3();
        tableload2();
        
    }

    public void tableload2() 
   {
       
        try {
            String j= "INSERT INTO copy (customerid,customername,total)SELECT customer_id ,customername,total  FROM sales ";
             pst=con.prepareStatement(j);
            pst.execute(); 
            
            
        } catch (Exception e) {
        }
       
       
   }   
    
     public void tableload3()
{
  try {
         String sql= "select customerid,name,total from copy";
   pst=con.prepareStatement(sql);
   rs=pst.executeQuery();
   
   jTable1.setModel(DbUtils.resultSetToTableModel(rs));
   
   
  } catch (Exception e) {
    }
  
  
    
}
     
      public void tableload4()
{
  try {
         String sql= "select customerid,name,total,points  from bonus";
   pst=con.prepareStatement(sql);
   rs=pst.executeQuery();
   
   jTable2.setModel(DbUtils.resultSetToTableModel(rs));
   
   
  } catch (Exception e) {
    }
  
  
    
}
      
    public void tableload5() 
   {
       
        try {
            String j= "select customerid,name,points FROM bonus where points>=1 and points<10";
             pst=con.prepareStatement(j);
            rs=pst.executeQuery(); 
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (Exception e) {
        }
       
       
   } 
    
    
      public void tableload6() 
   {
       
        try {
            String j= "select customerid,name,points FROM bonus where points>=10 and points<20";
             pst=con.prepareStatement(j);
            rs=pst.executeQuery(); 
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (Exception e) {
        }
       
       
   }     
      
      
          public void tableload7() 
   {
       
        try {
            String j= "select customerid,name,points FROM bonus where points>=20 and points<30";
             pst=con.prepareStatement(j);
            rs=pst.executeQuery(); 
            jTable2.setModel(DbUtils.resultSetToTableModel(rs));
            
            
        } catch (Exception e) {
        }
       
       
   } 
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1414, 670));
        setMinimumSize(new java.awt.Dimension(1414, 670));
        setPreferredSize(new java.awt.Dimension(1414, 670));
        getContentPane().setLayout(null);
        getContentPane().add(jTextField1);
        jTextField1.setBounds(10, 220, 130, 30);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(160, 220, 130, 30);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(320, 220, 130, 30);

        jButton1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton1.setText("Cal bonus");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(360, 280, 90, 23);

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
        jScrollPane1.setBounds(10, 30, 452, 160);

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

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 360, 460, 130);

        jButton2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton2.setText("Golden");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 530, 73, 23);

        jButton3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton3.setText("Silver");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(160, 530, 65, 23);

        jButton4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton4.setText("bronze");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(290, 530, 71, 23);
        getContentPane().add(jTextField4);
        jTextField4.setBounds(580, 60, 120, 30);
        getContentPane().add(jTextField5);
        jTextField5.setBounds(579, 130, 120, 30);

        jButton5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton5.setText("Search by id");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(810, 380, 130, 23);

        jButton6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton6.setText("Search by name");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(810, 460, 140, 23);

        jButton7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton7.setText("Search by id");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(770, 60, 120, 23);

        jButton8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jButton8.setText("Search by name");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(760, 130, 140, 23);
        getContentPane().add(jTextField6);
        jTextField6.setBounds(580, 370, 120, 40);
        getContentPane().add(jTextField7);
        jTextField7.setBounds(580, 450, 120, 40);

        jButton9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton9.setText("Delete");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(490, 410, 71, 23);

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\hp\\Documents\\NetBeansProjects\\POS\\src\\pos\\aaaaa.jpg")); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 0, 1414, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          String id=jTextField1.getText();
        String name=jTextField2.getText();
         String tot=jTextField3.getText();
        Double q= Double.parseDouble(tot);
        if(q>=5200 && q<=7200)
        {
            double p;
           p= (q/100)+4;
            
            String p2 = String.valueOf(p);
          
            try {
            String sq="INSERT INTO  bonus(customer_id,name,total ,points)values('"+id+"','"+name+"','"+tot+"','"+ p2+"')";
            pst=con.prepareStatement(sq);
            pst.execute();
           tableload4();
         
          
        } catch (SQLException e) {
            
        }
        }
        
        else if(q>7200 && q<=9200)
        {
            double p;
           p= (q/100)+4;
            
            String p2 = String.valueOf(p);
          
            try {
            String sq="INSERT INTO  bonus(customer_id,name,total ,points)values('"+id+"','"+name+"','"+tot+"','"+ p2+"')";
            pst=con.prepareStatement(sq);
            pst.execute();
           tableload4();
         
          
        } catch (SQLException e) {
            
        }
        }
        
          else if(q>9200 && q<=13200)
        {
            double p;
           p= (q/100)+4;
            
            String p2 = String.valueOf(p);
          
            try {
            String sq="INSERT INTO  bonus(customer_id,name,total ,points)values('"+id+"','"+name+"','"+tot+"','"+ p2+"')";
            pst=con.prepareStatement(sq);
            pst.execute();
           tableload4();
         
          
        } catch (SQLException e) {
            
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        tableload5();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tableload7();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tableload6();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
                    
        int x=JOptionPane.showConfirmDialog(null, "do you really want to delete");
        
    if(x==0)
    {
        
        String id=jTextField6.getText();
        
      try {
          String sql="DELETE from bonus where customerid='"+ id+"'";
        
          pst=con.prepareStatement(sql);
        pst.execute();
         tableload4();
      
      } catch (Exception e) {
        }
        
    }    
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
         try {
             int row=jTable1.getSelectedRow();
       String table=jTable1.getModel().getValueAt(row, 0).toString();
        String sql="select * from copy where customerid= '"+ table+"'";
        pst=con.prepareStatement(sql);
        rs=pst.executeQuery();
        
        if(rs.next())
        {
            
             
            String cname=rs.getString("customerid");  
           jTextField1.setText(cname);
            String nic=rs.getString("name");  
         jTextField2.setText(nic);
             String tot=rs.getString("total"); 
           jTextField3.setText(tot);
             
        }
        
            
        } catch (Exception e) {
        } 
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
            
          String id=jTextField4.getText();
    
        
        try {
            
        String sql= "select customerid,name,total from copy where customerid='"+id +"' ";
        pst= con.prepareStatement(sql);
        rs=pst.executeQuery();
       
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
   
       } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
           String name=jTextField5.getText();
    
        
        try {
            
        String sql= "select customerid,name,total from copy where name='"+name +"' ";
        pst= con.prepareStatement(sql);
        rs=pst.executeQuery();
       
        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
   
       } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
          String id=jTextField6.getText();
    
        
        try {
            
        String sql= "select customerid,name,total,points from bonus where customerid='"+id +"' ";
        pst= con.prepareStatement(sql);
        rs=pst.executeQuery();
       
        jTable2.setModel(DbUtils.resultSetToTableModel(rs));
   
       } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        String name=jTextField7.getText();
    
        
        try {
            
        String sql= "select customerid,name,total,points from bonus where name like '"+name+"%' ";
        pst= con.prepareStatement(sql);
        rs=pst.executeQuery();
       
        jTable2.setModel(DbUtils.resultSetToTableModel(rs));
   
       } catch (Exception e) {
        }
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(cus_package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cus_package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cus_package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cus_package.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cus_package().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
