package decoratorPattern;

public class DecoratorPatternMain {

	public static void main(String[] args) {

		IShape sp = new Cricle();
		
		ShapeDecorator sh = new RedShapeDecorator(sp);
		sh.draw();
		
		IShape s = new Rectengle();
		ShapeDecorator re = new RedShapeDecorator(s);
		re.draw();
	}

}
