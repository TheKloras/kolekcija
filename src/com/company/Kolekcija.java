package com.company;

import java.util.List;
import java.util.Random;

public class Kolekcija {
    public static void kolekcija(List mas){
        Random random = new Random();
        int sk = 1;
        while (sk != 0){
            sk = random.nextInt(100);
            mas.add(new Integer(sk));
        }
        System.out.println("List dydis: " + mas.size());
    }
}
