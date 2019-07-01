public class DragonSlayer {
    public static void main(String[] args) {
        int playersStrength = 25;
        int dragonsHP = 35;
        boolean hasSword = true;
        if (playersStrength > dragonsHP) {
            System.out.println("You defeated the dragon!");
        }
        else if (hasSword) {
            System.out.println("You're not strong enough to defeat the dragon. However, you remember your magic sword and use it to slay the beast.");
            playersStrength += 10;
            System.out.println("Your strength is: " + playersStrength);
        }
        else {
            System.out.println("You were defeated");
        }
    }
}
