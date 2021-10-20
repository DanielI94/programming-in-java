package agh.ii.prinjava.lab04.lst04_03;

class C4<T> { // <- the "T" in this line
    private T x;

    <U> U sm1(U x) { // <- has nothing to do with this "T"
        return x;
    }
}
