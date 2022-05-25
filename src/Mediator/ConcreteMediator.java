package Mediator;

public class ConcreteMediator implements Mediator {

    private ConcreteColleague1 usu1;
    private ConcreteColleague2 usu2;
    public void setColleague1 (ConcreteColleague1 colleague1){
        usu1 = colleague1;
    }
    public void setColleague2 (ConcreteColleague2 colleague2){
        usu2 = colleague2;
    }
    @Override
    public void send(String message, Colleague colleague){
        if(colleague == usu1){
            usu2.messageReceived(message);
        } else if (colleague == usu2){
            usu1.messageReceived(message);
        } else {
            System.out.println("No colleague");
        }
    }
}
