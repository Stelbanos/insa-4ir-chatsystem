package Controleur.ListContact;
import Controleur.Communicateur;
import Modele.ContactList;
import Modele.User;

public class GestionListContact {
    private User user;

    private ContactList cl;

    public Communicateur comm;

    public GestionListContact (User self, Communicateur commUDP) {
        this.user = self;
        this.comm = commUDP;
    }


    public void initListUser () {

    }

    public void miseAJourListUser () {

    }

    public void createPDU (User utili) {

    }

    public void communicationModifierPseudo () {

    }

    public void recevUDP (String msg) {

    }

    public ContactList getContactList () {
        return null;
    }

    

}

