package Character;

import Interface.Iartist;
import Interface.Ichef;
import Interface.Idriver;
import Interface.Iworker;

public class AllRounder extends BaseCharacter implements Ichef,Iartist,Idriver,Iworker{

	public AllRounder() {
		super("AllRounder","seseorang yang bisa memasak, menyetir, melukis, dan bekerja");
	}

	@Override
	public void Work() {
		System.out.println(getName()+" bekerja");
	}

	@Override
	public void Drive() {
		System.out.println(getName()+" menyetir");
	}

	@Override
	public void Paint() {
		System.out.println(getName()+" melukis");
	}

	@Override
	public void Cook() {
		System.out.println(getName()+" memasak");
	}
	
	
}
