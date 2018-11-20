package Aircraft;

public class F16 extends Aircrafts {

  static int maxAmmoF16 = 8;
  static int baseDamageF16 = 30;

  F16() {
    this.maxAmmo = 8;
    this.baseDamage = 20 + (int) (Math.random()*10);
    this.ammoCurrent = 0;
  }

}
