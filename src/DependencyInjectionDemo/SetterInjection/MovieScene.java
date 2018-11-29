package DependencyInjectionDemo.SetterInjection;

public class MovieScene {

    public Actor actorInScene;

    public MovieScene(){
        this.actorInScene = null;
    }

    public MovieScene(Actor actor){
        this.actorInScene = actor;
    }

    public void setActorInScene(Actor actorInScene) {
        this.actorInScene = actorInScene;
    }

    public void performAction(){
        this.actorInScene.talk();
    }
}
