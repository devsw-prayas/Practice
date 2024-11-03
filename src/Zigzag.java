
public class Zigzag {
    public String convert(String s, int numRows) {

        if (numRows == 1 || s.length() <= numRows) return s;  // Edge cases
        if (numRows > 1000 || s.length() > 1000) return "";   // Constraints

        StringBuilder res = new StringBuilder();
        int cycleLen = 2 * numRows - 2;
        int numColumns = (int) Math.ceil((double) s.length() / cycleLen) * (numRows - 1);
        char[][] matrix = new char[numRows][numColumns];

        int counter = 0, i = 0, j = 0;
        boolean down = true;

        // Filling the matrix in a zigzag pattern
        while (counter < s.length()) {
            matrix[i][j] = s.charAt(counter++);

            if (down) {
                if (i < numRows - 1) {
                    i++;
                } else {
                    down = false;
                    i--;
                    j++;
                }
            } else {
                if (i > 0) {
                    i--;
                    j++;
                } else {
                    down = true;
                    i++;
                }
            }
        }

        // Building the result string
        for (char[] row : matrix) {
            for (char c : row) {
                if (c != 0) res.append(c);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        Zigzag z = new Zigzag();
        System.out.println(z.convert("PAYPALISHIRING", 4));
    }
}

// PAHNAPLSIIGYIR
// PAHNAPLSIIGYIR