import java.util.Scanner;
//Invoice class
public class Invoice {
    private String partNumber;
    private String partDescription;
    private int quantity;
    private double pricePerItem;
    //constructor to initialize default values
    public Invoice()
    {
        partNumber = "None";
        partDescription = "None";
        quantity = 0;
        pricePerItem = 0.0;
    }
    //Accessor method
    //get part number
    public String getPartNumber()
    {
        return partNumber;
    }
    //get part description
    public String getPartDescription()
    {
        return partDescription;
    }
    //get part quantity
    public int getQuantity()
    {
        return quantity;
    }
    //get price per item
    public double getPricePerItem()
    {
        return pricePerItem;
    }
    //Mutator methods
    //set part number
    public void setPartNumber(String partNumber)
    {
        this.partNumber = partNumber;
    }
    //set part description
    public void setPartDescription(String partDescription)
    {
        this.partDescription = partDescription;
    }
    //set quantity
    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
    //set price per item
    public void setPricePerItem(double pricePerItem)
    {
        this.pricePerItem = pricePerItem;
    }
    //calculating amd returning the Invoice amount
    public double getInvoiceAmount()
    {
        return (quantity * pricePerItem); //calculates total cost
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String partNum;
        String partDescr;
        int quantity;
        double price;
        // creating two invoice objects
        Invoice invoiceOne = new Invoice();
        Invoice invoiceTwo = new Invoice();
        //getting invoice 1 details from the user
        System.out.println("-------------------------------------------");
        System.out.println("INVOICE 1");
        System.out.print("Enter the part number: ");
        partNum = scanner.nextLine();
        System.out.print("Enter the name of the item: ");
        partDescr = scanner.nextLine();
        System.out.print("Enter the quantity of items being bought: ");
        quantity = scanner.nextInt();
        System.out.print("Enter the price per item: ");
        price = scanner.nextDouble();
        System.out.println("-------------------------------------------");
        System.out.println(" ");
        // add invoiceOne's data
        invoiceOne.setPartNumber(partNum);
        invoiceOne.setPartDescription(partDescr);
        invoiceOne.setQuantity(quantity);
        invoiceOne.setPricePerItem(price);
        //getting invoice 2 details from the user
        System.out.println("INVOICE 2");
        System.out.print("Enter the part number: ");
        scanner.nextLine();
        partNum = scanner.nextLine();
        System.out.print("Enter the name of the item: ");
        partDescr = scanner.nextLine();
        System.out.print("Enter the quantity of items being bought: ");
        quantity = scanner.nextInt();
        System.out.print("Enter the price per item: ");
        price = scanner.nextDouble();
        System.out.println("-------------------------------------------");
        System.out.println(" ");
        // add invoiceOne's data
        invoiceTwo.setPartNumber(partNum);
        invoiceTwo.setPartDescription(partDescr);
        invoiceTwo.setQuantity(quantity);
        invoiceTwo.setPricePerItem(price);
        //display invoiceOne's data
        System.out.println("Invoice One Information");
        System.out.println("part number: " + invoiceOne.getPartNumber());
        System.out.println("Description: " +
                invoiceOne.getPartDescription());
        System.out.println("Quantity: " + invoiceOne.getQuantity());
        System.out.println("price: $" + invoiceOne.getPricePerItem());
        System.out.printf("Invoice amount: $%.2f", +
                invoiceOne.getInvoiceAmount());
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println();
        //display invoiceTwo's data
        System.out.println("Invoice Two Information");
        System.out.println("part number: " + invoiceTwo.getPartNumber());
        System.out.println("Description: " +
                invoiceTwo.getPartDescription());
        System.out.println("Quantity: " + invoiceTwo.getQuantity());
        System.out.println("price: $" + invoiceTwo.getPricePerItem());
        System.out.printf("Invoice amount: $%.2f", +
                invoiceTwo.getInvoiceAmount());
    }// end main class
} // end of class invoice