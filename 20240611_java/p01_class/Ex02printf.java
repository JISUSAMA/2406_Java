package p01_class;

public class Ex02printf {
  public static void main(String[] args) {
    System.out.println("저 산자락에 긴 노을지면 \n 걸음걸음도 살며시 달님이  \t 오시네");
    System.out.println(7+7+"7"+7+7);
    System.out.println(7+7+"7"+(7+7));

    System.out.print("저 산자락에 긴 노을지면");
    System.out.print("걸음걸음도 살며시 달님이 \t 오시네 ");
    System.out.print("밤 달빛에도 참 어여뻐라");
    System.out.println("\n");
    System.out.printf("2 * %d = %d \n", 1, 2);
    System.out.printf("원주율의 파이는 %f \n", 3.141592);
    System.out.printf(
        "10진수 : %d" +
        "8진수  : %o" +
        "16진수 : %x" +
        "16진수  : %X \n", 10,10,10,10);
  }
}
