package week4.Animal2;
import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        Animal hAnimal = new Human();
        Animal tAnimal = new Tiger();
        Animal eAnimal = new Eagle();

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(hAnimal);
        animalList.add(tAnimal);
        animalList.add(eAnimal);

        AnimalTest test = new AnimalTest();
        test.testDownCasting(animalList);
    }

    public void testDownCasting(ArrayList<Animal> animalList) {
//            for (int i = 0; i < animalList.size(); i++){
//                    Animal animal = animalList.get(i);
//                    if (animal instanceof Human){
//                            Human human = (Human)animal;
//                            human.readBook();
//                    } else if (animal instanceof Tiger){
//                            Tiger tiger = (Tiger)animal;
//                            tiger.hunt();
//                    } else if(animal instanceof Eagle){
//                            Eagle eagle = (Eagle)animal;
//                            eagle.fly();
//                    }
//            }
        // Enhanced for 문
        for (Animal animal : animalList) {
            if (animal instanceof Human) {
                ((Human) animal).read();
            } else if (animal instanceof Tiger) {
                ((Tiger) animal).hunt();
            } else if (animal instanceof Eagle) {
                ((Eagle) animal).flying();
            }
        }
    }
}
