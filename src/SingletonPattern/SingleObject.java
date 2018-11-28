package SingletonPattern;

public class SingleObject {

    /*
    * double-checked locking for thread safety
    * */

    private volatile static SingleObject singleton;

    //private constructor
    private SingleObject(){

    }

    public static SingleObject getInstance(){
        if(singleton == null){
            synchronized (SingleObject.class){
                if(singleton == null){
                    //加载对象
                    singleton = new SingleObject();
                }
            }
        }
        return singleton;
    }

    @Override
    public String toString(){
        return "toString override demo";
    }

}
