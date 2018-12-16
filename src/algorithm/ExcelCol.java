package algorithm;

public class ExcelCol {

    public static int CharToInt(String s){
        int len = s.length();
        int result = 0;
        for(int i = 0; i < len; ++ i){
            int temp = s.charAt(i) - 'A' + 1;
            result = result * 26 + temp;
        }
        return result;
    }

    public static String IntToChar(int n){
        StringBuilder result = new StringBuilder();
        while(n > 0){
            -- n;
            char temp = (char)(n % 26 + 'A');
            n /= 26;
            result.append(temp);
        }
        return result.reverse().toString();
    }

    public static void main(String[] args){
        System.out.println(CharToInt("AB"));
        System.out.println(IntToChar(15615));
    }

}
