/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.UberCars;
import model.CarCatalog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.awt.CardLayout;


/**
 *
 * @author saisr
 */
public class EnterCarDetails extends javax.swing.JPanel {
    private JPanel SelectActionPanel;
    private CarCatalog CarCatalog;

   
   
    EnterCarDetails(JPanel SelectActionPanel, CarCatalog CarCatalog) {
        initComponents();
        this.SelectActionPanel = SelectActionPanel;
        this.CarCatalog = CarCatalog;//To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnnGROUP1 = new javax.swing.ButtonGroup();
        btnnGROUP2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtYearofManufacture = new javax.swing.JTextField();
        txtSerialNumber = new javax.swing.JTextField();
        txtModelNumber = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaxSeats = new javax.swing.JTextField();
        txtMinSeats = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnBack1 = new javax.swing.JButton();
        btnTrue = new javax.swing.JCheckBox();
        btnFalse = new javax.swing.JCheckBox();
        btnExp = new javax.swing.JCheckBox();
        btnNonExp = new javax.swing.JCheckBox();

        setBackground(new java.awt.Color(178, 215, 214));
        setPreferredSize(new java.awt.Dimension(850, 600));

        jLabel1.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ENTER CAR DETAILS");

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setText("Brand:");

        jLabel3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel3.setText("Year of Manufacture:");

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setText("Serial Number:");

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel5.setText("Model Number:");

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setText("Available City:");

        txtCity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCityActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        btnCreate.setText("Save");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Maximum Seat Capacity :");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("Minimum Seat Capacity :");

        txtMinSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinSeatsActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel7.setText("Is the Car Available? :");

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel10.setText("Maintenance Expiration Certificate Status :");

        btnBack1.setBackground(new java.awt.Color(153, 153, 153));
        btnBack1.setFont(new java.awt.Font("Calibri", 1, 13)); // NOI18N
        btnBack1.setText(" Back");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        btnTrue.setBackground(new java.awt.Color(178, 215, 214));
        btnTrue.setText("Yes");

        btnFalse.setBackground(new java.awt.Color(178, 215, 214));
        btnFalse.setText("No");

        btnExp.setBackground(new java.awt.Color(178, 215, 214));
        btnExp.setText("Expired");

        btnNonExp.setBackground(new java.awt.Color(178, 215, 214));
        btnNonExp.setText("Non Expired");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(409, 409, 409)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(30, 30, 30)
                                .addComponent(txtMaxSeats))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addGap(30, 30, 30)
                                .addComponent(txtMinSeats))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(30, 30, 30)
                                .addComponent(txtModelNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 178, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(30, 30, 30)
                                .addComponent(txtCity))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(30, 30, 30)
                                .addComponent(txtBrand))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(30, 30, 30)
                                .addComponent(txtYearofManufacture))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(30, 30, 30)
                                .addComponent(txtSerialNumber))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(30, 30, 30)
                                .addComponent(btnExp))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(30, 30, 30)
                                .addComponent(btnTrue))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(125, 125, 125)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnNonExp)
                            .addComponent(btnFalse))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtBrand, txtCity, txtMaxSeats, txtMinSeats, txtModelNumber, txtSerialNumber, txtYearofManufacture});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBack1)
                .addGap(16, 16, 16)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSerialNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtYearofManufacture, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaxSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtMinSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtModelNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(btnTrue)
                    .addComponent(btnFalse))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExp)
                    .addComponent(btnNonExp)
                    .addComponent(jLabel10))
                .addGap(34, 34, 34)
                .addComponent(btnCreate)
                .addContainerGap(522, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtBrand, txtCity, txtMaxSeats, txtMinSeats, txtModelNumber, txtSerialNumber, txtYearofManufacture});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel10, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7, jLabel8, jLabel9});

    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        
        String brandname = txtBrand.getText();
        if(brandname == null || brandname.equals(""))
            {
                JOptionPane.showMessageDialog(null,"Enter the Brand name");
                return;
            }
        
        String YearofManufacture = txtYearofManufacture.getText();
        if (YearofManufacture == null || YearofManufacture.equals("")) 
        {
        JOptionPane.showMessageDialog(null,"Enter the car's year of manufacture", " Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
         try {
            Integer.parseInt(txtYearofManufacture.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Enter a valid value", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
            
        }   
        
         String MaxSeats = txtMaxSeats.getText();
        if (MaxSeats == null || MaxSeats.equals("")) 
        {
        JOptionPane.showMessageDialog(null,"Enter the Maximum Seat Capacity", " Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
         try {
            Integer.parseInt(txtMaxSeats.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Enter a valid value", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }   
         
          String MinSeats = txtMinSeats.getText();
        if (MinSeats == null || MinSeats.equals("")) 
        {
        JOptionPane.showMessageDialog(null,"Enter the Minimum Seats Capacity", " Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
         try {
            Integer.parseInt(txtMinSeats.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Enter a valid value", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } 
         
         String SerialNumber = txtSerialNumber.getText();
        if (SerialNumber == null || SerialNumber.equals("")) 
        {
        JOptionPane.showMessageDialog(null,"Enter the Serial Number", " Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
         try {
            Integer.parseInt(txtSerialNumber.getText());
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Enter a valid value", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } 
         
         String ModelNumber = txtModelNumber.getText();
        if (ModelNumber == null || ModelNumber.equals("")) 
        {
        JOptionPane.showMessageDialog(null,"Enter the Model Number", " Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
         
         String avaCity = txtCity.getText();
        if (avaCity == null || avaCity.equals("")) 
        {
        JOptionPane.showMessageDialog(null,"Enter the Model Number", " Warning", JOptionPane.WARNING_MESSAGE);
        return;
        }
        
        if(btnTrue.isSelected()== false && btnFalse.isSelected()== false)
        {
            JOptionPane.showMessageDialog(null,"Please select the Availability", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        if(btnExp.isSelected()== false && btnNonExp.isSelected()== false)
        {
            JOptionPane.showMessageDialog(null,"Please select the Expiration status", " Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        String Brand = txtBrand.getText();
        int manuYear = Integer.parseInt(txtYearofManufacture.getText());
        int maxSeats = Integer.parseInt(txtMaxSeats.getText());
        int minSeats = Integer.parseInt(txtMinSeats.getText());
        int serialNumber = Integer.parseInt(txtSerialNumber.getText());
        String modelNumber = txtModelNumber.getText();
        String availCity = txtCity.getText();
        
        UberCars uber = CarCatalog.addUber();
        uber.setBrand(Brand);
        uber.setYearofManufacture(manuYear);
        uber.setMaxSeats(maxSeats);
        uber.setMinSeats(minSeats);
        uber.setSerialNumber(serialNumber);
        uber.setModelNumber(modelNumber);
        uber.setAvailableCity(availCity);
        uber.setAvailability(btnTrue.isSelected());
        uber.setMaintainanceCertificate(btnExp.isSelected());
        
       

        JOptionPane.showMessageDialog(null,"Car details added successfully!");
        
        txtBrand.setText("");
        txtCity.setText("");
        txtYearofManufacture.setText("");
        txtMaxSeats.setText("");
        txtModelNumber.setText("");
        txtMinSeats.setText("");
        txtSerialNumber.setText("");
        btnnGROUP1.clearSelection();
        btnnGROUP2.clearSelection();
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void txtCityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCityActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        SelectActionPanel.remove(this);
        CardLayout layout = (CardLayout) SelectActionPanel.getLayout();
        layout.previous(SelectActionPanel);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private void txtMinSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinSeatsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnCreate;
    private javax.swing.JCheckBox btnExp;
    private javax.swing.JCheckBox btnFalse;
    private javax.swing.JCheckBox btnNonExp;
    private javax.swing.JCheckBox btnTrue;
    private javax.swing.ButtonGroup btnnGROUP1;
    private javax.swing.ButtonGroup btnnGROUP2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtMaxSeats;
    private javax.swing.JTextField txtMinSeats;
    private javax.swing.JTextField txtModelNumber;
    private javax.swing.JTextField txtSerialNumber;
    private javax.swing.JTextField txtYearofManufacture;
    // End of variables declaration//GEN-END:variables
}
