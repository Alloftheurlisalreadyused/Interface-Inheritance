package Character;

import Interface.Iworker;

public class Worker extends BaseCharacter implements Iworker{

	public Worker() {
		super("Worker","seorang yang bisa bekerja");
	}

	@Override
	public void Work() {
		System.out.println(getName()+" bekerja");
	}

}
