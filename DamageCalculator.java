import java.util.Random;

public class DamageCalculator {
    private static Random random = new Random();

    public static int calculate(int baseDamage) {
        return baseDamage + random.nextInt(6); // random bonus 0-5
    }
}