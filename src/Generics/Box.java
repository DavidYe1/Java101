package Generics;

/**
 * Created by David on 15.09.2016.
 */
public class Box<T extends Comparable<T>> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Box(T value) {
        setValue(value);
    }

    @Override
    public String toString() {
        return "Box{" +
                "value=" + value.toString() +
                '}';
    }

    public int compareTo(T value){

        return this.value.compareTo(value);
    }

    public boolean equals(T value){

        return this.value.equals(value);
    }

}
