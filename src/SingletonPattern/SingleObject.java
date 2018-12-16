package SingletonPattern;

public class SingleObject {

    /*
    * double-checked locking for thread safety
    * */

    /*
    * 适用场景：一个被全局使用的类被频繁的创建和销毁
    * 优点：内存里只有一个类，减少了内存的使用；避免了对资源的多重占用
    * 缺点：没有接口，不能继承
    * */

    private volatile static SingleObject singleton;

    //private constructor
    private SingleObject(){

    }

    public static SingleObject getInstance(){
        if(singleton == null){
            synchronized (SingleObject.class){  //multi-thread safety
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
