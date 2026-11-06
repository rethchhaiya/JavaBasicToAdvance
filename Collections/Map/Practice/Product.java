package Collections.Map.Practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Product {

    Map<String, Integer> productMap = new HashMap<>();

    String productName;
    int qty;

    public Product(){}

    public Product(String productName, int qty) {
        this.productName = productName;
        this.qty = qty;
    }

    public void setProductMap(Map<String, Integer> productMap) {
        this.productMap = productMap;
    }

    public Map<String, Integer> getProductMap() {
        return productMap;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getProductName() {
        return productName;
    }

    public int getQty() {
        return qty;
    }

    //add product method
    public void addProduct(String productName, int qty){
        // check if the product already exsit and add more
        if(productMap.containsKey(productName)){
            int oldQty = productMap.get(productName);
            productMap.put(productName, oldQty + qty);
        }else{
            productMap.put(productName, qty);
        }
    }

    //display product method
    public void displayProduct(){
        // System.out.println("+===========Display Product==========+");
        if(productMap.size() > 0){
            for(Entry<String, Integer> entry : productMap.entrySet()){
                System.out.println(entry.getKey() + " = " + entry.getValue());
            }
        }
        else{
            System.out.println("There are not product yet");
        }
    }


    //update product method
    public void updateProduct(String productName, Scanner scanner){
        if(!productMap.containsKey(productName)){
            System.out.println("Product not found: " + productName);
            return;
        }
        System.out.println("+============Product found============+");
        System.out.print("Enter new Quantity: ");
        int newValue = scanner.nextInt();
        productMap.put(productName, newValue);
    }

    //remove product method
    public void removeProduct(String productName){
        if(productMap.containsKey(productName)){
            System.out.println("+========Product delete successful===========+");
            productMap.remove(productName);
        }
        else{
            System.out.println("+=======Product not found ===============+");
        }
        // System.out.println("+============Product Not found=========+");
        return;
    }

    //order product method
    public void orderProduct(String productName, Scanner scanner){
        if(productMap.containsKey(productName)){
            System.out.print("Enter quantity: ");
            int qty = scanner.nextInt();

            int oldQty = productMap.get(productName);
            productMap.put(productName, oldQty - qty);
        }
        else{
            System.out.println("+===========Product not found============+");
        }
    }

}
