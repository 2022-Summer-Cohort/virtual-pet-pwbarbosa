package virtual_pet;

public class OrganicCat extends OrganicPet implements PlayInKittyCourtyard{
    private int litterBoxSoilLevel;

    public OrganicCat(String name, boolean isAlive, int boredom, int hunger, int thirst, int fatigue, int litterBoxSoilLevel) {
        super(name, isAlive, boredom, hunger, thirst, fatigue);
        this.litterBoxSoilLevel = litterBoxSoilLevel;
    }

    public int getLitterBoxSoilLevel() {
        return litterBoxSoilLevel;
    }

    public void cleanLitterBox() {
        litterBoxSoilLevel = 0;
    }

    public void autoCleanLitterBox() {
        System.out.println("Oh dear! " + name + " has started pooping outside the litter box again. Luckily, an attendant" +
                "was able to clean up the mess and add fresh litter to the box. They didn't have time " +
                "to fully clean the litter box, though...");
        litterBoxSoilLevel = 15;
    }

    public void feedPet() {
        super.feedPet();
        litterBoxSoilLevel ++;

        if (litterBoxSoilLevel >= 25) {
            autoCleanLitterBox();
        }
    }

    public void vomitPet() {
        super.vomitPet();
        litterBoxSoilLevel ++;

        if (litterBoxSoilLevel >= 25) {
            autoCleanLitterBox();
        }
    }

    public void waterPet() {
        super.waterPet();
        litterBoxSoilLevel ++;

        if (litterBoxSoilLevel >= 25) {
            autoCleanLitterBox();
        }
    }

    public void play() {
        super.play();
        litterBoxSoilLevel ++;
    }

    public void playInKittyCourtyard() {
        hunger += 3;
        thirst += 3;
        fatigue += 6;
        boredom -= 6;
        litterBoxSoilLevel --;

        if (fatigue >= 25) {
            autoNap();
        }
    }

    public void tick() {
        super.tick();
        litterBoxSoilLevel ++;

        if (litterBoxSoilLevel >= 25) {
            autoCleanLitterBox();
        }
    }
}
