package Aircraft;

import java.util.ArrayList;
import java.util.List;

public class Carrier {

  int ammoStore;
  int health;
  List<Aircrafts> aircrafts = new ArrayList<>();

  Carrier(int ammo, int health) {
    this.ammoStore = 200 + (int) (Math.random()*ammo);
    this.health = 300 + (int) (Math.random()*health);
  }

  public void add(Aircrafts aircraft) {
    aircrafts.add(aircraft);
  }

  public void fill() throws Exception {
    if (ammoStore == 0) {
      throw new Exception("Ammo store empty");
    }

    if (totalAmmoNeeded() > this.ammoStore) {
      for (int i = 0; i < aircrafts.size(); i++) {
        if(aircrafts.get(i).isPriority()) {
          aircrafts.get(i).refill(this.ammoStore);
        }
      }
    } else {
      fillAmmoAll();
    }

    if (allF35MaxAmmo()) {
      fillAmmoAll();
    }
  }

  public void fillAmmoAll() {
    for (int i = 0; i < aircrafts.size(); i++) {
      aircrafts.get(i).refill(this.ammoStore);
    }
  }

  public int totalAmmoNeeded() {
    int ammoNeeded = 0;
    for (int i = 0; i < aircrafts.size(); i++) {
      ammoNeeded += aircrafts.get(i).maxAmmo - aircrafts.get(i).ammoCurrent;
    }
    return ammoNeeded;
  }

  public boolean allF35MaxAmmo() {
    int count = 0;
    int totalAmmo = 0;
    for (int i = 0; i < aircrafts.size(); i++) {
      if (aircrafts.get(i).getType().equals("F35")) {
        count++;
        totalAmmo += aircrafts.get(i).ammoCurrent;
      }
    }
    if (count * F35.maxAmmoF35 == totalAmmo) {
      return true;
    }
    return false;
  }

  public void fight(Carrier carrier) {
    carrier.health -= this.totalDamage();
  }

  public int totalDamage() {
    int totalAmmoF16 = 0;
    int totalAmmoF35 = 0;
    for (int i = 0; i < aircrafts.size(); i++) {
      if (aircrafts.get(i).getType().equals("F35")) {
        totalAmmoF16 += aircrafts.get(i).ammoCurrent;
      } else {
        totalAmmoF35 += aircrafts.get(i).ammoCurrent;
      }
    }
    return totalAmmoF16 * F16.baseDamageF16 + totalAmmoF35 * F35.baseDamageF35;
  }

  public void getStatus() {
    if (this.health > 0) {
      System.out.println("health " + this.health + ", " + aircrafts.size() + " aircrafts " + ", "
          + ammoStore + " ammo in store"  + ", " + totalDamage() + " total damage");
      System.out.println("Aircrafts");
      for (int i = 0; i < aircrafts.size(); i++) {
        System.out.println("Type " + aircrafts.get(i).getType() + ", " +
            "Ammo " + aircrafts.get(i).ammoCurrent + ", " + "Base damage " + aircrafts.get(i).baseDamage
            + ", " + "All damage " + aircrafts.get(i).ammoCurrent * aircrafts.get(i).baseDamage);
      }
    } else {
      System.out.println("destroyed");
    }


  }



}
