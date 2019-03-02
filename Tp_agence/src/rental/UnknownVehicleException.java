package rental;
class UnknownVehicleException extends Exception{ 

  public UnknownVehicleException(){

    System.out.println("la voiture n'existe pas a l'agence ou l client la deja louer ");

  }  

}
