package services;

import models.Sneaker;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SneakerServiceTest {
    @Test
    public void createTest(){

        // (1)
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennis";
        int expectedSize = 10;
        int expectedQty = 10;
        float expectedPrice = 80.00f;

        // (2)
        SneakerService sneakerService = new SneakerService();
        Sneaker testSneaker = sneakerService.create(expectedName, expectedBrand,
                expectedSport, expectedSize, expectedQty, expectedPrice);

        // (3)
        Integer actualId = testSneaker.getId();
        String actualName = testSneaker.getName();
        String actualBrand = testSneaker.getBrand();
        String actualSport = testSneaker.getSport();
        int actualSize = testSneaker.getSize();
        Integer actualQty = testSneaker.getQty();
        Float actualPrice = testSneaker.getPrice();

        // (4)
        Assertions.assertEquals(Integer.class.getName(), new Integer(actualId).getClass().getName());
        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSport, actualSport);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);

    }
    @Test
    public void findSneakerTest() {
        SneakerService sneakerService = new SneakerService();
        for (int i = 0; i < 5; i++) {
            sneakerService.create("name"+i, "brand"+i, "sport"+i, 10, 34, 88.99f);
        }
        Sneaker actual = sneakerService.findSneaker(2);
        Sneaker expected = new Sneaker(2, "name1", "brand1", "sport1", 10, 34, 88.99f);
        Assertions.assertEquals(expected.getName(), actual.getName());
        Assertions.assertEquals(expected.getBrand(), actual.getBrand());
        Assertions.assertEquals(expected.getQty(), actual.getQty());
        Assertions.assertEquals(expected.getPrice(), actual.getPrice());
    }
    


    @Test
    public void deleteTest() {
        Sneaker[] expected = new Sneaker[6];
        SneakerService sneakerService = new SneakerService();
        for (int i = 0; i < 5; i++) {
            expected[i] = sneakerService.create("Zoom360"+i, "Nike"+i, "Running"+i, 10, 34, 88.99f);
        }
        Boolean actual = sneakerService.delete(4);
        Assertions.assertTrue(actual);
    }


}