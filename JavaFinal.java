package javafinal;

import java.util.Scanner;
import java.util.ArrayList;

public class JavaFinal 
{

	public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("====WELCOME====");
            double Pprice, profit;
            String manf, type, trans;
            int choice;
            ArrayList<CVehicle> vehiclelist= new ArrayList<CVehicle>();
            CVehicle veh;// Object Reference
            do {
                System.out.println("Choose options by number: ");
                System.out.println("1. Car");
                System.out.println("2. Plane");
                System.out.println("3. Ship");
                System.out.println("4. Display All Cars");
                System.out.println("5. Display All Planes");
                System.out.println("6. Display All Ships");
                System.out.println("7. Display All Vehicles");
                System.out.println("8. Exit");
                choice=input.nextInt();
                switch (choice)
                {
                    case 1:
                    {
                        System.out.print("Enter Manufacturer: ");
                        manf=input.next();
                        System.out.print("Enter Type: ");
                        type=input.next();
                        System.out.print("Enter Transmission: ");
                        trans=input.next();
                        System.out.print("Enter Purchasing Price: ");
                        Pprice=input.nextDouble();
                        System.out.print("Enter Profit: ");
                        profit=input.nextDouble();
                        veh=new Car(manf,type,trans,Pprice,profit);//upcasting
                        vehiclelist.add(veh);
                        
                    }break;
                    case 2: 
                    {
                        System.out.print("Enter Manufacturer: ");
                        manf=input.next();
                        System.out.print("Enter Type: ");
                        type=input.next();
                        System.out.print("Enter Purchasing Price: ");
                        Pprice=input.nextDouble();
                        System.out.print("Enter Profit: ");
                        profit=input.nextDouble();
                        veh=new Plane(manf,type,Pprice,profit);//upcasting
                        vehiclelist.add(veh);
                    }break;
                    case 3:
                    {
                        System.out.print("Enter Manufacturer: ");
                        manf=input.next();
                        System.out.print("Enter Type: ");
                        type=input.next();
                        System.out.print("Enter Purchasing Price: ");
                        Pprice=input.nextDouble();
                        System.out.print("Enter Profit: ");
                        profit=input.nextDouble();
                        veh=new Ship(manf,type,Pprice,profit);//upcasting
                        vehiclelist.add(veh);
                    }break;
                    case 4: {
                        for (CVehicle vehicles:vehiclelist)
                        {
                            if (vehicles instanceof Car)
                            {
                                Car c1=(Car)vehicles;
                                c1.display();//Downcasting
                            }
                        }
                        int z=1;
                        do{
                        System.out.println("Enter number of engines to rate car");
                        int engine=input.nextInt();
                        try
                        {
                            if (engine<3||engine==5||engine==7||engine>8)
                                throw new EngineException();
                            z=2;
                             veh=new Car(engine);
                        if (veh instanceof Car)
                        {
                            ((Car)veh).engine();
                        }
                        }catch(EngineException Ex){}
                        }while(z==1);
                       
                    }
                        break;
                    case 5:{
                        for (CVehicle vehicles:vehiclelist)
                        {
                            if (vehicles instanceof Plane)
                            {
                                Plane p1=(Plane)vehicles;
                                p1.display();//downcasting
                            }
                        }
                        System.out.println("Enter Type  to view maximum number of passangers");
                        String crafttype=input.next();
                        int t=1;
                        do{
                        try
                        {
                            if (crafttype.equals("Airbus-380")||crafttype.equals("Boeng-777")||crafttype.equals("Boeng-747")||crafttype.equals("Airbus-340")||crafttype.equals("Airbus-330"))
                            {
                                t=2;
                            veh=new Plane(crafttype);
                        if (veh instanceof Plane)
                        {
                            ((Plane)veh).passengers();//downcasting
                        }}
                            else
                                throw new Typecheck();
                        }catch(Typecheck tc){}
                        }while(t==1);    
                        break;
                    }
                    case 6: 
                        for (CVehicle vehicles:vehiclelist)
                        {
                            if (vehicles instanceof Ship)
                            {
                                Ship s1=(Ship)vehicles;
                                s1.display();//downcasting
                            }
                        }
                        System.out.print("Enter Size To view discription: ");
                        
                        int s=1;
                        do{
                            String size=input.next();
                        try{
                            if (size.equals("Handymax")||size.equals("Aframax")||size.equals("Panamax")||size.equals("Suezmax")||size.equals("Capesize")||size.equals("VLCC"))
                            {
                                s=2;
                                veh=new Ship(size);
                                if (veh instanceof Ship)
                                   {
                                      ((Ship)veh).discription();//downcasting
                                   } 
                            }
                            else
                                throw new Sizechecker();
                        }catch(Sizechecker sc){}}while(s==1);
                        break;
                    case 7: 
                    {
                        for(CVehicle vehicles: vehiclelist)
                        {
                            if(vehicles instanceof Car)
                            {
                                ((Car)vehicles).display();//downcasting
                            }
                            else if(vehicles instanceof Plane)
                            {
                                ((Plane)vehicles).display();//downcasting
                            }
                            else if(vehicles instanceof Ship)
                            {
                                ((Ship)vehicles).display();//downcasting
                            }
                        }
                    }break;
                    case 8:
                        break;
                    default :
                        System.err.println("Invalid Choice");
                }
            }while (choice!=8);
}
}
