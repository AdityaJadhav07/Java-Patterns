public class Pattern2 {
    public static void printPattern2()
    {
        int i,j;
        for(i=1;i<=5;i++){

          for(j=1;j<=1;j++){
              System.out.print(" ");
          }
          for(j=1;j<=i;j++){
              System.out.print(i);
          }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        printPattern2();
    }
}
