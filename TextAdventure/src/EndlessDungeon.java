import java.util.Random;
public class EndlessDungeon {
    public static void main(String[] args) {
        System.out.println("Hello. Welcome to the endless dungeon. Enjoy your play!");
        Random generator = new Random();
        int playerHealth = 100;
        int enemyHealth = generator.nextInt(10) + 1;
        int enemiesDefeated = 0;
        while(playerHealth > 0) {
            if(enemyHealth <= 0){

                System.out.println("You have defeated the enemy! You kick down the door to the next room and prepare yourself to fight the next enemy.");
                enemyHealth = generator.nextInt(10) + 1;
                enemiesDefeated++;

            }
            System.out.println("You have " + playerHealth + " health.");
            int playerDamage, enemyDamage;
            playerDamage = generator.nextInt(5) + 1;
            enemyDamage = generator.nextInt(3) + 1;
            playerHealth -= enemyDamage;
            enemyHealth -= playerDamage;
            System.out.println("You attack the enemy for " + playerDamage);
            System.out.println("The enemy attacks you for " + enemyDamage);
        }
        System.out.println("You defeated " + enemiesDefeated + " enemies");



    }
}
