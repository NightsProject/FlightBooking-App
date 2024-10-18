/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbooking.components.bookFlight;

/**
 *
 * @author night
 * 
 */

import flightbooking.components.Booking;
import flightbooking.components.ReadWrite.FileWrite;
import flightbooking.Main;
import flightbooking.components.Flight;
import flightbooking.components.bookFlight.BookFlightForm;

public class BookFlightComponents {

    public static Booking newBook;


    public static String flightIdCheck(String flightId){
        
         // the vip and regular
        
        for(int i = 0; i < Main.SEAT_TYPE_COUNT; i++){
            BookFlightForm.flight[i] = new Flight();
        }
        
        String seatTypeAvail = null;
        
        int count;
        int indicator;
        
        
        System.out.print(flightId);
        
        //check the flight id input
        if((Integer.parseInt(flightId) >= 1000) && (Integer.parseInt(flightId) <= 9999)  ){
            
            count = 0; //index for main flight array
            indicator = 0; // index for flight array
            //check every flightId stored in the array
            while(Main.flights[count].getFlightId() != null){
                
                if(flightId.equals(Main.flights[count].getFlightId())){
                    
                    
                    //passing the selected flight id to a tem object 
                    BookFlightForm.flight[indicator].setFlightId(Main.flights[count].getFlightId());
                    BookFlightForm.flight[indicator].setAirplaneCode(Main.flights[count].getAirplaneCode());
                    BookFlightForm.flight[indicator].setDepartureDate(Main.flights[count].getDepartureDate());
                    BookFlightForm.flight[indicator].setDepartureTime(Main.flights[count].getDepartureTime());
                    BookFlightForm.flight[indicator].setDestination(Main.flights[count].getDestination());
                    BookFlightForm.flight[indicator].setVacantSeat(Main.flights[count].getVacantSeat());
                    BookFlightForm.flight[indicator].setSeatType(Main.flights[count].getSeatType());
                    BookFlightForm.flight[indicator].setStatus(Main.flights[count].getStatus());
                    BookFlightForm.flight[indicator].setRemarks(Main.flights[count].getRemarks());
                     
                    
                    indicator++;
                    
                    //break if all seatType is already added
                    if(indicator == Main.SEAT_TYPE_COUNT){
                        break;
                    }
                   
                }
                
                count++;
            }
            
         
            
        } else {
            
            System.out.print("invalid Input");
        }
        
        if(BookFlightForm.flight[0].getSeatType() != null){
            seatTypeAvail = chooseFlight(BookFlightForm.flight);
            return seatTypeAvail;
        } else {
            seatTypeAvail = "!FlightExist"; 
        }
        
       return seatTypeAvail;
    }
    
    public static String chooseFlight(Flight[] flight){
        
        String seatType = null;
        //if seat type is available
        boolean isVip = false;
        boolean isRegular = false;
        
        for(int i = 0; i < flight.length; i++){

               //the seat type is in the index 6 of the array
               if("VIP".equals(flight[i].getSeatType())){
                   isVip = true;
               } 
               if("Regular".equals(flight[i].getSeatType())){
                   isRegular = true;
               
                
            }
         
        }
   
        if(isVip && isRegular){
            seatType = "both";
           
        } else
        
        if(isVip && !isRegular){
             seatType = "vip";
            
        } else
        
        if(!isVip && isRegular){
            seatType = "regular";
        }
        
    return seatType; // this should not return null
    }
    
    
    public static String genBookNum(){
        
        String newBookingNumber = null;         
        String temp = null; //this should not be null
        int num;
        int count;
        int indicator;
        
        
        count = 0;
        indicator = 0;
        System.out.println("here\n");
        
        System.out.print(Main.bookings[count].getbookNumber());
        while(Main.bookings[count].getbookNumber() != null){ 
            temp = Main.bookings[count].getbookNumber();
            count++;
            indicator++;
           
        }
        
         
        if(indicator == 0){
            
            return newBookingNumber = "0001";
        }
        
        num = Integer.parseInt(temp) + 1;
        
        if(num >= 1 && num < 10){
            return newBookingNumber = "000" + Integer.toString(num);      
        }
        if(num >= 10 && num < 100){
            return newBookingNumber = "00" + Integer.toString(num);
        }
        if(num >= 100 && num < 1000){
            return newBookingNumber = "0" + Integer.toString(num);
        }
        if(num >= 1000 && num < 10000){
            return newBookingNumber = Integer.toString(num);
        }
        if(num >= 10000){
            System.out.print("the booking number have reached already reached the maximum");
        }
        
        return newBookingNumber;
    }
    //generate a new book number in passenger input details
     public static String genBookNumPass(){
        
        String newBookingNumber = null;         
        String temp = null; //this should not be null
        int num;
        int count;
        int indicator;
        
        
        count = 0;
        indicator = 0;
        System.out.println("here\n");
        
   
        while(BookFlightForm.passengerData[count][0] != null){ 
            temp = BookFlightForm.passengerData[count][0];
            count++;
            indicator++;
           
        }
        
         
        if(indicator == 0){
            
            return newBookingNumber = "0001";
        }
        
        num = Integer.parseInt(temp) + 1;
        
        if(num >= 1 && num < 10){
            return newBookingNumber = "000" + Integer.toString(num);      
        }
        if(num >= 10 && num < 100){
            return newBookingNumber = "00" + Integer.toString(num);
        }
        if(num >= 100 && num < 1000){
            return newBookingNumber = "0" + Integer.toString(num);
        }
        if(num >= 1000 && num < 10000){
            return newBookingNumber = Integer.toString(num);
        }
        if(num >= 10000){
            System.out.print("the booking number have reached already reached the maximum");
        }
        
        return newBookingNumber;
    }
    
    
    
    public static void setPassengerData(){
        int count;
        
        count = 0;
        while(count < Main.MAX_BOOKINGS){
            
            if(BookFlightForm.passengerData[count][0] == null){
                break;
            }
            
            System.out.println(count);
            
            newBook.setbookNumber(BookFlightForm.passengerData[count][0]);
            newBook.setName(BookFlightForm.passengerData[count][1]);
            newBook.setContactNumber(BookFlightForm.passengerData[count][3]);
            newBook.setEmail(BookFlightForm.passengerData[count][2]);
            newBook.setExtraBaggage(BookFlightForm.passengerData[count][4]);
            newBook.setBill(BookFlightForm.passengerData[count][5]);
            newBook.setSeatReserve(BookFlightForm.passengerData[count][6]);

            addNewBooking();
            count++;
        }
        
        System.out.println("Called the update booking");
        System.out.println(BookFlightForm.passengerData[0][0] + "jjjj");
        FileWrite.updateBookingsData();
        
    }
    
    
    public static void addNewBooking(){
        int count;
        
        
        count = -1;
        while(Main.bookings[count + 1 ].getbookNumber() != null){
            count++;
        }
        System.out.println(count + "this is the count in bookflight components");
       
        count += 1;
        //will add the new booking to an empty slot in bookings array
                 
            Main.bookings[count].setbookNumber(newBook.getbookNumber());
            Main.bookings[count].setFlightId(newBook.getFlightId());
            Main.bookings[count].setAirplaneCode(newBook.getAirplaneCode());
            Main.bookings[count].setDepartureDate(newBook.getDepartureDate());
            Main.bookings[count].setDepartureTime(newBook.getDepartureTime());
            Main.bookings[count].setDestination(newBook.getDestination());
            Main.bookings[count].setSeatReserve(newBook.getSeatReserve());
            Main.bookings[count].setSeatType(newBook.getSeatType());
            Main.bookings[count].setName(newBook.getName());
            Main.bookings[count].setEmail(newBook.getEmail());
            Main.bookings[count].setExtraBaggage(newBook.getExtraBaggage());
            Main.bookings[count].setContactNumber(newBook.getContactNumber());   
            Main.bookings[count].setBill(newBook.getBill());
        

    } 
}
