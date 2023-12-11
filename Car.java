package javafinal;

public class Car extends CVehicle {
    private String Transmission;
    
        private int engine;
	public Car(String manf, String type, String Transmission, double Purchasingprice, double profit) {
            super.Purchasingprice=Purchasingprice;
            super.profit=profit;
            super.manf=manf;
            super.type=type;
            this.Transmission=Transmission;
	}
       public Car(int engine)
       {
           this.engine=engine;
       }
        public void engine()
        {
            switch(engine)
            {
                case 3:
                    System.out.println("Small Power");
                    break;
                case 4:
                    System.out.println("Normal Power");
                    break;
                case 6: 
                    System.out.println("Moderate Power");
                    break;
                case 8:
                    System.out.println("Powerful ");
                    break;
            }
        }
        
    @Override
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
            System.out.println("Transmission: "+Transmission);
            System.out.println("Purchasing price : "+Purchasingprice);
            System.out.println("Tax : "+tax());
            System.out.println("Selling Price: "+Sellingprice());
            System.out.println("=====================================");
	}


	
	
}
