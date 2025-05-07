/**
*
* Lab 10 Car class
* @author Nathan Adkins
*/

public class Car extends Vehicle {
	
	private int numDoors;
	private int numPass;
	
	public Car(int aNumDoors, int aNumPass, String aMake, String aModel, String aPlate) {
		super(aMake, aModel, aPlate);
		this.numDoors = aNumDoors;
		this.numPass = aNumPass;
		
	}
	public int getNumDoors() {
		return this.numDoors;
	}
	
	public int getNumPass() {
		return this.numPass;
	}
	
	@Override
	public String toString() {
		String result= String.format("%s", this.numDoors) + super.toString();
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Car)) {
			return false;
		}
		
		Car other = (Car) obj;
		if (this.numDoors == other.getNumDoors()) {
			if (this.numPass == other.getNumPass()) {
				return super.equals(obj);
			}
		} return false;
	}
	
	public Car copy() {
		int theNumDoors = this.numDoors;
		int theNumPass = this.numPass;
		String theMake = super.getMake();
		String theModel = super.getModel();
		String thePlate = super.getPlate();
		
		Car theCopy = new Car(theNumDoors, theNumPass, theMake, theModel, thePlate);
		return theCopy;
	}
}