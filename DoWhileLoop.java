package com.homework2;

public class DoWhileLoop {

    public static void main(String[] args) {


        int o = 1;// to print 10 odd number
        do {
            if ((o % 2 != 0)) {

                System.out.println(o);

            }
        } while ((o++) < 20);

        int e = 1; // to print 10 even number

        do{
            if (e % 2 == 0){
                System.out.println(e);

            }
        } while ((e++) < 20);
        }
    }
