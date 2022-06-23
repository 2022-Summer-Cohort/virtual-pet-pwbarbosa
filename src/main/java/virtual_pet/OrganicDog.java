package virtual_pet;

public class OrganicDog extends OrganicPet implements Walk{
    private int cageSoilLevel;

    public OrganicDog(String name, boolean isAlive, int boredom, int hunger, int thirst, int fatigue, int cageSoilLevel) {
        super(name, isAlive, boredom, hunger, thirst, fatigue);
        this.cageSoilLevel = cageSoilLevel;
    }

    public int getCageSoilLevel() {
        return cageSoilLevel;
    }

    public void cleanCage() {
        cageSoilLevel = 0;
    }

    public void autoCleanCage() {
        System.out.println("Peee-yoo! " + name + "'s cage is starting to stink. Luckily, an attendant was available" +
                "to clean it up.");
        cleanCage();
    }

    public void feedPet() {
        super.feedPet();
        cageSoilLevel ++;
    }

    public void vomitPet() {
        super.vomitPet();
        cageSoilLevel += 10;

        if (cageSoilLevel >= 25) {
            autoCleanCage();
        }
    }

    public void waterPet() {
        super.waterPet();
        cageSoilLevel ++;
    }

    public void play() {
        super.play();
        cageSoilLevel ++;
    }

    public void walk() {
        boredom = 0;
        hunger += 6;
        thirst += 6;
        fatigue += 12;

        if (fatigue >= 25) {
            autoNap();
        }
    }

    public void sleepPet() {
        super.sleepPet();
        cageSoilLevel ++;
    }

    public void tick() {
        super.tick();
        cageSoilLevel ++;
    }
}
