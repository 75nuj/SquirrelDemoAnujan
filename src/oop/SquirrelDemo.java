package oop;
import oop.Squirrel;

public class SquirrelDemo {
    public static void main(String[] args) {
        Squirrel oneSquirrel = new Squirrel("blue", "big", 10, 0.3);
        Squirrel twoSquirrel = new Squirrel("black", "big", 2, 100.0);
        Squirrel threeSquirrel = new Squirrel("purple", "microscopic", 2034, 110.0);
        
        oneSquirrel.climb();
        twoSquirrel.findNut(1);
        threeSquirrel.eat(1);
        threeSquirrel.findNut(1000);
        twoSquirrel.run();
        twoSquirrel.die();


        threeSquirrel.run();
        threeSquirrel.die();

        System.out.println("one nut count: " + oneSquirrel.getNutCount());


        System.out.println(oneSquirrel.iqDouble); //accessing instance variable of an object (not best practice, use get methods)
        
    }
}
