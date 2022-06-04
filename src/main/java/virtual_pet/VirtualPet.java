package virtual_pet;
public class VirtualPet {
    private String name;
    private int hunger;
    private int thirst;
    private int fatigue;


    private boolean isAlive;
    private int boredom;
//    private int hungerDeathCount5;
//    private int thirstDeathCount5;

    public VirtualPet(String name, int hunger, int thirst, int fatigue, boolean isAlive, int boredom) {
        this.name = name;
        this.hunger = hunger;
        this.thirst = thirst;
        this.fatigue = fatigue;
        this.isAlive = isAlive;
        this.boredom = boredom;
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

    public int getBoredom() {
        return boredom;
    }

    public void feedPet() {
        hunger -= 6;
        boredom +=3;

        if (hunger < 0) {
            vomitPet();
        }
    }

    public void vomitPet() {
        hunger = 3;
        thirst = 7;
        boredom = 2;
        fatigue = 7;
        System.out.println("WHoops! " + name + " ate too much and threw up!");
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

    public void sleepPet() {
        fatigue -= 6;
        boredom = 20;

        if (fatigue < 0) {
            fatigueToZero();
        }
    }

    private void fatigueToZero() {
        fatigue = 0;
    }

    public void playWithPet() {
        fatigue += 6;
        thirst += 3;
        hunger += 3;
        boredom -= 6;

        if (fatigue >=20) {
            autoNap();
        }
    }

    public void autoNap() {
        System.out.println(name + " is tuckered and decides to nap.");
        sleepPet();
    }

    public void tick() {
        fatigue += 1;
        hunger += 1;
        thirst += 1;

        if (fatigue >= 20) {
            autoNap();
        }

    }



    @Override
    public String toString() {
        return "VirtualPet{" +
                "name='" + name + '\'' +
                ", hunger=" + hunger +
                ", thirst=" + thirst +
                ", fatigue=" + fatigue +
                ", isAlive=" + isAlive +
                '}';
    }
}
