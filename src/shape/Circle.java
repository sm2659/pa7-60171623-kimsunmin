package shape;

public class Circle extends Shape {//ShapeŬ���� ���

	public Circle(double a, double b, double c) {
		//doubleŸ����  �Է¹޴� Constructor ����
		getArea();{
			System.out.printf("Area: %.1f\n", (c*c*(3.14)));
		}
		getLength();{
			System.out.printf("Length: %.1f\n", (2*c*(3.14)));
		}
		draw();{
			System.out.println("Circle center "+"("+a+", "+b+")"+"-"+"Radius ("+c+")");
		}
		}		
//Shape���� ��ӹ��� �޼ҵ带 �̿��Ͽ� Circle�� ����,����,��ǥ ����Ʈ
	
		
	
	



	@Override
	public void draw() {
		
	}//Drawable interface���� �̱��� ���ִ� �޼ҵ带 ��������

	}
		
