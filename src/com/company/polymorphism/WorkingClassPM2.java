package com.company.polymorphism;

/**
 * An generic example of how to create interfaces and have them implemented from their implementation
 * class is as follows -
 */
interface in1 {
}

interface in2 {
}

class A implements in1, in2 {
}

public class WorkingClassPM2 {
    public static void main(String[] args) {
        AnimalList obj = new AnimalList();

        Eagle e = new Eagle();
        Goldfish gf = new Goldfish();
        Kangaroo k = new Kangaroo();

        obj.add(e);
        obj.add(gf);
        obj.add(k);
    }
}
