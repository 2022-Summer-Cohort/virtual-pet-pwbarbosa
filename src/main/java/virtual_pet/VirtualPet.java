package virtual_pet;
public abstract class VirtualPet implements Tick{
    protected String name;
    protected boolean isAlive;
    protected int boredom;


    public VirtualPet(String name, boolean isAlive, int boredom) {
        this.name = name;
        this.isAlive = isAlive;
        this.boredom = boredom;
    }

    public String getName() {
        return name;
    }
    public boolean getIsAlive() {
        return isAlive;
    }
    public int getBoredom() {
        return boredom;
    }


    public void tick() {
        boredom ++;
    }

    public void play() {
        System.out.println(name + " sure did seem to enjoy that!");
        boredom = 0;
    }
}
