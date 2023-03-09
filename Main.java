import java.lang.Math;

class Main {
  public static void main(String[] args) {
    double dlugosc = 100;
    double pierwiastek = Math.sqrt(dlugosc);
    boolean lp;
    for (int i = 0; i <= dlugosc; i++) {
      lp = true;
      if (lp) {
        for (int j = 2; j <= pierwiastek; j++) {
          if (i % j == 0 && i != j) {
            lp = false;
          }
        }
      }
      if (lp)
        System.out.println(i);
    }
  }
}