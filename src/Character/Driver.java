package Character;

import Interface.Idriver;

public class Driver extends BaseCharacter implements Idriver{

	public Driver() {
		super("Driver","seorang yang bisa menyetir");
	}

	@Override
	public void Drive() {
		System.out.println(getName()+" menyetir");
	}
}
