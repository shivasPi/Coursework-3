public class Mobile {
    private String model;
    private double price;
    private double weight;
    private double size;
    private int credit;

    public Mobile(String model, double price, double weight, double size, int credit) {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;
        this.credit = credit;
    }

    // Getters and Setters for the class variables
    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public double getSize() {
        return size;
    }

    public int getCredit() {
        return credit;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public static void main(String[] args) {
        String model = "iPhone 12";
        double price = 999.99;
        double weight = 0.20;
        double size = 6.1;
        int credit = 5;

        Mobile mobile = new Mobile(model, price, weight, size, credit);
        
        // Accessing the object's properties
        System.out.println("Model: " + mobile.getModel());
        System.out.println("Price: " + mobile.getPrice());
        System.out.println("Weight: " + mobile.getWeight());
        System.out.println("Size: " + mobile.getSize());
        System.out.println("Credit: " + mobile.getCredit());
    }
}

