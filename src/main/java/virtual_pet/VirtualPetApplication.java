package virtual_pet;

import java.util.Scanner;

public class VirtualPetApplication {

    public static void main(String[] args) {
        VirtualPetApplication myGame = new VirtualPetApplication();
        myGame.gameLoop();
    }
    public void gameLoop() {
        Scanner input = new Scanner(System.in);

        VirtualPetShelter spca = new VirtualPetShelter();
        OrganicCat orgCatPrime = new OrganicCat("Garfield",true,6,6,6,6,0);
        OrganicDog orgDogPrime = new OrganicDog("Fido",true,6,6,6,6,0);
        RoboticCat robCatPrime = new RoboticCat("RoboCat",true,6,6,6,6);
        RoboticDog robDogPrime = new RoboticDog("RoboDog",true,6,6,6,6);
        spca.admitOrganicCat(orgCatPrime);
        spca.admitOrganicDog(orgDogPrime);
        spca.admitRoboticCat(robCatPrime);
        spca.admitRoboticDog(robDogPrime);

        String choicePrime;

        welcome();

        System.out.println("Here at the Virtual Pet Shelter, we've got plenty of lonely pets who need homes!");
        System.out.println("What would you like to do while you're here?");

        do {
            spca.getAllStatuses();
            mainMenu();
            choicePrime = input.nextLine();

            if (choicePrime.equalsIgnoreCase("1")) {
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
            else if (choicePrime.equalsIgnoreCase("2")) {
                admitPetMenu();
                String admitVirPetResponse = input.nextLine();
                if (admitVirPetResponse.equalsIgnoreCase("1")) {
                    admitRoboticPetMenu();
                    String admitRobPetResponse = input.nextLine();
                    if (admitRobPetResponse.equalsIgnoreCase("1")) {
                        System.out.println("We promise to find a great home for the little guy.");
                        System.out.println("What is their name?");
                        String admittedPetName = input.nextLine();
                        String petName = admittedPetName.substring(0,1).toUpperCase() + admittedPetName.substring(1);
                        RoboticDog pet = new RoboticDog(petName,true,6,6,6,6);
                        spca.admitRoboticDog(pet);
                        System.out.println(admittedPetName + " is in good hands. You've made the right call.");
                        System.out.println("What would you like to do next?");
                        spca.tickAllPets();
                    }
                    else if (admitRobPetResponse.equalsIgnoreCase("2")) {
                        System.out.println("We promise to find a great home for the little guy.");
                        System.out.println("What is their name?");
                        String admittedPetName = input.nextLine();
                        String petName = admittedPetName.substring(0,1).toUpperCase() + admittedPetName.substring(1);
                        RoboticCat pet = new RoboticCat(petName,true,6,6,6,6);
                        spca.admitRoboticCat(pet);
                        System.out.println(admittedPetName + " is in good hands. You've made the right call.");
                        System.out.println("What would you like to do next?");
                        spca.tickAllPets();
                    }
                    else {
                        System.out.println("Invalid response. Returning to main menu.");
                    }
                }
                else if (admitVirPetResponse.equalsIgnoreCase("2")) {
                    admitOrganicPetMenu();
                    String admitOrgPetResponse = input.nextLine();
                    if (admitOrgPetResponse.equalsIgnoreCase("1")) {
                        System.out.println("We promise to find a great home for the little guy.");
                        System.out.println("What is their name?");
                        String admittedPetName = input.nextLine();
                        String petName = admittedPetName.substring(0,1).toUpperCase() + admittedPetName.substring(1);
                        OrganicDog pet = new OrganicDog(petName,true,6,6,6,6,0);
                        spca.admitOrganicDog(pet);
                        System.out.println(admittedPetName + " is in good hands. You've made the right call.");
                        System.out.println("What would you like to do next?");
                        spca.tickAllPets();
                    }
                    else if (admitOrgPetResponse.equalsIgnoreCase("2")) {
                        System.out.println("We promise to find a great home for the little guy.");
                        System.out.println("What is their name?");
                        String admittedPetName = input.nextLine();
                        String petName = admittedPetName.substring(0,1).toUpperCase() + admittedPetName.substring(1);
                        OrganicCat pet = new OrganicCat(petName,true,6,6,6,6, 0);
                        spca.admitOrganicCat(pet);
                        System.out.println(admittedPetName + " is in good hands. You've made the right call.");
                        System.out.println("What would you like to do next?");
                        spca.tickAllPets();
                    }
                    else {
                        System.out.println("Invalid response. Returning to main menu.");
                    }
                }
            }
            else if (choicePrime.equalsIgnoreCase("3")) {
                careForAllMenu();
                String careAllResponse = input.nextLine();
                if (careAllResponse.equalsIgnoreCase("1")) {
                    System.out.println("Great idea! Our robotic friends all have full batteries now!");
                    spca.chargeAllRoboticPets();
                    spca.tickAllPets();
                }
                else if (careAllResponse.equalsIgnoreCase("2")) {
                    System.out.println("Glug glug glug. Now our robotic friends' gears should be whirring like new!");
                    spca.oilAllRoboticPets();
                    spca.tickAllPets();
                }
                else if (careAllResponse.equalsIgnoreCase("3")) {
                    System.out.println("Clink Clank Clunk! All systems seem to be in good order for our robotic friends!");
                    spca.serviceAllRoboticPets();
                    spca.tickAllPets();
                }
                else if (careAllResponse.equalsIgnoreCase("4")) {
                    System.out.println("Yummm. All our organic friends have full bellies!");
                    spca.feedAllOrganicPets();
                    spca.tickAllPets();
                }
                else if (careAllResponse.equalsIgnoreCase("5")) {
                    System.out.println("Gulp gulp! Our organic friends have had their thirst quenched!");
                    spca.waterAllOrganicPets();
                    spca.tickAllPets();
                }
                else if (careAllResponse.equalsIgnoreCase("6")) {
                    System.out.println("Yawn! That was a great nap! Our organic friends are all ready to play again!");
                    spca.sleepAllOrganicPets();
                    spca.tickAllPets();
                }
                else if (careAllResponse.equalsIgnoreCase("7")) {
                    System.out.println("The dog cages have never smelled so good!");
                    spca.cleanAllCages();
                    spca.tickAllPets();
                }
                else if (careAllResponse.equalsIgnoreCase("8")) {
                    System.out.println("Hallelujah! No more amonia! The cats are sure to be happy!");
                    spca.cleanAllLitterBoxes();
                    spca.tickAllPets();
                }
                else if (careAllResponse.equalsIgnoreCase("9")) {
                    System.out.println("Whooosh! Our organic dog cages and cat litter boxes are all clean, \nbut we got " +
                            "water all over the robotic pets! luckily they're all rated IP68!");
                    spca.cleanAllCagesAndLitterBoxes();
                    spca.tickAllPets();
                }
                else {
                    System.out.println("Invalid response. Returning to main menu.");
                }
            }
            else if (choicePrime.equalsIgnoreCase("4")) {
                careForOneMenu();
                String careOneResponse = input.nextLine();
                if (careOneResponse.equalsIgnoreCase("1")) {
                    System.out.println("Which robotic pet would you like to charge?");
                    System.out.println(spca.getRoboticPetNames());
                    String petToCharge = input.nextLine();
                    String petToChargeCap = petToCharge.substring(0,1).toUpperCase() + petToCharge.substring(1);
                    System.out.println(petToChargeCap + " now has a full battery!");
                    spca.chargeSpecificRoboticPet(petToChargeCap);
                    spca.tickAllPets();
                }
                else if (careOneResponse.equalsIgnoreCase("2")) {
                    System.out.println("Which robotic pet would you like to oil?");
                    System.out.println(spca.getRoboticPetNames());
                    String petToOil = input.nextLine();
                    String petToOilCap = petToOil.substring(0,1).toUpperCase() + petToOil.substring(1);
                    System.out.println(petToOilCap + "'s gears are whirring like new!");
                    spca.oilSpecificRoboticPet(petToOil);
                    spca.tickAllPets();
                }
                else if (careOneResponse.equalsIgnoreCase("3")) {
                    System.out.println("Which robotic pet would you like to service?");
                    System.out.println(spca.getRoboticPetNames());
                    String petToService = input.nextLine();
                    String petToServiceCap = petToService.substring(0,1).toUpperCase() + petToService.substring(1);
                    System.out.println(petToServiceCap + " looks well assembled!");
                    spca.serviceSpecificRoboticPet(petToServiceCap);
                    spca.tickAllPets();
                }
                else if (careOneResponse.equalsIgnoreCase("4")) {
                    System.out.println("Which organic pet would you like to feed?");
                    System.out.println(spca.getOrganicPetNames());
                    String petToFeed = input.nextLine();
                    String petToFeedCap = petToFeed.substring(0,1).toUpperCase() + petToFeed.substring(1);
                    System.out.println(petToFeedCap + " looks satisfied with a full belly!");
                    spca.feedSpecificOrganicPet(petToFeedCap);
                    spca.tickAllPets();
                }
                else if (careOneResponse.equalsIgnoreCase("5")) {
                    System.out.println("Which organic pet would you like to water?");
                    System.out.println(spca.getOrganicPetNames());
                    String petToFeed = input.nextLine();
                    String petToFeedCap = petToFeed.substring(0,1).toUpperCase() + petToFeed.substring(1);
                    System.out.println(petToFeedCap + " looks satisfied with a full belly!");
                    spca.waterSpecificOrganicPet(petToFeedCap);
                    spca.tickAllPets();
                }
                else if (careOneResponse.equalsIgnoreCase("6")) {
                    System.out.println("Which organic pet would you like to let nap?");
                    System.out.println(spca.getOrganicPetNames());
                    String petToNap = input.nextLine();
                    String petToNapCap = petToNap.substring(0,1).toUpperCase() + petToNap.substring(1);
                    System.out.println(petToNapCap + " is well rested and ready to play again!");
                    spca.sleepSpecificOrganicPet(petToNapCap);
                    spca.tickAllPets();
                }
                else if (careOneResponse.equalsIgnoreCase("7")) {
                    System.out.println("Who's cage would you like to clean?");
                    System.out.println(spca.getOrganicDogNames());
                    String petsCageToClean = input.nextLine();
                    String petsCageToCleanCap = petsCageToClean.substring(0,1).toUpperCase() + petsCageToClean.substring(1);
                    System.out.println(petsCageToCleanCap + "'s cage has never looked so clean!");
                    spca.cleanSpecificCage(petsCageToCleanCap);
                    spca.tickAllPets();
                }
                else if (careOneResponse.equalsIgnoreCase("8")) {
                    System.out.println("Who's litter box would you like to clean?");
                    System.out.println(spca.getOrganicCatNames());
                    String petsLitterBoxToClean = input.nextLine();
                    String petsLitterBoxToCleanCap = petsLitterBoxToClean.substring(0,1).toUpperCase() + petsLitterBoxToClean.substring(1);
                    System.out.println(petsLitterBoxToCleanCap + "'s litter box has never looked so clean!");
                    spca.cleanSpecificLitterBox(petsLitterBoxToCleanCap);
                    spca.tickAllPets();
                }
                else {
                    System.out.println("Invalid response. Returning to main menu.");
                }
            }
            else if (choicePrime.equalsIgnoreCase("5")) {
                playOrWalkManyMenu();
                String walkPlayManyResponse = input.nextLine();
                if (walkPlayManyResponse.equalsIgnoreCase("1")) {
                    System.out.println("Wow! Those dogs were tough to wrangle, but they sure enjoyed that!");
                    spca.walkAllWalkablePets();
                    spca.tickAllPets();
                }
                else if (walkPlayManyResponse.equalsIgnoreCase("2")) {
                    System.out.println("Thank goodness we have the courtyard! Could you imagine trying to put a leash" +
                            "on one of those kitties?");
                    spca.playWithAllKittiesInKittyCourtyard();
                    spca.tickAllPets();
                }
                else if (walkPlayManyResponse.equalsIgnoreCase("3")) {
                    System.out.println("What a free-for-all! Who knew the dogs and cats would get along so well!?");
                    spca.playWithAllPets();
                    spca.tickAllPets();
                }
                else {
                    System.out.println("Invalid response. Returning to main menu.");
                }

            }
            else if (choicePrime.equalsIgnoreCase("6")) {
                playOrWalkOneMenu();
                String playWalkOneResponse = input.nextLine();
                if (playWalkOneResponse.equalsIgnoreCase("1")) {
                    System.out.println("Which dog would you like to walk?");
                    System.out.println(spca.getDogNames());
                    String dogToWalk = input.nextLine();
                    String dogToWalkCap = dogToWalk.substring(0, 1) + dogToWalk.substring(1);
                    System.out.println(dogToWalkCap + " seemed to enjoy your walk! Would we be thinking about adoption today?");
                    spca.walkSpecificWalkablePet(dogToWalkCap);
                    spca.tickAllPets();
                } else if (playWalkOneResponse.equalsIgnoreCase("2")) {
                    System.out.println("Which cat would you like to take to the courtyard to play?");
                    System.out.println(spca.getCatNames());
                    String catToWalk = input.nextLine();
                    String catToWalkCap = catToWalk.substring(0, 1) + catToWalk.substring(1);
                    System.out.println(catToWalkCap + " seemed to enjoy your time in the courtyard! Would we be thinking about adoption today?");
                    spca.playWithSpecificKittyInKittyCourtyard(catToWalkCap);
                    spca.tickAllPets();
                } else if (playWalkOneResponse.equalsIgnoreCase("3")) {
                    System.out.println("Which animal would you like to play with?");
                    System.out.println(spca.getAllNames());
                    String animalToPlay = input.nextLine();
                    String animalToPlayCap = animalToPlay.substring(0, 1) + animalToPlay.substring(1);
                    System.out.println(animalToPlayCap + " seemed to enjoy playing with you! Would we be thinking about adoption today?");
                    spca.playWithSpecificPet(animalToPlayCap);
                    spca.tickAllPets();
                } else {
                    System.out.println("Invalid response. Returning to main menu.");
                }
            }
            else if (choicePrime.equalsIgnoreCase("7")) {
                System.out.println("Which pet would you like to adopt?");
                System.out.println(spca.getAllNames());
                String petToAdopt = input.nextLine();
                String petToAdoptCap = petToAdopt.substring(0,1).toUpperCase() + petToAdopt.substring(1);
                spca.adoptPet(petToAdoptCap);
                System.out.println("We knew " + petToAdoptCap + " would find a forever home! \nWe are so happy it's you!");
                spca.tickAllPets();
            }
            else if (choicePrime.equalsIgnoreCase("8")) {
                spca.tickAllPets();
                System.out.println("Good idea!");
            }
            else {
                System.out.println("Invalid response. Returning to main menu.");
            }
        } while (!spca.getBoardedPets().isEmpty());
        System.out.println("Come back and play again soon!");
    }

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
    public void admitPetMenu() {
        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
        System.out.println("|                                                     |");
        System.out.println("|           What kind of pet did you bring?           |");
        System.out.println("|                                                     |");
        System.out.println("|            [1] Robotic      [2] Organic             |");
        System.out.println("|                                                     |");
        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
    }
    public void admitRoboticPetMenu() {
        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
        System.out.println("|                                                     |");
        System.out.println("|           Great! What type of Robotic Pet?          |");
        System.out.println("|                                                     |");
        System.out.println("|                 [1] Dog      [2] Cat                |");
        System.out.println("|                                                     |");
        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
    }
    public void admitOrganicPetMenu() {
        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
        System.out.println("|                                                     |");
        System.out.println("|           Great! What type of Organic Pet?          |");
        System.out.println("|                                                     |");
        System.out.println("|                 [1] Dog      [2] Cat                |");
        System.out.println("|                                                     |");
        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
    }
    public void mainMenu() {
        System.out.println(" *~~~~~~~~~~~~~~~~~~~~~~~~~--[Main Menu]--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~* ");
        System.out.println("{  [1] Go home for now.                 [5] Play/Walk pets.             }");
        System.out.println("{  [2] Admit a new pet to the shelter.  [6] Play/Walk specific pet.     }");
        System.out.println("{  [3] Care for all pets.               [7] Adopt a pet.                }");
        System.out.println("{  [4] Care for specific pet.           [8] Check on pets.              }");
        System.out.println(" *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~* ");
    }
    public void careForAllMenu() {
        System.out.println(" *~~~~~~~~~~~~~~~~~~~~~~~~~--[Care Menu]--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~* ");
        System.out.println("{  [1] Charge robotic pets.           [6] Nap organic pets.             }");
        System.out.println("{  [2] Oil robotic pets.              [7] Clean cages.                  }");
        System.out.println("{  [3] Service robotic pets.          [8] Clean litter boxes.           }");
        System.out.println("{  [4] Feed organic pets.             [9] Hose down the shelter.        }");
        System.out.println("{  [5] Water organic pets.                                              }");
        System.out.println(" *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~* ");
    }
    public void careForOneMenu() {
        System.out.println(" *~~~~~~~~~~~~~~~~~~~~~~~~~--[Care Menu]--~~~~~~~~~~~~~~~~~~~~~~~~~~~~~* ");
        System.out.println("{  [1] Charge robotic pet.            [5] Water organic pet.            }");
        System.out.println("{  [2] Oil robotic pet.               [6] Nap organic pet.              }");
        System.out.println("{  [3] Service robotic pet.           [7] Clean cage.                   }");
        System.out.println("{  [4] Feed organic pet.              [8] Clean litter box.             }");
        System.out.println(" *~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~* ");
    }
    public void playOrWalkManyMenu() {
        System.out.println("*~~~~~~~~~~~--[Walk/Play]--~~~~~~~~~*");
        System.out.println("|  [1] Walk Dogs.                   |");
        System.out.println("|  [2] Let cats play in courtyard.  |");
        System.out.println("|  [3] Play with all pets.          |");
        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
    }
    public void playOrWalkOneMenu() {
        System.out.println("*~~~~~~~~~~~--[Walk/Play]--~~~~~~~~~*");
        System.out.println("|  [1] Walk a Dog.                  |");
        System.out.println("|  [2] Let a cat play in courtyard. |");
        System.out.println("|  [3] Play with a pet.             |");
        System.out.println("*~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~*");
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
