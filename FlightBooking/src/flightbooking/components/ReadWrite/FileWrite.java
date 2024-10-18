/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbooking.components.ReadWrite;

import flightbooking.components.NewFlight.NewFlightComponents;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import flightbooking.Main;
import static flightbooking.components.bookFlight.BookFlightComponents.newBook;
import flightbooking.components.bookFlight.BookFlightForm;
import flightbooking.components.bookingList.BookingListForm;
/**
 *
 * @author night
 */
public class FileWrite {
        
    
    
    
    public static void accountWrite(String string){
        try{
        File file = new File(FileRead.accountsPath);
        FileWriter writeAccount = new FileWriter(file);
        
        
        writeAccount.write(string);
        writeAccount.close();
        }
        
        catch(IOException e){
        
        }
    }
      
     
    public static void updateFlightData(){
        
        try{

            boolean append = false;
            int indicator;
            int count;

            File inputFile = new File(FileRead.flightsPath);
            FileWriter updateFlight = new FileWriter(inputFile, append);

            count = 0;
            indicator = 0;

            while(indicator < Main.MAX_FLIGHTS){
                
                indicator++;
                //if flight array is at the end the add the new flight
                if(Main.flights[count].getFlightId() == null && NewFlightComponents.addFlight != null){
                    
                    //add the new data
                    
                    //add to the array
                    Main.flights[count].setFlightId(NewFlightComponents.addFlight.getFlightId());
                    Main.flights[count].setAirplaneCode(NewFlightComponents.addFlight.getAirplaneCode());
                    Main.flights[count].setDepartureDate(NewFlightComponents.addFlight.getDepartureDate());
                    Main.flights[count].setDepartureTime(NewFlightComponents.addFlight.getDepartureTime());
                    Main.flights[count].setDestination(NewFlightComponents.addFlight.getDestination());        
                    Main.flights[count].setVacantSeat(NewFlightComponents.addFlight.getVacantSeat());        
                    Main.flights[count].setSeatType(NewFlightComponents.addFlight.getSeatType());        
                    Main.flights[count].setStatus(NewFlightComponents.addFlight.getStatus());        
                    Main.flights[count].setRemarks(NewFlightComponents.addFlight.getRemarks());
                           
                    //add to the file
                    updateFlight.write(Main.flights[count].flightData() + "\n");
                  
                    break;
                } else if(Main.flights[count].getFlightId() == null){
                    break;
                }
                

                if(indicator == 1){
                        append = true;
                        updateFlight.close();
                        updateFlight = new FileWriter(inputFile, append);
                }
                
                updateFlight.write(Main.flights[count].flightData() + "\n");
                count++;
            }
            
            updateFlight.write(Main.FILE_END + "\n");
            updateFlight.close();
        }
        catch(IOException e){
            
        }
        

    }
    
    public static void updateBookingsData(){
        
           try{

            boolean append = false;
            int indicator;
            int count;

            File inputFile = new File(FileRead.bookingsPath);
            FileWriter updateBook = new FileWriter(inputFile, append);
       
  
            
            count = 0;
            indicator = 0;

            while(indicator < Main.MAX_BOOKINGS){
            
                if(Main.bookings[count].getbookNumber() == null){
                    break;
                }
                if(indicator == 1){
                        append = true;
                        updateBook.close();
                        updateBook = new FileWriter(inputFile, append);
                }
                
                indicator++;
          
                
                updateBook.write(Main.bookings[count].bookingData() +"\n");
                
     
                count++;
                
            }
            
        
            for(int i = 0; i < Main.MAX_FLIGHTS; i++){
                        //flighgt id and seat compare
                if(Main.flights[i].getFlightId() == null){
                    break;
                        }
                if((Main.flights[i].getFlightId().equals(BookFlightForm.flight[0].getFlightId()) ) && Main.flights[i].getSeatType().equals(newBook.getSeatType())){

                            //it did update the vacant seats
                    System.out.print("this is the inside main flights");

                    System.out.print(Main.bookings[0].getSeatReserve());
                            //look for parent book number to update the vacant seats
                    String seat[] = BookFlightForm.passengerData[0][6].split(":"); 
                            //update the vacant seat
                    Main.flights[i].setVacantSeat( Integer.toString( (Integer.parseInt(Main.flights[i].getVacantSeat())) - (Integer.parseInt(seat[1]))  ));


                        }         
                    }
                    
                         
            
            
            //update the flight data
           
            
            newBook = null;
            updateFlightData();
            updateBook.write(Main.FILE_END);
            updateBook.close();
        }
        catch(IOException e){
            
        }
        
        
        
        
        
    }
  
    
        public static void cancelBooking(String currentSelected, String parentNum){
        
           try{

            boolean append = false;
            int indicator;
            int count;
            
            String flightId = null;
            String seatType = null;
            
            
            File inputFile = new File(FileRead.bookingsPath);
            FileWriter updateBook = new FileWriter(inputFile, append);
       
  
            
            count = 0;
            indicator = 0;

            while(indicator < Main.MAX_BOOKINGS){
            
                if(Main.bookings[count].getbookNumber() == null){
                    break;
                }
                if(indicator == 1){
                        append = true;
                        updateBook.close();
                        updateBook = new FileWriter(inputFile, append);
                }
                
                indicator++;
          
                if(currentSelected.equals(Main.bookings[count].getbookNumber())){
                    flightId = Main.bookings[count].getFlightId();
                    seatType = Main.bookings[count].getSeatType();
                    continue;
                }
                
                if(parentNum.equals(Main.bookings[count].getbookNumber())){
                    String seatReserve[] = Main.bookings[count].getSeatReserve().split(":");
                    
                    Main.bookings[count].setSeatReserve("Total:" + Integer.toString(Integer.parseInt(seatReserve[1]) - 1));
                }
                
                System.out.println(Main.bookings[count].getbookNumber());
                updateBook.write(Main.bookings[count].bookingData() +"\n");
                
                
                count++;
                
            }
            
        
            for(int i = 0; i < Main.MAX_FLIGHTS; i++){
                        //flighgt id and seat compare
                if(Main.flights[i].getFlightId() == null){
                    break;
                        }
                if((flightId.equals(Main.flights[i].getFlightId() ) ) && seatType.equals(Main.flights[i].getSeatType())){

                            //it did update the vacant seats
                    System.out.print("this is the inside main flights");

                    System.out.print(Main.bookings[0].getSeatReserve());
                            //look for parent book number to update the vacant seat
                            
                            //update the vacant seat
                    Main.flights[i].setVacantSeat( Integer.toString( (Integer.parseInt(Main.flights[i].getVacantSeat())) + 1  ));
                    

                }         
            }
                    
  
            //update the flight data
           
            
        
            updateFlightData();
            updateBook.write(Main.FILE_END);
            updateBook.close();
            
            
            FileRead.loadBookingsTxt(currentSelected);
            System.out.print("\n");
           
            
            for(int i = 0; i < Main.bookings.length; i++){
                
                if(Main.bookings[i].getbookNumber() == null){
                    break;
                }
                
                System.out.println(Main.bookings[i].getbookNumber());
                
            }
            
            Main.viewBookingForm.allBookings();
            FileRead.loadFlightsTxt();
            
        }
        catch(IOException e){
            
        }
        
        
        
        
        
    }
  
    
}
