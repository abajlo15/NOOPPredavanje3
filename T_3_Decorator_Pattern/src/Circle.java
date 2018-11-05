
public class Circle implements BasicShape {

	public static final String name = "Circle";
	private String shName;

	public Circle() {
		

	}

	@Override
	public String setShapeName(String shapeName) {

		this.shName = name;

		return shName;
	}

	@Override
	public void draw() {

		System.out.println("Drawing -->  " + shName);

	}

	@Override
	public void resize(int dim) {

		System.out.println("Basic Shape: " + dim + "times");
	}

	@Override
	public String description() {
		String desc = "Basic Shape: " + shName;
		return desc;
	}

	@Override
	public boolean isHide(int state) {

		if (state == 1) {
			return true;
		} else {
			return false;

		}
	}

}
