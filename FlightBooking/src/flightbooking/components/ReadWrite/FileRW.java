/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package flightbooking.components.ReadWrite;

/**
 *
 * @author night
 */
public class FileRW{

   

    
   
    
  
   /*
    
    public static String[] readAccounts(){
     
        return ;
    }
    
    */
    //read the flights and store all in an array and/or store it to each variable in the format for flight.txt
    // format #9 flightId/airplaneCode/departureDate/departureTime/destination/vacantSeats/seatType/status/remarks 
    /*
                newAirplaneCode =  addFlight.getAirplaneCode();
                newDepartureDate = addFlight.getDepartureDate();
                newDepartureTime = addFlight.getDepartureTime();
                newDestination = addFlight.getDestination();
                newVacanSeats = addFlight.getVacantSeat();
                newSeatType = addFlight.getSeatType();
                newStatus = addFlight.getStatus();
                newRemarks = addFlight.getRemarks();
    
    */
    
    
      
   
    
    /*
    public static void writeAccountTxt(){
        
        try{
            
            int count;
            String accountArray[] = new String[MAX_ACCOUNTS];
            boolean append = false;
            
            File inputFile = new File(accountsPath);
            Scanner scan = new Scanner(inputFile);
            
       
            
            count = 0;
            while(scan.hasNextLine()){
                String temp;
                temp = scan.nextLine(); 
             
                if(temp.equals(FILE_END)){
                    System.out.print("end file");
                    accountArray[count ] = // the new account here
                    accountArray[count + 1] = FILE_END;
                    count += 2;
                    break;
                }
                flightsArray[count] = temp;
                count++;
            }
            
            scan.close();
            System.out.print(count);
            
            FileWriter writeFlight = new FileWriter(inputFile, append);
            int i = 0;
            while(i < count){
                 if(i == 1){
                    append = true;
                    writeFlight.close();
                    writeFlight = new FileWriter(inputFile, append);
                 }
                 writeFlight.write(flightsArray[i] + "\n");
                 i++;
            }
            
            System.out.print( "flight data:" + addFlight.flightData());
            writeFlight.close();
        
            
        }
        catch(IOException e){
            
            
        }
        
        
        
    }
    */
    
}
