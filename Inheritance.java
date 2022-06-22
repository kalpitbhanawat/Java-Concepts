public class Inheritance {
    public static void main(String args[]) {
        Animals obj=new Dog();
        obj.walk();
    }


}

class Animals{
    void print() {
        System.out.println("Hii you are in Animal");
    }
    void walk() {
        System.out.println("Animal is walking");
    }

}
 class Dog extends Animals{
    void print() {
        System.out.println("Hii you are in Dog");
    }
    void walk() {
        System.out.println("Dog is walking ");
    }
}
 class Cat extends Animals{
    void print() {
        System.out.println("Hii you are in Cat");
    }
    void walk() {
        System.out.println("Cat is walking ");
    }
}