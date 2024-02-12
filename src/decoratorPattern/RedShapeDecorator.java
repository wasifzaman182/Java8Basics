package decoratorPattern;

public class RedShapeDecorator extends ShapeDecorator{

	public RedShapeDecorator(IShape iShape) {
		super(iShape);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw() {
		iShape.draw();
		setRedBorder(iShape);
		
		
	}

	
	public void setRedBorder(IShape shape) {
		System.out.println("Setting red border");
	}
}
