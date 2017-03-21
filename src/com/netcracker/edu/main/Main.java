package com.netcracker.edu.main;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello world");
        String[] ger={"Hello","Car","Petter","j","b","horse","m","house","w","k","dorian","e"};
        print(args);
        sort(ger);
        for(String r:ger){
            System.out.println(r);
        }
    }

    /**
     *This method use for print String mass.
     */

    public static void print(String [] args){
        for(String r:args){
            System.out.println(r);
        }
    }

    /**
     *This method use for sort String mass.
     */

    public static void sort(String [] args){

        for (int i=0; i<args.length; i++) {

            for (int j=i+1; j<args.length; j++) {

                if (args[i].compareTo(args[j]) > 0) {

                    String temp = args[j];
                    args[j] = args[i];
                    args[i] = temp;

                }
            }
        }
    }
}
