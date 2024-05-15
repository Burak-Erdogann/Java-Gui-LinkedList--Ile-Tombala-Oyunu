package com.mycompany.burak_erdogan_proje;

import java.util.Random;

public class Liste_islemleri {

    Node head = null;
    Node tail = null;

    public Node arrayi_linked_list_cevirme(int[][] m) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {

                if (m[i][j] != -1) {
                    Node eleman = new Node(m[i][j]);

                    if (head == null) {
                        head = eleman;
                        tail = eleman;
                    } else {
                        tail.next = eleman;
                        eleman.prev = tail;
                        tail = eleman;
                    }

                }

            }
        }
        return head;
    }

    public Node down_baglama(Node n) {
        Node bas = n;
        Node tmp = n;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {

                tmp = tmp.next;

            }

            bas.down = tmp;
            bas = tmp;

        }
        return n;
    }

    public void linkyaz(Node n) {
        Node bas = n;
        Node tmp = n;

        System.out.println("Matrixe Göre Olusturulmus Linked List");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tmp.sayi + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
            bas = bas.down;
            tmp = bas;

        }
        System.out.println("");
    }

    public int[][] matrix_olusturma() {
        int[][] sayilar = new int[3][9];
        Random random = new Random();

        for (int i = 0; i < 3; i++) {
            int boslukSayisi = 0;
            while (boslukSayisi < 4) {
                int randomSutun = random.nextInt(9);
                if (sayilar[i][randomSutun] != -1) {
                    sayilar[i][randomSutun] = -1;
                    boslukSayisi++;
                }
            }

            for (int j = 0; j < 9; j++) {
                if (sayilar[i][j] != -1) {
                    int randomsayim = j * 10 + random.nextInt(9);

                    for (int k = 0; k < 3; k++) {

                        if (sayilar[k][j] == randomsayim) {
                            randomsayim++;
                        }
                    }

                    sayilar[i][j] = randomsayim;
                }
            }
        }

        return sayilar;

    }

    public void matrixiyaz(int[][] a) {
        System.out.println("Rastgele Olusturulan Matrix :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public int satirikontrol(Node n, int sayi) {
        int listedeki_satir = 0;
        Node head = n;
        Node temp = n;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                if (temp.sayi == sayi) {
                    return listedeki_satir;
                } else {
                    temp = temp.next;
                }
            }
            head = head.down;
            temp = head;
            listedeki_satir++;

        }
        return -1;
    }
}
