package javafinal;
abstract class CVehicle {
	public CVehicle() {		
	}
	   
        abstract public double tax();
        abstract public double Sellingprice();
           protected double Purchasingprice;
           protected double profit;
           protected String manf;
           protected String type;
}