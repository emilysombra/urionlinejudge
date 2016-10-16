import java.util.*;
class uri1101{
    public static void program(int in, int fn){
        int[] nums = new int[fn-in+1];
        int soma = 0;
        for(int i = 0; i<nums.length; i++){
            nums[i] = in+i;
        }
        Arrays.sort(nums);
        for(int i = 0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
        for(int i = 0; i<nums.length; i++){
            soma+=nums[i];
        }
        System.out.println("Sum=" + soma);
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int m, n;
        m = scan.nextInt();
        n = scan.nextInt();
        while((m > 0) && (n > 0)){
            if(m>n){
                program(n, m);
            }else{
                program(m, n);
            }
            m = scan.nextInt();
            n = scan.nextInt();
        }
    }
}