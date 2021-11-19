package com.company;
import java.util.Random;

class Tablica{

    int[] tab = new int[10];

        void fill(){
            Random r = new Random();
            for(int i=0;i<tab.length;i++) {
                tab[i] = r.nextInt(10);
            }
    }
        void show(){
            for (int num:tab){
                System.out.println(num);
            }
        }
}

public class Main {

    public static void main(String[] args) {
	// write your code here
    Tablica tablica = new Tablica();
    tablica.fill();
    tablica.show();
    }
}
