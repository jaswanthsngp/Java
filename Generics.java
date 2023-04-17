// Generics in Java are the same as Templates in C++

interface TestTemplate<T extends Number, U> {                          // Generic Interface
    void set(T t, U u);
    T first();
    U second();
    <X>void testFn(X x);
}

class Test<T extends Number, U> implements TestTemplate<T, U>{           // Generic Class
    // static T ts;                                         // static variables cannot be Generic
    T t;                                                    // Instance Variables can be Generic
    U u;
    public void set(T t, U u){
        this.t= t;
        this.u= u;
    }
    public T first(){
        // X y= t;                                          // Local variables can be Generic
        return t;
    }
    public U second(){
        return u;
    }
    public <X>void testFn(X x){                            // Fns can also be given a Generic Class
        System.out.println(x.getClass()+" "+x);
    }
}

class Main{
    public static void main(String[] args) {
        // Test test= new Test();
        Test<Number, String> test= new Test<Number, String>();         // This is a safer declaration 
        test.set(53.25, "something");
        System.out.println(test.first());
        System.out.println(test.second());
        test.<Double>testFn(32.34);
    }
}