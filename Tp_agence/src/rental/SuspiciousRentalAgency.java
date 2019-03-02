package rental;

public class SuspiciousRentalAgency extends RentalAgency{

    /** client rents a vehicle
    * @param client the renter
    * @param v the rented vehicle
    * @return the daily rental price
    * @exception UnknownVehicleException   if v is not a vehicle of this agency
    * @exception IllegalStateException if v is already rented or client rents already another vehicle
    */
    public float rentVehicle(Client client, Vehicle v) throws UnknownVehicleException, IllegalStateException {
    	if(this.theVehicles.contains(v)==false || this.hasRentedAVehicle(client))
    	throw new UnknownVehicleException();
    	else if(this.isRented(v))
    	throw new IllegalStateException();
    	else{
	if(client.getAge()<25){
    	this.rentedVehicles.put(client,v);
    	return v.getDailyPrice()+((v.getDailyPrice()*10)/100);
	}else
	return v.getDailyPrice();
    }
    }

}
