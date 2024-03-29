/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static javax.swing.text.html.HTML.Tag.OPTION;
import model.CarProfile;
import model.CarProfileHistory;
/**
 *
 * @author saisr
 */
public class CreateJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJpanel
     * @param history
     */
    CarProfile cp;
    CarProfileHistory history;
    private List<String> unique;
    Image picture;
    ImageIcon icon;
    
    public CreateJpanel(CarProfileHistory history) {
        initComponents();
        this.history = history;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblOwnerTelephoneNumber = new javax.swing.JLabel();
        lblOwnerEmailAddress = new javax.swing.JLabel();
        lblOwnerDriverLicense = new javax.swing.JLabel();
        lblOwnerSocialSecurityNumber = new javax.swing.JLabel();
        lblOwnerAddress = new javax.swing.JLabel();
        txtBrand = new javax.swing.JTextField();
        txtModel = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtYear = new javax.swing.JTextField();
        txtEngineNumber = new javax.swing.JTextField();
        txtNumberofSeats = new javax.swing.JTextField();
        txtLicensePlate = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        txtOwnerName = new javax.swing.JTextField();
        lblBrand = new javax.swing.JLabel();
        txtOwnerTelephoneNumber = new javax.swing.JTextField();
        lblModel = new javax.swing.JLabel();
        txtOwnerEmailAddress = new javax.swing.JTextField();
        lblColor = new javax.swing.JLabel();
        txtOwnerDriverLicense = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        txtOwnerSocialSecurityNumber = new javax.swing.JTextField();
        lblEngineNumber = new javax.swing.JLabel();
        txtOwnerAddress = new javax.swing.JTextField();
        lblNumberofSeats = new javax.swing.JLabel();
        lblLicensePlate = new javax.swing.JLabel();
        lblOwnerName = new javax.swing.JLabel();
        txtWarrantyYear = new javax.swing.JTextField();
        lblWarrantyYear = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnPhotoAttach = new javax.swing.JButton();
        lblAddServiceRecords = new javax.swing.JLabel();
        lblLastMaintenanceYear = new javax.swing.JLabel();
        lblNumberofAccidents = new javax.swing.JLabel();
        lblOdometerReading = new javax.swing.JLabel();
        lblNumberofPreviousOwners = new javax.swing.JLabel();
        lblTotalServiceCost = new javax.swing.JLabel();
        txtLastMaintenanceYear = new javax.swing.JTextField();
        txtNumberofAccidents = new javax.swing.JTextField();
        txtOdometerReading = new javax.swing.JTextField();
        txtNumberofPreviousOwners = new javax.swing.JTextField();
        txtTotalServiceCost = new javax.swing.JTextField();
        lblPhotoAttach = new javax.swing.JLabel();
        jLabelImage = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        lblOwnerTelephoneNumber.setText("Owner Telephone Number:");

        lblOwnerEmailAddress.setText("Owner Email Address:");

        lblOwnerDriverLicense.setText("Owner Driver License:");

        lblOwnerSocialSecurityNumber.setText("Owner Social Security Number:");

        lblOwnerAddress.setText("Owner Address:");

        txtModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtModelActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(0, 153, 153));
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("CREATE CAR PROFILE");

        lblBrand.setText("Brand:");

        txtOwnerTelephoneNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOwnerTelephoneNumberKeyPressed(evt);
            }
        });

        lblModel.setText("Model:");

        txtOwnerEmailAddress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerEmailAddressActionPerformed(evt);
            }
        });
        txtOwnerEmailAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtOwnerEmailAddressKeyPressed(evt);
            }
        });

        lblColor.setText("Color:");

        txtOwnerDriverLicense.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOwnerDriverLicenseActionPerformed(evt);
            }
        });

        lblYear.setText("Year:");

        lblEngineNumber.setText("Engine Number:");

        lblNumberofSeats.setText("Number of Seats:");

        lblLicensePlate.setText("License Plate:");

        lblOwnerName.setText("Owner Name:");

        lblWarrantyYear.setText("Warranty Year:");

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnPhotoAttach.setText("Attach Image");
        btnPhotoAttach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPhotoAttachActionPerformed(evt);
            }
        });

        lblAddServiceRecords.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblAddServiceRecords.setForeground(new java.awt.Color(0, 102, 102));
        lblAddServiceRecords.setText("Service Record");

        lblLastMaintenanceYear.setText("Last Maintenance Year:");

        lblNumberofAccidents.setText("Number of Accidents:");

        lblOdometerReading.setText("Odometer Reading:");

        lblNumberofPreviousOwners.setText("Number of Previous Owners:");

        lblTotalServiceCost.setText("Total Service Cost:");

        lblPhotoAttach.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblPhotoAttach.setForeground(new java.awt.Color(0, 102, 102));
        lblPhotoAttach.setText("Image of the Car");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblBrand, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblModel, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblColor, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblYear, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblEngineNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblNumberofSeats, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblLicensePlate, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEngineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtNumberofSeats, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(lblAddServiceRecords)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(180, 180, 180)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtLastMaintenanceYear, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNumberofAccidents, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOdometerReading, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtNumberofPreviousOwners, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtTotalServiceCost, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblLastMaintenanceYear, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblNumberofAccidents, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblOdometerReading, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblNumberofPreviousOwners, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblTotalServiceCost, javax.swing.GroupLayout.Alignment.TRAILING)))
                                .addGap(234, 234, 234)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPhotoAttach)
                                            .addComponent(btnPhotoAttach))
                                        .addGap(32, 32, 32)
                                        .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblOwnerEmailAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblOwnerDriverLicense, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblOwnerSocialSecurityNumber, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblOwnerAddress, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblWarrantyYear, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblOwnerName, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(lblOwnerTelephoneNumber, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(94, 94, 94)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOwnerTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOwnerEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOwnerDriverLicense, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOwnerSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator1)
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.CENTER)
                            .addComponent(lblTitle, javax.swing.GroupLayout.Alignment.CENTER, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblBrand)
                            .addComponent(txtBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblModel)
                            .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblColor)
                            .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblYear)
                            .addComponent(txtYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblEngineNumber)
                            .addComponent(txtEngineNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumberofSeats)
                            .addComponent(txtNumberofSeats, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLicensePlate)
                            .addComponent(txtLicensePlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOwnerName)
                            .addComponent(txtOwnerName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOwnerTelephoneNumber)
                            .addComponent(txtOwnerTelephoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOwnerEmailAddress)
                            .addComponent(txtOwnerEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOwnerDriverLicense)
                            .addComponent(txtOwnerDriverLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOwnerSocialSecurityNumber)
                            .addComponent(txtOwnerSocialSecurityNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblOwnerAddress)
                            .addComponent(txtOwnerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblWarrantyYear)
                            .addComponent(txtWarrantyYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(19, 19, 19)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddServiceRecords)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(jLabelImage, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 35, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblLastMaintenanceYear)
                                    .addComponent(txtLastMaintenanceYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnPhotoAttach))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNumberofAccidents)
                                    .addComponent(txtNumberofAccidents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblOdometerReading)
                                    .addComponent(txtOdometerReading, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblNumberofPreviousOwners)
                                    .addComponent(txtNumberofPreviousOwners, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblTotalServiceCost)
                                    .addComponent(txtTotalServiceCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPhotoAttach)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(btnSave)
                .addGap(99, 99, 99))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtModelActionPerformed

    private void txtOwnerDriverLicenseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerDriverLicenseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOwnerDriverLicenseActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
       
        String Brand = txtBrand.getText();
        String Model = txtModel.getText();
        String Color = txtColor.getText();
        int Year = Integer.parseInt(txtYear.getText());
        String EngineNumber = txtEngineNumber.getText();
        int NumberofSeats = Integer.parseInt(txtNumberofSeats.getText());
        String LicensePlates = txtLicensePlate.getText();
        String OwnerName = txtOwnerName.getText();
        String OwnerTelephoneNumber = txtOwnerTelephoneNumber.getText();
        String OwnerEmailAddress = txtOwnerEmailAddress.getText();
       
        
            /*if(txtOwnerEmailAddress.getText().contains("@") && txtOwnerEmailAddress.getText().contains("."))
            {}
            else
                JOptionPane.showMessageDialog(this, "Invalid Email Address");*/
            
        String OwnerDriverLicense = txtOwnerDriverLicense.getText();
        String OwnerSocialSecurityNumber = txtOwnerSocialSecurityNumber.getText();
        String OwnerAddress = txtOwnerAddress.getText();
        int WarrantyYear = Integer.parseInt(txtWarrantyYear.getText());
        
        int LastMaintenanceYear = Integer.parseInt(txtLastMaintenanceYear.getText());
        int NumberofAccidents = Integer.parseInt(txtNumberofAccidents.getText());
        int OdometerReading = Integer.parseInt(txtOdometerReading.getText());
        int NumberofPreviousOwners = Integer.parseInt(txtNumberofPreviousOwners.getText());
        int TotalServiceCost = Integer.parseInt(txtTotalServiceCost.getText());
        
        
        
        
        cp = history.addNewCarProfile();
        
        cp.setBrand(Brand);
        cp.setModel(Model);
        cp.setColor(Color);
        cp.setYear(Year);
        cp.setEngineNumber(EngineNumber);
        cp.setNumberofSeats(NumberofSeats);
        cp.setLicensePlates(LicensePlates);
        cp.setOwnerName(OwnerName);
        cp.setOwnerTelephoneNumber(OwnerTelephoneNumber);
        cp.setOwnerEmailAddress(OwnerEmailAddress);
        cp.setOwnerDriverLicense(OwnerDriverLicense);
        cp.setOwnerSocialSecurityNumber(OwnerSocialSecurityNumber);
        cp.setOwnerAddress(OwnerAddress);
        cp.setWarrantyYear(WarrantyYear);
        
        cp.setLastMaintenanceYear(LastMaintenanceYear);
        cp.setNumberofAccidents(NumberofAccidents);
        cp.setOdometerReading(OdometerReading);
        cp.setNumberofPreviousOwners(NumberofPreviousOwners);
        cp.setTotalServiceCost(TotalServiceCost);
        cp.setImage(picture);
        
       
        
        
        
        JOptionPane.showMessageDialog(this, "New Car Profile Added.");
        
        txtBrand.setText("");
        txtModel.setText("");
        txtColor.setText("");
        txtYear.setText("");
        txtEngineNumber.setText("");
        txtNumberofSeats.setText("");
        txtLicensePlate.setText("");
        txtOwnerName.setText("");
        txtOwnerTelephoneNumber.setText("");
        txtOwnerEmailAddress.setText("");
        txtOwnerDriverLicense.setText("");
        txtOwnerSocialSecurityNumber.setText("");
        txtOwnerAddress.setText("");
        txtWarrantyYear.setText("");
        
        txtLastMaintenanceYear.setText("");
        txtNumberofAccidents.setText("");
        txtOdometerReading.setText("");
        txtNumberofPreviousOwners.setText("");
        txtTotalServiceCost.setText("");
        jLabelImage.setIcon(icon);
        
        
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnPhotoAttachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPhotoAttachActionPerformed
        // TODO add your handling code here:
        
        JFileChooser browseImageFile = new JFileChooser();
        //Filter image extensions
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("IMAGES", "png", "jpg", "jpeg");
        browseImageFile.addChoosableFileFilter(fnef);
        int showOpenDialogue = browseImageFile.showOpenDialog(null);
        
        if (showOpenDialogue == JFileChooser.APPROVE_OPTION) {
            File selectedImageFile = browseImageFile.getSelectedFile();
            String selectedImagePath = selectedImageFile.getAbsolutePath();
            JOptionPane.showMessageDialog(null, selectedImagePath);
            //Display image on jlable
            ImageIcon ii = new ImageIcon(selectedImagePath);
                //Resize image to fit jlabel
            Image image = ii.getImage().getScaledInstance(jLabelImage.getWidth(), jLabelImage.getHeight(), Image.SCALE_SMOOTH);
            ii.setImage(image);
            jLabelImage.setIcon(new ImageIcon(image));
            picture = image;
            
            
            
            
    }
        
        
        
    }//GEN-LAST:event_btnPhotoAttachActionPerformed

    private void txtOwnerTelephoneNumberKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOwnerTelephoneNumberKeyPressed
        // TODO add your handling code here:
        int key = evt.getKeyChar();
        String phoneNumber = txtOwnerTelephoneNumber.getText();
        int count = phoneNumber.length();
        if (!((key >= evt.VK_0 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD0 && key <= evt.VK_NUMPAD9) || (key == KeyEvent.VK_BACK_SPACE))){
            JOptionPane.showMessageDialog(this, "Enter only Number");
        }
        if ((key >= evt.VK_0 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD0 && key <= evt.VK_NUMPAD9)) {
            if (count>9) {
                JOptionPane.showMessageDialog(this, "Enter valid phone number");
                txtOwnerTelephoneNumber.setText("");
                String OwnerTelephoneNumber = txtOwnerTelephoneNumber.getText();
            }
        }
        
            
        
    }//GEN-LAST:event_txtOwnerTelephoneNumberKeyPressed

    private void txtOwnerEmailAddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOwnerEmailAddressActionPerformed
        // TODO add your handling code here:
        
        /*if (!((key >= evt.VK_0 && key <= evt.VK_9) || (key >= evt.VK_NUMPAD0 && key <= evt.VK_NUMPAD9) || (key == KeyEvent.VK_BACK_SPACE))){
            JOptionPane.showMessageDialog(this, "Enter only Number");
        }
        if(txtOwnerEmailAddress.getText().contains("@") && txtOwnerEmailAddress.getText().contains("."))
            {}
        else {
            JOptionPane.showMessageDialog(this, "Invalid Email Address");
            txtOwnerEmailAddress.setText("");
            String OwnerEmailAddress = txtOwnerEmailAddress.getText();
        }*/
            
       
        
    }//GEN-LAST:event_txtOwnerEmailAddressActionPerformed

    private void txtOwnerEmailAddressKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtOwnerEmailAddressKeyPressed
        // TODO add your handling code here:
        /*char key = evt.getKeyChar();
        String OwnerEmailAddress = txtOwnerEmailAddress.getText();
        String at = Character.toString(KeyEvent.VK_2);
        String sf = Character.toString(KeyEvent.VK_SHIFT);
        if(txtOwnerEmailAddress.getText().contains("@") && txtOwnerEmailAddress.getText().contains("."))
            {}
        else {
            JOptionPane.showMessageDialog(this, "Invalid Email Address");
            txtOwnerEmailAddress.setText("");
            OwnerEmailAddress = txtOwnerEmailAddress.getText();
        }*/
        
    }//GEN-LAST:event_txtOwnerEmailAddressKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPhotoAttach;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabelImage;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblAddServiceRecords;
    private javax.swing.JLabel lblBrand;
    private javax.swing.JLabel lblColor;
    private javax.swing.JLabel lblEngineNumber;
    private javax.swing.JLabel lblLastMaintenanceYear;
    private javax.swing.JLabel lblLicensePlate;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblNumberofAccidents;
    private javax.swing.JLabel lblNumberofPreviousOwners;
    private javax.swing.JLabel lblNumberofSeats;
    private javax.swing.JLabel lblOdometerReading;
    private javax.swing.JLabel lblOwnerAddress;
    private javax.swing.JLabel lblOwnerDriverLicense;
    private javax.swing.JLabel lblOwnerEmailAddress;
    private javax.swing.JLabel lblOwnerName;
    private javax.swing.JLabel lblOwnerSocialSecurityNumber;
    private javax.swing.JLabel lblOwnerTelephoneNumber;
    private javax.swing.JLabel lblPhotoAttach;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotalServiceCost;
    private javax.swing.JLabel lblWarrantyYear;
    private javax.swing.JLabel lblYear;
    private javax.swing.JTextField txtBrand;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtEngineNumber;
    private javax.swing.JTextField txtLastMaintenanceYear;
    private javax.swing.JTextField txtLicensePlate;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtNumberofAccidents;
    private javax.swing.JTextField txtNumberofPreviousOwners;
    private javax.swing.JTextField txtNumberofSeats;
    private javax.swing.JTextField txtOdometerReading;
    private javax.swing.JTextField txtOwnerAddress;
    private javax.swing.JTextField txtOwnerDriverLicense;
    private javax.swing.JTextField txtOwnerEmailAddress;
    private javax.swing.JTextField txtOwnerName;
    private javax.swing.JTextField txtOwnerSocialSecurityNumber;
    private javax.swing.JTextField txtOwnerTelephoneNumber;
    private javax.swing.JTextField txtTotalServiceCost;
    private javax.swing.JTextField txtWarrantyYear;
    private javax.swing.JTextField txtYear;
    // End of variables declaration//GEN-END:variables
}
