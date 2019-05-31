package Character;

public class BaseCharacter {
	private String name;
	private String Desc;
	
	public void getInfo() {
		System.out.println(this.name+", "+this.Desc);
	}
	
	public BaseCharacter(String name, String desc) {
		super();
		this.name = name;
		Desc = desc;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return Desc;
	}

	public void setDesc(String desc) {
		Desc = desc;
	}
	
}
