
public abstract class ShapeDecorator implements BasicShape {

	protected BasicShape decoratedShape;

	public void setShape2Decorate(BasicShape shape) {

		this.decoratedShape = shape;
	}
}
