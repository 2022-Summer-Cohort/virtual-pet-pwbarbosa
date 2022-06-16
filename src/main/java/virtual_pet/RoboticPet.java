package virtual_pet;

public abstract class RoboticPet extends VirtualPet{
    protected int batteryLevel;
    protected int maintenanceLevel;
    protected int oilLevel;

    public RoboticPet(String name, boolean isAlive, int boredom, int batteryLevel, int maintenanceLevel, int oilLevel) {
        super(name, isAlive, boredom);
        this.batteryLevel = batteryLevel;
        this.maintenanceLevel = maintenanceLevel;
        this.oilLevel = oilLevel;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public int getMaintenanceLevel() {
        return maintenanceLevel;
    }

    public int getOilLevel() {
        return oilLevel;
    }


    public void chargePet() {
        batteryLevel = 25;
    }

    public void  oilPet() {
        oilLevel = 25;
    }

    public void servicePet() {
        maintenanceLevel = 25;
    }

    public void autoRegenerate() {
        chargePet();
        boredom = 25;

    }

    public void play() {
        super.play();
        batteryLevel -= 5;
        maintenanceLevel -= 5;
        oilLevel -= 5;
    }

    public void tick() {
        super.tick();
        batteryLevel --;
        oilLevel --;
        maintenanceLevel --;

        if (batteryLevel <= 6 && batteryLevel > 0) {
            System.out.println("Uh oh! Looks like " + name + " is getting sluggish. Might want to consider a charge.");
        }
        if (batteryLevel <= 0) {
            System.out.println("Well, looks like " + name + "'s battery is dead. With their last ounce of energy, they " +
                    "managed to stick their tongue in a nearby outlet.");
            autoRegenerate();
        }

        if (oilLevel <= 6 && oilLevel > 0) {
            System.out.println("Uh oh! " + name + "'s gears are starting to whine. Might be time for some oil.");
        }
        if (oilLevel <= 0) {
            System.out.println("Well, all " + name + "'s gears grind to a stop. Looks like " + name +
                    " is out of oil. Luckily, an attendant was able to come and add some.");
            oilLevel = 6;
        }

        if (maintenanceLevel > 0 && maintenanceLevel <= 6) {
            System.out.println("Hmmmm. As " + name + " wags their tail, it looks as though it might fall off. Might be " +
                    "time for a servicing.");
        }

        if (maintenanceLevel <= 0) {
            System.out.println("Oh dear! Poor " + name + "'s tail has fallen off! This is why service is so important " +
                    "for our robotic friends. An attendant was able to reattach the tale with minimal effort.");
            maintenanceLevel = 6;
        }
    }
}
