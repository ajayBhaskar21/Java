
/*
 * n = 3
 * +    +
 * ++  ++
 * ++++++
 * ++  ++
 * +    +
 * 
 */

class butterFly{


    public static void main(String[] args) {
        
        int n = 10;

        for (int i = 1; i < n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for (int j = i + 1; j < (n * 2) - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i = 0; i < n * 2 - 1; i++){
            System.out.print("*");
        }
        System.out.println();


        for (int i = n - 1; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }

            for (int j = i * 2; j < n * 2 - 1; j++){
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}