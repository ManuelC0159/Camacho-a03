import org.junit.jupiter.api.Test;

import static baseline.Solution24.isAnagram;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Solution24Test {



    @Test
    public void test(){
        assertTrue(isAnagram("keep", "peek"));
        assertTrue(isAnagram("word", "drow"));
        assertTrue(isAnagram("pot", "top"));
    }

}
