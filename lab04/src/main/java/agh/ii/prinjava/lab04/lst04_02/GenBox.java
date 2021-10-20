package agh.ii.prinjava.lab04.lst04_02;

class GenBox<T> {
    private T x;

    public GenBox() {
    }

    public GenBox(T x) {
        this.x = x;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "GenBox{" + "x=" + x + '}';
    }
}
