public class Potion extends Item {

    private int healAmount;

    public Potion(String name, int healAmount) {
        super(name);
        this.healAmount = healAmount;
    }

    @Override
    public void use(Player player) {
        player.health += healAmount;
        System.out.println("Healed for " + healAmount + " HP!");
    }
}