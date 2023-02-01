import java.util.Scanner;

public class Sport extends Activity{
  public Sport (String n, String t, int a, int e, int h, Location l){
    super(n, t, a, e, h, l);
  }
  private int baseHappiness;
  private int baseEnergy;

  Scanner sc = new Scanner(System.in);
  
  @Override
  public void select() throws InsufficientEnergyException{
    baseHappiness = 3;
    baseEnergy = 3;
    System.out.println("Which sport will you play?");
    String decision = sc.nextLine();
    switch (decision) {
        
      case "Football":
        baseHappiness = baseHappiness * 2;
        baseEnergy = baseEnergy * 3;
        break;
        
      case "Frisbee":
        baseHappiness = baseHappiness * 4;
        baseEnergy = baseEnergy * 3;
        break;
        
      case "Volleyball":
        baseHappiness = baseHappiness * 3;
        baseEnergy = baseEnergy * 2;
        break;
        
      case "Basketball":
        baseHappiness = baseHappiness * 2;
        baseEnergy = baseEnergy * 2;
        break;
        
      case "Arnis":
        baseHappiness = baseHappiness * 2;
        baseEnergy = baseEnergy * 2;
        break;
        
      case "Swimming":
        baseHappiness = baseHappiness * 2;
        baseEnergy = baseEnergy * 4;
        break;
        
      case "Dancing":
        baseHappiness = baseHappiness * 2;
        baseEnergy = baseEnergy * 2;
        break;
    }
    System.out.println("How long will you play? (hours)");
    int hour = sc.nextInt();
    baseHappiness = baseHappiness * hour;
    baseEnergy = baseEnergy * hour;
    
    if (EMoji.getEnergyLevel() > baseEnergy) {
      performActivity(decision);
    }
    else {
      throw new InsufficientEnergyException("Insufficient energy points");
    }
  }

  @Override 
  public void performActivity(String actName){ //will be further developed in the next quarters
    EMoji.getHappinessLevel() = EMoji.getHappinessLevel() + baseHappiness;
    EMoji.getEnergyLevel() = EMoji.getEnergyLevel() - baseEnergy;
    System.out.println("You played " + actName);
    System.out.println("Updated Energy Points: " + String.valueOf(EMoji.getEnergyLevel()));
    System.out.println("Updated Happiness Points: " + String.valueOf(EMoji.getHappinessLevel()));
  }
}