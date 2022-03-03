public class training5_4 {
  public static void main(String[] args) {
    double ans1 = calcTriangleArea(10.0, 5.0);
    double ans2 = calcCircleArea(5.0);
    System.out.println(ans1 + "と" + ans2);
  }

  public static double calcTriangleArea(double bottom, double height) {
    double ans = bottom * height / 2;
    return ans;
  }

  public static double calcCircleArea(double radius) {
    double ans = radius * radius * 3.14;
    return ans;
  }
}
