public class A {
    int add() {
        int a = 10, b = 20, sum;
        sum = a + b;
        return sum;
    }
}

public class B  {
    public static void main(String[] args) {
        /*
         * B r = new B();
         * r.add();
         * r.a = 10;
         * r.b = 20;
         * r.sum = r.a + r.b;
         */
        // add();
        A a1 = new A();
        int s = a1.add();
        System.out.println(s);
    }
}
