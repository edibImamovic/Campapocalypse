
public class Player extends Character {
	private double intl;

	public Player(String name, double healthP, double dex, double str, double spd, Weapon wpn, double intl) {
		super(name, healthP, dex, str, spd, wpn);
		this.intl = intl;

	}

	public double getIntl() {
		return intl;
	}

	public void setIntl(double intl) {
		this.intl = intl;
	}

	public String toString() {
		return super.toString() + "\nIntelegent: " + intl;
	}

}
