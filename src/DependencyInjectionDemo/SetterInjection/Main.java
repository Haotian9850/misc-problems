package DependencyInjectionDemo.SetterInjection;

public class Main {

    public static void main(String[] args){
        Actor actor = new ActorImpl("actorName", 1.84);

        MovieScene scene = new MovieScene();

        scene.setActorInScene(actor);   //属性注入！

        scene.performAction();
    }

}
