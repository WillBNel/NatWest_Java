package Cars;

public class Car {
	
	private String colour;
	private String model;
	private int milage;
	
	public Car(String colour, String model, int milage) {
		super();
		this.colour = colour;
		this.model = model;
		this.milage = milage;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}


	@Override
	public String toString() {
		return "Car [colour=" + colour + ", moderl=" + model + ", milage=" + milage + "]";
	}
	
	

}
