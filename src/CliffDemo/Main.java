package CliffDemo;

public class Main {

    public static void main(String[] args) {
        // write your code here
        DrinkDispenser cliffsDispenser = new DrinkDispenser(5, 8, 12);
        cliffsDispenser.addSyrup(new Syrup("Purple Drink", 1000));
        cliffsDispenser.addSyrup("Blue Drink", 600);
        cliffsDispenser.addSyrup(new Syrup("Orange", 48));
        cliffsDispenser.addSyrup("Dr. Cliff", 240);

        cliffsDispenser.serveDrink("M", 3);

    }
}
