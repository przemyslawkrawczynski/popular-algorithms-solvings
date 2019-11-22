package pl.pk.algorithms.whatWeSeAfterCompilation.extendings;

class Derived extends Base {
    public Derived() {
        super();
        System.out.println("Derived.Derived()");
    }

    public void hello() {
        System.out.println("Derived.hello()");
    }

    public static void main(String... args) {
        Base base = new Derived();
        base.hello();

        Derived derived = new Derived();
        derived.hello();
    }
}