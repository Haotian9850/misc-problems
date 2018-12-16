package SingletonPattern;

public class Main {

    public static void main(String[] args){

        SingleObject demoObject = SingleObject.getInstance();
        System.out.println(demoObject.toString());

    }

}
