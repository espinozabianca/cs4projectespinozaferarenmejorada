public abstract class Activity implements Choice{
  ArrayList<Activity> activities = new ArrayList<Activity>();
  
  private String name, type;
  private int happiness, energy, hours;
  private Location location;

  public Activity(String n, String t, int a, int e, int h, Location l){
    name = n;
    type = t;
    happiness = a;
    energy = e;
    hours = h;
    location = l;
  }

  public String getName() {
    return name;
  }
  
  public String getType() {
    return type;
  }
  
  public double getHappiness() {
    return happiness;
  }
  
  public double getEnergy() {
    return energy;
  }
  
  public int getHours() {
    return hours;
  }

  public Location getLocation() {
    return location;
  } 
  
  public abstract void performActivity(String actName); //hours multiplier will be added once method codes are further polished

  public abstract void select() throws InsufficientEnergyException;
}