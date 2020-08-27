package testing;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import testing.collection.OddNumbersExterminator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {
    @Before
    public void beforeTest() {
        System.out.println("Testing started...");
    }

    @After
    public void afterTest() {
        System.out.println("Testing ended.");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //given
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        //when
        exterminator.exterminate(listOfNumbers);
        int result = listOfNumbers.size();
        //then
        Assert.assertEquals(result, 0);

    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //given
        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        Random rg = new Random();
        for (int n = 0; n < 10; n++) {
            listOfNumbers.add(rg.nextInt(30));
        }
        //when
        System.out.println(listOfNumbers);
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        ArrayList<Integer> evenNumbers = exterminator.exterminate(listOfNumbers);
        System.out.println(evenNumbers);
        //then
        Assert.assertEquals(6,evenNumbers.size());

    }
}
