package virtual_pet;

import java.util.ArrayList;

public class VirtualPetShelter {
   //Array list that holds all Virtual Pets (VP's)
    private ArrayList<VirtualPet> boardedPets = new ArrayList<>();


    //Getters for shelter/all VP's
    public ArrayList<VirtualPet> getBoardedPets() {
        return boardedPets;
    }
    public String getAllNames() {
        String nameString = "";
        for (VirtualPet currentPet:boardedPets) {
            nameString += currentPet.getName() + " ";
        }
        return nameString.trim();
    }
    public String getRoboticPetNames() {
        String nameString = "";
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof RoboticPet) {
                nameString += ((RoboticPet)currentPet).getName() + " ";
            }
        }
        return nameString.trim();
    }
    public String getOrganicPetNames() {
        String nameString = "";
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof OrganicPet) {
                nameString += ((OrganicPet)currentPet).getName() + " ";
            }
        }
        return nameString.trim();
    }
    public String getOrganicDogNames() {
        String nameString = "";
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof OrganicDog) {
                nameString += ((OrganicDog)currentPet).getName() + " ";
            }
        }
        return nameString.trim();
    }
    public String getOrganicCatNames() {
        String nameString = "";
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof OrganicCat) {
                nameString += ((OrganicCat)currentPet).getName() + " ";
            }
        }
        return nameString.trim();
    }
    public String getDogNames() {
        String nameString = "";
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof Walk) {
                nameString += ((Walk)currentPet).getName() + " ";
            }
        }
        return nameString.trim();
    }
    public String getCatNames() {
        String nameString = "";
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof PlayInKittyCourtyard) {
                nameString += ((PlayInKittyCourtyard)currentPet).getName() + " ";
            }
        }
        return nameString.trim();
    }

    //Actions/methods for shelter/all VP's
    public void feedAllOrganicPets() {
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof OrganicPet) {
                ((OrganicPet) currentPet).feedPet();
            }
        }
    }
    public void feedSpecificOrganicPet(String petToFeed) {
        for (VirtualPet currentPet:boardedPets) {
            if (currentPet.getName().equalsIgnoreCase(petToFeed) && currentPet instanceof OrganicPet) {
                ((OrganicPet)currentPet).feedPet();
                break;
            }
        }
    }
    public void waterAllOrganicPets() {
        for (VirtualPet currentPet: boardedPets) {
            if(currentPet instanceof OrganicPet) {
                ((OrganicPet) currentPet).waterPet();
            }
        }
    }
    public void waterSpecificOrganicPet(String petToWater) {
        for (VirtualPet currentPet:boardedPets) {
            if (currentPet.getName().equalsIgnoreCase(petToWater) && currentPet instanceof OrganicPet) {
                ((OrganicPet) currentPet).waterPet();
            }
                break;
        }
    }
    public void sleepAllOrganicPets() {
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof OrganicPet) {
                ((OrganicPet) currentPet).sleepPet();
            }
        }
    }
    public void sleepSpecificOrganicPet(String petToSleep) {
        for (VirtualPet currentPet:boardedPets) {
            if (currentPet.getName().equalsIgnoreCase(petToSleep) && currentPet instanceof OrganicPet) {
                ((OrganicPet)currentPet).sleepPet();
                break;
            }
        }
    }
    public void chargeAllRoboticPets() {
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof RoboticPet) {
                ((RoboticPet) currentPet).chargePet();
            }
        }
    }
    public void chargeSpecificRoboticPet(String petToCharge) {
        for (VirtualPet currentPet:boardedPets) {
            if (currentPet.getName().equalsIgnoreCase(petToCharge) && currentPet instanceof RoboticPet) {
                ((RoboticPet)currentPet).chargePet();
                break;
            }
        }
    }
    public void oilAllRoboticPets() {
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof RoboticPet) {
                ((RoboticPet) currentPet).oilPet();
            }
        }
    }
    public void oilSpecificRoboticPet(String petToOil) {
        for (VirtualPet currentPet:boardedPets) {
            if (currentPet.getName().equalsIgnoreCase(petToOil) && currentPet instanceof RoboticPet) {
                ((RoboticPet)currentPet).oilPet();
                break;
            }
        }
    }

    public void serviceAllRoboticPets() {
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof RoboticPet) {
                ((RoboticPet) currentPet).servicePet();
            }
        }
    }
    public void serviceSpecificRoboticPet(String petToService) {
        for (VirtualPet currentPet:boardedPets) {
            if (currentPet.getName().equalsIgnoreCase(petToService) && currentPet instanceof RoboticPet) {
                ((RoboticPet)currentPet).servicePet();
                break;
            }
        }
    }
    public void playWithAllKittiesInKittyCourtyard() {
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof PlayInKittyCourtyard) {
                ((PlayInKittyCourtyard) currentPet).playInKittyCourtyard();
            }
        }
    }
    public void playWithSpecificKittyInKittyCourtyard(String kittyToKitty) {
        for (VirtualPet currentPet:boardedPets) {
            if (currentPet.getName().equalsIgnoreCase(kittyToKitty) && currentPet instanceof PlayInKittyCourtyard) {
                ((PlayInKittyCourtyard)currentPet).playInKittyCourtyard();
                break;
            }
        }
    }
    public void walkAllWalkablePets() {
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof Walk) {
                ((Walk)currentPet).walk();
            }
        }
    }
    public void walkSpecificWalkablePet(String petToWalk) {
        for (VirtualPet currentPet:boardedPets) {
            if (currentPet.getName().equalsIgnoreCase(petToWalk) && currentPet instanceof Walk) {
                ((Walk)currentPet).walk();
                break;
            }
        }
    }
    public void playWithAllPets() {
        for (VirtualPet currentPet: boardedPets) {
            currentPet.play();
        }
    }
    public void playWithSpecificPet(String petToPlayWith) {
        for (VirtualPet currentPet:boardedPets) {
            if (currentPet.getName().equalsIgnoreCase(petToPlayWith)) {
                currentPet.play();
                break;
            }
        }
    }
    public void cleanAllCages() {
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof OrganicDog) {
                ((OrganicDog)currentPet).cleanCage();
            }
        }
    }

    public void cleanSpecificCage(String petWhoseCageToClean) {
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof OrganicDog && currentPet.getName().equalsIgnoreCase(petWhoseCageToClean)) {
                ((OrganicDog)currentPet).cleanCage();
            }
        }
    }

    public void cleanAllLitterBoxes() {
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof OrganicCat) {
                ((OrganicCat)currentPet).cleanLitterBox();
            }
        }
    }

    public void cleanSpecificLitterBox(String petWhoseLitterBoxToClean) {
        for (VirtualPet currentPet: boardedPets) {
            if (currentPet instanceof OrganicCat && currentPet.getName().equalsIgnoreCase(petWhoseLitterBoxToClean)) {
                ((OrganicCat)currentPet).cleanLitterBox();
            }
        }
    }

    public void cleanAllCagesAndLitterBoxes() {
        cleanAllCages();
        cleanAllLitterBoxes();
    }

    public void tickAllPets() {
        for (VirtualPet currentPet: boardedPets) {
            currentPet.tick();
        }
    }

    public void admitOrganicCat(OrganicCat petToAdd) {
        boardedPets.add(petToAdd);
    }
    public void admitOrganicDog(OrganicDog petToAdd) {
        boardedPets.add(petToAdd);
    }
    public void admitRoboticCat(RoboticCat petToAdd) {
        boardedPets.add(petToAdd);
    }
    public void admitRoboticDog(RoboticDog petToAdd) {
        boardedPets.add(petToAdd);
    }

    public void adoptPet(String nameOfPetToAdopt) {
        for (int i = boardedPets.size() - 1;i >= 0;i--) {
            if (boardedPets.get(i).getName().equalsIgnoreCase(nameOfPetToAdopt)) {
                boardedPets.remove(i);
                break;
            }
        }
    }

    //Not using this for now. Might include in 3rd iteration
//    public void adoptMultiplePets(VirtualPet[] petsToRemove) {
//        boardedPets.removeAll(List.of(petsToRemove));
//    }

    //Various status messages for VP's
    public void getAllStatuses() {
        String statuses = "";
        for (VirtualPet currentPet:boardedPets) {
//            below is a general numeric printout of statuses
//            System.out.println(currentPet.getName() + " is feeling " + currentPet.getThirst() + " thirsty " + currentPet.getHunger() + " hungry " +
//                    currentPet.getFatigue());
            if (currentPet instanceof OrganicCat) {
                System.out.println(currentPet.getName() + " has " + ((OrganicCat) currentPet).getHunger() + " hunger, " +
                        ((OrganicCat) currentPet).getThirst() + " thirst, " + ((OrganicCat) currentPet).getFatigue() + " fatigue, "
                        + ((OrganicCat) currentPet).getBoredom() + " boredom, and " + ((OrganicCat) currentPet).getLitterBoxSoilLevel() +
                        " litter box soil level.");
            }
            else if (currentPet instanceof OrganicDog) {
                System.out.println(currentPet.getName() + " has " + ((OrganicDog) currentPet).getHunger() + " hunger, " +
                        ((OrganicDog) currentPet).getThirst() + " thirst, " + ((OrganicDog) currentPet).getFatigue() + " fatigue, "
                        + ((OrganicDog) currentPet).getBoredom() + " boredom, and " + ((OrganicDog) currentPet).getCageSoilLevel() +
                        " cage soil level.");
            }
            else {
                System.out.println(currentPet.getName() + " has " + ((RoboticPet) currentPet).getBatteryLevel() + " battery level, " +
                        ((RoboticPet) currentPet).getOilLevel() + " oil level, " + ((RoboticPet) currentPet).getMaintenanceLevel() + " maintenance level, and "
                        + ((RoboticPet) currentPet).getBoredom() + " boredom.");
            }
        }
    }
}
