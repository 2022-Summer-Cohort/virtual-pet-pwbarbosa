package virtual_pet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class VirtualPetAmokTest {
    @Test
    public void shoudDecreaseCageSoilLevel() {
        OrganicDog testPet = new OrganicDog("Pedro",true,6,6,6,6,12);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.admitOrganicDog(testPet);
        testShelter.cleanSpecificCage("Pedro");
        assertTrue(testPet.getCageSoilLevel() < 12);
    }

    @Test
    public void shouldDecreaseLitterBoxSoilLevel() {
        OrganicCat testPet  = new OrganicCat("Pedro",true,6,6,6,6,12);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.admitOrganicCat(testPet);
        testShelter.cleanSpecificLitterBox("Pedro");
        assertTrue(testPet.getLitterBoxSoilLevel() < 12);
    }

    @Test
    public void shouldIncreaseHungerOrDecreaseBatteryLevel() {
        OrganicDog testPet1  = new OrganicDog("Pedro1",true,6,6,6,6,12);
        RoboticDog testPet2  = new RoboticDog("Pedro2",true,6,15,6,6);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.admitOrganicDog(testPet1);
        testShelter.admitRoboticDog(testPet2);
        testShelter.walkAllWalkablePets();
        assertEquals(12, testPet1.getHunger());
        assertEquals(5, testPet2.getBatteryLevel());
    }
}
