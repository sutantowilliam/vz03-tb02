/**
  * @author NIM/Nama : 13515057 / Erick Wijaya
  * File             : Driver.java
  */

import java.io.*;
import java.lang.*;

public class Driver {
  /**
    * Deklarasi objek myZoo.
    */
  public static Zoo myZoo;
  
  /**
    * Membuat sebuah kebun binatang.
    */
  public static void createZoo() {
    try {
      Scanner inZoo = new Scanner(new File("zoo.txt"));
      Scanner inumCage = new Scanner(new File("cage.txt"));
      Scanner inumAnimal = new Scanner(new File("animal.txt"));
      Scanner in = new Scanner(System.in);
      myZoo = new Zoo();
      // read Zoo from file
      myZoo.read(inZoo);
      // read Cage from file and add to Zoo
      int numCage = inumCage.nextInt();
      for (int i = 0; i < numCage; i++) {
        Cage myCage = new Cage();
        myCage.read(inumCage);
        myZoo.AddCage(myCage);
      }
      // read Animal from file and add to Zoo
      int numAnimal = inumAnimal.nextInt();
      for (int i = 0; i < numAnimal; i++) {
        AnimalFactory af = new AnimalFactory();
        Animal myAnimal = af.read(inumAnimal);
        myZoo.addAnimal(myAnimal);
      }
    } catch (FileNotFoundException e) {
      System.out.println(e);
    }
  }
  
  /**
    * Menampilkan daftar pilihan menu utama.
    */
  public static void showMenu() {
    System.out.println("Selamat datang di Kebun Binatang Virtual Zoo!");
    System.out.println("1. Menampilkan peta Kebun Binatang");
    System.out.println("2. Menampilkan seluruh peta pada Kebun Binatang");
    System.out.println("3. Menampilkan total makanan yang dimakan seluruh hewan");
    System.out.println("4. Tour Kebun Binatang!");
    System.out.println("5. Real Time Tour!");
    System.out.println("6. Quit");
    System.out.println("Pilih angka 1..6 :");
  }
  
  /**
    * main program.
    */
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    createZoo();
    int n;
    do {
      showMenu();
      n = in.nextInt();
      switch (n) {
        case 1:
          System.out.print("Input angka x1 y1 x2 y2 : ");
          int x1 = in.nextInt(); 
          int y1 = in.nextInt();
          int x2 = in.nextInt(); 
          int y2 = in.nextInt();
          myZoo.display(x1, y1, x2, y2);
          break;
        case 2:
          myZoo.display();
          break;
        case 3:
          myZoo.printConsumedFood();
          break;
        case 4:
          myZoo.tour();
          break;
        case 5:
          myZoo.realTimeTour();
          break;
        case 6:
          System.out.print("Thank You For Visiting Our Zoo");
          break;
        default:
          break;
      }
      System.out.println();
    } while (n != 6);
  }
}
