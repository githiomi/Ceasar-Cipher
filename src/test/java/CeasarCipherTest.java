
import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class CeasarCipherTest {

    @Test
    public void encodeCaesarCipher_acceptKeyFromUser_int() {
        CaesarCipher caesarCipherKey = new CaesarCipher("", 5);
        assertEquals(5, caesarCipherKey.getKey(5));
    }

    @Test
    public void encodeCaesarCipher_acceptStringInput_string() {
        CaesarCipher caesarCipherInput = new CaesarCipher("Daniel is very cool" ,0);
        assertEquals( "Daniel is very cool", caesarCipherInput.inputToEncode("Daniel is very cool"));
    }

    @Test
    public void encodeCaesarCipher_checksOnlyString_true() {
        CaesarCipher caesarCipherString = new CaesarCipher("Daniel is busy" , 0);
        assertEquals(true, caesarCipherString.checkString("Daniel is 2 busy!"));
    }

    @Test
    public void encodeCaesarCipher_convertToLowercase_string() {
        CaesarCipher caesarCipherLowercase = new CaesarCipher("Daniel", 0);
        assertEquals("daniel", caesarCipherLowercase.toLowercase("Daniel"));
    }

    @Test
    public void encodeCaesarCipher_encodeWithKey1_string() {
        CaesarCipher caesarCipherEncode1 = new CaesarCipher("daniel", 2);
        assertEquals("fcpkgn", caesarCipherEncode1.encodeToKey("daniel", 2));
    }

    @Test
    public void encodeC

}