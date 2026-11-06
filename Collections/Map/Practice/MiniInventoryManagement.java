package Collections.Map.Practice;

import java.util.Scanner;

public class MiniInventoryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // ArrayList<Product> inventory = new ArrayList<>();
        /*
            - add new product
            - display all product and price
            - update product
            - remove product
            - order product
        */
        
        Product product = new Product();

        while (true) {
            System.out.println();
            System.out.println("1.Add Product");
            System.out.println("2.Display Product");
            System.out.println("3.Update Product");
            System.out.println("4.Remove Product");
            System.out.println("5.Order Product");
            System.out.println("6.End program!");
            System.out.println();

            System.out.print("Enter Your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("+========Add New Product========+");

                    System.out.print("Enter Product Name: ");
                    String name = scanner.nextLine().trim();

                    System.out.print("Enter Product Quantity: ");
                    int qty = scanner.nextInt();

                    product.addProduct(name, qty);
                    break;
                case 2: 
                    System.out.println("+========Show Product===========+");
                    product.displayProduct();
                    break;
                case 3: 
                    System.out.println("+========Update Product=========+");
                    System.out.print("Enter product name: ");
                    String updateName = scanner.nextLine();

                    product.updateProduct(updateName, scanner);
                    break;
                case 4: 
                    System.out.println("+=========Remove Product===========+");
                    System.out.print("Enter product name: ");
                    String deleteProduct = scanner.nextLine();

                    product.removeProduct(deleteProduct);
                    break;
                case 5: 
                    System.out.println("+==========Order product===========+");
                    System.out.print("Enter product name: ");
                    String orderName = scanner.nextLine();
                    product.orderProduct(orderName, scanner);
                default:
                    break;
            }
            
        }
        
        // scanner.close();
    }
}
