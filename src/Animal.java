    public class Animal {
    public void animalSound(){
        System.out.println(" The Animal Sound");
    }
}
class dog extends Animal{
    public void animalSound(){
        System.out.println(" The Dog says : Bow - Bow");
    }
}
class cat extends Animal{
    public void animalSound(){
        System.out.println(" The Cat says : Meow - Meow");
    }
}
class cow extends Animal{
    public void animalSound(){
        System.out.println(" The Cow says :  Moo - Moo");
    }
}
class Main{
    public static void main (String[] args){
        Animal myAnimal = new Animal();
        Animal myDog = new dog();
        Animal myCat = new cat();
        Animal myCow = new cow();

        myAnimal.animalSound();
        myDog.animalSound();
        myCat.animalSound();
        myCow.animalSound();
      }
}
