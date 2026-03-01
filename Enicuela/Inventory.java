import java.util.ArrayList;

public class Inventory {

    private ArrayList<Item> items;

    public Inventory() {
        items = new ArrayList<>();
        items.add(new Potion("Small Potion", 20));
    }

    public void showItems() {
        for (int i = 0; i < items.size(); i++) {
            System.out.println(i + ". " + items.get(i).getName());
        }
    }

    public void useItem(int index, Player player) {
        if (index >= 0 && index < items.size()) {
            items.get(index).use(player);
            items.remove(index);
        }
    }
}