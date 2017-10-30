import java.util.Scanner;
/**
 * Created by Terry Louder on 30/10/17.
 */
public class Game {
    Scanner input = new Scanner(System.in);
    Creature creature;
    boolean quit = false;
    public void run(){

        startTutorial();
        while(!quit){
            interact();
            System.out.println(this.creature.checkStatus());
        }
        System.out.println("Aww time to put "  + this.creature.getName()+ " to bed.");
    }
   private void startTutorial(){
       System.out.println("Hello! Welcome to Javagotchi");
       System.out.println("What is your creatures name?");
       String name = input.nextLine();
       this.creature = new Creature(name);
       System.out.println("Meet " + this.creature.getName() + "!");
   }

    private void interact(){
        System.out.println("What would you like to do?");
        System.out.println("1. Sleep");
        System.out.println("2. Eat");
        System.out.println("3. Play");
        System.out.println("4. Quit");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                creature.sleep();
                break;
            case 2:
                creature.eat();
                break;
            case 3:
                creature.play();
                break;
            case 4:
                quit =true;
                break;
            default:
                System.out.println("Oops, Please pick a number between 1 and 4");
                break;


        }

    }
}
