package Algorithm;

public class AddTwoFloats {

    /*
    * "4.83" + "5.051561" = "9.881561"
    * */

    public static String addTwoFloats(String s1, String s2){
        //append zero?
        StringBuilder result = new StringBuilder();
        int len = Math.max(s1.length(), s2.length());
        if(s1.length() < s2.length()){
            s1 = appendZero(s1, len);
        }else if(s1.length() > s2.length()){
            s2 = appendZero(s2, len);
        }

        System.out.println(s1.length());

        int cout = 0;
        for(int i = len - 1; i >= 0; -- i){

            //handle decimal point
            if(s1.charAt(i) == '.'){
                result.append(".");
                continue;
            }

            int num1 = Character.getNumericValue(s1.charAt(i));
            int num2 = Character.getNumericValue(s2.charAt(i));
            int tempSum = num1 + num2 + cout;
            if(tempSum > 9){
                cout = 1;
                tempSum /= 10;
            }
            result.append(tempSum);
        }
        //handle cout
        if(cout > 0){
            result.append('1');
        }

        return result.reverse().toString();

    }

    private static String appendZero(String s, int len){
        StringBuilder result = new StringBuilder(s);
        for(int i = 0; i < len - s.length(); ++ i){
            result.append("0");
        }
        return result.toString();
    }

    public static void main(String[] args){
        System.out.println(addTwoFloats("4.83", "5.051561"));
    }

}
