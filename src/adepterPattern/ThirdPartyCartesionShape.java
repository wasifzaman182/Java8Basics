package adepterPattern;

public class ThirdPartyCartesionShape implements ICartesianShape {

	@Override
	public void draw(int x, int y) {
		
		System.out.println("Drawing shape at Cartesian coordinates: (" + x + ", " + y + ")");
	}

}
