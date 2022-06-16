package virtual_pet;

public class RoboticDog extends RoboticPet implements Walk{
    public RoboticDog(String name, boolean isAlive, int boredom, int batteryLevel, int maintenanceLevel, int oilLevel) {
        super(name, isAlive, boredom, batteryLevel, maintenanceLevel, oilLevel);
    }

    public void walk() {
        boredom = 0;
        batteryLevel -= 10;
        maintenanceLevel -= 10;
        oilLevel -= 10;

        if (batteryLevel <= 6 && batteryLevel > 0) {
            System.out.println("Uh oh! Looks like " + name + " is getting sluggish. Might want to consider a charge.");
        }
        if (batteryLevel <= 0) {
            System.out.println("Well, looks like " + name + "'s battery is dead. With their last ounce of energy, they " +
                    "managed to stick their tongue in a nearby outlet.");
            autoRegenerate();
        }

        if (oilLevel <= 6 && oilLevel > 0) {
            System.out.println("Uh oh! " + name + "'s gears are starting to squeak. Might be time for some oil.");
        }
        if (oilLevel <= 0) {
            System.out.println("Well, all " + name + "'s gears grind to a stop. Looks like " + name +
                    " is out of oil. Luckily, an attendant was close by and able to add some.");
            oilLevel = 6;
        }

        if (maintenanceLevel > 0 && maintenanceLevel <= 6) {
            System.out.println("Hmmmm. As " + name + " wags their tail, it looks as though it might fall off. Might be " +
                    "time for servicing.");
        }

        if (maintenanceLevel <= 0) {
            System.out.println("Oh dear! Poor " + name + "'s tail has fallen off! This is why service is so important " +
                    "for our robotic friends. Luckily, it wasn't too hard to temporarily reattach. " + name + " definitely " +
                    "needs a full servicing asap.");
            maintenanceLevel = 6;
        }
    }
}
