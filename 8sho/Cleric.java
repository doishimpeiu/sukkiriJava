import java.util.*;

public class Cleric {
  String name;
  int HP = 50;
  final int maxHP = 50;
  int MP = 10;
  final int maxMP = 10;

  public void selfAid(){
    this.MP -= 5;
    this.HP = this.maxHP;
  }

  public int pray(int sec){
    //論理上の回復量を乱数を用いて決定する
    int recover = new Random().nextInt(3) + sec;

    //実際の回復量を計算する
    int recoverActual = Math.min(this.maxMP - this.MP, recover);
    
    this.MP += recoverActual;
    return recoverActual;
  }
}
