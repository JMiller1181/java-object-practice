public class Product {
    private String name;
    private double cost;
    private int amount;
    public Product(String name, double cost, int amount){
        this.name = name;
        this.amount = amount;
        this.cost = cost;
    }
    public double totalCost(){
        System.out.println("Total cost is: " + (this.cost * this.amount));
        return this.cost * this.amount;
    }
    public void printProduct(){
        System.out.println("One " + this.name + " costs " + this.cost + ".\n" +
                this.amount + " were purchased.");
    }
}
