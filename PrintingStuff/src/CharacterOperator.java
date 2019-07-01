import java.util.Scanner;

public class CharacterOperator {
    public static void main(String[] args) {
        Scanner playerInput;
        playerInput = new Scanner(System.in);
        String playerName;
        System.out.println("What is your character's name?");
        playerName = playerInput.nextLine();
        System.out.println("Welcome, " + playerName);
        double playerHealth;
        System.out.println("How much health does " + playerName + " have?");
        playerHealth = playerInput.nextDouble();
        System.out.println("Welcome " + playerName + " you have " + playerHealth + " HP");
    }
}
