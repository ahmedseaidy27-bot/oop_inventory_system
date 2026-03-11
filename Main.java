import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Inventory inventory=new Inventory();
        Scanner sr=new Scanner(System.in);

        while (true){
            System.out.println("1 Add Product");
            System.out.println("2 Search Product");
            System.out.println("3 Remove Product");
            System.out.println("4 Total Product");
            System.out.println("5 Display All Product");
            System.out.println("6 Exit");
            int choice=sr.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Enter ID: ");
                    int id=sr.nextInt();
                    System.out.println("Enter Name: ");
                    String name=sr.next();
                    System.out.println("Enter price: ");
                    double price=sr.nextDouble();

                    Product p=new Product(id,name,price);
                    inventory.addProduct(p);
                    break;

                case 2:
                    System.out.println("Enter Product name: ");
                    String searchName=sr.next();
                    inventory.searchProduct(searchName);
                    break;

                case 3:
                    System.out.println("Enter Product ID");
                    int removedId= sr.nextInt();
                    inventory.removeProduct(removedId);
                    break;

                case 4:
                    System.out.println("Total Price = "+inventory.calculateTotal());
                    break;

                case 5:
                    inventory.displayAllProducts();
                    break;

                case 6:
                    return;
            }
        }






    }



}