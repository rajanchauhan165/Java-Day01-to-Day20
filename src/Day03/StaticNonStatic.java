package Day03;

public class StaticNonStatic {
    //Static variables are directly loaded in memory and can be called by main method without creating object of class.
    static void fun1(){
        System.out.println("Static");
    }

    //Non-Static variables are not loaded in memory directly and can be called by main method dynamically by creating object of class.
    void fun2(){
        System.out.println("Non-Static");
    }

    public static void main(String[] args) {
        fun1(); //calling static member directly

        StaticNonStatic s1 = new StaticNonStatic();
        s1.fun2(); //calling non-static member by creating object of class
    }
}
