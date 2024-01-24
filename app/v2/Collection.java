package app.v2;

import java.util.ArrayList;
import java.util.List;

public class Collection<T, U> {

    private T player;
    private List<U> resources = new ArrayList<>();
    private String name;
    private int max;

    public Collection(String name, int max, T player) {
        this.player = player;
        this.name = name;
        this.max = max;
    }

    public Collection<T,U> add(U resource) throws Exception {
        if (resources.size() == max) {
            throw new Exception(String.format("%s is full!", name));
        }
        resources.add(resource);
        return this;
    }

    @Override
    public String toString() {
        List<String> names = new ArrayList<>();
        resources.stream().forEach(r -> names.add(r.toString()));
        return String.format("%s's %s: %s", this.player.toString(), this.name, String.join(", ", names));
    }




}