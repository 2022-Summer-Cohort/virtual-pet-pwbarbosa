package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a VirtualPet object in this method
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your pet's name.");

        String anyName = input.nextLine();
        String name = anyName.substring(0,1).toUpperCase() + anyName.substring(1);

        VirtualPet dog = new VirtualPet(name, 4, 5, 6, true);
        int choice;

        System.out.println("You've just brought " + name + " home from the shelter! Keeping a pet is" +
                "\na big responsibility. Why don't we starting caring for your new pet?");

        do {
            dog.tick();
            System.out.println(name + " looks " + dog.getHunger() + " hungry, " + dog.getThirst() + " thirsty, and " + dog.getFatigue() + " tired.");
            System.out.println("Pick a number!");
            System.out.println("[0] Quit");
            System.out.println("[1] Feed " + name + ".");
            System.out.println("[2] Give " + name + " some water.");
            System.out.println("[3] Let " + name + " take a nap.");
            System.out.println("[4] Let time pass.");

            choice = input.nextInt();

            if (choice == 0) {
                break;
            }
            else if (choice == 1) {
                dog.feedPet();
            }
            else if (choice == 2) {
                dog.waterPet();
            }
            else if (choice == 3) {
                dog.sleepPet();
            }
            else if (choice == 4) {
                dog.tick();
                dog.tick();
                dog.tick();
            }
            else {
                System.out.println("Please choose a different option.");
            }
        } while (dog.getIsAlive());
        System.out.println("Come back and play again soon!");
    }

}
