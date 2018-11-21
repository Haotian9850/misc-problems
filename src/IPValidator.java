public class IPValidator {
    /*
    * check whether an input string is a valid IPv4 address or IPv6 address or neither
    * */

    public String validIPAddress(String IP){
        //handle edge cases
        if(IP == null || IP.length() == 0){
            return "Neither";
        }
        boolean is4 = checkIP4(IP);
        boolean is6 = checkIP6(IP);
        if(is4){
            return "IPv4";
        }
        if(is6){
            return "IPv6";
        }
        return "Neither";
    }

    private boolean checkIP4(String s){
        if(s.charAt(s.length() - 1) == '.'){
            return false;
        }
        String[] splitted = s.split("\\.");
        if(splitted == null || splitted.length != 4){
            return false;
        }
        //do check
        for(String str : splitted){
            if(str.length() == 0 || str.length() > 3){
                return false;
            }
            if(str.length() > 1 && str.charAt(0) == '0'){
                return false;
            }
            int temp = 0;
            for(int i = 0; i < str.length(); ++ i){
                Character c = str.charAt(i);
                if(c < '0' || c >'9'){
                    return false;
                }
                temp = temp * 10 + (int)(c - '0');
            }
            //check temp
            if(temp > 255 || temp < 0){
                return false;
            }
        }
        return true;
    }

    private boolean checkIP6(String s){
        if(s.charAt(s.length() - 1) == ':'){
            return false;
        }
        String[] splitted = s.split(":");
        if(splitted == null || splitted.length != 8){
            return false;
        }
        for(String str : splitted){
            if(str.length() == 0 || str.length() > 4){
                return false;
            }
            for(int i = 0; i < str.length(); ++ i){
                Character c = str.charAt(i);
                if((c < '0' || c > '9') &&
                        (c < 'a' || c > 'f') &&
                        (c < 'A' || c > 'F')){
                    return false;
                }
            }
        }
        return true;
    }
}
