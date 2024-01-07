import java.util.Scanner;

public class AtkSpeed {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double baseAtkSpeed, bonusAtkSpeed, currentAtkSpeed;
        int level;
        
        System.out.println("Enter the base attack speed: ");
        baseAtkSpeed = in.nextDouble();
        
        System.out.println("Enter the bonus attack speed %: ");
        bonusAtkSpeed = in.nextDouble();
        
        System.out.println("Enter the level: ");
        level = in.nextInt();
        
        bonusAtkSpeed = bonusAtkSpeed / 100;
        currentAtkSpeed = baseAtkSpeed * (1 + (bonusAtkSpeed * (level - 1)));
        
        System.out.printf("The character's current attack speed is %.3f", currentAtkSpeed);
    }
}
