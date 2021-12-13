import java.lang.Math;
import java.util.*;

public class Jardin {

    ArrayList<Abri> abris;
    ArrayList<Enfant> enfants;
    HashMap<Abri, ArrayList<Enfant>> container;

    public int distanceEnfantEtAbri(Enfant e, Abri a){
        return Math.abs(e.getPointY() - a.getAbriY()) + Math.abs(e.getPointX() - a.getAbriX()) ;
    }

    public HashMap<Abri, ArrayList<Enfant>> move(){
        ArrayList<Enfant> enfantsSurAbri = new ArrayList<>();

        for (Enfant e : enfants){
            int distance = distanceEnfantEtAbri(new Enfant(2,2),
                    new Abri(100,100, "BOX"));
            for (Abri a : abris ){
                if(distance < distanceEnfantEtAbri(e,a)) {
                    enfantsSurAbri.add(e);
                    container.put(a, new ArrayList<>(
                            new HashSet<>(enfantsSurAbri)));
                } else {
                    distance = distanceEnfantEtAbri(e,a);
                }
            }
            enfantsSurAbri = new ArrayList<>();
        }
        return container;
    }

    public ArrayList<Abri> getAbris() {
        return abris;
    }

    public void setAbris(ArrayList<Abri> abris) {
        this.abris = abris;
    }

    public ArrayList<Enfant> getEnfants() {
        return enfants;
    }

    public void setEnfants(ArrayList<Enfant> enfants) {
        this.enfants = enfants;
    }

    public HashMap<Abri, ArrayList<Enfant>> getContainer() {
        return container;
    }

    public void setContainer(HashMap<Abri, ArrayList<Enfant>> container) {
        this.container = container;
    }

    public void Affichage() {
        Iterator iterator = container.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry mapentry = (Map.Entry) iterator.next();
            System.out.println("clé: "+mapentry.getKey()
                    + " | valeur: " + mapentry.getValue());
        }
    }
}
