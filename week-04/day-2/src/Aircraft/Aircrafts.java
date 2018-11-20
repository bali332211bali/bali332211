package Aircraft;

public class Aircrafts {


  int maxAmmo;
  int baseDamage;
  int ammoCurrent;

  public int fight() {
    int temp = this.ammoCurrent;
    this.ammoCurrent = 0;
    return temp * this.baseDamage;
  }


  public int refill(int amount) {
    int temp = this.ammoCurrent;
    if (this.ammoCurrent + amount <= this.maxAmmo) {
      this.ammoCurrent += amount;
    } else {
      this.ammoCurrent = this.maxAmmo;
    }
    return amount - (maxAmmo - temp);
  }

  public String getType() {
    if (this instanceof F16) {
      return "F16";
    } else {
      return "F35";
    }
  }

  public String getStatus() {
    return "Type " + getType() + ", " + "Ammo " + this.ammoCurrent + ", " + "Base damage " + this.baseDamage
        + ", " + "All damage " + this.fight();
  }

  public boolean isPriority() {
    if (this.getType().equals("F16")) {
      return true;
    }
    return false;
  }

}
