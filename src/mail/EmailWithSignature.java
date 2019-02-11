package mail;

public class EmailWithSignature extends EmailDecorator{
    public EmailWithSignature (Email email) {
        super(email);
    }


    @Override
    public void envoyer(){
        // traite le début  du mail
        super.envoyer();
        // puis ajoute la signature
        System.out.println("Signature: Mochi le Grogneur");
        }
}
