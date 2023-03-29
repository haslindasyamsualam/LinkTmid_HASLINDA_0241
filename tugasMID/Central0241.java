package central0241;
interface A {
    public void aaa();
}

interface B extends A {
    
}

class Central0241 implements B {
    public void aaa() {
        System.out.println("aaa");
    }

    public static void main(String arg[]) {
        Central0241 obj = new Central0241();
        System.out.println("main");
        obj.aaa();
    }
}