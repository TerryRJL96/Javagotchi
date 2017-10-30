/**
 * Created by k1763940 on 30/10/17.
 */
public class Creature {
    int energy,fullness,happiness;
    String name;
    public Creature(String name) {
        this.name = name;
        energy=15;
        fullness = 15;
        happiness = 15;
    }

    public String getName() {
        return name;
    }

    public void eat(){
       if(fullness >= 12){
           print(getName() + " cannot eat anymore they're already full.");
       }
        else {
           fullness += 8;
           energy -= 4;
           happiness -= 6;
           if(fullness>15){fullness = 15;}
       }
    }

    public void sleep(){
        if(energy >= 12){
            print(getName() + " is full of energy and cannot sleep!");
        }
        else {
            energy += 8;
            fullness -= 5;
            happiness -= 5;
            if(energy > 15){energy = 15;}
        }
        print("*Yawn* what a nice nap.");
    }

    public void play() {


        happiness += 8;
        energy -= 6;
        fullness -= 4;
        if (happiness > 15) {
            happiness = 15;
        }
        print("That was soo much fun! Let's do that again.");
    }

    public void print(String word){
        System.out.println(word);
    }
    public String checkStatus(){
        String status ="";
        if(energy <= 0 || fullness <= 0 || happiness <= 0){
            print("Oh no! " + this.getName()+ " has died.");
            System.exit(0);
        }
        if (happiness<6){
            status += this.getName() + " is feeling sad.\n";
        }
        if (fullness<6){
            status += this.getName() + " is really hungry.\n";
        }
        if (energy<6){
            status +=this.getName() + " is getting sleepy.\n";
        }
        if(energy <= 0 || fullness <= 0 || happiness <= 0){
            print("Oh no! " + this.getName()+ " has died.");
            System.exit(0);
        }
        return status;
    }
}

