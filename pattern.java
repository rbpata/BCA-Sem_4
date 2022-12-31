public class pattern {
    public static void main(String argv[]) {

        int n = 4, m = 5;

        // p1
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }

        //p2
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }


        //p3
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i + 1);
            }
            System.out.print("\n");
        }

        //p4
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1);
            }
            System.out.print("\n");
        }


        //p5
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || j == m || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //butterfly pattern

        //upper part 
        for(int i =1;i<=5;i++)
        {
            //first part
            for(int j=1;j<=i;j++)
                System.out.print("*");

            //middle part
            int space = 2 * (5-i);
            for(int j=1;j<=space;j++)
                System.out.print(" ");
        
            //end part
            for(int j = 1;j<=i;j++)
             System.out.print("*");
            
            System.out.println();
        }
        //lower part
        for(int i =5;i>=1;i--)
        {
            //first part
            for(int j=1;j<=i;j++)
                System.out.print("*");

            //middle part
            int space = 2 * (5-i);
            for(int j=1;j<=space;j++)
                System.out.print(" ");
        
            //end part
            for(int j = 1;j<=i;j++)
             System.out.print("*");
            
             System.out.println();
        }

        // pyramid pattern 
        for(int i=1;i<=6;i++)
        {
            for(int j=7;j>=i;j--)
                System.out.print(" ");
            for(int k=1;k<=i;k++)
                System.out.print(k+" ");

            System.out.println();
        }
    }
}
