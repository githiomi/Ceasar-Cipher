
import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class CeasarCipherTest {

    @Test
    public void encodeCaesarCipher_acceptKeyFromUser_int() {
        CaesarCipher caesarCipherKey = new CaesarCipher();
        assertEquals(5, caesarCipherKey.getKey(5));
    }

    @Test
    public void encodeCaesarCipher_acceptStringInput_string() {
        CaesarCipher caesarCipherInput = new CaesarCipher();
        assertEquals("Daniel is very cool", caesarCipherInput.inputToEncode("Daniel is very cool"));
    }

}