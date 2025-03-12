package co.com.screenplay.cucumberproject.utils;

import java.util.Random;

public class RandomNumber {

    public static int randomNumberSearch(int number){
        Random random = new Random();
        return random.nextInt(number);
    }
}
