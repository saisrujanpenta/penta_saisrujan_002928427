/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author saisr
 */
public class CarProfileHistory {

    private ArrayList<CarProfile> history;
    
    public CarProfileHistory() {
        this.history = new ArrayList<CarProfile>();   
    } 

    public ArrayList<CarProfile> getHistory() {
        return history;                                                                                                                                                                                                                  
    }

    public void setHistory(ArrayList<CarProfile> history) {
        this.history = history;
    } 
                             
    public CarProfile addNewCarProfile(){
        
        CarProfile newCarProfile = new CarProfile();
        history.add(newCarProfile);
        return newCarProfile;
        
    }    
    
    public void deleteCarProfile(CarProfile cp){
        history.remove(cp);
    }
    
    
}
