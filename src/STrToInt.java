public class STrToInt {
    public int myAtoi(String str) {
        str = str.trim();
        if (str.isEmpty()) return 0;

        int index = 0;
        boolean isNegative = false;

        // Check for sign
        char firstChar = str.charAt(index);
        if (firstChar == '-' || firstChar == '+') {
            isNegative = firstChar == '-';
            index++;
        }

        int result = 0;
        while (index < str.length()) {
            char c = str.charAt(index);

            // Break on any non-digit character
            if (c < '0' || c > '9') break;

            int digit = c - '0';

            // Check for overflow
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
            }

            result = result * 10 + digit;
            index++;
        }

        return isNegative ? -result : result;
    }

    public static void main(String[] args) {
        STrToInt st = new STrToInt();
        System.out.println(st.myAtoi("-24w26"));
        System.out.println(st.myAtoi("+24w26"));
        System.out.println(st.myAtoi("+234567898765u8"));
        System.out.println(st.myAtoi("0-1"));
        System.out.println(st.myAtoi("+-12"));
    }
}