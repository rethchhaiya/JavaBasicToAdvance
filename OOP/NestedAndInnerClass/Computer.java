package OOP.NestedAndInnerClass;

//outer class
public class Computer {
    private String model;

    public Computer(String model){
        this.model = model;
    }

    public void display(){
        System.out.println("Model: " + model);
    }

    static class Static {
        public void display(){
            System.out.println("Hello from static class");
        }    
    }

    //inner class
    protected class InnerComputer {
        private int core;
        private String type;

        public InnerComputer(int core, String type){
            this.core = core;
            this.type = type;
        }

        public void display(){
            System.out.println("Core: " + core);
            System.out.println("Type: " + type);
        }

        protected class InnerComputer_1 {
            private int price; 

            public InnerComputer_1(int price){
                this.price = price;
            }

            public void display(){
                System.out.println("Price: " + price);
            }
        }
    }
    
}