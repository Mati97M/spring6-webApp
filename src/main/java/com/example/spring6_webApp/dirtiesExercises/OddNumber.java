package com.example.spring6_webApp.dirtiesExercises;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
public class OddNumber {
    @Getter
    private boolean valid = true;
    private int number = 1;

    public void setNumber(int number) {
        this.number = number;
        if (number % 2 == 0) {
            valid = false;
        }
    }

    public int getNumber() {
        if(!valid) {
            throw new IllegalStateException();
        }
        return number;
    }
}
