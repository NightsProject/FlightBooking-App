/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbooking.components.NewFlight;

import flightbooking.components.ReadWrite.FileRead;
import flightbooking.components.Flight;
import flightbooking.Main;
import flightbooking.components.NewFlight.NewFlightForm;

/**
 *
 * @author night
 */
public class NewFlightComponents {
    
    public static Flight addFlight;
  
    public static String generateFlightId(){
         
        //generating for a unique id based on airplane Code, Departure Date, departure Time, destination and seat Type.
        String newSeatType = null;
       
        String genFlightId = null;
        String temp = null;
        String flightIdExist = null;
        
        boolean isEnd = false;
        boolean isFlightVipAvailable = true;
        boolean isFlightRegularAvailable = true;
        boolean isAirplaneUnique= true;
            
        int count;
        int indicator;
        
        
        
        indicator = 0;
        count = 0;
        while(indicator < Main.MAX_FLIGHTS){  
            
            indicator++;
            
            if(Main.flights[count].getFlightId() == null){
                isEnd = true;
                break;
            }
      
            temp = Main.flights[count].getFlightId();
                   
            //compare if same           
            if((addFlight.getAirplaneCode().equals(Main.flights[count].getAirplaneCode())) && 
               (addFlight.getDepartureDate().equals(Main.flights[count].getDepartureDate()) &&
               (addFlight.getDepartureTime().equals(Main.flights[count].getDepartureTime())) &&
               addFlight.getDestination().equals(Main.flights[count].getDestination()))){
                           
                isAirplaneUnique = false;
                        
                if("VIP".equals(Main.flights[count].getSeatType())){
                    flightIdExist = temp;
                    isFlightVipAvailable = false;
                } 
                if("Regular".equals(Main.flights[count].getSeatType())){
                    flightIdExist = temp;
                    isFlightRegularAvailable = false;
                }
                               
            }
            // end of is statement 
            count++;
        }
        //end of while loop
        System.out.print("flight");
        System.out.println(isFlightVipAvailable);
        System.out.print(isFlightRegularAvailable);
        
        newSeatType = addFlight.getSeatType();
        
        
        if(isEnd){
                
            //new plane
            if(isAirplaneUnique){
                //see if this is the first time creating new flight
                if (indicator == 1){
                    return "1000";
                }
                
                int num;

                num = Integer.parseInt(temp) + 1;
                System.out.print(num);
                genFlightId = Integer.toString(num);
            }
                
            if((!isFlightVipAvailable) && (!isFlightRegularAvailable)){
                    
                NewFlightForm.flightCheck("Exist");
                    
            } else
                
                //vip flight is available to set
            if((isFlightVipAvailable) && (!isFlightRegularAvailable)){
                    
                if ("VIP".equals(newSeatType)){
                    NewFlightForm.flightExists = false;
                    return flightIdExist;
                }
                    
                    NewFlightForm.flightCheck("vip");
             } else
                
                //regular flight is available to set
             if((!isFlightVipAvailable) && (isFlightRegularAvailable) ){
                    
                if ("Regular".equals(newSeatType)){
                    NewFlightForm.flightExists = false;
                    return flightIdExist;
                }
                    
                NewFlightForm.flightCheck("regular");
                    
            }
                        
             
                        
        }
         
       
        
       
       return genFlightId;
        
    }
     
  
     
     
     
     
     
     
    
    public static boolean airplaneCodeValid(String airplaneCode){
        
        boolean first2Dig = true;
        boolean remainDig = true;
        
        if(airplaneCode.length() == 6){
            
            int airplaneCodeLength = airplaneCode.length();
            String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String num = "0123456789";
            
                char code;
                
                for(int i = 0; i < airplaneCodeLength; i++){
                    
                    if(i < 2){    
                        
                        code = airplaneCode.charAt(i); 
                        
                        for(int j = 0; j < alphabet.length(); j++){
                            
                            if(code == alphabet.charAt(j) && first2Dig){
                                
                                first2Dig = true;
                                break;
                                
                            } else if (j == (alphabet.length() - 1)){
                                first2Dig = false;
                            }
                        }
                        
                    } else{
                       
                        code = airplaneCode.charAt(i); 
                        
                        for(int j = 0; j < num.length(); j++){
                            
                            if(code == num.charAt(j) && remainDig){
                                
                                remainDig = true;
                                break;
                                
                            } else if (j == (num.length() - 1)){
                                remainDig = false;
                            }
                        }
                        
                        
                    }
                    
                    
                    
                } 
                
                if(first2Dig && remainDig){
                    return true;
                } 
        }
        
        // the airplane code is invalid
        return false; 
        
    }
    
    
    
 
    
    
    
    
}
