package com.company;
import java.io.*;
public class Main {

    public static void main(String[] args) {
/*
Сумма цифр трехзначного числа
*/ System.out.println(sumDigitsInNumber(1998));


        }
    public static int sumDigitsInNumber(int number) {

        int firstnumber = number/1000;
        int secondnumber = number%1000/100;
        int thirdnumber = number%100/10;
        int pnumb = number%10;
        return firstnumber + secondnumber + thirdnumber + pnumb;
        /*return   number/100 +(number - (number/100*100))/10 + number - (number/100*100)
                - (number - (number/100*100))/10*10; */
    }
}

