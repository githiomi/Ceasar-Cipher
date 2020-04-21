
import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class CeasarCipherTest {

    @Test
    public void encodeCaesarCipher_acceptKeyFromUser_int() {
        CaesarCipher caesarCipherKey = new CaesarCipher(5);
        assertEquals(5, caesarCipherKey.getKey(5));
    }

}