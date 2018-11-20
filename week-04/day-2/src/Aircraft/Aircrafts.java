package Aircraft;

public class Aircrafts {


  int maxAmmo;
  int baseDamage;
  int ammoStore;

  public int fight() {
    this.ammoStore = 0;
    return this.ammoStore * this.baseDamage;
  }


  public int refill(int amount) {
    int temp = this.ammoStore;
    if (this.ammoStore + amount <= this.maxAmmo) {
      this.ammoStore += amount;
    } else {
      this.ammoStore = this.maxAmmo;
    }
    return amount - temp;
  }

  public String getType() {
    if(this instanceof F16) {
      return "F16";
    } else {
      return "F35";
    }
  }

  public String getStatus() {
    return "Type " + getType() + ", " + "Ammo " + this.ammoStore + ", " + "Base damage " + this.baseDamage
        + ", " + "All damage " + this.fight();
  }

  public boolean isPriority() {
    if (this.getType().equals("F16")) {
      return true;
    }
    return false;
  }

}
