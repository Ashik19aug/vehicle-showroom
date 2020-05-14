package org.nlt.view;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.nlt.instance.DatabaseConnection;

public class MainFrame extends javax.swing.JFrame {

    private Connection conn;
    private int vehicleId;
    public MainFrame() {
        initComponents();

        DatabaseConnection databasecon = DatabaseConnection.getDatabaseConnection();
        conn = databasecon.getConnection();
        setVehiclesTableData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        addButton = new javax.swing.JButton();
        DeleteButton = new javax.swing.JButton();
        selectedvehicleType = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        vehicleTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Add New Vehicle "));
        jPanel1.setLayout(new java.awt.GridLayout(2, 6, 10, 10));

        jLabel1.setText("Model Number");
        jPanel1.add(jLabel1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Oil", "Gas", "diesel", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox1);

        jLabel3.setText("Engine Power");
        jPanel1.add(jLabel3);

        jLabel4.setText("Tire Size");
        jPanel1.add(jLabel4);

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Normal", "Sports", "Heavy" }));
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2);

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "turbo", "engine type oil only", "weight", "engine type diesel only" }));
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jPanel1.add(jTextField1);
        jPanel1.add(jTextField2);
        jPanel1.add(jTextField3);
        jPanel1.add(jTextField4);
        jPanel1.add(jTextField5);
        jPanel1.add(jTextField6);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(new java.awt.GridLayout(1, 2));

        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });
        jPanel2.add(addButton);

        DeleteButton.setText("Delete");
        DeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButtonActionPerformed(evt);
            }
        });
        jPanel2.add(DeleteButton);

        selectedvehicleType.setBorder(javax.swing.BorderFactory.createTitledBorder("Showroom vehicle List"));

        vehicleTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "No", "Model Number", "Engine Type", "engine power", "Tire Size", "Vehicle Type", "Vehicle Sub Type"
            }
        ));
        vehicleTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                vehicleTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(vehicleTable);

        javax.swing.GroupLayout selectedvehicleTypeLayout = new javax.swing.GroupLayout(selectedvehicleType);
        selectedvehicleType.setLayout(selectedvehicleTypeLayout);
        selectedvehicleTypeLayout.setHorizontalGroup(
            selectedvehicleTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedvehicleTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        selectedvehicleTypeLayout.setVerticalGroup(
            selectedvehicleTypeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectedvehicleTypeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(288, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)))
                    .addComponent(selectedvehicleType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectedvehicleType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(1061, 435));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed


        //Select Engine type
        String engineType = jComboBox1.getSelectedItem().toString();
        jTextField2.setText(engineType);


    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed

        //Select Vehicle Type
        String selectvehicleType = jComboBox2.getSelectedItem().toString();
        jTextField5.setText(selectvehicleType);
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed

        //Select Vehicle Type
        String selectsubvehicleType = jComboBox3.getSelectedItem().toString();
        jTextField6.setText(selectsubvehicleType);
    }//GEN-LAST:event_jComboBox3ActionPerformed


    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String modelnumber = jTextField1.getText();
        String enginetype = jTextField2.getText();
        String enginepower = jTextField3.getText();
        String tiresize = jTextField4.getText();
        String vehicletype = jTextField5.getText();
        String subtype = jTextField6.getText();
        

        
        try {
            Statement smt = conn.createStatement();
            smt.execute("insert into vehicles(modelnumber,enginetype,enginepower,tiresize,vehicletype,subtype) values('" +modelnumber+ "','" +enginetype+ "','" + enginepower + "','" + tiresize + "','" + vehicletype + "','" + subtype + "')");
            JOptionPane.showMessageDialog(this, "Added Successfully");

            jTextField1.setText("");
            jTextField2.setText("");
            jTextField3.setText("");
            jTextField4.setText("");
            jTextField5.setText("");
            jTextField6.setText("");

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex);
            System.out.println(ex);
        }


    }//GEN-LAST:event_addButtonActionPerformed

    private void DeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButtonActionPerformed
        
//        if(vehicleID!=0)
//        {
//            
//        try{
//            Statement smt = conn.createStatement();
//            smt.execute("delete from vehicles where id=+vehicleID");
//            JOptionPane.showMessageDialog(this, "delete");
//            vehicleID=0;
//            
//        }catch(Exception ex){
//            JOptionPane.showMessageDialog(this, "can't delete");
//        }
//        }


    }//GEN-LAST:event_DeleteButtonActionPerformed

    private void vehicleTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_vehicleTableMouseClicked

   
//        vehicleId = Integer.parseInt(vehicleTable.getValueAt(vehicleTable.getSelecteRow(),0).toString());
        
    }//GEN-LAST:event_vehicleTableMouseClicked

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton DeleteButton;
    private javax.swing.JButton addButton;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JPanel selectedvehicleType;
    private javax.swing.JTable vehicleTable;
    // End of variables declaration//GEN-END:variables
    
    private void setVehiclesTableData()
    {
        try{
            int rows = 0;
            int rowIndex = 0;
            Statement smt = conn.createStatement();
            ResultSet rs = smt.executeQuery("select * from vehicles order by id desc");
            if(rs.next())
            {
                rs.last();
                rows = rs.getRow();
                rs.beforeFirst();
            }
//            System.out.println(rows);
            String[][] data = new String[rows][7];
            while(rs.next())
            {
                data[rowIndex][0]=rs.getInt(1)+"";
                data[rowIndex][1]=rs.getString(2);
                data[rowIndex][2]=rs.getString(3);
                data[rowIndex][3]=rs.getString(4);
                data[rowIndex][4]=rs.getString(5);
                data[rowIndex][5]=rs.getString(6);
                data[rowIndex][6]=rs.getString(7);
                rowIndex++;
            }
            String[] cols={"id","modelnumber","enginetype","enginepower","tiresize","vehicletype","subtype"};
            DefaultTableModel model = new DefaultTableModel(data,cols);
            vehicleTable.setModel(model);
            rs.close();
        }
        catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "can't access data");
        }
    }
    private static class DatabaseConnectio {

        private static DatabaseConnection getDatabaseConnection() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        public DatabaseConnectio() {
        }
    }
}
