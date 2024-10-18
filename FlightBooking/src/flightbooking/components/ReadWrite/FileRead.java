/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbooking.components.ReadWrite;



import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import flightbooking.Main;

/**
 *
 * @author night
 */
public class FileRead {
    
    
    
    
    public static String accountsPath;
    public static String flightsPath;
    public static String bookingsPath;
    
    //create all files needed for new user
    public static void readyAllFiles(){
        
        try{
           // try to use this on other devices of the paths work
            
            File inputFile = new File("src/flightbooking/components/ReadWrite/defaultPaths.txt");
            Scanner scan = new Scanner(inputFile);
            
            // if path cannot be found provide a way;
            
            while(scan.hasNextLine()){
                
               String path[] = new String[2];
               String fileName;
               String pathAddress;
               String temp;
               
               temp = scan.nextLine();
               path = temp.split(":");
               
               fileName = path[0]; 
               pathAddress = path[1];
               
               if("accounts".equals(fileName)){
                   
                   accountsPath = pathAddress;
                   
                   File fileInput = new File(pathAddress);
                  
                   if(fileInput.exists() && fileInput.length() > 0){
                       continue;
                   } else {
                       FileWriter writePath = new FileWriter(fileInput);
                       writePath.write(Main.FILE_END);
                       writePath.close();
                   } 
               } else if("flights".equals(fileName)){
                   
                   flightsPath = pathAddress;
                   
                   File fileInput = new File(pathAddress);
                    
                   if(fileInput.exists() && fileInput.length() > 0){
                       continue;
                   } else {
                       FileWriter writePath = new FileWriter(fileInput);
                       writePath.write(Main.FILE_END);
                       writePath.close();
                   } 
               } else if("bookings".equals(fileName)){
                   
                   bookingsPath = pathAddress;
                   
                   File fileInput = new File(pathAddress);
                    
                   if(fileInput.exists() && fileInput.length() > 0){
                       continue;
                   } else {
                       FileWriter writePath = new FileWriter(fileInput);
                       writePath.write(Main.FILE_END);
                       writePath.close();
                   } 
        
               }
                  
            }
            scan.close();
                     
        }
        catch(IOException e){
            
            
        }
        
       
        
        
    }

    public static void loadFlightsTxt(){
        
        try{
        
          
        int flightsDataIndex = 0;
        File file = new File(flightsPath);
        Scanner scan = new Scanner(file);
        
         while(scan.hasNextLine()){
                
                //read the flights file line by line#
                //store to a one-dimension array with "/" to split the strings into a flight format
                //store the one-dimension array to the two dimension array       
             
                String flightFormat[] = new String[Main.FLIGHT_FORMAT_COUNT];
                String flight;
                
                
                
                flight = scan.nextLine();
                
                
                if(flight.equals(Main.FILE_END)){
                    break;
                }
                
                flightFormat = flight.split("/");
                
             
                Main.flights[flightsDataIndex].setFlightId(flightFormat[0]);
                Main.flights[flightsDataIndex].setAirplaneCode(flightFormat[1]);
                Main.flights[flightsDataIndex].setDepartureDate(flightFormat[2]); 
                Main.flights[flightsDataIndex].setDepartureTime(flightFormat[3]); 
                Main.flights[flightsDataIndex].setDestination(flightFormat[4]); 
                Main.flights[flightsDataIndex].setVacantSeat(flightFormat[5]); 
                Main.flights[flightsDataIndex].setSeatType(flightFormat[6]); 
                Main.flights[flightsDataIndex].setStatus(flightFormat[7]); 
                Main.flights[flightsDataIndex].setRemarks(flightFormat[8]); 
                   
                
                flightsDataIndex++; // storing all read data in a two dimension object array 
    
               
         }
         
        }catch(IOException e){
                 System.out.print("loadFlight.txt ERROR");
        }
                
    }
   
    
    public static void loadBookingsTxt(String currentSelected){
         
        try{
        
            if(!currentSelected.isEmpty()){
                System.out.println("emptying");
                for(int i = 0; i < Main.bookings.length; i++){
                    Main.bookings[i].setbookNumber(null);
                }
            }
       
          
        int indicator = 0;
        int bookingsIndex = 0;
        File file = new File(bookingsPath);
        Scanner scan = new Scanner(file);
        
         while(scan.hasNextLine()){
                
                //read the bookings file line by line
                //store to a one-dimension array with "/" to split the strings into a booking format
                //store the one-dimension array to the two dimension array       
             
                String bookingsFormat[] = new String[Main.BOOKING_FORMAT_COUNT];
                String booking;
                
                
                
                booking = scan.nextLine();
                
                indicator++;
                
                if(booking.equals(Main.FILE_END)){
                    break;
                }
                
                
                
                bookingsFormat = booking.split("/");
                        
                if(currentSelected.equals(bookingsFormat[0])){
                    continue;
                }
                Main.bookings[bookingsIndex].setbookNumber(bookingsFormat[0]);
                Main.bookings[bookingsIndex].setFlightId(bookingsFormat[1]);
                Main.bookings[bookingsIndex].setAirplaneCode(bookingsFormat[2]);
                Main.bookings[bookingsIndex].setDepartureDate(bookingsFormat[3]);
                Main.bookings[bookingsIndex].setDepartureTime(bookingsFormat[4]);
                Main.bookings[bookingsIndex].setDestination(bookingsFormat[5]);
                Main.bookings[bookingsIndex].setSeatReserve(bookingsFormat[6]);
                Main.bookings[bookingsIndex].setSeatType(bookingsFormat[7]);
                Main.bookings[bookingsIndex].setName(bookingsFormat[8]);
                Main.bookings[bookingsIndex].setEmail(bookingsFormat[9]);
                Main.bookings[bookingsIndex].setExtraBaggage(bookingsFormat[10]);
                Main.bookings[bookingsIndex].setContactNumber(bookingsFormat[11]);   
                Main.bookings[bookingsIndex].setBill(bookingsFormat[12]);
                    
                System.out.print(bookingsFormat[0]);
                bookingsIndex++; // storing all read data in a two dimension array
    
               
         }
         
        }catch(IOException e){
                 System.out.print("loadBook.txt ERROR");
        }
                 
    
        
    }
    
     public static String[][] loadDefaultPricesTxt(){
        
         String pricesData[][] = new String[Main.COUNT_PRICES][Main.PRICES_LOCATION_FORMAT];
        
        try{
        
          
        int indicator = 0;
        int pricesDataIndex = 0;
        File file = new File("src/flightbooking/components/ReadWrite/defaultPrices.txt");
        Scanner scan = new Scanner(file);
        
         while(scan.hasNextLine()){
                
                //read the bookings file line by line
                //store to a one-dimension array with "/" to split the strings into a booking format
                //store the one-dimension array to the two dimension array       
             
                String pricesFormat[] = new String[Main.BOOKING_FORMAT_COUNT];
                String prices;
                
                
                
                prices = scan.nextLine();
                
                indicator++;
                
                if(prices.equals(Main.FILE_END)){
                    break;
                }
                
                
                pricesFormat = prices.split(":");
                
                for(int i = 0; i < pricesFormat.length; i++){
                    pricesData[pricesDataIndex][i] = pricesFormat[i];
                    
                }
                
                pricesDataIndex++; // storing all read data in a two dimension array
    
               
         }
         
        }catch(IOException e){
                 System.out.print("loadBook.txt ERROR");
        }
                 
         return pricesData;
        
        
        
    }
            
            
      
}




