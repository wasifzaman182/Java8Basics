package abstractFacotoryPattern;

public class AbstractMain {

	public static void main(String[] args) {

		IGuiFactory f  = new WindowGuiFactory();
		
		IButton b = f.createButton();
		ICheckBox c = f.createCheckBox();
		
		b.render();
		c.render();

	}

}
