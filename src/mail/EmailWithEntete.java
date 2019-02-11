package mail;

public class EmailWithEntete extends EmailDecorator {

    public EmailWithEntete(Email email) {
        super(email);
    }


    @Override
    public void envoyer(){
        //ajoute l'entête
        System.out.println("Entète : Bonjour Madame, Monsieur" );
        // puis traite le reste du mail
        super.envoyer();
    }
}