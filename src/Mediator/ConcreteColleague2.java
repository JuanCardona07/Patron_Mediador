package Mediator;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator){
        super(mediator);
    }
    @Override
    public void send(String message){
        mediator.send(message, this);
    }
    @Override
    public void messageReceived(String message){
        System.out.println("Colleague 2 ->" + message);
    }
}
