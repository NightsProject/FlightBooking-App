/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbooking.components;

/**
 *
 * @author night
 */
public class Flight extends Airplane{
    
    protected String flightId;
    protected String destination;
    protected String departureDate;
    protected String departureTime;
    protected String status;
    protected String remarks;
    
    public Flight(){};

    public Flight(String flightId,String airplaneCode, String departureDate, String departureTime, String destination, String vacantSeat, String seatType, String status, String remarks) {
        super.airplaneCode = airplaneCode;
        super.vacantSeat = vacantSeat;
        super.seatType = seatType;
        this.flightId = flightId;
        this.destination = destination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
        this.status = status;
        this.remarks = remarks;
    }
    
    

    public void setFlightId(String flightId) {
        this.flightId = flightId;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getFlightId() {
        return flightId;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }

    public String getStatus() {
        return status;
    }

    public String getRemarks() {
        return remarks;
    }
    
  
    //method that return all flight data
  
    public static void main(String[] args){
        
        
        
    }
     public String flightData(){
        return (flightId + "/" + airplaneCode + "/" + departureDate + "/" + departureTime + "/" 
                + destination + "/" + vacantSeat + "/" + seatType + "/" + status + "/" + remarks);
        
    }
    
}
