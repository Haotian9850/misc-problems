package Algorithm;

public class IntegerToEnglishWords {

    static String[] digits = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten",
            "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    static String[] tens = {"Zero", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};

    public static String convert(int num){
        //validate input
        if(num < 0){
            throw new RuntimeException("Malformed input!");
        }
        if(num == 0){
            return "Zero";
        }
        return util(num).substring(1);
    }

    private static String util(int num){
        //billion
        if(num > 1000000000){
            return util(num / 1000000000) + " Billion" + util(num % 1000000000);
        }else if(num > 1000000){
            return util(num / 1000000) + " Million" + util(num % 1000000);
        }else if(num >= 1000){
            return util(num / 1000) + " Thousand" + util(num % 1000);
        }else if(num >= 100){
            return util(num / 100) + " Hundred" + util(num % 100);
        }else if(num >= 20){
            return " " + tens[num / 10] + util(num % 10);
        }else if(num >= 1){
            return " " + digits[num];
        }else{
            return "";
        }
    }

    public static void main(String[] args){
        System.out.println(convert(15656451));
    }

}
