package machine;
import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Setup some initial values
        int cash = 550, water = 400, milk = 540, beans = 120, cups = 9;
        String drinkSelection;

        // Get user input
        System.out.println("Write action (buy, fill, take, remaining, exit):");
        System.out.print("> ");
        String selection = scanner.next();

        while (!selection.equals("exit")) {
            switch (selection) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                    System.out.print("> ");

                    drinkSelection = scanner.next();
                    boolean gotEnough = true;

                    switch (drinkSelection) {
                        case "1":
                            //resource check
                            if (water <= 250) {
                                System.out.println("Sorry, not enough water!");
                                gotEnough = false;
                            }
                            if (beans <= 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                                gotEnough = false;
                            }
                            if (cups <= 1) {
                                System.out.println("Sorry, not enough disposable cups!");
                                gotEnough = false;
                            }

                            if (gotEnough) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 250;
                                beans -= 16;
                                cups -= 1;
                                cash += 4;
                            }
                            break;
                        case "2":
                            if (water <= 350) {
                                System.out.println("Sorry, not enough water!");
                                gotEnough = false;
                            }
                            if (milk <= 75) {
                                System.out.println("Sorry, not enough milk!");
                                gotEnough = false;
                            }
                            if (beans <= 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                                gotEnough = false;
                            }
                            if (cups <= 1) {
                                System.out.println("Sorry, not enough disposable cups!");
                                gotEnough = false;
                            }

                            if (gotEnough) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 350;
                                milk -= 75;
                                beans -= 20;
                                cups -= 1;
                                cash += 7;
                            }
                            break;
                        case "3":
                            if (water <= 200) {
                                System.out.println("Sorry, not enough water!");
                                gotEnough = false;
                            }
                            if (milk <= 100) {
                                System.out.println("Sorry, not enough milk!");
                                gotEnough = false;
                            }
                            if (beans <= 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                                gotEnough = false;
                            }
                            if (cups <= 1) {
                                System.out.println("Sorry, not enough disposable cups!");
                                gotEnough = false;
                            }

                            if (gotEnough) {
                                System.out.println("I have enough resources, making you a coffee!");
                                water -= 200;
                                milk -= 100;
                                beans -= 12;
                                cups -= 1;
                                cash += 6;
                            }
                            break;
                        case "back":
                            break;
                        default:
                    }
                    break;
                case "fill":
                    //Gather the info
                    System.out.println("Write how many ml of water the coffee machine has:");
                    water += scanner.nextInt();

                    System.out.println("Write how many ml of milk the coffee machine has:");
                    milk += scanner.nextInt();

                    System.out.println("Write how many grams of coffee beans the coffee machine has:");
                    beans += scanner.nextInt();

                    System.out.println("Write how many disposable cups you want to add:");
                    cups += scanner.nextInt();
                    break;
                case "take":
                    System.out.println("I gave you $" + cash);
                    cash = 0;
                    break;
                case "remaining":
                    System.out.println("The coffee machine has:");
                    System.out.println(water + " ml of water");
                    System.out.println(milk + " ml of milk");
                    System.out.println(beans + " g of coffee beans");
                    System.out.println(cups + " disposable cups");
                    System.out.println("$" + cash + " of money");
                    System.out.println();
                    break;
                default:
            }
            // Print out the initial quantities.
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            System.out.print("> ");
            selection = scanner.next();
        }



/*


        // Work the logic
        if (minimum > coffeeCups) {
            // we have left over ingredients
            System.out.println("Yes, I can make that amount of coffee (and even " + (minimum - coffeeCups) +" more than that)");
        } else if (minimum < coffeeCups) {
            // we don't have enough ingredients
            System.out.println("No, I can make only " + minimum + " cup(s) of coffee");
        } else {
            // we have exactly enough ingredients
            System.out.println("Yes, I can make that amount of coffee");
        }

        System.out.println("For " + coffeeCups + " cups of coffee you will need:");
        System.out.println(water + " ml of water");
        System.out.println(milk + " ml of milk");
        System.out.println(beans + " g of coffee beans");
 */
    }
}
