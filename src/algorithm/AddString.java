package algorithm;

public class AddString {

    public static String addString(String s1, String s2){
        StringBuilder result = new StringBuilder();
        StringBuilder s1Reversed = new StringBuilder(s1);
        s1Reversed.reverse();
        StringBuilder s2Reversed = new StringBuilder(s2);
        s2Reversed.reverse();
        int len = Math.max(s1.length(), s2.length());
        int cout = 0;
        for(int i = 0; i < len; ++ i){
            int num1 = 0;
            int num2 = 0;
            if(i < s1.length()){
                num1 = Character.getNumericValue(s1.charAt(i));
            }
            if(i < s2.length()){
                num2 = Character.getNumericValue(s2.charAt(i));
            }
            int tempSum = num1 + num2 + cout;
            if(tempSum > 9){
                cout = 1;
                tempSum /= 10;
            }else{
                cout = 0;
            }
            result.append(tempSum);
        }

        return result.reverse().toString();

    }

    public static void main(String[] args){
        System.out.println(addString("12345615616515", "549815193"));
    }

}
