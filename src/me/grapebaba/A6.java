package me.grapebaba;

/**
 * Created by grapebaba on 7/24/17.
 */
public class A6 {
    // 折线索引方向改变
    public String convert(String s, int numRows) {
        if (numRows <= 1) return s;
        StringBuilder[] sb = new StringBuilder[numRows];
        for (int i = 0; i < sb.length; i++) {
            sb[i] = new StringBuilder("");
        }
        int incre = 1;
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            sb[index].append(s.charAt(i));
            if (index == 0) {
                incre = 1;
            }
            if (index == numRows - 1) {
                incre = -1;
            }
            index += incre;
        }
        StringBuilder re = new StringBuilder();
        for (StringBuilder aSb : sb) {
            re.append(aSb);
        }
        return re.toString();
    }
}
