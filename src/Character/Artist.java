package Character;

import Interface.Iartist;

public class Artist extends BaseCharacter implements Iartist{

	
	public Artist() {
		super("Artist","seorang yang bisa melukis");
	}

	@Override
	public void Paint() {
		System.out.println(getName()+" melukis");
		
	}
}
