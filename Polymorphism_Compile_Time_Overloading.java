public class Polymorphism_Compile_Time_Overloading {
    public static void main(String[] args)
    {

        // Calling method by passing
        // input as in arguments
        Calculate m=new Calculate();
        System.out.println(m.Multiply(2, 4));
        System.out.println(m.Multiply(5.5, 6.3));
    }
}
class Calculate{
    static int Multiply(int a, int b)
    {

        // Returns product of integer numbers
        return a * b;
    }

    // Method 2
    // With same name but with 2 double parameters
    static double Multiply(double a, double b)
    {

        // Returns product of double numbers
        return a * b;
    }
}