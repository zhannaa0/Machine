import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Machine machine = new Machine();
        System.out.println("Choose a product (enter the number): ");
        System.out.println("1. Ice Cream   2. Cocktail   3. Fresh   4. Lemonade");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input == 1) {
            machine.setiMachineBehavior(new IceCreamMaker());
            machine.performProduct();
        }
        else if (input == 2) {
            machine.setiMachineBehavior(new CocktailMaker());
            machine.performProduct();
        }
        else if (input == 3){
            machine.setiMachineBehavior(new FreshMaker());
            machine.performProduct();
        }
        else if (input == 4){
            machine.setiMachineBehavior(new LemonadeMaker());
            machine.performProduct();
        }


    }

}
