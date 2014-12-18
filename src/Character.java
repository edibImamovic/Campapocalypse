
public class Character {
	
	String name;
	private double healthP;
	private double dex;
	private double str;
	private double spd;
	private Weapon wpn;
	
	public Character(String name, double healthP, double dex, double str, double spd, Weapon wpn) {
		this.name = name;
		this.healthP = healthP;
		this.dex = dex;
		this.str = str;
		this.spd = spd;
		this.wpn = new Weapon(wpn);
	}

	public String toString() {
		return "Character [name=" + name + ", \nhealthP=" + healthP + ", \ndex="
				+ dex + ", \nstr=" + str + ", \nspd=" + spd + "]\n";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHealthP() {
		return healthP;
	}

	public void setHealthP(double healthP) {
		this.healthP = healthP;
	}

	public double getDex() {
		return dex;
	}

	public void setDex(double dex) {
		this.dex = dex;
	}

	public double getStr() {
		return str;
	}

	public void setStr(double str) {
		this.str = str;
	}

	public double getSpd() {
		return spd;
	}

	public void setSpd(double spd) {
		this.spd = spd;
	}

	public Weapon getWpn() {
		return wpn;
	}

	public void setWpn(Weapon wpn) {
		this.wpn = wpn;
	}
	
}
