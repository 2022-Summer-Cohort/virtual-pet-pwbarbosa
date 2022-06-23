package virtual_pet;

public abstract class OrganicPet extends VirtualPet{
    protected int hunger;
    protected int thirst;
    protected int fatigue;

    public OrganicPet(String name, boolean isAlive,
                      int boredom, int hunger, int thirst,
                      int fatigue) {
        super(name, isAlive, boredom);
        this.hunger = hunger;
        this.thirst = thirst;
        this.fatigue = fatigue;
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

    public void feedPet() {
        hunger -= 6;
        boredom += 3;


        if (hunger < 0) {
            vomitPet();
        }
    }

    public void vomitPet() {
        hunger = 0;
        thirst = 7;
        fatigue = 7;
        boredom = 2;
        System.out.println("WHoops! " + getName() + " ate too much and threw up!");
        System.out.println("Luckily, an attendant cleaned up the mess.");
    }

    public void waterPet() {
        thirst -= 6;
        boredom += 3;

        if (thirst < 0) {
            thirstToZero();
        }
    }
    public void thirstToZero() {
        thirst = 0;
    }

    public void play() {
        super.play();
        hunger += 3;
        thirst += 3;
        fatigue += 6;

        if (fatigue >= 25) {
            autoNap();
        }
    }

    private void fatigueToZero() {
        fatigue = 0;
    }

    public void sleepPet() {
        fatigue -= 6;
        boredom = 25;

        if (fatigue < 0) {
            fatigueToZero();
        }
    }

    public void autoNap() {
        System.out.println(name + " is tuckered and decides to nap.");
        sleepPet();
    }

    public void tick() {
        super.tick();
        fatigue += 1;
        hunger += 1;
        thirst += 1;
        if (fatigue >= 20) {
            autoNap();
        }
    }
}
