package com.example.spring6_webApp.dirtiesExercises;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;

@TestPropertySource(properties = {"evenNumber=2"})
@SpringBootTest
class OddNumberTest {
    @Autowired
    private OddNumber oddNumber;

    @DirtiesContext
    @Test
    void settingNumberWithEvenNumberMakesTheOddNumberObjectInvalidTest(@Value("${evenNumber}") int evenNumber) {
        oddNumber.setNumber(evenNumber);
        assertFalse(oddNumber.isValid());
    }

    @Test
    void getNumberInitiallyReturns1Test() {
        assertEquals(1, oddNumber.getNumber());
    }

    @DirtiesContext
    @Test
    void getNumberThrowsIllegalStateExceptionIfTheOddNumberObjectIsInvalidTest(@Value("${evenNumber}") int evenNumber) {
        oddNumber.setNumber(evenNumber);

        assertFalse(oddNumber.isValid());
        assertThrows(IllegalStateException.class, () -> oddNumber.getNumber());
    }
}