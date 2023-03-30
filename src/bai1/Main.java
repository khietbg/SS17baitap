package bai1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
       List<Product> productList = new ArrayList<>();
//       productList.add(new Product(1,"iphone","apple",1000,"dep"));
//       productList.add(new Product(2,"galaxy","samsung",1000,"dep"));
//       productList.add(new Product(3,"xiaomi","xiaomi",1000,"re"));
//       writeProduct("src//product.txt",productList);
        productList = readProduct("src//product.txt");
        for (Product pro:productList) {
            System.out.println(pro);
        }
    }
    public static void writeProduct(String filePath, List<Product> productList){

        try {
            FileOutputStream fo = new FileOutputStream(filePath);
            ObjectOutputStream os = new ObjectOutputStream(fo);
            os.writeObject(productList);
            fo.close();
            os.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static List<Product> readProduct(String filePath){
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fs = new FileInputStream(filePath);
            ObjectInputStream os = new ObjectInputStream(fs);
           productList = (List<Product>) os.readObject();


        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        return productList;
    }
}