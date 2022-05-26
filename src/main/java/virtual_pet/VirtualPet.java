package virtual_pet;
//For real, this is a dog...
public class VirtualPet {
    private String name;

    //Should be fed 2 servings of 2 cups daily for hunger
    //6 hunger points = one cup food
    private int hunger;

    //Dog needs 24oz of water daily
    //One thirst point = one thirst point
    private int thirst;

    //Dog needs approx 12 hours of sleep daily
    //One hour sleep = 1 fatigue point
    private int fatigue;

    private boolean isAlive;

    public VirtualPet(String name, int hunger, int thirst, int fatigue, boolean isAlive) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.fatigue = fatigue;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public int getHunger() {
        return hunger;
    }

    public int getThirst() {
        return thirst;
    }

    public int getFatigue() {
        return fatigue;
    }

    public boolean getIsAlive() {
        return isAlive;
    }

    public void feedPet() {
        hunger -= 6;
    }

    public void waterPet() {
        thirst -= 6;
    }

    public void sleepPet() {
        fatigue -= 6;
    }

    public void tick() {
        fatigue += 1;
        hunger += 1;
        thirst += 1;
    }
}
