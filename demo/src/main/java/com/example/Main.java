package demo.src.main.java.com.example;


// Implement decorators based on attached diagram. This implementation should follow Decorator Pattern.
// Cover decorators with tests.

// This tasks was covered in previous lab already!!!


public class Main {
    public static void main(String[] args) {
        AbstractGenerator flowerGenerator = new AbstractGenerator();

        while (flowerGenerator.hasNext()) {
            Flower flower = flowerGenerator.next();
            System.out.println("Generated Flower: " + flower.getName());
        }


        Flower_1 rose = new ConcreteFlower_1("Rose");
        Flower_1 redRose = new RedRoseDecorator(rose);
        redRose.display();
    }
}
