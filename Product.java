public class Product implements Comparable<Product> {
    
        private int productId;
        private String name;
        private double price;

    public Product(){}
    public Product(int productId,String name,double price){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }
    public void setProductId(int productId){
        this.productId=productId;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "ID: "+productId+"\nName: "+name+"\n Price: "+price;
    }
    public int compareTo(Product p){
        return this.name.compareTo(p.name);
    }
}