public class Main {

    public static void main(String[] args) {
        Animal cow = new Animal("Muhli", 100);
        Animal parrot = new Animal("Krabi", 2.4);
        Animal snake = new Animal("Snaky", 13.2);
        Animal dog = new Animal("Pluto", 8);

        System.out.println(cow);
        System.out.println(parrot);
        System.out.println(snake);
        // .toString() wird bei allen implizit verwendet. Hier explizit:
        System.out.println(dog.toString());

        Gehege weide = new Gehege("Weide", 1000);
        weide.addAnimal(cow);
        weide.addAnimal(dog);

        Gehege ter = new Gehege("Terrarium", 150);
        ter.addAnimal(snake);

        ter.addAnimal(parrot);
        // passt doch nicht ins Terrarium
        ter.removeAnimal(parrot.getId());

        weide.printAnimals();
        ter.printAnimals();
    }


}
