package agh.ii.prinjava.lab04.lst04_03;

class C3<T> { // This "T"...
    private T x;

    <T> T sm1(T x) { // <- ... has nothing to do with this "T"
        return x;
    }
}
