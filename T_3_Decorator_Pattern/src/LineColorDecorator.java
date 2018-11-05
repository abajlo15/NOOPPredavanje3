
public class LineColorDecorator extends ShapeDecorator {

	Color lineColor;

	public LineColorDecorator(BasicShape bs, Color color) {

		this.decoratedShape = bs;
		this.lineColor = color;

	}
	
	public LineColorDecorator() {
		
	}

	public void setBasicShape2Decorate(BasicShape shape) {

		this.decoratedShape = shape;

	}

	public void setLineColor(Color clr) {
		this.lineColor = clr;
	}

	@Override
	public String setShapeName(String shapeName) {
		// TODO Auto-generated method stub
		return decoratedShape.setShapeName(shapeName)+"Line color: "+lineColor;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Lines with color: " + lineColor);
	}

	@Override
	public void resize(int dim) {
		decoratedShape.resize(dim);

	}

	@Override
	public String description() {
		// TODO Auto-generated method stub
		return decoratedShape.description() + "With colored lines: "+ lineColor;
	}

	@Override
	public boolean isHide(int state) {
		// TODO Auto-generated method stub
		return decoratedShape.isHide(state);
	}

}
