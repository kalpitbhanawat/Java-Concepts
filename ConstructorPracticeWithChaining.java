public class ConstructorPracticeWithChaining {
    public static void main(String args[]) {
        MainClass objectWithoutParameter = new MainClass();
        MainClass objectWithParameter = new MainClass(10);

    }
}
class MainClass{
    MainClass(){
        this(5);//This is constructor Chaining we are calling another constructor from a constructor
        System.out.println("In parameter less constructor of main class");
    }
    MainClass(int a){
        System.out.println("In constructor of mainclass with pameter as integer" + a);
    }
}


