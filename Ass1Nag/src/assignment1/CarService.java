package assignment1;

public class CarService {
	
	private String type;
	private Double price;
	private String insuranceType;
	public CarService(String type, Double price, String insuranceType) {
		
		this.type = type;
		this.price = price;
		this.insuranceType = insuranceType;
	}
	public Double calculateCarInsurance() throws Exception {
		Double insurance=null;
		if(CarConstant.getValueToCalculatePercentage().containsKey(type))
		{
		 insurance=	CarConstant.getValueToCalculatePercentage().get(type)*price;
		
		if(insuranceType.equals("Premium"))
		{
			Double premiumInsurance=null;
			Double twenty=20.0;
			Double hundred =100.0;
			
			
			premiumInsurance=insurance*twenty;
			premiumInsurance=premiumInsurance/hundred;
			insurance+=premiumInsurance;
		}
		else if(!insuranceType.equals("Basic"))
		{
			return null;
		}
			
		
		}
		else
		{
			if(insurance==null)
				throw new Exception("invalid car type");
		
		}
		return insurance;
		
	}
	
	
}
