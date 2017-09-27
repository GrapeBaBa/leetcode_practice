package me.grapebaba;

/**
 * Created by grapebaba on 9/26/17.
 */
public class A8 {
    public int myAtoi(String str) {
        int index = 0, sign = 1, total = 0;
        while ((index < str.length()) && (str.charAt(index) == ' ')) {
            index++;
        }

        if (index == str.length()) {
            return total * sign;
        }

        if (str.charAt(index) == '+' || str.charAt(index) == '-') {
            sign = str.charAt(index) == '+' ? 1 : -1;
            index++;
        }

        while (index < str.length()) {
            int digit = str.charAt(index) - '0';
            if (digit < 0 || digit > 9) {
                break;
            }

            if (Integer.MAX_VALUE / 10 < total || Integer.MAX_VALUE / 10 == total && Integer.MAX_VALUE % 10 < digit) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            total = total * 10 + digit;
            index++;
        }

        return total * sign;
    }
}