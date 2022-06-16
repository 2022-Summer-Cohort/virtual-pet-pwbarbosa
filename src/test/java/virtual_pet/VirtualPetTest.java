package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class VirtualPetTest {

    @Test
    public void shouldDecreaseHunger() {
        OrganicDog underTest = new OrganicDog("Pedro", true, 6, 6,6,6,6);
        underTest.feedPet();

        assertEquals(0,underTest.getHunger());
    }

    @Test
    public void shouldDecreaseThirst() {
        OrganicCat underTest = new OrganicCat("Pedro", true, 6, 6,6,6,6);
        underTest.waterPet();

        assertEquals(0,underTest.getThirst());
    }

    @Test
    public void shouldDecreaseFatigue() {
        OrganicCat underTest = new OrganicCat("Pedro", true, 6, 6,6,6,6);
        underTest.sleepPet();

        assertEquals(0,underTest.getFatigue());
    }

    @Test
    public void shouldDecreaseBatteryLevel() {
        RoboticDog underTest = new RoboticDog("Pedro", true, 6, 6,6,6);
        underTest.tick();

        assertEquals(5,underTest.getBatteryLevel());
    }

    @Test
    public void shouldDecreaseOilLevel() {
        RoboticCat underTest = new RoboticCat("Pedro", true, 6, 6,6,6);
        underTest.tick();

        assertEquals(5,underTest.getOilLevel());
    }

}
