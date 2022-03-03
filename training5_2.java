public class training5_2 {
  public static void main(String[] args) {
    String title = "誕生日パーティー";
    String address = "is0419rf@ed.ritsumei.ac.jp";
    String text = "こんにちは";
    email(title, address, text);
    System.out.println("メソッドのオーバーロード");
    email(address, text);
  }

  public static void email(String title, String address, String text) {
    System.out.println(address + "に以下のメールを送信しました.");
    System.out.println("件名：" + title);
    System.out.println("本文：" + text);
  }
  public static void email(String address, String text) {
    System.out.println(address + "に以下のメールを送信しました.");
    System.out.println("件名：無題");
    System.out.println("本文：" + text);
  }
}
