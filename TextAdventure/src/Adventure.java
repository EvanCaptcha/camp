import java.util.Scanner;
import java.util.Random;
public class Adventure {
    public static void main(String[] args) {
        int playerLevel = 1;
        double playerHealth = 10.0;
        boolean hasSword = false;
        Random randomGenerator = new Random();
        Scanner userInput = new Scanner(System.in);
        System.out.println("What is your character's name?");
        String playerName = userInput.nextLine();
        System.out.println("Welcome " + playerName + "!");
        System.out.println("Before you is a large cave mouth. Darkness is before you. Dare you enter the Cave of Wonders?");
        System.out.println("1. Enter the Cave and explore the possibilities");
        System.out.println("2. Run away and never come back");
        int playerChoice = userInput.nextInt();
        if(playerChoice == 1) {
            System.out.println("You have entered the cave.");
            playerLevel++;
            System.out.println("Your bravery has rewarded you! Congratulations, you are now level " + playerLevel);
            System.out.println("You travel forward into the dark cave. You feel something press against your leg...");
            System.out.println("It's a trap! Suddenly, you're being bombarded by rocks from above.");
            int rockDamage = randomGenerator.nextInt(5);
            playerHealth -= rockDamage;
            System.out.println("The rock slide hits you for " + rockDamage + " damage!");
            System.out.println("You have " + playerHealth + " health remaining.");
            System.out.println("You walk into the cave. You are curious. You find a treasure chest right in front of you.");
            System.out.println("1. Open the chest.");
            System.out.println("2. Ignore the chest.");
            playerChoice = userInput.nextInt();
            if(playerChoice == 1) {
                System.out.println("You slowly open the chest to find a magical sword.");
                hasSword = true;
                System.out.println("You leave the cavern with the chest and continue your journey");
                System.out.println("Up ahead the air grows warm and wet. You hear snoring.");
                System.out.println("Peeking around a corner you see a monstrous shape! A dragon sleeps in the room ahead.");
                System.out.println("You swallow hard and decide it is time to leave.");
                System.out.println("As you turn, your foot finds a rock. It thuds loudly against the cave wall. The dragon wakes up!");
                System.out.println("1. Fight the dragon");
                System.out.println("2. Run away");
                playerChoice = userInput.nextInt();
                if(playerChoice == 1){
                    System.out.println("You have chosen to fight the dragon. ");
                    if(hasSword) {
                        System.out.println("Your magic sword has slain the beast in front of you.");
                    }
                    else {
                        System.out.println("The dragon defeated you.");
                    }

                }
                else {
                    System.out.println("The dragon caught you as you were running. You made a nice lunch for the beast.");

                }

            }




        }
        else {
            System.out.println(playerName + " Has choosen to not enter. The program will now exit.");
            System.exit(0);
        }

    }
}
