/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package flightbooking;

import flightbooking.components.login.LoginForm;

import flightbooking.components.ReadWrite.FileWrite;
import flightbooking.components.ReadWrite.FileRead;


import flightbooking.components.NewFlight.NewFlightComponents;
import flightbooking.components.NewFlight.NewFlightForm;
import flightbooking.components.Flight;

import flightbooking.components.bookFlight.BookFlightComponents;
import flightbooking.components.bookFlight.BookFlightForm;
import flightbooking.components.Booking;

import flightbooking.components.flightList.FlightListForm;
import flightbooking.components.bookingList.BookingListForm;


import flightbooking.components.menu.MenuForm;



/**
 *
 * @author night
 */
public class Main {
    
    //Constants that can be changed
    public static String FILE_END = "[END]/This is the end of the file/[END]";
    public static int MAX_ACCOUNTS = 1000; 
    public static int MAX_BOOKINGS = 100000;
    public static int MAX_GROUP_BOOKING = 100; // maximum allowed group booking
    public static int EXTRA_BAGGAGE_PRICE = 400;
    public static String DEFAULT_REMARKS = "This flight is cancelled due to bad weather";
    
    //-----------------------------------------------------
    //flights Constants [DO NOT CHANGE]
    public static int MAX_FLIGHTS = 9999;
    public static int FLIGHT_FORMAT_COUNT = 9;
    // [FORMAT]: FLIGHT ID / AIRPLANE CODE / DEPARTURE DATE / DEPARTURE TIME/ DESTINATION/ VACANT SEATS / SEAT TYPE / STATUS / REMARKS
    public static int SEAT_TYPE_COUNT = 2;
    
    //-----------------------------------------------------
    //bookings Constants [DO NOT CHANGE
    public static int BOOKING_FORMAT_COUNT = 13;
    // [FORMAT]: bookNumber / flightId / airplaneCode / departureDate / departureTime / destination / seatReserve / seatType / name / + email / extraBaggage / contactNumber / bill
    
    public static int PASSENGER_FORMAT_COUNT = 7;
    // [FORMAT]: BOOKNUMBER / NAME / CANTACT / EMAIL / EEXTRA BAGGAGE / BILL / SEAT RESERVE
   
    public static int DESTINATION_COUNT = 4;
    public static int COUNT_PRICES = SEAT_TYPE_COUNT * DESTINATION_COUNT; // count for vip and regular prices for all destination
    public static int PRICES_LOCATION_FORMAT = 3;
    // [FORMAT]: DESTINATION : SEATTYPE : PRICE
          
    
    public static Flight flights[] = new Flight[MAX_FLIGHTS];
    public static Booking bookings[] = new Booking[MAX_BOOKINGS];
 
    public static String prices[][] = new String[COUNT_PRICES][];
    
 
    private static LoginForm loginForm;
    public static NewFlightForm newFlightForm;
    public static BookFlightForm bookFlightForm;
    public static FlightListForm viewFlightForm;
    public static BookingListForm viewBookingForm;
    
    public static MenuForm menuForm;
    
    
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                //initiation for objects array
                for(int i = 0; i < MAX_FLIGHTS; i++){
                    flights[i] = new Flight();
                }
                for(int i = 0; i < MAX_BOOKINGS; i++){    
                    bookings[i] = new Booking();
                }
                //check and ready all files
               FileRead.readyAllFiles();  
               
               FileRead.loadFlightsTxt();
               FileRead.loadBookingsTxt("");
               prices = FileRead.loadDefaultPricesTxt();
         
                showLoginForm();
                //showMenuForm();  
             
             
            }
            
            
        });
        
        
    }
    
    
        
    //create account if no account exist in the database
    //account creation for new admin
    public static void createNewAdmin(String username, String password){
        String admin;
        
        admin = username + "/" + password + "/" + "admin";
                
        FileWrite.accountWrite(admin);
        showLoginForm();
        showLoginForm();
        
        
    }
     
    
    
    public static void newFlightObject(){
        if(NewFlightComponents.addFlight == null){
            NewFlightComponents.addFlight = new Flight();
         }
        
    }
    
    public static void newBookingObject(){
        if(BookFlightComponents.newBook == null){
            BookFlightComponents.newBook = new Booking();
            
        }
        
    }
    
    
    
     
    //main methods for FRAMES
    public static void showLoginForm(){
        if(loginForm != null){
            loginForm.dispose();
        } 
        if(loginForm == null){
            loginForm = new LoginForm();
            loginForm.setVisible(true);
        }

    }
    
    public static void showNewFlightForm(){
        newFlightForm = new NewFlightForm();
        newFlightForm.setVisible(true);
        
        
    }
    
    public static void showBookFlightForm(){
        bookFlightForm = new BookFlightForm();
        bookFlightForm.setVisible(true);
   
    }
    
    public static void showViewFlight(){
        viewFlightForm = new FlightListForm();
        viewFlightForm.setVisible(true);
    }
    
    public static void showViewBooking(){
        viewBookingForm = new BookingListForm();
        viewBookingForm.setVisible(true);
    }
    
    public static void showMenuForm(){
        if(menuForm != null){
            menuForm.dispose();
        } 
        if(menuForm == null){
            menuForm = new MenuForm();
            menuForm.setVisible(true);
        }
    }
    
    
    
}
