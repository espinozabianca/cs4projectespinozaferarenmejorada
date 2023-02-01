public class NPC{
  private String name, friendStatus, dialog; //dialog may be converted to an arrayList in the following quarters
  private Location currentLocation;
  private int baseHappy, baseEnergy;

  private int happiness = baseHappy;
  private int energy = baseEnergy;
  
  public NPC (String n, String f, String d, Location l, int baseH, int baseE, int h, int e){
    name = n;
    friendStatus = f;
    dialog = d;
    currentLocation = l;
    baseHappy = baseH;
    baseEnergy = baseE;
    happiness = h;
    energy = e;
  }

  public String getName() {
    return name;
  }

  public String getStatus() {
    return friendStatus;
  }

  public String getDialog() {
    return dialog;
  }
  
  public double getHappiness() {
    return happiness;
  }
  
  public double getEnergy() {
    return energy;
  }

  public Location getLocation() {
    return currentLocation;
  } 
}