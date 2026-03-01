public class Enemy extends Character {

    public Enemy(String name) {
        super(name, 80, 10);
    }

    @Override
    public void attack(Character target) {
        int damage = DamageCalculator.calculate(attackPower);
        target.takeDamage(damage);
        System.out.println(name + " attacks for " + damage + " damage!");
    }
}