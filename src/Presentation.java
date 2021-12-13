import com.sun.corba.se.pept.transport.ContactInfo;

import java.util.ArrayList;
import java.util.HashMap;

public class Presentation {

    public static void main(String[] args) {

        Jardin jardin = new Jardin();

        ArrayList<Enfant> enfants = new ArrayList<>();
        enfants.add(new Enfant(5,4));
        enfants.add(new Enfant(1,2));
        enfants.add(new Enfant(-6,-1));
        enfants.add(new Enfant(1,1));

        jardin.setEnfants(enfants);

        ArrayList<Abri> abris = new ArrayList<>();
        abris.add(new Abri(5,5,"BOX1"));
        abris.add(new Abri(-2,-1,"BOX2"));
        abris.add(new Abri(3,2,"BOX3"));
        abris.add(new Abri(-7,-5,"BOX4"));

        jardin.setAbris(abris);
        jardin.setContainer(new HashMap<>());

        HashMap<Abri, ArrayList<Enfant>> cleanContainer = jardin.move();
        System.out.println(cleanContainer);

      //  jardin.removeOccurenceByDistance();

    }
}
