import java.util.*;

public class Location{
  private String name, funFact;
  private ArrayList<Object> personList;
  private ArrayList<Activity> activityList;

  public Location(String n, String f){
    this.name = n;
    this.funFact = f;
    this.personList = new ArrayList<>();
    this.activityList = new ArrayList<>(); 
  }
  
  public String getName(){
        return name;
    }
  
  public ArrayList<Object> getPersonList(){
        return personList;
    }
  
  public void addPerson(NPC c){
        personList.add(c);
    }
  
  public void removePerson(NPC c){
        personList.remove(c);
    }

  public void addEMoji(EMoji e){
        personList.add(e);
    }
  
  public void removeEMoji(EMoji e){
        personList.remove(e);
    }

  public ArrayList<Activity> getActivityList(){
        return activityList;
    }
  
  public void addActivity(Activity a){
        activityList.add(a);
    }
  
  public void removePerson(Activity a){
        activityList.remove(a);
    }
}