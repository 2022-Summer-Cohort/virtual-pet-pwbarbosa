package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetShelterTest {
    @Test
    public void shouldAddOrganicDog() {
        OrganicDog testPet = new OrganicDog("Pedro", true, 6, 6,6,6, 6);
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitOrganicDog(testPet);
        assertTrue(underTest.getBoardedPets().contains(testPet));
    }
//
//
    @Test
    public void shouldRemovePet() {
        OrganicDog underTest = new OrganicDog("underTest", true, 6, 6,6,6,12);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.admitOrganicDog(underTest);
        testShelter.adoptPet("underTest");
        assertTrue(!testShelter.getBoardedPets().contains(underTest));
    }
//
    @Test
    public void shouldLowerHungerLevelForAllPets() {
        OrganicDog test1 = new OrganicDog("test1", true, 6, 6,6,6,6);
        OrganicCat test2 = new OrganicCat("test2", true, 6, 6,6,6,6);
        OrganicDog test3 = new OrganicDog("test3", true, 6, 6,6,6,6);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.admitOrganicDog(test1);
        testShelter.admitOrganicCat(test2);
        testShelter.admitOrganicDog(test3);
        testShelter.feedAllOrganicPets();
        assertTrue(test1.getHunger()<6);
        assertTrue(test2.getHunger()<6);
        assertTrue(test3.getHunger()<6);
    }

}
