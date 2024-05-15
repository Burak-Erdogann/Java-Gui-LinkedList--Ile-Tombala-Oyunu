package com.mycompany.burak_erdogan_proje;

public class Node {

    Integer sayi;
    Node next;
    Node prev;
    Node down;

    public Node(int sayi) {
        this.sayi = sayi;
        this.next = null;
        this.prev = null;
        this.down = null;
    }
}
