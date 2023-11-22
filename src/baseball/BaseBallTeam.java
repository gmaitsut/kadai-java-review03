package baseball;

public class BaseBallTeam {
    // フィールド
    private String name;// チーム名
    private int win;// 勝数
    private int lose;// 負け数
    private int draw;// 引分数


    //コンストラクタ
    public BaseBallTeam() {
}

    // 引数ありコンストラクタ
    public BaseBallTeam(String name, int win, int lose, int draw) {
        System.out.println("初期化時に引数ありコンストラクタが呼ばれました");
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }


    //もうひとつ、 report というメソッドを BaseBallTeam に作ります。
    //○○ の2022年の成績は △△勝 □□敗 ☆☆分、勝率は 0.▽▽▽▽▽▽です。と表示するメソッドです
    public void report() {
        System.out.println(this.name + "の2022年の成績は　" + this.win + " 勝 " + this.lose + " 敗 " + this.draw + " 分、勝率は　" + getRate() + "です。");
    }

    //勝率はフィールドとして持たせず、メソッドにします。
    //「勝ち数/(勝ち数+負け数)」の計算で求められるからです。
    //この計算結果を小数値（double）で戻す getRate メソッドを BaseBallTeam に作ってください
    public double getRate() {
        double rate = (double) win / (win + lose);
        return rate;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }

}
