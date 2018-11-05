
public class App {

	public static void main(String[] args) {
		
		BasicShape circle = new Circle();
		circle.setShapeName("a");
		
		BasicShape trokut = new Trokut();
		trokut.setShapeName("b");
		
		
		System.out.println("Create decorated circle with: ");
		System.out.println("1. line color with pruple color");
		System.out.println("2. line thickness 3.45");
		System.out.println("3. Line style --> DOUBLE_DASH");
		System.out.println("4. Fill with color green");
		System.out.println(" ************** Start decoration **************");
		LineColorDecorator lcd = new LineColorDecorator();
		lcd.setBasicShape2Decorate(circle);
		lcd.setLineColor(Color.PURPLE);
		//lcd.setShapeName("LineColName: ");
		//lcd.description();
		//lcd.draw();
		
		LineThicknessDecorator ltd = new LineThicknessDecorator();
		ltd.setBasicShape2Decorate(lcd);
		ltd.setLineThickness(3.45);
		//ltd.description();
		//ltd.draw();
		
		LineStyleDecorator lsd = new LineStyleDecorator();
		lsd.setBasicShape2Decorate(ltd);
		lsd.setLineStyle(LineStyle.DOUBLE_DASH);
		lsd.description();
		//lsd.draw();
		
		FillColorDecorator fcd = new FillColorDecorator();
		fcd.setBasicShape2Decorate(lsd);
		fcd.setFillColor(Color.GREEN);
		//fcd.description();
		fcd.draw();
		
		System.out.println("Create decorated Triangle with: ");
		System.out.println("1. line color with yellow color");
		System.out.println("2. line thickness 5");
		System.out.println("3. Line style --> DOT");
		System.out.println("4. Fill with color Black");
		System.out.println(" ************** Start decoration **************");
		
		LineColorDecorator lcd1 = new LineColorDecorator(trokut, Color.YELLOW);
		LineThicknessDecorator ltd1 = new LineThicknessDecorator(lcd1, 5.6);
		LineStyleDecorator lsd1 = new LineStyleDecorator(lcd1, LineStyle.DOT);
		FillColorDecorator fcd1 = new FillColorDecorator(lsd1, Color.BLACK);
		fcd1.draw();
		
		System.out.println("---------Druga Verzija--------------");
		
		double a = 5;
		FillColorDecorator fd2 = new FillColorDecorator(new LineStyleDecorator(new LineThicknessDecorator(new LineColorDecorator(trokut, Color.GREEN), a ),LineStyle.DOT), Color.BLACK);
		fd2.description();
		fd2.draw();
	}

}
