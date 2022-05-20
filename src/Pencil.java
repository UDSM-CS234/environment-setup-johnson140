public class Pencil {
    public String Colour;
    public int Length;
    public double Price;
    public Pencil(String pColour)
    {
        Colour = pColour;
    }
    public void setLength(int pLength)
    {
        Length = pLength;
    }
    public void setPrice(double pPrice)
    {
        Price = pPrice;
    }
    public void display()
    {
        System.out.println("Pencil colour: " + Colour);
        System.out.println("Pencil length: " + Length + "cm");
        System.out.println("Pencil's price: " + Price);
    }
    public static void main(String[] args)
    {
        Pencil s = new Pencil("blue");
        s.setLength(15);
        s.setPrice(500);
        s.display();
    }
}

