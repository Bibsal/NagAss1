package assignment1;

public class Car {
	private String model;
	private String type;
	private String insuranceType;
	private Double price;
	private Double actualInsurance;
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getInsuranceType() {
		return insuranceType;
	}
	public void setInsuranceType(String insuranceType) {
		this.insuranceType = insuranceType;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Double getActualInsurance() {
		return actualInsurance;
	}
	public void setActualInsurance(Double actualInsurance) {
		this.actualInsurance = actualInsurance;
	}
	public Car(String model, String type, String insuranceType, Double price, Double actualInsurance) {
	
		this.model = model;
		this.type = type;
		this.insuranceType = insuranceType;
		this.price = price;
		this.actualInsurance = actualInsurance;
	}
	@Override
	public String toString() {
		return "Car [model=" + model + ", price=" + price + ", finalInsurance=" + actualInsurance + "]";
	}
	
	
	
	

}
