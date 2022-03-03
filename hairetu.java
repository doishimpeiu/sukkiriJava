public class hairetu {
  public static void main(String[] args) {
    //配列を作るステップ
    // int[] scores;  //ステップ1
    // scores = new int[5];  //ステップ2
    int[] scores = new int[5];  //ステップ1と2を同時に
    int num = scores.length;
    System.out.println("要素の数：" + num);
    
    //配列の要素にアクセス
    scores[1] = 30;
    System.out.println(scores[1]);

    //配列の省略記法
    int[] scores1 = new int[] {20, 30, 40, 50, 80};
    int[] scores2 = {20, 30, 40, 50, 80};
    System.out.println(scores1[1]);
    System.out.println(scores2[2]);

    //配列とfor 
    int sum = 0;
    for (int i = 0; i < scores.length; i++) {
      sum += scores1[i];
    }
    int avg = sum / scores.length;
    System.out.println("合計点：" + sum);
    System.out.println("平均点：" + avg);
  }
}
