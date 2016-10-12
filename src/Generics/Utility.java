package Generics;

/**
 * Created by Keqin on 22.09.2016.
 */
public class Utility {
    public static <T> T random(T a, T b){
        return Math.random()>0.5?a:b;
    }
    public static <T extends Comparable<T>> T max(T a, T b){
        return a.compareTo(b)>0?a:b;
    }
    public static <T> T random (T[] c){
        if (c==null || c.length== 0)  throw new NullPointerException();

        int i = (int)(Math.random()* c.length);
        return  c[i];
    }
}
