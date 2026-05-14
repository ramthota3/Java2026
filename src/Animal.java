    public class Animal {

    public void animalSound(){
        System.out.println(" The Animal Sound");
    }
}
class Dog extends Animal{
    public void animalSound(){
        System.out.println(" The Dog says : Bow - Bow");
    }
}
class Cat extends Animal{
    public void animalSound(){
        System.out.println(" The Cat says : Meow - Meow");
    }
}
class Cow extends Animal{
    public void animalSound(){
        System.out.println(" The Cow says :  Moo - Moo");
    }
}
class AnimalDemo{
    public static void main (String[] args){
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal myCow = new Cow();

        myAnimal.animalSound();
        myDog.animalSound();
        myCat.animalSound();
        myCow.animalSound();
      }
}

















