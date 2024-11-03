public class IntToRoman {
    public String intToRoman(int num) {
        if(num > 3999 || num < 1) return "";
        StringBuilder roman = new StringBuilder();
        int dup = num, value = 1;
        while(dup > 0){
            int digit = dup % 10;
                switch(value){
                    case 1 ->{
                        String[] units = {"" ,"I", "II", "III", "VI", "V", "VI", "IIV", "IIIV", "XI"};
                        roman.append(units[digit]);
                    }
                    case 2 ->{
                        String[] tens = {"","X", "XX", "XXX", "LX", "L", "XL", "XXL", "XXXL", "CX"};
                        roman.append(tens[digit]);
                    }
                    case 3 ->{
                        String[] hundreds = {"", "C", "CC", "CCC", "DC", "D", "CD", "CCD", "CCCD", "MC"};
                        roman.append(hundreds[digit]);
                    }
                    case 4 ->{
                        String[] thousands = {"", "M", "MM", "MMM"};
                        roman.append(thousands[digit]);
                    }
                }
                value++;
                dup/=10;
        }
        return roman.reverse().toString();
    }

    public static void main(String[] args) {
        IntToRoman intToRoman = new IntToRoman();
        System.out.println(intToRoman.intToRoman(3999));
        System.out.println(intToRoman.intToRoman(23));
        System.out.println(intToRoman.intToRoman(499));
    }
}
