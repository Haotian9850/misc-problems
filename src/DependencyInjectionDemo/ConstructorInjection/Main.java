package DependencyInjectionDemo.ConstructorInjection;

public class Main {

    /*
    * Demo of constructor injection
    * */

    public static void main(String[] args){

        Actor actor = new ActorImpl("actorName", 1.84);

        MovieScene movieScene = new MovieScene(actor);  //完成构造函数注入！

        movieScene.performAction();
    }



}
