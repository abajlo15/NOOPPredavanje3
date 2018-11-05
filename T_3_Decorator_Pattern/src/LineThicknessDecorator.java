
public class LineThicknessDecorator extends ShapeDecorator {

	protected double lineThickness;

	public LineThicknessDecorator(BasicShape bs, double lth) {

		this.lineThickness = lth;
		this.decoratedShape = bs;
	}

	public LineThicknessDecorator() {
		// TODO Auto-generated constructor stub
	}

	public void setBasicShape2Decorate(BasicShape shape) {

		this.decoratedShape = shape;

	}

	public void setLineThickness(double lth) {
		this.lineThickness = lth;
	}

	@Override
	public String setShapeName(String shapeName) {
		// TODO Auto-generated method stub
		return decoratedShape.setShapeName(shapeName);
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("With lnes thickness: " + lineThickness);
	}

	@Override
	public void resize(int dim) {
		decoratedShape.resize(dim);

	}

	@Override
	public String description() {
		String desc = decoratedShape.description() + "With line thickness" + lineThickness;
		return desc;
	}

	@Override
	public boolean isHide(int state) {
		// TODO Auto-generated method stub
		return decoratedShape.isHide(state);
	}

}
