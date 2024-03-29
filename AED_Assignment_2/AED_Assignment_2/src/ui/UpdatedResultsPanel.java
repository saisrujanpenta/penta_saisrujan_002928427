/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.UberCars;
import model.CarCatalog;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saisr
 */
public class UpdatedResultsPanel extends javax.swing.JPanel {
    private JPanel SelectActionPanel;
    private CarCatalog CarCatalog;
    private ArrayList<UberCars> result;
    

    UpdatedResultsPanel(JPanel SelectActionPanel, ArrayList<UberCars> result) {
         initComponents();
         this.SelectActionPanel = SelectActionPanel;
         this.result = result;
         
         populateTable();//To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblSec = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        btnBACKKK = new javax.swing.JButton();

        setBackground(new java.awt.Color(178, 215, 214));
        setForeground(new java.awt.Color(51, 51, 51));

        tblSec.setFont(new java.awt.Font("Comic Sans MS", 1, 13)); // NOI18N
        tblSec.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Year of Manufacture", "Maximum Seats", "Minimum Seats", "Serial Number", "Model Number", "Available City", "Aavailability", "Main. Certi. Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblSec);

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("                              UPDATED LIST");

        btnView.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnView.setForeground(new java.awt.Color(51, 51, 51));
        btnView.setText("View Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnBACKKK.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnBACKKK.setText("Back");
        btnBACKKK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBACKKKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 826, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBACKKK)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBACKKK)
                .addGap(54, 54, 54)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnView)
                .addContainerGap(329, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblSec.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Select a row from Table", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            UberCars uber = (UberCars) tblSec.getValueAt((selectedRow), 0);
            ViewCarDetails amPanel = new ViewCarDetails (SelectActionPanel, uber);
            SelectActionPanel.add("ViewCarDetails",amPanel);
            CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
            layout.next(SelectActionPanel);
        }

    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBACKKKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBACKKKActionPerformed
        // TODO add your handling code here:
        SelectActionPanel.remove(this);
        CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
        layout.previous(SelectActionPanel);
    }//GEN-LAST:event_btnBACKKKActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBACKKK;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSec;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel) tblSec.getModel();
            dtm.setRowCount(0);
            for (UberCars uber : result ){
                Object[] row = new Object [9];
                row [0] = uber;
                row [1] = uber.getYearofManufacture();
                row [2] = uber.getMaxSeats();
                row [3] = uber.getMinSeats();
                row [4] = uber.getSerialNumber();
                row [5] = uber.getModelNumber();
                row [6] = uber.getAvailableCity();
                row [7] = uber.isAvailability();
                row [8] = uber.isMaintainanceCertificate();
                
                dtm.addRow(row);
                
            }
    }    

  
    }

