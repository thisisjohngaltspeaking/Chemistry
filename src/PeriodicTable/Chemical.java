package PeriodicTable;



public class Chemical {

	int atomicNumber;
	int atomicWeight;
	String chemicalName;
	String fullName;
	int primaryOxidationState;

	public void setAll(int atomicNumber, int atomicWeight, String chemicalName,
			String fullName, int primaryOxidationState) {
		this.atomicNumber = atomicNumber;
		this.atomicWeight = atomicWeight;
		this.chemicalName = chemicalName;
		this.fullName = fullName;
		this.primaryOxidationState = primaryOxidationState;
	}

	public int getPrimaryOxidationState() {
		return primaryOxidationState;
	}

	public void setPrimaryOxidationState(int primaryOxidationState) {
		this.primaryOxidationState = primaryOxidationState;
	}

	public int getAtomicNumber() {
		return atomicNumber;
	}

	public void setAtomicNumber(int atomicNumber) {
		this.atomicNumber = atomicNumber;
	}

	public int getAtomicWeight() {
		return atomicWeight;
	}

	public void setAtomicWeight(int atomicWeight) {
		this.atomicWeight = atomicWeight;
	}

	public String getChemicalName() {
		return chemicalName;
	}

	public void setChemicalName(String chemicalName) {
		this.chemicalName = chemicalName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

}
