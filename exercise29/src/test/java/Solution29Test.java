import org.junit.jupiter.api.Test;

import static baseline.Solution29.findYears;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution29Test {

    @Test
    public void test1(){
        assertEquals(18, findYears(String.valueOf(4)));
        assertEquals(1, findYears(String.valueOf(72)));
        assertEquals(72, findYears(String.valueOf(1)));
    }
}
