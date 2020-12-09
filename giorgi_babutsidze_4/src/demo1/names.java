package demo1;

import java.util.HashSet;
import java.util.Set;

public class names<String> {
    private Set<String> names = new HashSet<>();

    public void add(String name) {
        names.add(name);
    }

    @Override
    public java.lang.String toString() {
        return "names" + names;
    }
}
