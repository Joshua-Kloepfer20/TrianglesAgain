public class Triangle {
  private Point v1, v2, v3;

  public Triangle(Point a, Point b, Point c) {
    v1 = new Point(a);
    v2 = new Point(b);
    v3 = new Point(c);
  }
  public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
    v1 = new Point(x1, y1);
    v2 = new Point(x2, y2);
    v3 = new Point(x3, y3);
  }
  public double getPerimeter() {
    return v1.distanceTo(v2) + v1.distanceTo(v3) + v2.distanceTo(v3);
  }
  public double getArea() {
    double s = this.getPerimeter() / 2;
    return Math.sqrt(s * (s - v1.distanceTo(v2)) * (s - v1.distanceTo(v3)) * (s - v2.distanceTo(v3)));
  }
  public String classify() {
    if (v1.distanceTo(v2) == v1.distanceTo(v3) && v1.distanceTo(v2) == v2.distanceTo(v3)) {
      return "equaliteral";
    }
    else if (v1.distanceTo(v2) == v1.distanceTo(v3) || v1.distanceTo(v2) == v2.distanceTo(v3) || v1.distanceTo(v3) == v1.distanceTo(v2)) {
      return "isosceles";
    }
    else {
      return "scalene";
    }
  }
  public String toString() {
    return "v1(" + String.valueOf(v1.getX()) + ", " + String.valueOf(v1.getY()) + ") v2(" + String.valueOf(v2.getX()) + ", " + String.valueOf(v2.getY()) + ") v3(" + String.valueOf(v3.getX()) + ", " + String.valueOf(v3.getY()) + ")";
  }
  public void setVertex(int index, Point newP) {
    if (index == 0) {
      v1 = newP;
    }
    else if(index == 1) {
      v2 = newP;
    }
    else {
      v3 = newP;
    }
  }
}
