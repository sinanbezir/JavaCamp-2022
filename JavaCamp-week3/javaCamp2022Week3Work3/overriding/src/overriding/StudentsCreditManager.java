package overriding;

public class StudentsCreditManager extends BaseCreditManager {
	public double hesapla(double tutar) {
		return tutar * 1.10;
	}
}
