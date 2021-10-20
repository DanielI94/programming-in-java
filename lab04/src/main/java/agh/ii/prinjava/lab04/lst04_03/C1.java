package agh.ii.prinjava.lab04.lst04_03;

class C1 {
    /**
     * Instance generic method
     */
    <T> T m1(T x) {
        return x;
    }

    /**
     * Static generic method
     */
    static <T> T sm1(T y) {
        return y;
    }
}
