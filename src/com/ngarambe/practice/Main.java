package com.ngarambe.practice;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
	int sum =addTwoNumbers(10,20);

        System.out.println("The addition of x and y = " + sum);
   }

    public static int addTwoNumbers(int x,int y){
        return x+y;
    }
}
