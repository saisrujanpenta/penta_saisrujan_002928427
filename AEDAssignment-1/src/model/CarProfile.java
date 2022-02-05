/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Image;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author saisr
 */
public class CarProfile {
 
    private String Brand;
    private String Model;
    private String Color;
    private int Year;
    private String EngineNumber;
    private int NumberofSeats;
    private String LicensePlates;
    private String OwnerName;
    private String OwnerTelephoneNumber;
    private String OwnerEmailAddress;
    private String OwnerDriverLicense;
    private String OwnerSocialSecurityNumber;
    private String OwnerAddress;
    private int WarrantyYear;
    
    private int LastMaintenanceYear;
    private int NumberofAccidents;
    private int OdometerReading;
    private int NumberofPreviousOwners;
    private int TotalServiceCost;
    
    private Image image;

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getLastMaintenanceYear() {
        return LastMaintenanceYear;
    }

    public void setLastMaintenanceYear(int LastMaintenanceYear) {
        this.LastMaintenanceYear = LastMaintenanceYear;
    }

    public int getNumberofAccidents() {
        return NumberofAccidents;
    }

    public void setNumberofAccidents(int NumberofAccidents) {
        this.NumberofAccidents = NumberofAccidents;
    }

    public int getOdometerReading() {
        return OdometerReading;
    }

    public void setOdometerReading(int OdometerReading) {
        this.OdometerReading = OdometerReading;
    }

    public int getNumberofPreviousOwners() {
        return NumberofPreviousOwners;
    }

    public void setNumberofPreviousOwners(int NumberofPreviousOwners) {
        this.NumberofPreviousOwners = NumberofPreviousOwners;
    }

    public int getTotalServiceCost() {
        return TotalServiceCost;
    }

    public void setTotalServiceCost(int TotalServiceCost) {
        this.TotalServiceCost = TotalServiceCost;
    }
    

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getYear() {
        return Year;
    }

    public void setYear(int Year) {
        this.Year = Year;
    }

    public String getEngineNumber() {
        return EngineNumber;
    }

    public void setEngineNumber(String EngineNumber) {
        this.EngineNumber = EngineNumber;
    }

    public int getNumberofSeats() {
        return NumberofSeats;
    }

    public void setNumberofSeats(int NumberofSeats) {
        this.NumberofSeats = NumberofSeats;
    }

    public String getLicensePlates() {
        return LicensePlates;
    }

    public void setLicensePlates(String LicensePlates) {
        this.LicensePlates = LicensePlates;
    }

    public String getOwnerName() {
        return OwnerName;
    }

    public void setOwnerName(String OwnerName) {
        this.OwnerName = OwnerName;
    }

    public String getOwnerTelephoneNumber() {
        return OwnerTelephoneNumber;
    }

    public void setOwnerTelephoneNumber(String OwnerTelephoneNumber) {
        this.OwnerTelephoneNumber = OwnerTelephoneNumber;
    }

    public String getOwnerEmailAddress() {
        return OwnerEmailAddress;
    }

    public void setOwnerEmailAddress(String OwnerEmailAddress) {
        this.OwnerEmailAddress = OwnerEmailAddress;
    }

    public String getOwnerDriverLicense() {
        return OwnerDriverLicense;
    }

    public void setOwnerDriverLicense(String OwnerDriverLicense) {
        this.OwnerDriverLicense = OwnerDriverLicense;
    }

    public String getOwnerSocialSecurityNumber() {
        return OwnerSocialSecurityNumber;
    }

    public void setOwnerSocialSecurityNumber(String OwnerSocialSecurityNumber) {
        this.OwnerSocialSecurityNumber = OwnerSocialSecurityNumber;
    }

    public String getOwnerAddress() {
        return OwnerAddress;
    }

    public void setOwnerAddress(String OwnerAddress) {
        this.OwnerAddress = OwnerAddress;
    }

    public int getWarrantyYear() {
        return WarrantyYear;
    }

    public void setWarrantyYear(int WarrantyYear) {
        this.WarrantyYear = WarrantyYear;
    }
    
    @Override
    public String toString(){
        return Brand;
    }
    
    
    
}
