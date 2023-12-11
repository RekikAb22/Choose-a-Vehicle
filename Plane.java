package javafinal;

public class Plane extends CVehicle{
    
    public Plane(String manf, String type, double Purchasingprice, double profit)
    {
        super.Purchasingprice=Purchasingprice;
        super.manf=manf;
        super.type=type;
        super.profit=profit;
    }
    private String crafttype;
    public Plane(String crafttype)
    {
        this.crafttype=crafttype;
    }
    
    public void passengers()
    {
        switch(crafttype)
        {
            case "Airbus-380":
                System.out.println("Number of passengers: 853");
                break;
            case "Boeng-777":
                System.out.println("Number of passengers: 550");
                break;
            case "Boeng-747":
                System.out.println("Number of passengers: 524");
                break;
            case "Airbus-340":
                System.out.println("Number of passengers: 475");
                break;
            case "Airbus-330":
                System.out.println("Number of passengers: 300");
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
