
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
        assertEquals( "Daniel is very cool", caesarCipherInput.inputToEncode("Daniel is very cool"));
    }

    @Test
    public void encodeCaesarCipher_checksOnlyString_true() {
        CaesarCipher caesarCipherString = new CaesarCipher();
        assertEquals(true, caesarCipherString.checkString("Daniel is 2 busy!"));
    }

    @Test
    public void encodeCaesarCipher_convertToLowercase_string() {
        CaesarCipher caesarCipherLowercase = new CaesarCipher();
        assertEquals("daniel", caesarCipherLowercase.toLowercase("Daniel"));
    }

//    @Test
//    public void encodeCaesarCipher_encodeWithKey1_string() {
//        CaesarCipher caesarCipherEncode1 = new CaesarCipher();
//        assertEquals("ebojfm", caesarCipherEncode1.encodeToOne("daniel"));
//    }

}