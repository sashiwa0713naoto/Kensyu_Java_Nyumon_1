package ch10;

public class SuperHero extends Hero {
    boolean flying;

    public SuperHero() {
    	super();
    	 System.out.println("SuperHeroのコンストラクタが動作");
    }
    public void attac(Matango m) {
        System.out.println(this.name + "の攻撃!");
        m.hp -= 5;
        System.out.println("5ポイントのダメージをあたえた!");
       if (this.flying) {
        System.out.println(this.name + "の攻撃!");
        m.hp -= 5;
        System.out.println("5ポイントのダメージをあたえた!");
    }
}
}