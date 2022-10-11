package com.tools.test.utils;

import org.springframework.stereotype.Component;

import java.util.Random;

public class RandomNomber {
    public static String getRandomNickname(int length) {
        String val = "";
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            val += String.valueOf(random.nextInt(10));
        }
        return val;
    }
}
