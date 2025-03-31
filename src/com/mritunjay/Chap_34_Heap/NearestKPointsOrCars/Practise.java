package com.mritunjay.Chap_34_Heap.NearestKPointsOrCars;

public class Practise {
    public static void main(String[]args){


        int n=8;

                long lp = 0;
                long bin = 0;
                int pow =0;


                while(n!=0){

                    lp = n%2;
                    bin = bin + lp*(long)Math.pow(10,pow);
                    pow++;
                    n=n/2;
                }

            System.out.println(bin);


    }
}
