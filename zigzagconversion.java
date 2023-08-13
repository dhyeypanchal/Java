public class zigzagconversion {
    public static String convert(String s, int numRows) {
        String newstr = "";
        for (int i = 0; i < numRows; i++) {
            newstr = newstr + s.charAt(i);
            int n = (numRows - 1) * 2 + i;
            // System.out.println(n);
            while (s.length() > n) {
                newstr = newstr + s.charAt(n);
                n = n + (numRows - 1) * 2;
            }
            numRows = numRows - 1;
        }
        numRows = 3;
        newstr = newstr + s.charAt(numRows - 1);
        int n = (numRows - 1) * 2 + numRows - 1;
        while (s.length() > n) {
            newstr = newstr + s.charAt(n);
            // System.out.println(s.charAt(4));
            n = n + (numRows - 1) * 2;
        }
        return newstr;
    }

    public static String ZigzagConversion(String s, int numRows) {
        if (numRows <= 1 || s.length() <= numRows) {
            return s;
        }

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) {
            rows[i] = new StringBuilder();
        }

        int currentRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows[currentRow].append(c);

            if (currentRow == 0 || currentRow == numRows - 1) {
                goingDown = !goingDown;
            }

            currentRow += goingDown ? 1 : -1;
        }

        StringBuilder result = new StringBuilder();
        for (StringBuilder row : rows) {
            result.append(row);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "PAYPALISHIRING";
        int numRows = 3;
        // System.out.println(convert(s, numRows));
        System.out.println(ZigzagConversion(s, numRows));
    }
}
