public class Tester {
  public static void main(String[] args) {
    //Point one = new Point(5, 4);
    //Point two = new Point(10, 23);
    //System.out.println(one.distanceTo(two));
    //Point one = new Point(5, 4);
    //Point two = new Point(4, 4);
    //System.out.println(one.equals(two));
    //Point one = new Point(4, 6);
    //Point two = new Point(10, 13);
    //Point three = new Point(5, 15);
    //Triangle triangle1 = new Triangle(one, two, three);
    //System.out.println(triangle1.getPerimeter());
    //System.out.println(triangle1.getArea());
    //System.out.println(triangle1.toString());
    Point one = new Point(Math.sqrt(75), 0);
    Point two = new Point(0, 5);
    Point three = new Point(0, -5);
    Triangle triangle1 = new Triangle(one, two, three);
    System.out.println(triangle1.classify());
    Point newP = new Point(0, 0);
    triangle1.setVertex(1, newP);
    System.out.println(triangle1.toString());
  }
}
