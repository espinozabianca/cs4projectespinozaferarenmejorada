import java.util.Scanner;

public class Test extends Activity {
  private String testType, subject;
  private double score;
  protected boolean study, pass;
  private int baseHappiness;
  private int baseEnergy;
  
  public Test(String n, String t, int a, int e, int h, Location l, double s){
    super(n, t, a, e, h, l);
    testType = t;
    score = s;
  }
  
  Scanner sc = new Scanner(System.in);
  
  @Override
  public void select(){
    baseHappiness = 5;
    baseEnergy = 5; // will edit these values in further development of project depending on the circumstances regarding the length of the game and number of scenarios
    pass = false;
    score = 5;
    System.out.println("Will you study for the exam or play video games instead? (Study/Play)"); //in further development of this project, user will only have to click the choices flashed on-screen instead of inputting it themself
    String decision = sc.nextLine();
    if (decision.contains("Study")) {
      System.out.println("How long will you study for? (Hours)");
      double hour = sc.nextDouble();
      score = score * hour;
      
      switch (testType) {  //in further development of this project, the scenario will determine what type of test EMoji will take 
      case "Seatwork":
        if (score >= 6) {
          pass = true;
        }
        break;
        
      case "Quiz":
        baseHappiness = baseHappiness * 2;
        baseEnergy = baseEnergy * 2;
        if (score >= 9) {
          pass = true;
        }
        break;
          
      case "Long Test":
        baseHappiness = baseHappiness * 3;
        baseEnergy = baseEnergy * 3;
        if (score >= 18) {
          pass = true;
        }
        break;
          
      case "Periodical":
        baseHappiness = baseHappiness * 4;
        baseEnergy = baseEnergy * 4;
        if (score >= 36) {
          pass = true;
        }
        break;
      }
    } 
    performActivity(decision);
  }
  
  @Override
  public void performActivity(String actName){  
    if(pass){
      System.out.println("You passed the test! Congratulations!");
      EMoji.getHappinessLevel() = EMoji.getHappinessLevel() + baseHappiness;
      EMoji.getEnergyLevel() = EMoji.getEnergyLevel() - baseEnergy;
    }
    else{
      EMoji.getHappinessLevel() = EMoji.getHappinessLevel() + baseHappiness;
      EMoji.getEnergyLevel() = EMoji.getEnergyLevel() - baseEnergy;
      System.out.println("You failed :( Take some time to study...");
    }    
    System.out.println("Updated Energy Points: " + String.valueOf(EMoji.getEnergyLevel()));
    System.out.println("Updated Happiness Points: " + String.valueOf(EMoji.getHappinessLevel()));
  }
}