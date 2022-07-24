package assignment1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scn=new Scanner(System.in);
		String choice=null;
		
		List<Car>cars=new ArrayList<>();
		
		while(true)
		{
			if(choice==null||choice.equals("y"))
			{
				System.out.print("please enter model name : ");
				String model = scn.next();
				System.out.print("please enter car type : ");
				String type = scn.next();
				System.out.print("please enter car cost prize : ");
				Double price = scn.nextDouble();
				System.out.print("please enter insurance type : ");
				String insuranceType = scn.next();
				
				CarService csobj = new CarService(type, price, insuranceType);
				Double totalInsurance=null;
				try {
					 totalInsurance = csobj.calculateCarInsurance();
					 if(totalInsurance==null)
					 {
						 throw new Exception("invalid insurance type");
					 }
					 else
					 {
						 cars.add(new Car(model, type, insuranceType, price, totalInsurance));
						 System.out.println("Do you want to enter details of any other car (y/n):");
						 choice=scn.next();
					 }
				} catch (Exception e) {
					// TODO Auto-generated catch block
					System.out.println(e.getMessage());
					break;
					
				}
				
				
			}
			else 
			{
				break;
			}
			
		}
		
		
		for(Car car:cars)
		{
			System.out.println(car);
		}

	}

}
