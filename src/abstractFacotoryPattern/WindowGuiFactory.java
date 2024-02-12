package abstractFacotoryPattern;

public class WindowGuiFactory implements IGuiFactory {

	@Override
	public IButton createButton() {
		
		return new WindowButton();
	}

	@Override
	public ICheckBox createCheckBox() {
		return new WindowCheckBox();
	}

}
