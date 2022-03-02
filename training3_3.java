public class training3_3 {
  public static void main(String[] args) {
    // int isHungry = new java.util.Random().nextInt(1);
    int isHungry = 1;
    String food = "カレー";
    System.out.println("こんにちは");
    if (isHungry == 0) {
      System.out.println("お腹がいっぱいです.");
    } else {
      System.out.println("腹ペコです");
      System.out.println(food + "をいただきます");
    }
    System.out.println("ご馳走様でした.");
  } 
}