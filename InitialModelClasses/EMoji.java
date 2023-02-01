import java.util.Scanner;

public class EMoji{
  private String name;
  private Location currentLocation;
  protected int happinessLevel = 100;
  private int energyLevel = 100;
  private double acadScore;
  
  public EMoji (String n, Location l, int h, int e, double score){
    name = n;
    currentLocation = l;
    happinessLevel = h;
    energyLevel = e;
    acadScore = score;
  }

  public String getName() {
    return name;
  }

  public int getHappinessLevel() {
    return happinessLevel;
  }
  
  public int getEnergyLevel() {
    return energyLevel;
  }

  public double getAcadScore() {
    return acadScore;
  }

  public Location getLocation() {
    return currentLocation;
  } 

  public void talk(NPC character){
    System.out.println(character.getDialog());
    //will be improved to present a certain dialog depending on user's choice of interaction
  }
  
  public void travel(Location destination) throws LocationNotFoundException{ 
      Scanner sc = new Scanner(System.in);
      System.out.println("Where would you like to go? ");
      destination = Location.contains(sc.nextLine()); //will be improved upon in the next quarter
      if (!Location.contains(sc.nextLine())){
        throw new LocationNotFoundException("Location not found.");
      }
      else{
        currentLocation.removeEMoji(this);
      destination.addEMoji(this);
      currentLocation = destination;
      System.out.println(this.getName() + " travelled to " + destination.getName() + ".");
      }
    }
  
  public void computeGWA(double score){
    score = this.getAcadScore();
    if (score >= 60.0){
      System.out.println("You survived your first year in Pisay!");
    }
    else{
      System.out.println("You failed :(");
    }
  }
}