package com.KataAcademy;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Calculator1 extends RomanArabicConverter{

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите пример");
        String s1 = scan.nextLine();
        String repPlus = s1.trim().replaceAll("\\+", " + ");
        String repMinus = repPlus.replaceAll("\\-", " - ");
        String repMultiplication = repMinus.replaceAll("\\*", " * ");
        String repDivision = repMultiplication.replaceAll("\\/", " / ");
        String killSpace1 = repDivision.replaceAll("( )+", " ");
        String[] s2 = killSpace1.split(" ");
        if ((Objects.equals(s2[2], "1") | Objects.equals(s2[2], "2") | Objects.equals(s2[2], "3") |
             Objects.equals(s2[2], "4") | Objects.equals(s2[2], "5") | Objects.equals(s2[2], "6") |
             Objects.equals(s2[2], "7") | Objects.equals(s2[2], "8") | Objects.equals(s2[2], "9") |
             Objects.equals(s2[2], "10"))
                &
             (Objects.equals(s2[0], "I") | Objects.equals(s2[0], "II") | Objects.equals(s2[0], "III") |
             Objects.equals(s2[0], "IV") | Objects.equals(s2[0], "V") | Objects.equals(s2[0], "VI") |
             Objects.equals(s2[0], "VII") | Objects.equals(s2[0], "VIII") | Objects.equals(s2[0], "IX") |
             Objects.equals(s2[0], "X"))) {
            throw new Exception("Вы ввели неверный пример");
        } // (Objects.equals(s2[0], "I") || Objects.equals(s2[0], "II"))

        int lenght = s2.length;
        if (lenght != 3){   //if (lenght > 3 | lenght < 3){
            throw new Exception("Вы ввели неверный пример");
        }
        if (!Objects.equals(s2[0], "I")) {
        } else {
        }
        int num1;  // != НЕ, то есть надо != "римская цифра" выдавать исключение
        if(Objects.equals(s2[0], "I")){
            num1 = 1;
        } else if (Objects.equals(s2[0], "II")){
            num1 = 2;
        } else if (Objects.equals(s2[0], "III")) {
            num1 = 3;
        } else if (Objects.equals(s2[0], "IV")) {
            num1 = 4;
        } else if (Objects.equals(s2[0], "V")) {
            num1 = 5;
        }  else if (Objects.equals(s2[0], "VI")){
            num1 = 6;
        } else if (Objects.equals(s2[0], "VII")){
            num1 = 7;
        } else if (Objects.equals(s2[0], "VIII")) {
            num1 = 8;
        } else if (Objects.equals(s2[0], "IX")) {
            num1 = 9;
        } else if (Objects.equals(s2[0], "X")) {
            num1 = 10;
        } else if (Objects.equals(s2[0], "4") || Objects.equals(s2[0], "5") || Objects.equals(s2[0], "6")) {
            num1 = Integer.parseInt(s2[0]);
        } else if (Objects.equals(s2[0], "1") || Objects.equals(s2[0], "2") || Objects.equals(s2[0], "3")) {
            num1 = Integer.parseInt(s2[0]);
        } else if (Objects.equals(s2[0], "7") || Objects.equals(s2[0], "8") || Objects.equals(s2[0], "9")) {
            num1 = Integer.parseInt(s2[0]);
        } else if (Objects.equals(s2[0], "10")) {
            num1 = Integer.parseInt(s2[0]);
        } else {
            throw new Exception("Вы ввели неверный пример");
        }
        int num2;
        if(Objects.equals(s2[2], "I")){
            num2 = 1;
        } else if (Objects.equals(s2[2], "II")){
            num2 = 2;
        } else if (Objects.equals(s2[2], "III")) {
            num2 = 3;
        } else if (Objects.equals(s2[2], "IV")) {
            num2 = 4;
        } else if (Objects.equals(s2[2], "V")) {
            num2 = 5;
        }  else if (Objects.equals(s2[2], "VI")){
            num2 = 6;
        } else if (Objects.equals(s2[2], "VII")){
            num2 = 7;
        } else if (Objects.equals(s2[2], "VIII")) {
            num2 = 8;
        } else if (Objects.equals(s2[2], "IX")) {
            num2 = 9;
        } else if (Objects.equals(s2[2], "X")) {
            num2 = 10;
        } else if (Objects.equals(s2[2], "4") || Objects.equals(s2[2], "5") || Objects.equals(s2[2], "6")) {
            num2 = Integer.parseInt(s2[2]);
        } else if (Objects.equals(s2[2], "1") || Objects.equals(s2[2], "2") || Objects.equals(s2[2], "3")) {
            num2 = Integer.parseInt(s2[2]);
        } else if (Objects.equals(s2[2], "7") || Objects.equals(s2[2], "8") || Objects.equals(s2[2], "9")) {
            num2 = Integer.parseInt(s2[2]);
        } else if (Objects.equals(s2[2], "10")) {
            num2 = Integer.parseInt(s2[2]);
        } else {
            throw new Exception("Вы ввели неверный пример");
        }
//        int num2 = Integer.parseInt(s2[2]);
        String oper = s2[1];
        if(num1 > 0 && num1 <11 && num2 > 0 && num2 < 11){
        } else {
            throw new Exception("Вы ввели неверный пример");
        }
        int otv;
        if (Objects.equals(oper, "+")){
            otv = num1 + num2;
        } else if (Objects.equals(oper, "-")){
            otv = num1 - num2;
        } else if (Objects.equals(oper, "*")){
            otv = num1 * num2;
        } else if (Objects.equals(oper, "/")){
            otv = num1 / num2;
        } else{
            throw new Exception("Вы ввели неверный пример");
        }
        String otv1;
        if (Objects.equals(s2[0], "I") | Objects.equals(s2[0], "II") |
                Objects.equals(s2[0], "III") | Objects.equals(s2[0], "IV") |
                Objects.equals(s2[0], "V") | Objects.equals(s2[0], "VI") |
                Objects.equals(s2[0], "VII") | Objects.equals(s2[0], "VIII") |
                Objects.equals(s2[0], "IX") | Objects.equals(s2[0], "X")){
            otv1 = arabicToRoman(otv);
            System.out.println(otv1);
        } else {
            System.out.println(otv);
        }
    }
}
