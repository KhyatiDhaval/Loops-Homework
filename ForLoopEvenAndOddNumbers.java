package com.homework2;

public class ForLoopEvenAndOddNumbers {
    public static void main(String[] args) {

        for (int e = 1; e <= 20; e++) {// to print 10 even numbers

            if (e % 2 == 0) {

                System.out.println(e);
            }
        }


        for (int o = 1; o <= 20; o++) { // to print 10 odd numbers

            if (o % 2 == 1) {
                System.out.println(o);
            }
            }
        }
    }