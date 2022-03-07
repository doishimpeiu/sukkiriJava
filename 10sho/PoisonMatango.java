public class PoisonMatango extends Matango {
  super(suffix);
  int poisonCount = 5;
  public void attack(Hero h){
    super.attack(h);
    if (poisonCount > 0) {
      System.out.println("さらに毒の胞子をばら撒いた");
      h -= h/5;
      
    }
  }
}
