public class Lab1 {
    /*
        0204
        c2 = 0; O1 - "+"
        c3 = 0; C = 0
        c5 = 4; O2 - "-"
        c7 = 1; short
    */
    public static void main(String[] args) {
        float S = 0;
        short c = 0;
        short a=2,b=3,n=6,m=5;

        if(a <= -c & n >= -c){
            System.out.println("Ділення на нуль");
            System.exit(0);
        }

        for(short i = a;i<=n;i++) {
            for(short j = b;j<=m;j++) {
                S += (float)(i-j)/(i+c);
            }
        }
        System.out.println("S = "+S);
    }
}
