import java.util.*;
class uri1060{
    public static double[] readArray(int n){
        Scanner scan = new Scanner(System.in);
        double[] array = new double[n];
        for(int i = 0; i < array.length; i++){
            array[i] = scan.nextDouble();
        }
        return array;
    }
	public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
		double nums[];
        nums = readArray(6);
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0){
                j++;
            }
        }
        System.out.println(j + " valores positivos");
	}
}