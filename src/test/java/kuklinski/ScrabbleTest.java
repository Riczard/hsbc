package kuklinski;

import org.junit.Assert;
import org.junit.Test;


public class ScrabbleTest {

    @Test
    public void cabbageWordReturnScore14ExpectedTrue() {
        Scrabble scrabble = new Scrabble("cabbage");
        int expectedScore = 14;
        int result = scrabble.getScore();
        Assert.assertEquals(result, expectedScore);
    }

    @Test
    public void cabbageWordReturnScore10ExpectedFalse() {
        Scrabble scrabble = new Scrabble("cabbage");
        int expectedScore = 10;
        int result = scrabble.getScore();
        Assert.assertNotEquals(expectedScore, result);
    }
}