package kuklinski;

import org.junit.Assert;
import org.junit.Test;



public class BracketCheckerTest {

    @Test
    public void areBracketsMatchedAndNestedCorrectly() {
        BracketChecker bracketChecker = new BracketChecker("[]");
        boolean result = bracketChecker.areBracketsMatchedAndNestedCorrectly();
        Assert.assertTrue(result);
    }

    @Test
    public void areBracketsMatchedAndNestedCorrectly2() {
        BracketChecker bracketChecker = new BracketChecker("[{}]");
        boolean result = bracketChecker.areBracketsMatchedAndNestedCorrectly();
        Assert.assertTrue(result);
    }

    @Test
    public void bracketNestedNotCorretly() {
        BracketChecker bracketChecker = new BracketChecker("{]]]]]]]]]]");
        boolean result = bracketChecker.areBracketsMatchedAndNestedCorrectly();
        Assert.assertFalse(result);
    }
}