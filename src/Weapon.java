
public class Weapon {
	
	private double dmg;
	private double crit;
	private double ammo;
	
	public Weapon(double dmg, double crit, double ammo) {
		this.dmg = dmg;
		this.crit = crit;
		this.ammo = ammo;
	}
	
	public Weapon(Weapon wpn) {
		this.dmg = wpn.dmg;
		this.crit = wpn.crit;
		this.ammo = wpn.ammo;
	}

	public double getDmg() {
		return dmg;
	}

	public void setDmg(double dmg) {
		this.dmg = dmg;
	}

	public double getCrit() {
		return crit;
	}

	public void setCrit(double crit) {
		this.crit = crit;
	}

	public double getAmmo() {
		return ammo;
	}

	public void setAmmo(double ammo) {
		this.ammo = ammo;
	}
	
}
