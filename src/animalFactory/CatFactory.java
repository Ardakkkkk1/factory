package animalFactory;

public class CatFactory extends AnimalFactory {
    public Animal createAnimal(){
        return new Cat();
    }
}
