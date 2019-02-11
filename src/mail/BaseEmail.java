package mail;

public class BaseEmail implements Email {

    private String message;

    public BaseEmail(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public void envoyer() {
        System.out.println("email to sent :" + message);
    }

}


