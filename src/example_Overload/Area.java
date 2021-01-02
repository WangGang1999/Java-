package example_Overload;

public class Area {
	final float  PI=3.14f;
	float area(float r) {
		return PI*r*r;
	}
	float area(float a,float b) {
		//a为矩形的长，b为矩形的宽；
		return a*b;
	}
}
