package com.itfactory;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Map <Integer, Fructe> cosFructe = new HashMap<>();
        cosFructe.put(1,Fructe.FRUCT1);
        cosFructe.put(2,Fructe.FRUCT2);
        cosFructe.put(3, Fructe.FRUCT3);
        cosFructe.put(4,Fructe.FRUCT4);
        cosFructe.put(5,Fructe.FRUCT5);
        cosFructe.put(6, Fructe.FRUCT6);
        cosFructe.put(7,Fructe.FRUCT7);
        cosFructe.put(8,Fructe.FRUCT8);
        cosFructe.put(9, Fructe.FRUCT9);
        cosFructe.put(10, Fructe.FRUCT10);

        Random random = new Random();
        int randomInt = random.nextInt(10);

        System.out.println("Numarul extras este: "+randomInt+" iar fructul aferent numarului extras este: "+cosFructe.get(randomInt));
    }
}
