package DependencyInjectionDemo.ConstructorInjection;

public class MovieScene {

    private Actor actorInScene;

    //constructor injection
    public MovieScene(Actor actor){
        this.actorInScene = actor;
    }

    public void performAction(){
        this.actorInScene.talk();
    }
}
