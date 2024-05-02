public class Gadget {
    private String model;
    private double price;
    private int weight;
    private String size;

public Gadget(String model, double price, int weight, String size) {
        this.model = model;
        this.price = price;
        this.weight = weight;
        this.size = size;
    }

public String getmodel()
{
    return model;
}

public double getprice()
{
    return price;
}

public int getweight()
{
    return weight;
}

public String getsize()
{
    return size;
}

 public void display() 
     {
        System.out.println("Model: " + model);
        System.out.println("Price: £" + price);
        System.out.println("Weight: " + weight + " grams");
        System.out.println("Size: " + size);
    }

    public Gadget createGadget(String _model, double _price, int _weight, String _size) {
        return new Gadget(_model, _price, _weight, _size);
}

    
}
