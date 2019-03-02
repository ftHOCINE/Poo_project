package rental;

import java.util.*;

/** a rental vehicle agency, client can rent one vehicle at a time */
public class RentalAgency {
    // vehicles of this agency
    protected List<Vehicle> theVehicles;

    // maps client and rented vehicle (at most one vehicle by client)
    protected Map<Client,Vehicle> rentedVehicles;

    public RentalAgency() {
    	this.theVehicles=new ArrayList<Vehicle>();
    	this.rentedVehicles= new HashMap<Client,Vehicle>();
    }

    /** adds a vehicle to this agency
    * @param v the added vehicle
    */
    public void addVehicle(Vehicle v) {
    	this.theVehicles.add(v);
    }

    /** provides the list of the vehicles that satisfy the criterion c
    * @param c the selection criterion
    * @return  the list of the vehicles that satisfy the criterion c
    */
    public List<Vehicle> select(Criterion c) {
    	List<Vehicle> L= new ArrayList<Vehicle>();
    	for(Vehicle v : this.theVehicles){
			 	if (c.isSatisfiedBy(v)){
					L.add(v);
				}
			}
        return L;
    }
    /** displays the vehicles that satisfy the criterion c
    * @param c the selection criterion
    */
    public void displaySelection(Criterion c) {
		List l= this.select(c);
		for(int i = 0; i < l.size(); i++)
			System.out.println("cars :" + l.get(i));
		}


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
    	else
    	this.rentedVehicles.put(client,v);
    	return v.getDailyPrice();
    }

    /** returns <em>true</em> iff client c is renting a vehicle
    * @return <em>true</em> iff client c is renting a vehicle
    */
    public boolean hasRentedAVehicle(Client client){
        return this.rentedVehicles.containsKey(client);
    }

    /** returns <em>true</em> iff vehicle v is rented
    * @param v vehicule
    * @return <em>true</em> iff vehicle v is rented
    */
    public boolean isRented(Vehicle v){
        return this.rentedVehicles.containsValue(v);
    }

    
    public List<Vehicle> getAgence(){
    return this.theVehicles;
    }
    public Map<Client,Vehicle> getRentedVehicle(){

    return this.rentedVehicles;
    }

    /** the client returns a rented vehicle. Nothing happens if client didn't have rented a vehicle.
    * @param client who returns a vehicle
    */
    public void returnVehicle(Client client){
    	if(this.hasRentedAVehicle(client)){
			this.rentedVehicles.remove(client);
		}

    }
    /** provides the collection of rented vehicles for this agency
    * @return collection of currently rented vehicles
    */
    public Collection<Vehicle> allRentedVehicles(){
    	Collection<Vehicle> v= new  HashSet<Vehicle>();
    	v=this.rentedVehicles.values();
        return v;
    }

}
