package Mediator;

public abstract class Colleague {
    protected Mediator mediator;

    public Colleague (Mediator mediador) {
        this.mediator = mediador;
    }
    public abstract void send (String message);
    public abstract void messageReceived(String message);
}
