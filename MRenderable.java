/* NIM/Nama :  */
/* File     : MRenderable.java */

import java.util.*;
import java.lang.*;

class MRenderable implements Renderable {
  MRenderable(){}

  @Override
  public char render(){
    return 'a';
  }

  @Override
  public String renderWithColor(){
    return ANSI_BLUE_BACKGROUND + ANSI_RED + render() + ANSI_RESET;
  }

  public static void main(String[] args) {
    MRenderable tes = new MRenderable();
    System.out.println("tes");
    System.out.println(tes.render());
    System.out.println(tes.renderWithColor());
    System.out.println("tes");
  }

}
