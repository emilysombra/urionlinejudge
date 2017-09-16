class uri1156{
    public static void main(String[] args){
        double s = 1, frac, i = 3, j = 2;
        while(i<=39){
            frac = i/j;
            s += frac;
            i+=2;
            j*=2;
        }
        System.out.printf("%.2f\n", s);
    }
}