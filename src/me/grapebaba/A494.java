package me.grapebaba;

import java.util.*;


public class A494 {
    //Not pass TLE
    public int findTargetSumWays(int[] nums, int S) {
        int count = 0;
        if (nums.length == 0) {
            return count;
        }

        if (nums.length == 1) {
            return +nums[0] == S || -nums[0] == S ? 1 : 0;
        }

        Queue<int[]> results = new LinkedList<>();
        results.add(new int[]{+nums[0], 0});
        results.add(new int[]{-nums[0], 0});

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];
            while (!results.isEmpty()) {
                int[] val = results.peek();
                if (val[1] < i) {
                    results.poll();
                    if (i == nums.length - 1) {
                        if ((val[0] + current) == S) {
                            count++;
                        }
                        if ((val[0] - current) == S) {
                            count++;
                        }
                    } else {
                        results.add(new int[]{val[0] + current, i});
                        results.add(new int[]{val[0] - current, i});
                    }
                } else {
                    break;
                }

            }
        }

        return count;
    }
}
