package es.upm.miw.iwvg_devops.code;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchesTest {

    @Test
    void testFindUserFamilyNameByUserNameDistinct() {
        assertEquals(List.of("Torres"), new Searches().findUserFamilyNameByUserNameDistinct("Paula")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserFractionNumeratorByFamilyName() {
        assertEquals(List.of(2, 4, 0, 1, 1), new Searches().findFractionNumeratorByUserFamilyName("Torres")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFamilyNameByFractionDenominator() {
        assertEquals(List.of("López", "Torres"), new Searches().findUserFamilyNameByFractionDenominator(2)
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserFamilyNameInitialByAnyProperFraction(){
        assertEquals(List.of("F", "B", "L", "B"), new Searches().findUserFamilyNameInitialByAnyProperFraction()
                .collect(Collectors.toList()));
    }
    @Test
    void testFindUserIdByAnyProperFraction() {
        assertEquals(List.of("1", "2", "3", "5"), new Searches().findUserIdByAnyProperFraction()
                .collect(Collectors.toList()));
    }

    @Test
    void testFindUserNameByAnyImproperFraction(){
        assertEquals(List.of("Oscar", "Ana", "Oscar", "Antonio", "Paula"), new Searches().findUserNameByAnyImproperFraction()
                .collect(Collectors.toList()));
    }

    void testFindUserFamilyNameByAllSignFractionDistinct() {
    }

    @Test
    void testFindDecimalFractionByUserName() {
        assertEquals(List.of(2.0, -0.2, 0.5, 1.3333333333333333), new Searches().findDecimalFractionByUserName("Ana")
                .collect(Collectors.toList()));
    }

    @Test
    void testFindFirstDecimalFractionByUserName(){
        Double fraction = new Searches().findFirstDecimalFractionByUserName("Paula");
        assertEquals(1.0,fraction);
    }

    void testFindDecimalFractionBySignFraction() {
    }

    void testFindFractionAdditionByUserId() {
    }

    void testFindFractionSubtractionByUserName() {
    }

    void testFindFractionMultiplicationByUserFamilyName() {
    }
}
