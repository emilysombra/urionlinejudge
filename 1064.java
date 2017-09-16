import java.util.*;
class uri1064{
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
        double[] numsPos = new double[j];
        double media = 0;
        int m = 0;
        for(int k = 0; k<nums.length; k++){
            if(nums[k] > 0){
                numsPos[m] = nums[k];
                m++;
            }
        }
        for(int z = 0; z<numsPos.length; z++){
            media = media+numsPos[z];            
        }
        media = media/numsPos.length;
        System.out.printf("%d valores positivos\n%.1f\n", j, media);
	}
}