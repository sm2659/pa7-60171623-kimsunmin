package shape;
//60171623 �輱��
public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape[] shapes = new Shape[3];
		shapes[0] = new Rectangle(10,20,30,40);
		shapes[1] = new Rectangle(30,30,10,10);
		shapes[2] = new Circle(50,20,30);
		//constructor�� �Է°��� �־���
		
		Drawable[] drawables = new Drawable[4];
		for(int i = 0; i < shapes.length; i++) {
			drawables[i] = (Drawable)shapes[i];
		}
		drawables[3]= new Text("Sample Text");
		//constructor�� �Է°��� �־���
		for(Drawable d: drawables) {
			d.draw();
		}

	}

}
