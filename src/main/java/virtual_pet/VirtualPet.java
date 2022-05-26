package virtual_pet;
public class VirtualPet {
    private String name;
    private int hunger;
    private int thirst;
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
