package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        //Interact with a spca object in this method
        VirtualPetApplication myGame = new VirtualPetApplication();
        myGame.gameLoop();
    }
    public void gameLoop() {
        Scanner input = new Scanner(System.in);

        VirtualPet virtualPet1 = new VirtualPet("Fred", 4, 5, 6, true, 6);
        VirtualPet virtualPet2 = new VirtualPet("Brock", 4, 5, 6, true, 6);
        VirtualPet virtualPet3 = new VirtualPet("Kirk", 4, 5, 6, true, 6);
        VirtualPet virtualPet4 = new VirtualPet("Spock", 4, 5, 6, true, 6);
        VirtualPetShelter spca = new VirtualPetShelter();
        spca.admitMultiplePets(new VirtualPet[] {virtualPet1,virtualPet2,virtualPet3,virtualPet4});

        String choicePrime = "";

        welcome();

        System.out.println("Here at the Virtual Pet Shelter, we've got plenty of lonely pets who need homes!");
        System.out.println("What would you like to do while you're here?");

        //Game options
        do {
            spca.getAllStatuses();
            mainMenu();
            choicePrime = input.nextLine();

            //Quit options
            if (choicePrime.equalsIgnoreCase("0")) {
                quitMenu();
                String quitResponse = input.nextLine();
                if (quitResponse.equalsIgnoreCase("yes")) {
                    break;
                }
                else if (quitResponse.equalsIgnoreCase("no")) {
                    System.out.println("We are glad you decided to stay!");
                }
                else {
                    System.out.println("Invalid entry.\nReturning to main menu.");
                }
            }
            //Admits Pet to shelter
            else if (choicePrime.equalsIgnoreCase("1")) {
                System.out.println("We promise to find a great home for the little guy.");
                System.out.println("What is their name?");
                String admittedPetName = input.nextLine();
                String petName = admittedPetName.substring(0,1).toUpperCase() + admittedPetName.substring(1);
                VirtualPet pet = new VirtualPet(admittedPetName,6,6,6,true,6);
                spca.admitPet(pet);
                System.out.println(admittedPetName + " is in good hands. You've made the right call.");
                System.out.println("What would you like to do next?");
                spca.tickAllPets();

            }
            //Feeds all pets
            else if (choicePrime.equalsIgnoreCase("2")) {
                System.out.println("We're feeding all the pets! They sure enjoyed that! Their hunger levels all went down.");
                spca.feedAllPets();
                spca.tickAllPets();

            }
            //Feeds specific pet
            else if (choicePrime.equalsIgnoreCase("3")) {
                System.out.println("Which pet would you like to feed?");
                System.out.println(spca.getAllNames());
                String petToFeed = input.nextLine();
                String petToFeedCap = petToFeed.substring(0,1).toUpperCase() + petToFeed.substring(1);
                System.out.println("That looked tasty. " + petToFeedCap + "'s hunger level just went down.");
                spca.feedSpecificPet(petToFeedCap);
                spca.tickAllPets();


            }
            //Waters all pets
            else if (choicePrime.equalsIgnoreCase("4")) {
                System.out.println("We're watering all the pets! They sure enjoyed that! Their thirst levels all went down!");
                spca.waterAllPets();
                spca.tickAllPets();

            }
            //Waters specific pet
            else if (choicePrime.equalsIgnoreCase("5")) {
                System.out.println("Which pet would you like to water?");
                System.out.println(spca.getAllNames());
                String petToWater = input.nextLine();
                String petToWaterCap = petToWater.substring(0,1).toUpperCase() + petToWater.substring(1);
                spca.feedSpecificPet(petToWaterCap);
                System.out.println("That looked refreshing. " + petToWaterCap + "'s thirst level has gone down!");
                spca.tickAllPets();
            }
            //Play with all pets
            else if (choicePrime.equalsIgnoreCase("6")) {
                System.out.println("So much fur! So much fun! That really wore them out!");
                spca.playWithAllPets();
                spca.tickAllPets();
            }
            //Play with specific pet
            else if (choicePrime.equalsIgnoreCase("7")) {
                System.out.println("Which pet would you like to play with?");
                System.out.println(spca.getAllNames());
                String petToPlayWith = input.nextLine();
                String petToPlayWithCap = petToPlayWith.substring(0,1).toUpperCase() + petToPlayWith.substring(1);
                spca.playWithSpecificPet(petToPlayWithCap);
                System.out.println("I've never seen " + petToPlayWithCap + " have so much fun!\nMaybe you'll be their forever home?");
                spca.tickAllPets();
            }
            //All pets nap
            else if (choicePrime.equalsIgnoreCase("8")) {
                System.out.println("Lights out. It's shelter nap time. Please keep noise to a minimum.");
                spca.sleepAllPets();
                spca.tickAllPets();
            }
            //Specific pet naps
            else if (choicePrime.equalsIgnoreCase("9")) {
                System.out.println("Which pet would you like to play with?");
                System.out.println(spca.getAllNames());
                String petToSleep = input.nextLine();
                String petToSleepCap = petToSleep.substring(0,1).toUpperCase() + petToSleep.substring(1);
                spca.feedSpecificPet(petToSleepCap);
                System.out.println(petToSleepCap + " looks so cute sleeping.");
                spca.tickAllPets();
            }
            //Adopt a pet
            else if (choicePrime.equalsIgnoreCase("10")) {
                System.out.println("Which pet would you like to adopt?");
                System.out.println(spca.getAllNames());
                String petToAdopt = input.nextLine();
                String petToAdoptCap = petToAdopt.substring(0,1).toUpperCase() + petToAdopt.substring(1);
                spca.adoptPet(petToAdoptCap);
                System.out.println("We knew " + petToAdoptCap + " would find a forever home! \nWe are so happy it's you!");
                spca.tickAllPets();
            }
            //Get all statuses
            else if (choicePrime.equalsIgnoreCase("11")) {
                spca.tickAllPets();
                System.out.println("Good idea!");
            }
            //Recalls main menu for any response that doesn't satisfy an "if" condition
            else {
                System.out.println("Invalid response. Returning to main menu.");
            }
        } while (!spca.getBoardedPets().isEmpty());
        System.out.println("Come back and play again soon!");
    }
    //Various menus/pictures
    public void welcome() {
        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
        System.out.println("|                                                                   |");
        System.out.println("|                  <<<      W E L C O M E      >>>                  |");
        System.out.println("|                                                                   |");
        System.out.println("|               <<<              T O              >>>               |");
        System.out.println("|                                                                   |");
        System.out.println("|            <<<      V I R T U A L   P E T !!!      >>>            |");
        System.out.println("|                                                                   |");
        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
    }
    public void mainMenu() {
        System.out.println(" *~~~~~~~~~~~~~~~~~~~~~~~~--[Main Menu]--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~* ");
        System.out.println("{ [0] Go home for now.                 [6] Play with all the pets.     }");
        System.out.println("{ [1] Admit a new pet to the shelter.  [7] Play with specific pet(s).  }");
        System.out.println("{ [2] Feed all pets.                   [8] Shelter naptime!            }");
        System.out.println("{ [3] Feed specific pet(s).            [9] Give specific pet(s) a nap. }");
        System.out.println("{ [4] Water all pets.                  [10] Adopt a pet.               }");
        System.out.println("{ [5] Water specific pet(s).           [11] Check on pets.             }");
        System.out.println(" *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~* ");
        }

        public void quitMenu() {
            System.out.println("'---------------------------------'");
            System.out.println("|         --!!WARNING!!--         |");
            System.out.println("|    Going home quits the game.   |");
            System.out.println("| Are you sure you want to leave? |");
            System.out.println("|        [yes]   or   [no]        |");
            System.out.println("'---------------------------------'");
        }
}
