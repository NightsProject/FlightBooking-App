/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbooking.components;

/**
 *
 * @author night
 */
public class Airplane {
    
    protected String airplaneCode;
    protected String vacantSeat;
    protected String seatType;
    
    public Airplane(){};

    public void setAirplaneCode(String airplaneCode) {
        this.airplaneCode = airplaneCode;
    }

    public void setVacantSeat(String vacantSeat) {
        this.vacantSeat = vacantSeat;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getAirplaneCode() {
        return airplaneCode;
    }

    public String getVacantSeat() {
        return vacantSeat;
    }

    public String getSeatType() {
        return seatType;
    }
     
    
    
}
