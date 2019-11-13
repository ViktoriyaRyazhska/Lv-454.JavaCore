package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scc=new Scanner(System.in);
        Persone pr1 = new Persone();
        Persone pr2 = new Persone();
        Persone pr3 = new Persone();
        Persone pr4 = new Persone();
        Persone pr5 = new Persone();
        pr1.input(scc);
        pr2.input(scc);
        pr3.input(scc);
        pr4.input(scc);
        pr5.input(scc);
        pr1.output();
        pr2.output();
        pr3.output();
        pr4.output();
        pr5.output();
    }
}
