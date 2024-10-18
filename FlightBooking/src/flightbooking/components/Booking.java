/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbooking.components;

/**
 *
 * @author night
 */
public final class Booking extends Passenger{
    
    private String bookNumber;
    private String seatReserve;
    private String extraBaggage;
    private String bill;

    public Booking() {
    }

    public void  setbookNumber(String bookNumber){
        this.bookNumber = bookNumber;
    }
    public void setExtraBaggage(String extraBaggage){
        this.extraBaggage = extraBaggage;
    }
    public void setSeatReserve(String seatReserve) {
        this.seatReserve = seatReserve;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public void setBill(String Bill) {
        this.bill = Bill;
    }
    
    public String getbookNumber(){
        return bookNumber;
    }
    
    public String getExtraBaggage(){
        return extraBaggage;
        
    }        
    public String getSeatReserve() {
        return seatReserve;
    }

    public String getSeatType() {
        return seatType;
    }

    public String getBill() {
        return bill;
    }
    
    public String bookingData(){
        
        return (bookNumber + "/" + flightId + "/" + airplaneCode + "/" + departureDate + "/" + departureTime 
                + "/" + destination + "/" + seatReserve + "/" + seatType + "/" + name + "/" + email + "/" + extraBaggage + "/" + contactNumber + "/" + bill);
    }
 
       
       
      
        
        
        
       
       
       
      
       
      
          
      
        
        
        
        
    
}
