import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("Animal is moving!");
    }
}

class Human extends Animal {
    @Override
    public void move() {
        System.out.println("Human walks with two bare foot!");
    }

    public void readBook() {
        System.out.println("Human starts to read~"  );
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("Tiger is running with four legs!");
    }

    public void hunt() {
        System.out.println("Tiger starts to hunt!");
    }
}

class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("Eagle is flying!");
    }

    public void flying() {
        System.out.println("Eagle is fly high!");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal human = new Human();
        Animal tiger = new Tiger();
        Animal eagle = new Eagle();

        ArrayList<Animal> animals = new ArrayList<>();
        animals.add(human);
        animals.add(tiger);
        animals.add(eagle);

        for (Animal animal : animals) {
            animal.move();
        }

        animalMove(human);
        animalMove(tiger);
        animalMove(eagle);

        AnimalTest test = new AnimalTest();

        test.testDownCasting(animals);
    }

    public static void animalMove(Animal animal) {
        animal.move();
    }

    public static void testDownCasting(ArrayList<Animal> animals) {
        for (Animal animal : animals) {
            if (animal instanceof Human) {
                Human human = (Human)animal;
                human.readBook();
            } else if (animal instanceof  Tiger) {
                Tiger tiger = (Tiger)animal;
                tiger.hunt();
            } else if (animal instanceof Eagle) {
                Eagle eagle = (Eagle)animal;
                eagle.flying();
            }
        }
    }
}
