import java.io.IOException;
import java.net.*;

public class Principal {
    
    public static void main(String[] args) throws IOException {

        InetAddress addr_self;
        try {
            addr_self = InetAddress.getByName("127.0.0.1");
        } catch (Exception e) {
            throw e;
        }

        /*faire attention si le numero de port est deja pris (pas de solution pour l'instant) */
        /*le nom n'est pas unique pour l'instant*/
        User self = new User(args[0],addr_self,7000);
        
        Communicateur comm = new Communicateur();

        GestionListContact gestionnairListContact = new GestionListContact(self, comm);

        System.out.println(self.getUsername());

    }

}
