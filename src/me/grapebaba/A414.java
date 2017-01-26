package me.grapebaba;


import java.util.TreeSet;

public class A414 {
    //因为size是3，nlog(3)
    public int thirdMax(int[] nums) {
        int size = 3;
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums) {
            if (set.size() < size || set.first() < num) {
                set.add(num);
                if (set.size() > size) {
                    set.pollFirst();
                }
            }
        }

        return set.size() < size ? set.last() : set.first();
    }

}
