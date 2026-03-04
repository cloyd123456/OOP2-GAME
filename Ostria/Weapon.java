public class Weapon extends Item {

    private int bonusDamage;

    public Weapon(String name, int bonusDamage) {
        super(name);
        this.bonusDamage = bonusDamage;
    }

    @Override
    public void use(Player player) {
        System.out.println("Weapon equipped! Bonus damage: " + bonusDamage);
    }
}