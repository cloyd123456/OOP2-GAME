public class Player extends Character {

    private Inventory inventory;

    public Player(String name) {
        super(name, 100, 15);
        inventory = new Inventory();
    }

    @Override
    public void attack(Character target) {
        int damage = DamageCalculator.calculate(attackPower);
        target.takeDamage(damage);
        System.out.println(name + " attacks for " + damage + " damage!");
    }

    public Inventory getInventory() {
        return inventory;
    }
}