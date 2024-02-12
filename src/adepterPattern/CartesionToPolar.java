package adepterPattern;

public class CartesionToPolar implements IPolarShape {
	
	private ICartesianShape cartesianShape;
	
	public CartesionToPolar(ICartesianShape cartesianShape) {
		this.cartesianShape = cartesianShape;
	}
	

	@Override
	public void draw(int radius, int angle) {
		

		// Convert polar coordinates to Cartesian coordinates
        int x = (int) (radius * Math.cos(Math.toRadians(angle)));
        int y = (int) (radius * Math.sin(Math.toRadians(angle)));
        // Delegate drawing to the third-party library using Cartesian coordinates
        cartesianShape.draw(x, y);
	}

}
