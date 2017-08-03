package me.grapebaba;

/**
 * Created by grapebaba on 8/3/17.
 */
public class A7 {
    public int reverse(int x) {
        long res = 0L;
        while (x != 0) {
            res = res * 10 + x % 10;
            x = x / 10;
            if (res > Integer.MAX_VALUE || res < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) res;
    }

    public static void main(String[] args)throws Exception{
        A7 a7=new A7();
        System.out.printf(a7.reverse(-453)+"");
    }
}
