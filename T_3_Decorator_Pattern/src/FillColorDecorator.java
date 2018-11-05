
public class FillColorDecorator extends ShapeDecorator {

	Color fillColor;

	public FillColorDecorator(BasicShape bs, Color color) {

		this.decoratedShape = bs;
		this.fillColor = color;
	}

	public FillColorDecorator() {
		// TODO Auto-generated constructor stub
	}

	public void setBasicShape2Decorate(BasicShape shape) {

		this.decoratedShape = shape;

	}

	public void setFillColor(Color clr) {

		this.fillColor = clr;
	}

	@Override
	public String setShapeName(String shapeName) {

		String name = decoratedShape.setShapeName(shapeName) + "Filled with color: " + fillColor;
		return name;
	}

	@Override
	public void draw() {

		decoratedShape.draw();
		System.out.println("Filled with color: " + fillColor);

	}

	@Override
	public void resize(int dim) {
		decoratedShape.resize(dim);
	}

	@Override
	public String description() {
		String desc = decoratedShape.description() + "filled with: " + fillColor + "Color!";
		
		return desc;
	}

	@Override
	public boolean isHide(int state) {

		return decoratedShape.isHide(state);
	}

}
