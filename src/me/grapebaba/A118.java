package me.grapebaba;


import java.util.ArrayList;
import java.util.List;

public class A118 {
    //取上一行的值生成下一行的值
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> rows = new ArrayList<>(numRows);
        for (int i = 1; i <= numRows; i++) {
            List<Integer> row = new ArrayList<>(i);
            row.add(1);
            if (!rows.isEmpty()) {
                List<Integer> previousRow = rows.get(i - 2);
                if (previousRow.size() > 1) {
                    for (int j = 0, length = previousRow.size(); j < length - 1; j++) {
                        int value = previousRow.get(j) + previousRow.get(j + 1);
                        row.add(value);
                    }
                }
                row.add(1);
            }
            rows.add(row);
        }

        return rows;
    }
}

