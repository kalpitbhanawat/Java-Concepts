class Parent {

    // Method of parent class
    void Print()
    {
        // Print statement
        System.out.println("parent class");
    }
}

// Class 2
// Helper class
class subclass1 extends Parent {

    // Method
    void Print() { System.out.println("subclass1"); }
}

// Class 3
// Helper class
class subclass2 extends Parent {

    // Method
    void Print()
    {

        // Print statement
        System.out.println("subclass2");
    }
}

// Class 4
// Main class
class Run_Time_Polymorphism {

    // Main driver method
    public static void main(String[] args)
    {

        // Creating object of class 1


        // Now we will be calling print methods
        // inside main() method

        Parent a = new subclass1();
        a.Print();

         a = new subclass2();
        a.Print();
    }
}