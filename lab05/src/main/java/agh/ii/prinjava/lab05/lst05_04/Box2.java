package agh.ii.prinjava.lab05.lst05_04;

import java.util.Objects;

record Box2<T>(T e) {
    @Override
    public int hashCode() {
        return Objects.hash(e);
    }
}
