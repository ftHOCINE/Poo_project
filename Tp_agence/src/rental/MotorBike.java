package rental;

public class MotorBike extends Vehicle{

  private int cylindre;

  public MotorBike(String brand, String model, int productionYear, float dailyRentalPRice,int cylindre){
    super(brand,model,productionYear,dailyRentalPRice);
    this.cylindre=cylindre;

  }
	/**
	 * @return the Cylindre this Motor
	 */
  public int getCylindre(){
    return this.cylindre;
  }

public String toString(){
  return  super.toString()+" "+this.getCylindre();
}


}
