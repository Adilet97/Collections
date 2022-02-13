package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        ArrayList<String> boys = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter male name ... ");

        for (int i = 0; i<5; i++){
            String nameBoys = input.nextLine();
            boys.add(nameBoys);
        }
        System.out.println(boys);
        System.out.println("__________");

        ArrayList<String> girls = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter female name ... ");

        for (int i = 0; i<5; i++){
            String nameGirls = in.nextLine();
            girls.add(nameGirls);
        }
        System.out.println(girls);
        System.out.println("__________");

        ArrayList<String> listC = new ArrayList<>();
        listC.addAll(boys);
        listC.addAll(girls);
        System.out.println(listC);

        Collections.sort(listC, Collections.reverseOrder());
        System.out.println(listC);


        }

    }