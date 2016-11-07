import java.util.*;
class uri1837{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt(), y = scan.nextInt();
        int q = x/y, r = x%y;
        if(x<0 && y<0){
            if((r<0 && q<=0) || (r<0 && q>0)){
                q++;
                r = -(y*q)+x;
            }
        }else{
            if(r<0 && q<=0){
                q--;
                r = -(y*q)+x;
            }else if(r<0 && q>0){
                q++;
                r = -(y*q)+x;
            }
        }
        System.out.println(q + " " + r);
    }
}