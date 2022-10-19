package oop;


public class Squirrel {
    //instance variables
    String colourString;
    String sizeString;
    int nutCountInt;
    boolean aliveBoolean;
    double iqDouble;

    //constructor

    /**
     * Create an instance of a Squirrel
     * @param colourString
     * @param sizeString
     * @param nutCountInt
     * @param iqDouble
     */

    public Squirrel(String colourString, String sizeString, int nutCountInt, double iqDouble) {
        this.aliveBoolean = true;
        this.colourString = colourString;
        this.sizeString = sizeString;
        this.nutCountInt = nutCountInt;
        this.iqDouble = iqDouble;
    }

    //instance methods
    public void run() {
        System.out.println("run");
    }

    public void findNut(int nutsFoundInt) {
        System.out.println("find nut:" + nutsFoundInt);
        this.nutCountInt += nutsFoundInt; //modifying instance variable
        
    }

    public int getNutCount() {
        return this.nutCountInt;
    }

    public void climb() {
        System.out.println("climb tht tree");
    }

    public void die() {
        System.out.println("hood lost a real one (a squirrel)");
        this.aliveBoolean = false;
    }

    public void eat (int eatNutsInt) {
        System.out.println("eating nuts:" + eatNutsInt);

        this.nutCountInt -= eatNutsInt;
    }
}
