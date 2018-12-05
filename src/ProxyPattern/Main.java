package ProxyPattern;

public class Main {

    /*
    * 中间层被代理对象实现
    * */

    public static void main(String[] args){

        String location = "/haotian/Documents/image001.jpg";

        Image image = new ProxyImage(location);
        image.display();
    }

}


