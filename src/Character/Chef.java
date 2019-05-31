package Character;

import Interface.Ichef;

public class Chef extends BaseCharacter implements Ichef{

	public Chef() {
		super("Chef","Seorang yang bisa memasak");
	}

	@Override
	public void Cook() {
		System.out.println(getName()+" memasak");
	}
}
