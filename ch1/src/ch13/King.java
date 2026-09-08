package ch13;

public class King {
	 void talk(Hero h) {
		System.out.println
		("王様 : ようこそわが王国へ、勇者" + h.getName() + "よ。");
		System.out.println
		("王様 : まずは城下町を見てくるとよい。ではまた会おう。");
		h.die();
	}
}
