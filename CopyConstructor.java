public class CopyConstructor {
    public static void main(String args[]){
        ConstructorDemo obj1=new ConstructorDemo(10,20);
        ConstructorDemo obj2=new ConstructorDemo(obj1);
        //System.out.print(obj1);
        System.out.print(obj2.a);
    }
}
class ConstructorDemo{

    int a,b;
    ConstructorDemo(int a,int b){
        this.a=a;
        this.b=b;
    }
    ConstructorDemo(ConstructorDemo c){
        this.a=c.a;
        this.b=c.b;
    }
}