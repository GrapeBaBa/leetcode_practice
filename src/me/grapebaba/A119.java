package me.grapebaba;

import java.util.ArrayList;
import java.util.List;

public class A119 {
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            row.add(0, 1);
            for (int j = 1, length = row.size(); j < length - 1; j++) {
                int value = row.get(j) + row.get(j + 1);
                row.set(j, value);
            }

        }

        return row;
    }

    public static void main(String[] args) throws Exception {
        for (int val : A119.getRow(4)) {
            System.out.printf(String.valueOf(val));
        }
    }
}
