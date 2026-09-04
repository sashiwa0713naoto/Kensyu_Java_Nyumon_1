package ch10;

public class Item {
String name;
int price;

public Item(String name) {
	this.name = name;
	this.price = 0;
}

public int getDamage() {
	return 10;
}
}