package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FractionTest {

    @Test
    void TestGetNumerator(){
        assertEquals(1, new Fraction().getNumerator());
    }

    @Test
    void TestSetNumerator(){
        Fraction fraction = new Fraction();
        fraction.setNumerator(2);
        assertEquals(2, fraction.getNumerator());
    }

    @Test
    void TestGetDenominator(){
        assertEquals(1, new Fraction().getDenominator());
    }

    @Test
    void TestSetDenominator(){
        Fraction fraction = new Fraction();
        fraction.setDenominator(2);
        assertEquals(2, fraction.getDenominator());
    }

    @Test
    void TestDecimal(){
        assertEquals(0.5, new Fraction(2,4).decimal());
    }

    @Test
    void TestToString(){
        assertEquals("Fraction{" +
                "numerator=" + 2 +
                ", denominator=" + 4 +
                '}', new Fraction(2,4).toString());
    }
}
