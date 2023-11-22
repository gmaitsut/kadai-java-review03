package baseball;

public class Review03 {

    public static void main(String[] args) {
        BaseBallTeam yakuruto = new BaseBallTeam();
        yakuruto.setName("東京ヤクルトスワローズ");
        yakuruto.setWin(80);
        yakuruto.setLose(59);
        yakuruto.setDraw(4);
        yakuruto.report();


        BaseBallTeam yokohama = new BaseBallTeam();
        yokohama.setName("横浜DeNAベイスターズ");
        yokohama.setWin(73);
        yokohama.setLose(68);
        yokohama.setDraw(2);
        yokohama.report();


        BaseBallTeam hanshin = new BaseBallTeam();
        hanshin.setName("阪神タイガース");
        hanshin.setWin(68);
        hanshin.setLose(71);
        hanshin.setDraw(4);
        hanshin.report();


        BaseBallTeam yomiuri = new BaseBallTeam();
        yomiuri.setName("読売ジャイアンツ");
        yomiuri.setWin(68);
        yomiuri.setLose(72);
        yomiuri.setDraw(3);
        yomiuri.report();


        BaseBallTeam hiroshima = new BaseBallTeam();
        hiroshima.setName("広島東洋カープ");
        hiroshima.setWin(66);
        hiroshima.setLose(74);
        hiroshima.setDraw(3);
        hiroshima.report();


        BaseBallTeam tyunichi = new BaseBallTeam();
        tyunichi.setName("中日ドラゴンズ");
        tyunichi.setWin(66);
        tyunichi.setLose(75);
        tyunichi.setDraw(2);
        tyunichi.report();

     }

    }

