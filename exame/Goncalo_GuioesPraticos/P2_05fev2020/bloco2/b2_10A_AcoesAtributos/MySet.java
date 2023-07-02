import java.util.*;

public class MySet<T> {
    private HashSet<T> elements;

    // Constructor
    public MySet() {
        elements = new HashSet<T>();
    }

    // Getters
    public HashSet<T> getElements() {
        return elements;
        //return Collections.unmodifiableSet(elements); 
    }

    // Setters
    public boolean add (T t) {
        return elements.add(t);
    }

    public boolean contains(T t) {
        return elements.contains(t);
    }

    public String toString() {
        if (elements.size()==0)
            return "{ }";
        StringBuilder str = new StringBuilder("{ ");
        for(T el:elements) {
            str.append(el);
            str.append(", ");
        }
        str.deleteCharAt(str.length()-2);
        str.append("}");
        return str.toString();
    }

    // Static methods
    public static <X> MySet<X> union(MySet<X> s1, MySet<X> s2) {
        MySet<X> s = new MySet<>();
        for(X e: s1.getElements())
            s.add(e);
        for(X e:s2.getElements())
            s.add(e);
        return s;
    }

    public static <X> MySet<X> intersept(MySet<X> s1, MySet<X> s2) {
        MySet<X> s = new MySet<>();
        for(X e: s1.getElements())
            if(s2.contains(e))
                s.add(e);
        return s;
    }

    public static <X> MySet<X> difference(MySet<X> s1, MySet<X> s2) {
        MySet<X> s = new MySet<>();
        for(X e: s1.getElements())
            if(!s2.contains(e))
                s.add(e);
        return s;
    }


}