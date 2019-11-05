package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SneakerTest {
    @Test
    public void setNameTest() {
        // given (1)
        String expected = "OZWEEGO";

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getName());
    }

    @Test // (1)
    public void constructorTest(){

        // (2)
        int expectedId = 6;
        String expectedName = "Stan Smith";
        String expectedBrand = "Adidas";
        String expectedSport = "Tennnis";
        int expectedQty = 10;
        int expectedSize = 10;
        float expectedPrice = 80.00f;

        // (3)
        Sneaker testSneaker = new Sneaker(expectedId, expectedName, expectedBrand,
                expectedSport, expectedQty, expectedSize,expectedPrice);

        // (4)
        Assertions.assertEquals(expectedId, testSneaker.getId());
        Assertions.assertEquals(expectedName, testSneaker.getName());
        Assertions.assertEquals(expectedBrand, testSneaker.getBrand());
        Assertions.assertEquals(expectedSport, testSneaker.getSport());
        Assertions.assertEquals(expectedQty, testSneaker.getQty());
        Assertions.assertEquals(expectedQty, testSneaker.getSize());
        Assertions.assertEquals(expectedPrice, testSneaker.getPrice());
    }
    @Test
    public void setBrandTest() {
        // given (1)
        String expected = "Nike";

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setBrand(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }
    @Test
    public void setSportTest() {
        // given (1)
        String expected = "Track & Field";

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSport(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSport());
    }
    @Test
    public void setSizeTest() {
        // given (1)
        int expected = 13;

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSize(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSize());
    }
    @Test
    public void setQtyTest() {
        // given (1)
        int expected = 55;

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setQty(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getQty());
    }

    @Test
    public void setPriceTest() {
        // given (1)
        float expected = 100.0F;

        // when (2)
        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }

}
