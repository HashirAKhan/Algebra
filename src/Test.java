public class Test {
	public static void main(String[] args) {
		LinearEquation firstLine = new LinearEquation(2, 1, -4);
		LinearEquation secondLine = new LinearEquation(1, 1, -7);
		Coords intersection = firstLine.pointOfIntersection(secondLine);
		System.out.println(intersection);
	}
}