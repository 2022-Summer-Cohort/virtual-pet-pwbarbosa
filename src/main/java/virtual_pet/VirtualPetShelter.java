package virtual_pet;

import java.util.ArrayList;
import java.util.List;

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

    //Actions/methods for shelter/all VP's
    public void feedAllPets() {
        for (VirtualPet currentPet: boardedPets) {
            currentPet.feedPet();
        }
    }
    public void feedSpecificPet(String petToFeed) {
        for (VirtualPet currentPet:boardedPets) {
            if (currentPet.getName().equalsIgnoreCase(petToFeed)) {
                currentPet.feedPet();
                break;
            }
        }
    }
    public void waterAllPets() {
        for (VirtualPet currentPet: boardedPets) {
            currentPet.waterPet();
        }
    }
    public void waterSpecificPet(String petToWater) {
        for (VirtualPet currentPet:boardedPets) {
            if (currentPet.getName().equalsIgnoreCase(petToWater)) {
                currentPet.waterPet();
                break;
            }
        }
    }
    public void sleepAllPets() {
        for (VirtualPet currentPet: boardedPets) {
            currentPet.sleepPet();
        }
    }
    public void sleepSpecificPet(String petToSleep) {
        for (VirtualPet currentPet:boardedPets) {
            if (currentPet.getName().equalsIgnoreCase(petToSleep)) {
                currentPet.sleepPet();
                break;
            }
        }
    }
    public void playWithAllPets() {
        for (VirtualPet currentPet: boardedPets) {
            currentPet.playWithPet();
        }
    }
    public void playWithSpecificPet(String petToPlayWith) {
        for (VirtualPet currentPet:boardedPets) {
            if (currentPet.getName().equalsIgnoreCase(petToPlayWith)) {
                currentPet.playWithPet();
                break;
            }
        }
    }
    public void tickAllPets() {
        for (VirtualPet currentPet: boardedPets) {
            currentPet.tick();
        }
    }

    public void admitPet(VirtualPet petToAdd) {
        boardedPets.add(petToAdd);
    }

    public void admitMultiplePets(VirtualPet[] petsToAdd) {
        boardedPets.addAll(List.of(petsToAdd));
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
            if(!currentPet.getIsAlive()) {
                System.out.println("Poor " + currentPet.getName() + " is dead.");
            }
            else if (currentPet.getHunger() < 6 && currentPet.getThirst() < 6 && currentPet.getFatigue() < 6 && currentPet.getBoredom() < 6) {
                System.out.println(currentPet.getName() + " looks happy and healthy!");
            }
            else if (currentPet.getHunger() >= 6 && currentPet.getThirst() < 6 && currentPet.getFatigue() < 6 && currentPet.getBoredom() < 6) {
                System.out.println(currentPet.getName() + " is looking hungry!");
            }
            else if (currentPet.getHunger() < 6 && currentPet.getThirst() >= 6 && currentPet.getFatigue() < 6 && currentPet.getBoredom() < 6) {
                System.out.println(currentPet.getName() + " is looking thirsty!");
            }
            else if (currentPet.getHunger() < 6 && currentPet.getThirst() < 6 && currentPet.getFatigue() >= 6 && currentPet.getBoredom() < 6) {
                System.out.println("Looks like " + currentPet.getName() + " could use a nap!");
            }
            else if (currentPet.getHunger() < 6 && currentPet.getThirst() < 6 && currentPet.getFatigue() < 6 && currentPet.getBoredom() >= 6) {
                System.out.println(currentPet.getName() + " wants to play!");
            }
            else if (currentPet.getHunger() >= 6 && currentPet.getThirst() >= 6 && currentPet.getFatigue() < 6 && currentPet.getBoredom() < 6) {
                System.out.println(currentPet.getName() + " is hungry and thirsty.");
            }
            else if (currentPet.getHunger() >= 6 && currentPet.getThirst() < 6 && currentPet.getFatigue() >= 6 && currentPet.getBoredom() < 6) {
                System.out.println(currentPet.getName() + " is tired and hungry.");
            }
            else if (currentPet.getHunger() < 6 && currentPet.getThirst() >= 6 && currentPet.getFatigue() >= 6 && currentPet.getBoredom() < 6) {
                System.out.println(currentPet.getName() + " is tired and thirsty.");
            }
            else if (currentPet.getHunger() >= 6 && currentPet.getThirst() >= 6 && currentPet.getFatigue() >= 6 && currentPet.getBoredom() >= 6) {
                System.out.println(currentPet.getName() + " needs some attention!\nHunger level: " + currentPet.getHunger() +
                        "\nThirst level: " + currentPet.getThirst() + "\nFatigue level: " + currentPet.getFatigue() + "\nBoredom level: " +
                        currentPet.getBoredom());
            }
            else {
                System.out.println(currentPet.getName() + " is " + currentPet.getHunger() + " hungry, " + currentPet.getThirst() + " thirsty, " +
                        currentPet.getFatigue() + " tired, and " + currentPet.getBoredom() + " bored.");
            }

        }
    }
    //Allows me to print a string representation of boardedPets
    @Override
    public String toString() {
        return "VirtualPetShelter{" +
                "boardedPets=" + boardedPets +
                '}';
    }
}
