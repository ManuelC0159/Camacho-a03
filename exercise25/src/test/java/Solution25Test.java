
import org.junit.jupiter.api.Test;

import static baseline.Solution25.passwordValidator;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class Solution25Test {

    @Test
    public void test1(){
        assertEquals(0,passwordValidator("12345"));
    }
    @Test
    public void test2(){
        assertEquals(1, passwordValidator("abcdef"));
    }
    @Test
    public void test3(){
        assertEquals(2, passwordValidator("abc123xyz"));
    }
    @Test
    public void test4() {
        assertEquals(3, passwordValidator("1337h@xor!"));
    }
}
