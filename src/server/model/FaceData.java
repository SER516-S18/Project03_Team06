package server.model;

public class FaceData {
	
	private double counter = 0;
	private AffectiveData affectiveData = new AffectiveData();
	private ExpressiveData expressiveData = new ExpressiveData();
	
	public AffectiveData getAffectiveData() {
		return affectiveData;
	}
	public void setAffectiveData(AffectiveData affectiveData) {
		this.affectiveData = affectiveData;
	}
	public ExpressiveData getExpressiveData() {
		return expressiveData;
	}
	public void setExpressiveData(ExpressiveData expressiveData) {
		this.expressiveData = expressiveData;
	}
	public double getCounter() {
		return counter;
	}
	public void setCounter(double counter) {
		this.counter = counter;
	}
}
