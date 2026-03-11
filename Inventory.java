import java.util.ArrayList;
import java.util.Collections;

public class Inventory {
    ArrayList<Product> products=new ArrayList<>();
    public void addProduct(Product product){
        products.add(product);
    }
    public void removeProduct(int productId){
        for (Product p:products){
            if(p.getProductId() == productId){
                products.remove(p);
                System.out.println("product removed");
                return;
            }

        }
        System.out.println("product not found");
    }
    public void searchProduct(String name){
        for(Product p :products){
            if(p.getName().equalsIgnoreCase(name)){
                System.out.println(p);
                return;
            }
        }

        System.out.println("product not found");
    }
    public double calculateTotal(){
        double total=0;
        for (Product p:products){
            total+=p.getPrice();
        }
        return total;
    }
    public void displayAllProducts(){
        Collections.sort(products);
        for (Product p:products){
            System.out.println(p);
        }

    }

}