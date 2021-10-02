import org.junit.jupiter.api.Test;

import static baseline.Solution27.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Solution27Test {
    @Test
    public void test1(){
        assertEquals("", validateName("John"));
        assertEquals("", validateName("James"));
        assertEquals("", validateName("Steven"));
        assertEquals("", validateName("Yoel"));
    }

    @Test
    public void test2(){
        assertEquals("",validateLastName("Calvente"));
        assertEquals("",validateLastName("Camacho"));
        assertEquals("",validateLastName("Alvarez"));
        assertEquals("",validateLastName("Diaz"));
    }

    @Test
    public void test3(){
        assertEquals("The zipcode must be a 5 digit number.\n", validateZip(""));
    }
    @Test
    public void test4(){
        assertEquals("", validateID("TK-1234"));
    }

}
