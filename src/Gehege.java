import java.util.ArrayList;

public class Gehege {
    private String name;
    private double size;

    private ArrayList<Animal> tiere = new ArrayList<Animal>();

    public Gehege(String name, double size) {
        this.name = name;
        this.size = size;
    }

    public void addAnimal(Animal a) {
        boolean idAlreadyExists = false;

        for (Animal anim : tiere) {
            if (anim.getId() == a.getId())
                idAlreadyExists = true;
        }

        if(idAlreadyExists == false)
            tiere.add(a);
    }

    public void removeAnimal(int animalId){
        Animal toDelete = null;

        for(Animal anim : tiere){
            if(anim.getId() == animalId)
                toDelete = anim;
        }

        if(toDelete != null) // tier wurde gefunden
            tiere.remove(toDelete);
    }

}
