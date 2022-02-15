import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class ZwembadTest {
    @Test
    void testBerekendeInhoud() {
        Zwembad z = new Zwembad (2.0, 5.5, 1.5);

        assertEquals(16.5, z.inhoud());
    }

}