package adepterPattern;

public class AdapterPatternMain {

	public static void main(String[] args) {
		ICartesianShape cartesianShape = new ThirdPartyCartesionShape();
		
		IPolarShape adapter = new CartesionToPolar(cartesianShape);
		adapter.draw(5, 45);
	}
}
