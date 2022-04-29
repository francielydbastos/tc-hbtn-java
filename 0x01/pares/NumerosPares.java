public class NumerosPares {
    public static void main(String[] args) {
        for (int i=0; i < 100; i++) {
            if (i % 2 == 0){
                if (i < 98){
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i + "\n");
                }
            }
        }
    }
}