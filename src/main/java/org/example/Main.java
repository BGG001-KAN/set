package org.example;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {

       HashSet<Integer> ste = new HashSet<>();
       ste.add(5);
       ste.add(25);
       ste.add(35);
       ste.add(15);
       for(int i=0;i<10;i++){
           ste.add(i);
       }
     System.out.println(ste);
     System.out.println(ste.contains(5));
     System.out.println(ste.isEmpty());

        LinkedHashSet<Integer> stte = new LinkedHashSet<>();
        stte.add(5);
        stte.add(88);
        stte.add(25);
        stte.add(35);
        stte.add(15);
        for(int i=0;i<10;i++){
            stte.add(i);
        }
        System.out.println(stte);
        System.out.println(stte.contains(5));
        System.out.println(stte.isEmpty());
       stte.addAll(ste);
       System.out.println(stte);
        System.out.println("************************************* tree*********************");
        TreeSet<Integer> se = new TreeSet<>();
        se.add(5);
        se.add(88);
        se.add(25);
        se.add(35);
        se.add(15);
     //   for(int i=0;i<10;i++){
         //   se.add(i);
       // }
        System.out.println(se);
        System.out.println(se.contains(5));
        System.out.println(se.isEmpty());
        //stte.addAll(stte);
        System.out.println(se);
    }
}