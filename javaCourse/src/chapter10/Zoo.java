package chapter10;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.fetch();
        dog.makeSound();
        feed(dog);

        Animal rocky = new Dog();
        rocky.makeSound();
        feed(rocky);

        rocky = new Cat();
        rocky.makeSound();
        ((Cat) rocky).scratch();
        feed(rocky);
    }

    public static void feed(Animal animal){

        if (animal instanceof Dog){
            System.out.println("Dog food");
        }
        else if (animal instanceof Cat){
            System.out.println("Your cat food");
        }

    }
}
