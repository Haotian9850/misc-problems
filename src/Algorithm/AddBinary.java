package Algorithm;

public class AddBinary {

    public static String addBinary(String s1, String s2){
        StringBuilder result = new StringBuilder();
        StringBuilder s1Build = new StringBuilder(s1);
        StringBuilder s2Build = new StringBuilder(s2);
        String s1Reversed = s1Build.reverse().toString();
        String s2Reversed = s2Build.reverse().toString();
        int len = Math.max(s1.length(), s2.length());
        int cout = 0;
        for(int i = 0; i < len; ++ i){
            int num1 = 0;
            int num2 = 0;
            if(i < s1.length()){
                num1 = Character.getNumericValue(s1Reversed.charAt(i));
            }
            if(i < s2.length()){
                num2 = Character.getNumericValue(s2Reversed.charAt(i));
            }
            int tempSum = num1 + num2 + cout;
            if(tempSum > 1){
                tempSum = 0;
                cout = 1;
            }
            result.append(String.valueOf(tempSum));
        }
        if(cout == 1){
            result.append("1");
        }
        return result.reverse().toString();
    }

    public static void main(String[] args){
        System.out.println(addBinary("1011010", "1101101"));
    }

}
