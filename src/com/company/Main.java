package com.company;

//import static sun.util.locale.LocaleUtils.isNumeric;

public class Main {

    public static void main(String[] args) {
	// write your code here
       System.out.println( convertBinary(10));
    }


    public static String convertBinary(int value) {
        String binary="";
        if (validateNumber(value)) {
            for (int i = value; i > 0; i = i / 2) {
                binary = i % 2 + binary;
                System.out.println(i + "-" + i % 2 + "-" + binary + "-" + binary.length());
            }
        }
        if (binary.length() < 8) {
            for (int j=0; j < (8 - binary.length()); j++){
                binary = "0"+binary;
                System.out.println(j+"-" + binary + "-"+binary.length());
            }
        }
        return binary;
    }

    public static boolean validateNumber(int number) {
        boolean flag = true;
        if ((number < 0) && (number > 255) ) {
                flag = false;
            }
       return flag;
    }
}
