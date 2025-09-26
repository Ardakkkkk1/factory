package animalFactory;

public class Main {
    public static void main(String[] args){
        AnimalFactory factory = new CatFactory();
        Animal cat = factory.createAnimal();
        cat.sound();
    }
}
