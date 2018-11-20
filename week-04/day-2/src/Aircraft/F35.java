package Aircraft;

public class F35 extends Aircrafts {

  static int maxAmmoF35 = 12;
  static int baseDamageF35 = 50;

  F35() {
    this.maxAmmo = 12;
    this.baseDamage = 30 + (int) (Math.random()*20);
    this.ammoCurrent = 0;
  }
}
