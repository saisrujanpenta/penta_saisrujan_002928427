/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.CarCatalog;
import javax.swing.JPanel;
import model.UberCars;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saisr
 */
public class ManufacturersList extends javax.swing.JPanel {
    private JPanel SelectActionPanel;
    private CarCatalog CarCatalog;

    

    ManufacturersList(JPanel SelectActionPanel, CarCatalog CarCatalog) {
        initComponents();
        this.SelectActionPanel = SelectActionPanel;
        this.CarCatalog = CarCatalog;
        populateTable();//To change body of generated methods, choose Tools | Templates.
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblManu = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnBack4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(178, 215, 214));
        setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N

        tblManu.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        tblManu.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MANUFACTURERS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblManu);
        if (tblManu.getColumnModel().getColumnCount() > 0) {
            tblManu.getColumnModel().getColumn(0).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANUFACTURERS LIST");

        btnBack4.setBackground(new java.awt.Color(153, 153, 153));
        btnBack4.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btnBack4.setText(" Back");
        btnBack4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack4)
                        .addGap(0, 769, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(357, 357, 357))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBack4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack4ActionPerformed
        // TODO add your handling code here:
        SelectActionPanel.remove(this);
        CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
        layout.previous(SelectActionPanel);
    }//GEN-LAST:event_btnBack4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblManu;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        //To change body of generated methods, choose Tools | Templates.
        DefaultTableModel dtm = (DefaultTableModel) tblManu.getModel();
            dtm.setRowCount(0);
             ArrayList<String> brands = new ArrayList <String>();
            for (UberCars uber : CarCatalog.getUberCarsList()){
                Object[] row = new Object [1];
     
            if (brands.contains(uber.getBrand()))
            {
                
            }
            else 
            {
            row [0] = uber.getBrand();
            dtm.addRow(row);
            brands.add(uber.getBrand());
            }
            }
    }
}
