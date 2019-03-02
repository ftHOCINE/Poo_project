package rental;

public class Car extends Vehicle{

  private int nbOfPlace;

  public Car(String brand, String model, int productionYear, float dailyRentalPRice,int nbOfPlace){
     super(brand,model,productionYear,dailyRentalPRice);
     this.nbOfPlace=nbOfPlace;
  }
	/**
	 * @return the number of places of this car
	 */
  public int getNbOfPlace(){
    return this.nbOfPlace;
  }

  public String toString(){
    return super.toString()+" "+this.getNbOfPlace();
}

}
