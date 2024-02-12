package decoratorPattern;

public abstract class ShapeDecorator implements IShape{

	public IShape iShape;
	
	public ShapeDecorator(IShape iShape) {
		this.iShape = iShape;
	}
	
	public void draw() {
		iShape.draw();
	}
}
