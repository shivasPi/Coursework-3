public class MP3 extends Gadget 
{
    private int availableMemory;
    private String model;
    private double price;
    private int weight;
    private String size;

     

    public MP3(String model, double price, int weight, String size, int availableMemory)
    {
        super(model, price, weight, size);
        this.availableMemory = availableMemory;
    }
    
    public void mp3downloadMusic(String song) {
    System.out.println("Downloading " + song + "...");
    // Simulate downloading the music by deducting memory
    int songSize = 10; // Example song size in MB
    if (availableMemory >= songSize) {
        availableMemory -= songSize;
        System.out.println(song + " downloaded successfully!");
    } else {
        System.out.println("Not enough memory to download " + song + ".");
    }
} 

    @Override
    public void display() {
        super.display(); // Call the display method of the superclass
        System.out.println("Available Memory: " + availableMemory + " MB");
    }
}
