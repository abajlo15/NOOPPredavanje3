
public class LineStyleDecorator extends ShapeDecorator {
	
	LineStyle lineStyle;
	
	public LineStyleDecorator(BasicShape bs , LineStyle ls) {
		
		this.decoratedShape = bs;
		this.lineStyle = ls;
		
	}

	public LineStyleDecorator() {
		// TODO Auto-generated constructor stub
	}

	public void setBasicShape2Decorate(BasicShape shape) {

		this.decoratedShape = shape;

	}

	public void setLineStyle(LineStyle ls) {
		this.lineStyle = ls;
	}
	
	

	@Override
	public String setShapeName(String shapeName) {
		// TODO Auto-generated method stub
		return decoratedShape.setShapeName(shapeName)+"with line Style : "+lineStyle;
	}

	@Override
	public void draw() {
		decoratedShape.draw();
		System.out.println("Line style: "+ lineStyle);

	}

	@Override
	public void resize(int dim) {

		decoratedShape.resize(dim);
	}

	@Override
	public String description() {
		String desc = decoratedShape.description()+"Wiht line style: "+lineStyle;
		return desc;
	}

	@Override
	public boolean isHide(int state) {
		// TODO Auto-generated method stub
		return decoratedShape.isHide(state);
	}

}
