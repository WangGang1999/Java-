package example_Overload;

public class Test {

	public static void main(String[] args) {
		Area a =new Area();
		System.out.println("求一个圆的面积，该圆的面积为："+a.area(3));
		System.out.println("求一个矩形的面积，该矩形的面积为："+a.area(3, 4));

	}

}
