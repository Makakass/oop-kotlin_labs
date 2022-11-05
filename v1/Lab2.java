public class Lab2 {
    /*
    0204
    c5 = 4; C = AxB
    c7 = 1; byte
    c11 = 5; Обчислити суму найбільших елементів в рядках матриці з непарними номерами
             та найменших елементів в рядках матриці з парними номерами
    */
    public static void main(String[] args) {
        int sum1 = 0, sum2 = 0;
        byte[][] a = {
                {1,2,-1},
                {-2,8,3},
                {2,-5,4},
                {1,2,3}
        };
        byte[][] b = {
                {-1,3,6,-2},
                {2,2,2,2},
                {1,3,-1,4}
        };

        byte[][] c = new byte[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Матриця C:");
        for (int i = 0;i<c.length;i++) {
            for (int j = 0;j<c[0].length;j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0;i<c.length;i++) {
            int max = 0;
            int min = 0;
            if (i%2 == 0)
                max = c[i][0];
            if (i%2 == 1)
                min = c[i][0];
            for (int j = 1;j<c[0].length;j++) {
                if (i%2 == 0) {
                    if (c[i][j] > max) {
                        max = c[i][j];
                    }
                }
                if (i%2 == 1) {
                    if (c[i][j] < min) {
                        min = c[i][j];
                    }
                }
            }
            sum1 += max;
            sum2 += min;
        }
        System.out.println("Сумма максимальних значень непарних рядків: " + sum1);
        System.out.println("Сумма мінімальних значень парних рядків: " + sum2);
    }
}
