package ohtu;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MultiplierTest {

    @Test
    public void kertominenToimii() {
        Multiplier viisi = new Multiplier(5);
        assertEquals(5, viisi.multipliedBy(1));
        assertEquals(35, viisi.multipliedBy(7));
    }
}
