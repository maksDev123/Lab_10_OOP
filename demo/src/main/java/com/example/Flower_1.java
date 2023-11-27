package com.example;

interface Flower_1 {
    void display();
}


class ConcreteFlower_1 implements Flower_1 {
    private String name;

    public ConcreteFlower_1(String name) {
        this.name = name;
    }

    @Override
    public void display() {
        System.out.println("Displaying " + name);
    }
}
