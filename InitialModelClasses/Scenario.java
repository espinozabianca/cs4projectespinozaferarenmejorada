import java.util.*;

//scenarios are the specific situations the players will find themselves in

public class Scenario implements Choice{
  private String actName;
  private Location location;
  private ArrayList<Scenario> scenarioList;
  
  public Scenario(String n, Location l){
    actName = n;
    location = l;
  }

  public String getActName() {
    return actName;
  }

  public Location getLocation() {
    return location;
  }

  public ArrayList<Scenario> getScenarioList(){
    return scenarioList;
  }
  
  public void select(){
    //selects scenario to be played onscreen from array based on choices of user + progress; will be developed next quarter as further consultation is needed
  }
}