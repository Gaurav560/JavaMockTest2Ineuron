package CodingQuestion1;

 class Animal {
void makeSound(){
    System.out.println("sound of this animal is ::");
}
}
  class Dog extends Animal{
      @Override
      void makeSound() {
          System.out.println("sound of dog is :: bark");
      }
  }

  class Cat extends Animal{
     @Override
      void makeSound(){
         System.out.println("sound of cat is :: meow");
     }
  }

class Cow extends Animal{
    @Override
    void makeSound(){
        System.out.println("sound of cow is :: moo");
    }
}

class Sound{
    public static void main(String[] args) {
        Dog dog=new Dog();
        Cat cat=new Cat();
        Cow cow=new Cow();
        dog.makeSound();
        cow.makeSound();
        cat.makeSound();
    }
}