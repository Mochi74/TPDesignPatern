package mail;

public class Main {

    public static void main(String args[]){

        Email mail1=new BaseEmail("Contenu mail 1");
        Email mail2=new EmailWithEntete(new BaseEmail("Contenu mail 2"));
        Email mail3=new EmailWithSignature(new BaseEmail("Contenu mail 3"));
        Email mail4=new EmailWithSignature(new EmailWithEntete(new BaseEmail("Contenu mail 4")));
        Email mail5=new EmailWithEntete(new EmailWithSignature(new BaseEmail("Contenu mail 5")));
        mail1.envoyer();
        mail2.envoyer();
        mail3.envoyer();
        mail4.envoyer();
        mail5.envoyer();
    }
}
