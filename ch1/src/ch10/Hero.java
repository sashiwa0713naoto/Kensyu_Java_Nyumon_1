package ch10;

public class Hero {

    String name = "ミナト";
    int hp;

    public Hero() {
    System.out.println("Heroのコンストラクタが動作");
        this.hp = 100;
    }

    public Hero(String name) {
        this.hp = 100;
        this.name = name;
    }
    
    public void attack() {
        System.out.println(this.name + "は攻撃した!");
        System.out.println("敵に5ポイントのダメージをあたえた!!");
    }

    public final void slip() {
    	System.out.println(this.name + "は転んだ!");
    	System.out.println("5のダメージ");
    }
    public void run() {
        System.out.println(this.name + "は逃げ出した");
    }
}
