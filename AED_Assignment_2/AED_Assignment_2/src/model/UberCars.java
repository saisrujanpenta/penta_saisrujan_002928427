/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author saisr
 */
public class UberCars {
    private boolean Availability;
    private String Brand;
    private int YearofManufacture;
    private int MaxSeats;
    private int MinSeats;
    private int SerialNumber;
    private String ModelNumber;
    private String AvailableCity;
    private boolean MaintenanceCertificate;
    
     public UberCars( String Brand, int YearofManufacture, int MinSeats, int MaxSeats, int SerialNumber, String ModelNumber, String AvailableCity, boolean Availability, boolean MaintenanceCertificate) {
        this.Availability = Availability;
        this.Brand = Brand;
        this.YearofManufacture = YearofManufacture;
        this.MinSeats = MinSeats;
        this.MaxSeats = MaxSeats;
        this.SerialNumber = SerialNumber;
        this.ModelNumber = ModelNumber;
        this.AvailableCity = AvailableCity;
        this.MaintenanceCertificate = MaintenanceCertificate;
        
      
    }
     
     UberCars ()
     {
         
     }

    public boolean isAvailability() {
        return Availability;
    }

    public void setAvailability(boolean Availability) {
        this.Availability = Availability;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String Brand) {
        this.Brand = Brand;
    }

    public int getYearofManufacture() {
        return YearofManufacture;
    }

    public void setYearofManufacture(int YearofManufacture) {
        this.YearofManufacture = YearofManufacture;
    }

    public int getMaxSeats() {
        return MaxSeats;
    }

    public void setMaxSeats(int MaxSeats) {
        this.MaxSeats = MaxSeats;
    }

    public int getMinSeats() {
        return MinSeats;
    }

    public void setMinSeats(int MinSeats) {
        this.MinSeats = MinSeats;
    }

    public int getSerialNumber() {
        return SerialNumber;
    }

    public void setSerialNumber(int SerialNumber) {
        this.SerialNumber = SerialNumber;
    }

    public String getModelNumber() {
        return ModelNumber;
    }

    public void setModelNumber(String ModelNumber) {
        this.ModelNumber = ModelNumber;
    }

    public String getAvailableCity() {
        return AvailableCity;
    }

    public void setAvailableCity(String AvailableCity) {
        this.AvailableCity = AvailableCity;
    }

    public boolean isMaintainanceCertificate() {
        return MaintenanceCertificate;
    }

    public void setMaintainanceCertificate(boolean MaintainanceCertificate) {
        this.MaintenanceCertificate = MaintainanceCertificate;
    }
    
    @Override
    public String toString(){
        return Brand;
        
    }
    
    
    
}
