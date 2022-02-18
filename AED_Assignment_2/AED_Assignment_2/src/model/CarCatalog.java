/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author saisr
 */
public class CarCatalog {
    private ArrayList<UberCars> UberCarsList;
    private ArrayList<UberCars> TemporaryList;
    
    
    
    public CarCatalog(){
        this.UberCarsList = new ArrayList<UberCars>();
        
        
        UberCars ubercar1 = new UberCars ("BMW", 2018, 2, 5, 1, "320d", "Baltimore", true, false);
        UberCars ubercar2 = new UberCars ("TESLA", 2016, 1, 4, 2, "X", "Boston", true, true);
        UberCars ubercar3 = new UberCars ("AUDI", 2017, 2, 6, 3, "A5", "New York", false, false);
        UberCars ubercar4 = new UberCars ("TOYOTA", 2013, 3, 5, 4, "Fortuner", "Arlington", false, true);
        UberCars ubercar5 = new UberCars ("TATA", 2015, 2, 6, 5, "NexonEV", "Dallas", true, true);
        UberCars ubercar6 = new UberCars ("INFINITI", 2012, 2, 7, 6, "Swift", "Boston", false, false);
        UberCars ubercar7 = new UberCars ("HYUNDAI", 2010, 2, 8, 7, "Verna", "California", true, false);
        UberCars ubercar8 = new UberCars ("HYUNDAI", 2017, 2, 5, 8, "Elantra", "Dallas", true, true);
        UberCars ubercar9 = new UberCars ("IMPALA", 2014, 1, 4, 9, "IM1", "Kansas", true, false);
        UberCars ubercar10 = new UberCars ("TESLA", 2020, 2, 5, 10, "S", "Ohio", true, true);
        UberCars ubercar11 = new UberCars ("MAXX", 2012, 2, 6, 11, "MX", "California", true, false);
        UberCars ubercar12 = new UberCars ("BMW", 2021, 2, 7, 12, "X5", "Boston", false, false);
        UberCars ubercar13 = new UberCars ("AUDI", 2013, 2, 4, 13, "Ultron", "Boston", false, true);
        UberCars ubercar14 = new UberCars ("BMW", 2014, 2, 5, 14, "320d", "Boston", true, false);
        UberCars ubercar15 = new UberCars ("TATA", 2018, 2, 5, 15, "NexonEV", "Arlington", true, false);
        
        
        UberCarsList.add(ubercar1);
        UberCarsList.add(ubercar2);
        UberCarsList.add(ubercar3);
        UberCarsList.add(ubercar4);
        UberCarsList.add(ubercar5);
        UberCarsList.add(ubercar6);
        UberCarsList.add(ubercar7);
        UberCarsList.add(ubercar8);
        UberCarsList.add(ubercar9);
        UberCarsList.add(ubercar10);
        UberCarsList.add(ubercar11);
        UberCarsList.add(ubercar12);
        UberCarsList.add(ubercar13);
        UberCarsList.add(ubercar14);
        UberCarsList.add(ubercar15);
        
    
    }

    public ArrayList<UberCars> getUberCarsList() {
        return UberCarsList;
    }

    public void setUberCarsList(ArrayList<UberCars> UberCarsList) {
        this.UberCarsList = UberCarsList;
    }
    
    public UberCars addUber()
    {
        UberCars ubercars = new UberCars();
        UberCarsList.add(ubercars);
        return ubercars;
    }
    
    public void deleteUber (UberCars ubercars)
    {
        UberCarsList.remove(ubercars);
    }
    public ArrayList<UberCars>searchBrand (String brandName ){
        TemporaryList = new ArrayList<UberCars>();
        for(UberCars ubercars : UberCarsList){
            if (ubercars.getBrand().equalsIgnoreCase(brandName)){
                TemporaryList.add(ubercars);
            }
        }
        return TemporaryList;
        
    }
    
    public ArrayList<UberCars>searchBrand1 (String brandName1, ArrayList<UberCars> result ){
        TemporaryList = new ArrayList<UberCars>();
        for(UberCars ubercars : result){
            if (ubercars.getBrand().equalsIgnoreCase(brandName1)){
                TemporaryList.add(ubercars);
            }
        }
        return TemporaryList;
        
    }
    

     public ArrayList<UberCars>searchYearofManufacture (String YearofManufacture, ArrayList<UberCars> result){
        TemporaryList = new ArrayList<UberCars>();
        for(UberCars ubercars : result){
            if (ubercars.getYearofManufacture()== Integer.parseInt(YearofManufacture))
                    {
                TemporaryList.add(ubercars);
            }
        }
        return TemporaryList;
    }
     public ArrayList<UberCars>searchSeatsAvail (int MinSeats, int MaxSeats, ArrayList<UberCars> result){
        TemporaryList = new ArrayList<UberCars>();
       
        for (UberCars ubercars : result) {
           if (MinSeats <= ubercars.getMinSeats() && MaxSeats >= ubercars.getMaxSeats())
           {
               TemporaryList.add(ubercars);
           }
       
       }
        return TemporaryList;
    }
     
    

      public ArrayList<UberCars>searchSerialNumber (String SerialNumber, ArrayList<UberCars> result){
        TemporaryList = new ArrayList<UberCars>();
        for(UberCars ubercars : result){
            if (ubercars.getSerialNumber()== Integer.parseInt(SerialNumber))
                    {
                TemporaryList.add(ubercars);
            }
        }
        return TemporaryList;
    }
      public ArrayList<UberCars>searchModelNumber (String ModelNumber, ArrayList<UberCars> result){
        TemporaryList = new ArrayList<UberCars>();
        for(UberCars ubercars : result){
            if (ubercars.getModelNumber().equalsIgnoreCase(ModelNumber)){
                TemporaryList.add(ubercars);
            }
        }
        return TemporaryList;
    }
      public ArrayList<UberCars>searchAvailCity (String AvailableCity, ArrayList<UberCars> result){
        TemporaryList = new ArrayList<UberCars>();
        for(UberCars ubercars : result){
            if (ubercars.getAvailableCity().equalsIgnoreCase(AvailableCity)){
                TemporaryList.add(ubercars);
            }
        }
        return TemporaryList;
    }
      public ArrayList<UberCars>searchAvailStatus (String availStatus, ArrayList<UberCars> result){
        TemporaryList = new ArrayList<UberCars>();
        for(UberCars ubercars : result){
            if (ubercars.isAvailability() == Boolean.parseBoolean(availStatus)){
                TemporaryList.add(ubercars);
            }
        }
        return TemporaryList;
    }
      public ArrayList<UberCars> searchFirstAvailUber (String firstAvailUber, ArrayList<UberCars> result){
          TemporaryList = new ArrayList<UberCars>();
          for (UberCars ubercars : result){
              if (ubercars.isAvailability() == true){
                  TemporaryList.add(ubercars);
                  break;
              }
          }
          return TemporaryList;
      }
      public ArrayList<UberCars>searchMainCerti (String MaintenanceCertifcate, ArrayList<UberCars> result){
        TemporaryList = new ArrayList<UberCars>();
        for(UberCars ubercars : result){
            if (ubercars.isMaintainanceCertificate() == Boolean.parseBoolean(MaintenanceCertifcate)){
                TemporaryList.add(ubercars);
            }
        }
        return TemporaryList;
    }
      
   }
    
    

