/** @author NIM/Nama : 13515078 / Veren Iliana Kurniadi 
      File     : Carnivore.java                   */

import java.lang.*;
import java.util.*;

public interface Carnivore {
  /** 
   * Mengembalikan nilai rasio daging.
   * @return nilai rasio daging
   */
  public double getMeatRatio();

  /** 
   * Mengembalikan nilai rasio sayur.
   * @return nilai rasio sayur
   */
  public double getVegRatio();
}
