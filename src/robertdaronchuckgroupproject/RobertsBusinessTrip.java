package robertdaronchuckgroupproject;

/**
 *The Business Trip Class
 *
 */ 

//Text Validator for values Ensemble example
public class RobertsBusinessTrip {
            
    private final int MAX_PARKING_FEE = 7;
    private final int MAX_TAXI_FEE = 12;
    private final int MAX_HOTEL_FEE = 99;
    private final int MAX_BREAKFAST_FEE = 4;
    private final int MAX_LUNCH_FEE = 12;
    private final int MAX_DINNER_FEE = 16;
    private final double FL_MILAGE_RATE = 0.28;
            
    private String departDay;
    private String departTime;
    private String returnDay;
    private String returnTime;
    private String airfare;
    private String carRental;
    private String milesDriven;
    private String parkingFees;
    private String taxiFees;
    private String registrationFees;
    private String hotelFees;
    private String meals[];

    public int getMAX_PARKING_FEE() {
        return MAX_PARKING_FEE;
    }

    public int getMAX_TAXI_FEE() {
        return MAX_TAXI_FEE;
    }

    public int getMAX_HOTEL_FEE() {
        return MAX_HOTEL_FEE;
    }

    public int getMAX_BREAKFAST_FEE() {
        return MAX_BREAKFAST_FEE;
    }

    public int getMAX_LUNCH_FEE() {
        return MAX_LUNCH_FEE;
    }

    public int getMAX_DINNER_FEE() {
        return MAX_DINNER_FEE;
    }

    public double getFL_MILAGE_RATE() {
        return FL_MILAGE_RATE;
    }

    public String getDepartDay() {
        return departDay;
    }

    public String getDepartTime() {
        return departTime;
    }

    public String getReturnDay() {
        return returnDay;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public String getAirfare() {
        return airfare;
    }

    public String getCarRental() {
        return carRental;
    }

    public String getMilesDriven() {
        return milesDriven;
    }

    public String getParkingFees() {
        return parkingFees;
    }

    public String getTaxiFees() {
        return taxiFees;
    }

    public String getRegistrationFees() {
        return registrationFees;
    }

    public String getHotelFees() {
        return hotelFees;
    }

    public String[] getMeals() {
        return meals;
    }
        
    
    
    
    
    
}//End BusinessTrip Class
