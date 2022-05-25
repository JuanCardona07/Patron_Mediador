package Mediator;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator){
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.send(message, this);
    }
    @Override
    public void messageReceived(String message){
        System.out.println("colleague 1 ->"+ message);
    }
}
