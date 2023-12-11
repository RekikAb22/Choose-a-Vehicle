package javafinal;

public class Ship extends CVehicle{
    private String size;
    
    public Ship(String manf, String type, double Purchasingprice, double profit)
    {
        super.Purchasingprice=Purchasingprice;
        super.manf=manf;
        super.type=type;
        super.profit=profit;
    }
    public Ship(String size)
    {
        this.size=size;
    }
    public void discription()
    {
        switch(size)
        {
            case "Handymax":
                System.out.println("Discription");
                System.out.println("*Traditionally used for dry cargo.\n*A Handymax is normally 150-200m long.\n*Capacity: at least 60,000 TPM. \n*Can enter in any port");
                break;
            case "Aframax":
                System.out.println("Discription");
                System.out.println("*AFRA(Average Freight Rate Assessment\n*A Standardised tanker rate system\n*Medium sized tankers\n*Capacity: between 80,000 and 120,000 TPM.\n*Ideal for short and medium distance oil trade)");
                break;
            case "Panamax":
                System.out.println("Discription");
                System.out.println("*Maximum acceptable size to travel through the Panama Canal\n*Applies to both solid cargo ships and oil tankers\n*Capacity: between 50,000 and 80,000 TPM.");
                break;
            case "Suezmax":
                System.out.println("Discription");
                System.out.println("*Manufacturd inorder to pass through the Suez Canal\n*Medium sized vessels\n*Capacity: between 120,000 and 200,000 TPM");
                break;
            case "Capesize":
                System.out.println("Discription");
                System.out.println("*Cannot travel through Panama and Suez canals\n *Passes through the Cape Horn and Cape of Good Hope\n *Capacity: between 80,000 and 175,000 TPM");
                break;
            case "VLCC":
                System.out.println("Discription");
                System.out.println("*Very large Crude Carriers\n*Huge Oil tankers\n*Capacity: between 150,000 and 320,000 TPM");
                break;
        }
    }
         public double tax()
        {
            return Purchasingprice*0.15;
        }
        
        public double Sellingprice()
        {
            return tax()+profit+Purchasingprice;
        }
    
	public void display() {
            System.out.println("Manufacturer: "+manf);
            System.out.println("Type : "+type);
            System.out.println("Purchasing price : "+Purchasingprice);
            System.out.println("Tax : "+tax());
            System.out.println("Selling Price: "+Sellingprice());
            System.out.println("=====================================");
            
	}
	
}
