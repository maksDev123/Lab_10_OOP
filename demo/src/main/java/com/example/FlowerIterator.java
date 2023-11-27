package demo.src.main.java.com.example;


import java.util.Iterator;

class Flower {
    private String name;

    public Flower(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class AbstractGenerator implements Iterator<Flower> {
    private static final String[] FLOWER_NAMES = {"Rose", "Tulip", "chamomile", "Sunflower", "Lily"};
    private int current = 0;

    @Override
    public boolean hasNext() {
        return current < FLOWER_NAMES.length;
    }

    @Override
    public Flower next() {
        if (hasNext()) {
            Flower flower = new Flower(FLOWER_NAMES[current]);
            current++;
            return flower;
        } else {
            throw new java.util.NoSuchElementException("No more flowers in the generator");
        }
    }
    @Override
    public void remove() {
        throw new UnsupportedOperationException("Remove operation is not supported");
    }
}


