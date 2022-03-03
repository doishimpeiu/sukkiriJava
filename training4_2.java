public class training4_2 {
  public static void main(String[] args){
    int[] moneyList = new int[] {121902, 8302, 55100};
    for (int i = 0; i < 3; i++) {
      System.out.println(moneyList[i]);
    }
    System.out.println("拡張for");
    for (int value : moneyList) {
      System.out.println(value);
    }
  }
}
