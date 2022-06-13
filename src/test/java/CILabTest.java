import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CILabTest {

    private CILabInterface myString;

    @BeforeEach
    public void setUp() {
        myString = new CILab();
    }

    @AfterEach
    public void tearDown() {
        myString = null;
    }

    @Test
    // Check that method returns true when All letters in this word are capitals, like "USA".
    public void detectCapitalUseTest1() {
       myString.setString("USA");
       assertTrue(myString.detectCapitalUse());
    }

    // Check that method returns true when All letters in this word are not capitals, like "leetcode".
    @Test
    public void detectCapitalUseTest2() {
        myString.setString("leetcode");
        assertTrue(myString.detectCapitalUse());
    }

    // Check that method returns true when Only the first letter in this word is capital, like "Google".
    @Test
    public void detectCapitalUseTest3() {
        myString.setString("Google");
        assertTrue(myString.detectCapitalUse());
    }

    // Check that method returns false when an all-lowercased string has an internal capitalized letter
    @Test
    public void detectCapitalUseTest4() {
        myString.setString("leeTcode");
        assertFalse(myString.detectCapitalUse());
    }

    // Check that method returns false when the all-capitalized string has an internal uncapitalized letter
    @Test
    public void detectCapitalUseTest5() {
        myString.setString("UsA");
        assertFalse(myString.detectCapitalUse());
    }

    // Check that method returns true when string is empty
    @Test
    public void detectCapitalUseTest6() {
        myString.setString("");
        assertTrue(myString.detectCapitalUse());
    }
}
