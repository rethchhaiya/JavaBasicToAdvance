package OOP.NestedAndInnerClass;

import OOP.NestedAndInnerClass.Computer.Static;

public class NestedAndInnerClass {
    public static void main(String[] args) {

        //how to access outer class
        Computer com = new Computer("MSI");
        com.display();

        //how to access inner class
        Computer.InnerComputer iner = com.new InnerComputer(7, "Smos");
        iner.display();

        //how to access double inner
        Computer.InnerComputer.InnerComputer_1 doubleIner = iner.new InnerComputer_1(150);
        doubleIner.display();

        //how to access static class
        Computer.Static s = new Static();
        s.display();
    } 
}