package math;

import java.util.HashMap;
import java.util.Map;

public class IntegerToRoman {

    public static void main(String[] args) {
        IntegerToRoman integerToRoman = new IntegerToRoman();
        System.out.println(integerToRoman.intToRoman(3));
        System.out.println(integerToRoman.intToRoman(4));
        System.out.println(integerToRoman.intToRoman(9));
        System.out.println(integerToRoman.intToRoman(58));
        System.out.println(integerToRoman.intToRoman(1994));
    }

    public String intToRoman(int num) {
        Map<Integer, String> integerToRomanMap = new HashMap<>();
        integerToRomanMap.put(1, "I");
        integerToRomanMap.put(4, "IV");
        integerToRomanMap.put(5, "V");
        integerToRomanMap.put(9, "IX");
        integerToRomanMap.put(10, "X");
        integerToRomanMap.put(40, "XL");
        integerToRomanMap.put(50, "L");
        integerToRomanMap.put(90, "XC");
        integerToRomanMap.put(100, "C");
        integerToRomanMap.put(400, "CD");
        integerToRomanMap.put(500, "D");
        integerToRomanMap.put(900, "CM");
        integerToRomanMap.put(1000, "M");

        StringBuilder builder = new StringBuilder();
        int x = num;
        while (x > 0) {
            if (x >= 1000) {
                int q = x / 1000;
                for (int i = 0; i < q; i++) {
                    builder.append(integerToRomanMap.get(1000));
                }
                x = x % 1000;
            } else if (x >= 900) {
                int q = x / 900;
                for (int i = 0; i < q; i++) {
                    builder.append(integerToRomanMap.get(900));
                }
                x = x % 900;
            } else if (x >= 500) {
                int q = x / 500;
                for (int i = 0; i < q; i++) {
                    builder.append(integerToRomanMap.get(500));
                }
                x = x % 500;
            } else if (x >= 400) {
                int q = x / 400;
                for (int i = 0; i < q; i++) {
                    builder.append(integerToRomanMap.get(400));
                }
                x = x % 400;
            } else if (x >= 100) {
                int q = x / 100;
                for (int i = 0; i < q; i++) {
                    builder.append(integerToRomanMap.get(100));
                }
                x = x % 100;
            } else if (x >= 90) {
                int q = x / 90;
                for (int i = 0; i < q; i++) {
                    builder.append(integerToRomanMap.get(90));
                }
                x = x % 90;
            } else if (x >= 50) {
                int q = x / 50;
                for (int i = 0; i < q; i++) {
                    builder.append(integerToRomanMap.get(50));
                }
                x = x % 50;
            } else if (x >= 40) {
                int q = x / 40;
                for (int i = 0; i < q; i++) {
                    builder.append(integerToRomanMap.get(40));
                }
                x = x % 40;
            } else if (x >= 10) {
                int q = x / 10;
                for (int i = 0; i < q; i++) {
                    builder.append(integerToRomanMap.get(10));
                }
                x = x % 10;
            } else if (x >= 9) {
                int q = x / 9;
                for (int i = 0; i < q; i++) {
                    builder.append(integerToRomanMap.get(9));
                }
                x = x % 9;
            } else if (x >= 5) {
                int q = x / 5;
                for (int i = 0; i < q; i++) {
                    builder.append(integerToRomanMap.get(5));
                }
                x = x % 5;
            } else if (x >= 4) {
                int q = x / 4;
                for (int i = 0; i < q; i++) {
                    builder.append(integerToRomanMap.get(4));
                }
                x = x % 4;
            } else if (x >= 1) {
                int q = x;
                for (int i = 0; i < q; i++) {
                    builder.append(integerToRomanMap.get(1));
                }
                x = 0;
            }
        }
        return builder.toString();
    }
}
