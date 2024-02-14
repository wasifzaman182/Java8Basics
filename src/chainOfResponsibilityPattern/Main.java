package chainOfResponsibilityPattern;

class Shape {
    public int getArea() {
        return 0;
    }
}

class Rectangle extends Shape {
    int width = 0;
	int height = 0;
	
    public int getArea() {
		return width * height;
    }

	public void setWidth(int width) {
		this.width = width;
	}

	public void setHeight(int height) {
		this.height = height;
	}

}

class Square extends Shape {
	 int side = 0;
    public int getArea() {
       
		return side * side;
    }

	public void setSide(int i) {
		this.side  = i;
		
	}
}

public class Main {
    static void printArea(Shape shape) {
        System.out.println("Area: " + shape.getArea());
    }

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(10);
        printArea(rectangle); // Output: Area: 50

        Square square = new Square();
        square.setSide(5);
        printArea(square); // Output: Area: 25
    }
}
