//thrown at main with a loop + if-else that regularly checks the energy level of EMoji

public class MinEnergyException extends Exception{
  public MinEnergyException() {
    }
    
  public MinEnergyException(String msg) {
        super(msg);
    }
}