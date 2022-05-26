package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VirtualPetTest {
    @Test
    public void shouldGetName() {
        VirtualPet underTest = new VirtualPet("Pedro", 6, 6, 6,true);

        underTest.getName();

        assertEquals("Pedro",underTest.getName());
    }

    @Test
    public void shouldGetHunger() {
        VirtualPet underTest = new VirtualPet("Pedro", 6, 6, 6,true);
        underTest.getHunger();

        assertEquals(6,underTest.getHunger());
    }

    @Test
    public void shouldGetThirst() {
        VirtualPet underTest = new VirtualPet("Pedro", 6, 6, 6,true);
        underTest.getThirst();

        assertEquals(6,underTest.getThirst());
    }

    @Test
    public void shouldGetFatigue() {
        VirtualPet underTest = new VirtualPet("Pedro", 6, 6, 6,true);
        underTest.getFatigue();

        assertEquals(6,underTest.getFatigue());
    }

    @Test
    public void shouldGetIsAlive() {
        VirtualPet underTest = new VirtualPet("Pedro", 6, 6, 6,true);
        underTest.getIsAlive();

        assertEquals(true,underTest.getIsAlive());
    }

    @Test
    public void shouldDecreaseHunger() {
        VirtualPet underTest = new VirtualPet("Pedro", 6, 6, 6,true);
        underTest.feedPet();

        assertEquals(0,underTest.getHunger());
    }

    @Test
    public void shouldDecreaseThirst() {
        VirtualPet underTest = new VirtualPet("Pedro", 6, 6, 6,true);
        underTest.waterPet();

        assertEquals(0,underTest.getThirst());
    }

    @Test
    public void shouldDecreaseFatigue() {
        VirtualPet underTest = new VirtualPet("Pedro", 6, 6, 6,true);
        underTest.sleepPet();

        assertEquals(0,underTest.getFatigue());
    }

    @Test
    public void shouldIncreaseHunger() {
        VirtualPet underTest = new VirtualPet("Pedro", 6, 6, 6,true);
        underTest.tick();

        assertEquals(7,underTest.getHunger());
    }

    @Test
    public void shouldIncreaseThirst() {
        VirtualPet underTest = new VirtualPet("Pedro", 6, 6, 6,true);
        underTest.tick();

        assertEquals(7,underTest.getThirst());
    }

    @Test
    public void shouldIncreaseFatigue() {
        VirtualPet underTest = new VirtualPet("Pedro", 6, 6, 6,true);
        underTest.tick();

        assertEquals(7,underTest.getFatigue());
    }


}
