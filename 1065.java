import java.util.*;
class uri1065{
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
        nums = readArray(5);
        int j = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i]%2 == 0){
                j++;
            }
        }
        System.out.println(j + " valores pares");
	}
}
