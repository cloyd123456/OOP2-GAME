import java.util.Scanner;

public class BattleSystem {

    private Player player;
    private Enemy enemy;
    private Skill skill;

    public BattleSystem(Player player, Enemy enemy) {
        this.player = player;
        this.enemy = enemy;
        skill = new Skill("Fireball", 25);
    }

    public void startBattle() {
        Scanner sc = new Scanner(System.in);

        while (player.isAlive() && enemy.isAlive()) {

            System.out.println("\n1. Attack");
            System.out.println("2. Use Skill");
            System.out.println("3. Use Potion");

            int choice = sc.nextInt();

            if (choice == 1) {
                TurnManager.playerTurn(player, enemy, skill);
            } else if (choice == 2) {
                skill.use(player, enemy);
            } else if (choice == 3) {
                player.getInventory().showItems();
                int itemChoice = sc.nextInt();
                player.getInventory().useItem(itemChoice, player);
            }

            if (enemy.isAlive()) {
                TurnManager.enemyTurn(enemy, player);
            }

            System.out.println("Player HP: " + player.getHealth());
            System.out.println("Enemy HP: " + enemy.getHealth());
        }

        if (player.isAlive()) {
            System.out.println("You Win!");
        } else {
            System.out.println("You Lose!");
        }
    }
}