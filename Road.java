/**
 * @author NIM / Nama : 13515087 / Audry Nyonata
 *  Nama file : Road.java
 */

import java.lang.*;
import java.util.*;

public class Road extends Facility {
  /**
   * Constructor.
   */
  public Road() {
    super();
  }
  
  /**
   * Mengembalikan karakter untuk ditampilkan ke layar.
   * @return id bertipe char
   */
  public char render() {
    return '-';
  }
  
  /**
   * Mengembalikan warna untuk ditampilkan ke layar.
   * @return color warna renderable
   */
  public String renderWithColor() {
    return ANSI_WHITE + render() + ANSI_RESET;
  }
}
