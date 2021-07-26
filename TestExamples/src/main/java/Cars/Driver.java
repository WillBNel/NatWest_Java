package Cars;

public class Driver {

	private String name;
	private int id;
	private int mileage;

	public Driver (String name, int id, int mileage) {
		this.name = name;
		this.id = id;
		this.mileage = mileage;
		
	}
	
	public void drive(int milesDriven) {
		this.setMileage(this.getMileage() + milesDriven);

			
	}


	public int getMileage() {
		return getMileage();
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}


	@Override
	public String toString() {
		return "Driver [mileage=" + mileage + "]";
	}

	
	
}
