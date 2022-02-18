/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.UberCars;
import model.CarCatalog;
import javax.swing.JPanel;
import javax.swing.JOptionPane;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saisr
 */
public class ManageCarDetails extends javax.swing.JPanel {
    private JPanel SelectActionPanel;
    private CarCatalog CarCatalog;

    
        
//To change body of generated methods, choose Tools | Templates.

    ManageCarDetails(JPanel SelectActionPanel, CarCatalog CarCatalog) {
        initComponents();
        this.SelectActionPanel = SelectActionPanel;
        this.CarCatalog = CarCatalog;
        populateTable(CarCatalog, "all"); //To change body of generated methods, choose Tools | Templates.
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetails = new javax.swing.JTable();
        txtField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnSearchBrand = new javax.swing.JButton();
        btnManuYear = new javax.swing.JButton();
        btnSerialNumber = new javax.swing.JButton();
        btnModelNumber = new javax.swing.JButton();
        btnAvailCity = new javax.swing.JButton();
        btnAvailStatus = new javax.swing.JButton();
        btnMainCerti = new javax.swing.JButton();
        btnBack2 = new javax.swing.JButton();
        MinSeatsTxtField = new javax.swing.JTextField();
        MaxSeatsTxtField = new javax.swing.JTextField();
        btnMinMax = new javax.swing.JButton();
        btnFirstAvailCar = new javax.swing.JButton();
        btnManuList = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(178, 215, 214));
        setForeground(new java.awt.Color(51, 51, 51));

        jLabel1.setBackground(new java.awt.Color(153, 153, 153));
        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE CAR DETAILS");

        tblDetails.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        tblDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Brand Name", "Year of Manufacture", "Maximum Seats", "Minimum Seats", "Serial Number", "Model Number", "Available City", "Available", "Main. Certi. Available"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDetails);
        if (tblDetails.getColumnModel().getColumnCount() > 0) {
            tblDetails.getColumnModel().getColumn(0).setResizable(false);
            tblDetails.getColumnModel().getColumn(1).setResizable(false);
            tblDetails.getColumnModel().getColumn(2).setResizable(false);
            tblDetails.getColumnModel().getColumn(3).setResizable(false);
            tblDetails.getColumnModel().getColumn(4).setResizable(false);
            tblDetails.getColumnModel().getColumn(5).setResizable(false);
            tblDetails.getColumnModel().getColumn(6).setResizable(false);
            tblDetails.getColumnModel().getColumn(7).setResizable(false);
            tblDetails.getColumnModel().getColumn(8).setResizable(false);
        }

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("       Enter your Inputs Below ");

        btnSearchBrand.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnSearchBrand.setText("Search Car by Brand ");
        btnSearchBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchBrandActionPerformed(evt);
            }
        });

        btnManuYear.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnManuYear.setText("Search Car by Year of Manufacture  ");
        btnManuYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManuYearActionPerformed(evt);
            }
        });

        btnSerialNumber.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnSerialNumber.setText("Search Car by Serial Number ");
        btnSerialNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSerialNumberActionPerformed(evt);
            }
        });

        btnModelNumber.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnModelNumber.setText("Search Car by Model Number ");
        btnModelNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModelNumberActionPerformed(evt);
            }
        });

        btnAvailCity.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnAvailCity.setText("Search Car by Available City ");
        btnAvailCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailCityActionPerformed(evt);
            }
        });

        btnAvailStatus.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnAvailStatus.setText("Search Car by Availability Status ");
        btnAvailStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAvailStatusActionPerformed(evt);
            }
        });

        btnMainCerti.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnMainCerti.setText("Search Car by Maintainance Certificate Expiration Status ");
        btnMainCerti.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainCertiActionPerformed(evt);
            }
        });

        btnBack2.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btnBack2.setText(" Back");
        btnBack2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack2ActionPerformed(evt);
            }
        });

        btnMinMax.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        btnMinMax.setText("Search Car by Seating Capacity");
        btnMinMax.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMinMaxActionPerformed(evt);
            }
        });

        btnFirstAvailCar.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btnFirstAvailCar.setForeground(new java.awt.Color(51, 51, 51));
        btnFirstAvailCar.setText(" First Available Car");
        btnFirstAvailCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstAvailCarActionPerformed(evt);
            }
        });

        btnManuList.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btnManuList.setForeground(new java.awt.Color(51, 51, 51));
        btnManuList.setText("Manufacturers List");
        btnManuList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManuListActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("           Minimum Seats :");

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("         Maximum Seats :");

        btnView.setFont(new java.awt.Font("Calibri", 1, 12)); // NOI18N
        btnView.setForeground(new java.awt.Color(51, 51, 51));
        btnView.setText("View Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel5.setFont(new java.awt.Font("Calibri", 1, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("FILTER UBER CARS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(287, 287, 287)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(16, 16, 16)))
                                .addGap(252, 252, 252))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnSerialNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnAvailStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAvailCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnMainCerti, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnManuYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearchBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(194, 194, 194)
                        .addComponent(btnModelNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMinMax, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(jLabel4))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(MinSeatsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MaxSeatsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(110, 120, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnFirstAvailCar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnView, javax.swing.GroupLayout.DEFAULT_SIZE, 498, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnManuList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSeparator3)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(571, 571, 571))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnView, jButton1});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnAvailCity, btnAvailStatus, btnMainCerti, btnManuYear, btnMinMax, btnModelNumber, btnSearchBrand, btnSerialNumber});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {MaxSeatsTxtField, MinSeatsTxtField, txtField});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(13, 13, 13)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFirstAvailCar)
                    .addComponent(btnManuList))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(MaxSeatsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(MinSeatsTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addComponent(btnMinMax))
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnManuYear)
                            .addComponent(btnSearchBrand))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSerialNumber)
                            .addComponent(btnAvailStatus))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAvailCity)
                            .addComponent(btnMainCerti))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnModelNumber)))
                .addContainerGap(336, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnView, jButton1});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAvailCity, btnAvailStatus, btnMainCerti, btnManuYear, btnMinMax, btnModelNumber, btnSearchBrand, btnSerialNumber});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {MaxSeatsTxtField, MinSeatsTxtField});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSearchBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchBrandActionPerformed
        // TODO add your handling code here:
        ArrayList<UberCars> result = CarCatalog.searchBrand1(txtField.getText(), CarCatalog.getUberCarsList());
        if (result.size() == 0){
            JOptionPane.showMessageDialog(null,"Brand Name does not exist", " Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
           
            FilteredResultsTable panel = new FilteredResultsTable(SelectActionPanel,result,CarCatalog);
            SelectActionPanel.add("FilteredResultsTable", panel);
            CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
            layout.next (SelectActionPanel);
        }
        txtField.setText("");
        
    }//GEN-LAST:event_btnSearchBrandActionPerformed

    private void btnManuYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManuYearActionPerformed
        // TODO add your handling code here:
        String resultt = txtField.getText();
        if (resultt == null || resultt.equals("")) 
        {
        JOptionPane.showMessageDialog(null,"Enter the car's year of manufacture", " Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
         try {
            Integer.parseInt(txtField.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Enter a valid value", " Warning", JOptionPane.WARNING_MESSAGE);
        }
         {
            ArrayList<UberCars> result = CarCatalog.searchYearofManufacture(txtField.getText(), CarCatalog.getUberCarsList());
            FilteredResultsTable panel = new FilteredResultsTable(SelectActionPanel, result, CarCatalog);
            SelectActionPanel.add("FilteredResultsTable", panel);
            CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
            layout.next (SelectActionPanel);
               }
         txtField.setText("");
    }//GEN-LAST:event_btnManuYearActionPerformed
/**/
    private void btnSerialNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSerialNumberActionPerformed

        String resulttt = txtField.getText();
        if (resulttt == null || resulttt.equals("")) 
        {
        JOptionPane.showMessageDialog(null,"Enter the Serial Number", " Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
         try {
            Integer.parseInt(txtField.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Enter a valid value", " Warning", JOptionPane.WARNING_MESSAGE);
        }
         {
            ArrayList<UberCars> result = CarCatalog.searchSerialNumber(txtField.getText(),CarCatalog.getUberCarsList());
            FilteredResultsTable panel = new FilteredResultsTable(SelectActionPanel, result, CarCatalog);
            SelectActionPanel.add("FilteredResultsTable", panel);
            CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
            layout.next (SelectActionPanel);
               }
         txtField.setText("");
    }//GEN-LAST:event_btnSerialNumberActionPerformed

    private void btnModelNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModelNumberActionPerformed
        // TODO add your handling code here:
        ArrayList<UberCars> result = CarCatalog.searchModelNumber(txtField.getText(),CarCatalog.getUberCarsList());
        if (result.size() == 0)
        {
            JOptionPane.showMessageDialog(null,"Model Number does not exist", " Warning", JOptionPane.WARNING_MESSAGE);
        }
        else 
        {
            //ArrayList<Uber> result = uberCatalog.searchModelNumber();
            FilteredResultsTable panel = new FilteredResultsTable(SelectActionPanel,result,CarCatalog);
            SelectActionPanel.add("FilteredResultsTable", panel);
            CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
            layout.next (SelectActionPanel);
        }
        
    }//GEN-LAST:event_btnModelNumberActionPerformed

    private void btnAvailCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailCityActionPerformed
        // TODO add your handling code here:
        ArrayList<UberCars> result = CarCatalog.searchAvailCity(txtField.getText(), CarCatalog.getUberCarsList());
        if (result.size() == 0){
            JOptionPane.showMessageDialog(null,"Available City does not exist", " Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
           
            FilteredResultsTable panel = new FilteredResultsTable(SelectActionPanel,result,CarCatalog);
            SelectActionPanel.add("FilteredResultsTable", panel);
            CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
            layout.next (SelectActionPanel);
            
            txtField.setText("");
        }
    }//GEN-LAST:event_btnAvailCityActionPerformed

    private void btnAvailStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAvailStatusActionPerformed
        // TODO add your handling code here:
        
        String resulttt = txtField.getText();
        if (resulttt == null || resulttt.equals("")) 
        {
        JOptionPane.showMessageDialog(null,"Enter the Availability status", " Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
         
         {
            ArrayList<UberCars> result = CarCatalog.searchAvailStatus(txtField.getText(), CarCatalog.getUberCarsList());
            FilteredResultsTable panel = new FilteredResultsTable(SelectActionPanel, result, CarCatalog);
            SelectActionPanel.add("FilteredResultsTable", panel);
            CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
            layout.next (SelectActionPanel);
        
        
       
       
               }
         txtField.setText("");
    }//GEN-LAST:event_btnAvailStatusActionPerformed

    private void btnMainCertiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainCertiActionPerformed
        // TODO add your handling code here:
         String resulttt = txtField.getText();
        if (resulttt == null || resulttt.equals("")) 
        {
        JOptionPane.showMessageDialog(null,"Enter the car's maintainance certificate status", " Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
       {
           ArrayList<UberCars> result = CarCatalog.searchMainCerti(txtField.getText(), CarCatalog.getUberCarsList());
            FilteredResultsTable panel = new FilteredResultsTable(SelectActionPanel, result, CarCatalog);
            SelectActionPanel.add("FilteredResultsTable", panel);
            CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
            layout.next (SelectActionPanel);
            
            txtField.setText("");
        }
    }//GEN-LAST:event_btnMainCertiActionPerformed

    private void btnBack2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack2ActionPerformed
        // TODO add your handling code here:
        SelectActionPanel.remove(this);
        CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
        layout.previous(SelectActionPanel);
    }//GEN-LAST:event_btnBack2ActionPerformed

    private void btnMinMaxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMinMaxActionPerformed
        // TODO add your handling code here:
        int MinSeats = Integer.parseInt(MinSeatsTxtField.getText());
        int MaxSeats = Integer.parseInt(MaxSeatsTxtField.getText());
       
       ArrayList<UberCars> result = CarCatalog.searchSeatsAvail(MinSeats , MaxSeats, CarCatalog.getUberCarsList());
       
        FilteredResultsTable panel = new FilteredResultsTable(SelectActionPanel, result, CarCatalog);
        SelectActionPanel.add("FilteredResultsTable", panel);
        CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
        layout.next (SelectActionPanel);
        
        MaxSeatsTxtField.setText("");
        MinSeatsTxtField.setText("");
    }//GEN-LAST:event_btnMinMaxActionPerformed

    private void btnFirstAvailCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstAvailCarActionPerformed
        // TODO add your handling code here:
        
       
            ArrayList<UberCars> result = CarCatalog.searchFirstAvailUber(txtField.getText(), CarCatalog.getUberCarsList());
            FilteredResultsTable panel = new FilteredResultsTable(SelectActionPanel, result, CarCatalog);
            SelectActionPanel.add("FilteredResultsTable", panel);
            CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
            layout.next (SelectActionPanel);
            
            txtField.setText("");
        
    }//GEN-LAST:event_btnFirstAvailCarActionPerformed

    private void btnManuListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManuListActionPerformed
        // TODO add your handling code here:
        {
        ManufacturersList amPanel = new ManufacturersList (SelectActionPanel, CarCatalog);
        SelectActionPanel.add("ManufacturersList",amPanel);
        CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
        layout.next(SelectActionPanel);  
        }
    }//GEN-LAST:event_btnManuListActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDetails.getSelectedRow();
        if(selectedRow<0){
            JOptionPane.showMessageDialog(null, "Select a row from Table", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            UberCars uber = (UberCars) tblDetails.getValueAt((selectedRow), 0);
            ViewCarDetails amPanel = new ViewCarDetails (SelectActionPanel, uber);
            SelectActionPanel.add("ViewCarDetails",amPanel);
            CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
            layout.next(SelectActionPanel);
        }
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblDetails.getSelectedRow();
        if(selectedRow>=0){
            int selectionButton = JOptionPane.YES_NO_OPTION;
            int selectionResult = JOptionPane.showConfirmDialog(null, "Are you sure? Do you want to delete?","Warning",selectionButton);
            if(selectionResult == JOptionPane.YES_OPTION){
                UberCars uber = (UberCars)tblDetails.getValueAt(selectedRow, 0);
                CarCatalog.deleteUber(uber);
                populateTable1(CarCatalog.getUberCarsList());
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please select a Row!");
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField MaxSeatsTxtField;
    private javax.swing.JTextField MinSeatsTxtField;
    private javax.swing.JButton btnAvailCity;
    private javax.swing.JButton btnAvailStatus;
    private javax.swing.JButton btnBack2;
    private javax.swing.JButton btnFirstAvailCar;
    private javax.swing.JButton btnMainCerti;
    private javax.swing.JButton btnManuList;
    private javax.swing.JButton btnManuYear;
    private javax.swing.JButton btnMinMax;
    private javax.swing.JButton btnModelNumber;
    private javax.swing.JButton btnSearchBrand;
    private javax.swing.JButton btnSerialNumber;
    private javax.swing.JButton btnView;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTable tblDetails;
    private javax.swing.JTextField txtField;
    // End of variables declaration//GEN-END:variables

   

    
    void populateTable(CarCatalog uberList, String all) {
         //To change body of generated methods, choose Tools | Templates.
         DefaultTableModel dtm = (DefaultTableModel) tblDetails.getModel();
            dtm.setRowCount(0);
            for (UberCars uber : CarCatalog.getUberCarsList())
            {
                if(uber.getBrand().equals(all)|| all.equals("all")){
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

    private void populateTable1(ArrayList<UberCars> UberCarsList) {
         //To change body of generated methods, choose Tools | Templates.
         DefaultTableModel dtm = (DefaultTableModel) tblDetails.getModel();
            dtm.setRowCount(0);
            for (UberCars uber : CarCatalog.getUberCarsList())
            {
                
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
   