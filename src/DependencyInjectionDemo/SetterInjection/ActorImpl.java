package DependencyInjectionDemo.SetterInjection;

public class ActorImpl extends Actor {

    public ActorImpl(String name, double height){
        super();
        this.name = name;
        this.height = height;
    }

    @Override
    public void talk(){
        System.out.println("墨者革离!");
    }

}
