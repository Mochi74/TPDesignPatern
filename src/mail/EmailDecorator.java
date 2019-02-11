package mail;

public abstract class EmailDecorator implements Email {

    private Email decorated;

    public EmailDecorator(Email email){
        decorated = email;
    }


    @Override
    public void envoyer() {
        decorated.envoyer();
    }

}
