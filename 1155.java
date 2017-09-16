class uri1155{
    public static void main(String[] args){
        double s = 1, frac;
        for(int i = 2; i <=100; i++){
            frac = 1/i;
            s += frac;
        }
        System.out.printf("%.2f\n", s);
    }
}