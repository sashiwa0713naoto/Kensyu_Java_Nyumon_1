package ch9;

public class Main {
public static void main(String[] args) {
	Sword s = new Sword();
s.name = "炎の剣";
s.damge = 10;
Hero h1 = new Hero("ミナト");
System.out.println(h1.name);
h1.hp = 100;
h1.sword = s;
System.out.println("現在の武器は" + h1.sword.name);
Hero h2;
h2 = h1;
h1.name = "アカサ";
h2.hp = 100;
System.out.println(h1.hp);
Wizard w = new Wizard();
w.name = "スガワラ";
w.hp = 50;
w.heal(h1);
w.heal(h2);
w.heal(h2);
}
}