package Java;

public class javaFormateCode {
    public static void main(String args[]){
        int a[][]= {{1,1},{1,1}};
        int b[][]= {{2,2},{2,2}};

        int c=0;
        int d=0;
        int e=0;
        int f=0;
        for(int i=0;i<a.length+1;i++) {
            if ((a.length / 2)  != i) {

                for (int j = 0; j < a[f].length + b[f].length + 2; j++) {
                    if (j < a.length) {
                        System.out.print(a[f][j] + " ");
                        e++;
                        if (e == a.length) {
                            System.out.print("  ");
                            e = 0;
                        }
                    }
                    if (j >= b.length && j < b.length + b.length) {
                        System.out.print(b[f][c] + " ");
                        c++;
                        e++;
                        if (e == a.length) {
                            System.out.print("  ");
                            e = 0;
                        }
                    }
                    if (j >= a.length + a.length) {
                        System.out.print(a[f][d] + b[f][d] + " ");
                        d++;
                        e++;
                        if (e == a.length) {
                            System.out.print("  ");
                            e = 0;
                        }
                    }
                }
                c = 0;
                d = 0;
                e = 0;
                f++;
                System.out.println();
            }
            else{

                for(int plus=0;plus<2*a.length;plus++) {
                    if (plus == a.length - 1) {
                        System.out.print("    +");
                    }
                    if (plus == a.length + b.length - 1) {
                        System.out.println("     =");

                    }
                }
        }


            }
    }
}
