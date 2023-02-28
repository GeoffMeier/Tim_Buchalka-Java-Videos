package encapsulation;

public class EnhancedPlayer {
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String name, int health, String weapon) {
        this.fullName = name;
        if(health<=0){
            this.healthPercentage =1;

        } else if (health>100) {
            this.healthPercentage =100;

        }else {
            this.healthPercentage =health;
        }
        this.weapon = weapon;
    }
}
