public class Skill {

    private String name;
    private int damage;

    public Skill(String name, int damage) {
        this.name = name;
        this.damage = damage;
    }

    public void use(Character user, Character target) {
        target.takeDamage(damage);
        System.out.println(user.getName() + " used " + name + " for " + damage + " damage!");
    }
}