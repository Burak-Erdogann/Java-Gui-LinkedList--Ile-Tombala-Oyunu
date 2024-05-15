
package com.mycompany.burak_erdogan_proje;

import java.util.Random;

public class Torba {

    int[] torba;
    int i = 0;

    public void torbayiyaz(int[] torba) {
        for (int i = 0; i < torba.length; i++) {
            System.out.println(torba[i]);
        }
    }

    public int[] generatePermutation(int a) {
        torba = new int[a];

        for (int i = 0; i < a; i++) {
            torba[i] = i + 1;
        }

        Random rand = new Random();
        for (int i = a - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);

            int temp = torba[i];
            torba[i] = torba[j];
            torba[j] = temp;
        }

        return torba;
    }

    public int torbadan_elemancekcek(int[] torba) {

        if (i == torba.length) {
            return -2;
        } else {
            int sayi = torba[i];
            torba[i] = -1;
            i++;
            return sayi;
        }
    }

    public void torba_sifira(int a) {
        i = 0;
        torba = generatePermutation(a);

    }
}
