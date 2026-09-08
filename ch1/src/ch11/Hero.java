package ch11;

public class Hero extends Character {
/*
public class Main{
	public static void main(String[] args) {
Hero h = new Hero();
h.attack(m);
	}
}
*/

public void attack(Matango m) {
System.out.println(this.name + "の攻撃!");
System.out.println("敵に10ポイントのダメージをあたえた!");
m.hp -=10;
}
}
