package virtual_pet;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetShelterTest {
    @Test
    public void shouldAddPet() {
        VirtualPet testPet = new VirtualPet("Pedro", 6, 6, 6,true,6);
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitPet(testPet);
        assertTrue(underTest.getBoardedPets().contains(testPet));
    }

    @Test
    public void shouldAddMultiplePets() {
        VirtualPet test1 = new VirtualPet("test1", 6, 6, 6,true,6);
        VirtualPet test2 = new VirtualPet("test2", 6, 6, 6,true,6);
        VirtualPet test3 = new VirtualPet("test3", 6, 6, 6,true,6);
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitMultiplePets(new VirtualPet[]{test1, test2, test3});
        assertTrue(underTest.getBoardedPets().contains(test1));
        assertTrue(underTest.getBoardedPets().contains(test2));
        assertTrue(underTest.getBoardedPets().contains(test3));
    }

    @Test
    public void shouldRemovePet() {
        VirtualPet underTest = new VirtualPet("underTest", 6, 6, 6,true,6);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.admitPet(underTest);
        testShelter.adoptPet("underTest");
        assertTrue(!testShelter.getBoardedPets().contains(underTest));
    }

    //Not using this for now. Might include in 3rd iteration
//    @Test
//    public void shouldRemoveMultiplePets() {
//        VirtualPet test1 = new VirtualPet("test1", 6, 6, 6,true,6);
//        VirtualPet test2 = new VirtualPet("test2", 6, 6, 6,true,6);
//        VirtualPet test3 = new VirtualPet("test3", 6, 6, 6,true,6);
//        VirtualPetShelter underTest = new VirtualPetShelter();
//        underTest.admitMultiplePets(new VirtualPet[]{test1, test2, test3});
//        underTest.adoptMultiplePets(new VirtualPet[]{test1, test2});
//        assertTrue(underTest.getBoardedPets().contains(test3));
//        assertFalse(underTest.getBoardedPets().contains(test1));
//        assertFalse(underTest.getBoardedPets().contains(test2));
//    }

    @Test
    public void shouldLowerHungerLevelForAllPets() {
        VirtualPet test1 = new VirtualPet("test1", 6, 6, 6,true,6);
        VirtualPet test2 = new VirtualPet("test2", 6, 6, 6,true,6);
        VirtualPet test3 = new VirtualPet("test3", 6, 6, 6,true,6);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.admitPet(test1);
        testShelter.admitPet(test2);
        testShelter.admitPet(test3);
        testShelter.feedAllPets();
        assertTrue(test1.getHunger()<6);
        assertTrue(test2.getHunger()<6);
        assertTrue(test3.getHunger()<6);
    }

    @Test
    public void shouldLowerHungerLevelForSpecifiedPet() {
        VirtualPet underTest1 = new VirtualPet("underTest1", 6, 6, 6,true,6);
        VirtualPet underTest2 = new VirtualPet("underTest2", 6, 6, 6,true,6);
        VirtualPet underTest3 = new VirtualPet("underTest3", 6, 6, 6,true,6);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.admitPet(underTest1);
        testShelter.admitPet(underTest2);
        testShelter.admitPet(underTest3);
        testShelter.feedSpecificPet("undertest2");
        assertTrue(underTest2.getHunger() < 6);
        assertTrue(underTest1.getHunger()==6);
    }

    @Test
    public void shouldLowerThirstLevelForAllPets() {
        VirtualPet underTest1 = new VirtualPet("underTest1", 6, 6, 6,true,6);
        VirtualPet underTest2 = new VirtualPet("underTest2", 6, 6, 6,true,6);
        VirtualPet underTest3 = new VirtualPet("underTest3", 6, 6, 6,true,6);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.admitPet(underTest1);
        testShelter.admitPet(underTest2);
        testShelter.admitPet(underTest3);
        testShelter.waterAllPets();
        assertTrue(underTest1.getThirst()<6);
        assertTrue(underTest2.getThirst()<6);
        assertTrue(underTest3.getThirst()<6);
    }

    @Test
    public void shouldLoweThirstLevelForSpecifiedPet() {
        VirtualPet underTest1 = new VirtualPet("underTest1", 6, 6, 6,true,6);
        VirtualPet underTest2 = new VirtualPet("underTest2", 6, 6, 6,true,6);
        VirtualPet underTest3 = new VirtualPet("underTest3", 6, 6, 6,true,6);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.admitPet(underTest1);
        testShelter.admitPet(underTest2);
        testShelter.admitPet(underTest3);
        testShelter.waterSpecificPet("undertest1");
        assertTrue(underTest1.getThirst() < 6);
        assertTrue(underTest2.getThirst()==6);
    }

    @Test
    public void shouldLowerFatigueLevelForAllPets() {
        VirtualPet underTest1 = new VirtualPet("underTest1", 6, 6, 6,true,6);
        VirtualPet underTest2 = new VirtualPet("underTest2", 6, 6, 6,true,6);
        VirtualPet underTest3 = new VirtualPet("underTest3", 6, 6, 6,true,6);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.admitPet(underTest1);
        testShelter.admitPet(underTest2);
        testShelter.admitPet(underTest3);
        testShelter.sleepAllPets();
        assertTrue(underTest1.getFatigue()<6);
        assertTrue(underTest2.getFatigue()<6);
        assertTrue(underTest3.getFatigue()<6);
    }

    @Test
    public void shouldLowerFatigueLevelForSpecifiedPet() {
        VirtualPet underTest1 = new VirtualPet("underTest1", 6, 6, 6,true,6);
        VirtualPet underTest2 = new VirtualPet("underTest2", 6, 6, 6,true,6);
        VirtualPet underTest3 = new VirtualPet("underTest3", 6, 6, 6,true,6);
        VirtualPetShelter testShelter = new VirtualPetShelter();
        testShelter.admitPet(underTest1);
        testShelter.admitPet(underTest2);
        testShelter.admitPet(underTest3);
        testShelter.sleepSpecificPet("undertest1");
        assertTrue(underTest1.getFatigue() < 6);
        assertTrue(underTest2.getFatigue()==6);
    }

    @Test
    public void shouldRaiseHungerThirstFatigueLevelsOfAllPets() {
        VirtualPet test1 = new VirtualPet("test1", 6, 6, 6,true,6);
        VirtualPet test2 = new VirtualPet("test2", 6, 6, 6,true,6);
        VirtualPet test3 = new VirtualPet("test3", 6, 6, 6,true,6);
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitMultiplePets(new VirtualPet[]{test1, test2, test3});
        underTest.tickAllPets();
        assertTrue(test1.getFatigue() > 6);
        assertTrue(test2.getFatigue() > 6);
        assertTrue(test3.getFatigue() > 6);
        assertTrue(test1.getHunger() > 6);
        assertTrue(test2.getHunger() > 6);
        assertTrue(test3.getHunger() > 6);
        assertTrue(test1.getThirst() > 6);
        assertTrue(test2.getThirst() > 6);
        assertTrue(test3.getThirst() > 6);
        assertTrue(test1.getBoredom() == 6);
        assertTrue(test2.getBoredom() == 6);
        assertTrue(test3.getBoredom() == 6);
    }

    @Test
    public void shouldReturnStringOfNames() {
        VirtualPet test1 = new VirtualPet("test1", 6, 6, 6,true,6);
        VirtualPet test2 = new VirtualPet("test2", 6, 6, 6,true,6);
        VirtualPet test3 = new VirtualPet("test3", 6, 6, 6,true,6);
        VirtualPetShelter underTest = new VirtualPetShelter();
        underTest.admitMultiplePets(new VirtualPet[]{test1, test2, test3});
        assertEquals("test1 test2 test3",underTest.getAllNames());
    }

}
