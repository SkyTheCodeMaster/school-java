public class RocketCountdown {
  public static void main(String[] args) throws InterruptedException {
    for (int i = 12;i>=1;i--) {
      switch (i) {
        case 8: System.out.println("Ignition sequence start"); break;
        case 7: break;
        default: System.out.println(i); break;
      }
      Thread.sleep(1000);
    }
    System.out.println("All engines running");
    System.out.println("Liftoff!");
  }
}
