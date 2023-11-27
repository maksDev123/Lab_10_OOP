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

abstract class AbstractFlower_1Decorator implements Flower_1 {
    private Flower_1 Flower_1;

    public AbstractFlower_1Decorator(Flower_1 Flower_1) {
        this.Flower_1 = Flower_1;
    }

    @Override
    public void display() {
        Flower_1.display();
    }
}


class RedRoseDecorator extends AbstractFlower_1Decorator {
    public RedRoseDecorator(Flower_1 Flower_1) {
        super(Flower_1);
    }

    @Override
    public void display() {
        super.display();
        addRedColor();
    }

    private void addRedColor() {
        System.out.println("Adding red color to the Flower_1");
    }
}
