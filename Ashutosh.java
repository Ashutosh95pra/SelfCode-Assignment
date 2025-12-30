import java.util.*;
class Ashu{
	public void fn(){
		int x=90;
		System.out.println(x);
	}
}

class Solution{
	public static int dublicateVariable(int []nums){
		Arrays.sort(nums);
		int i=0;
		for(int n:nums){
			if(i<1 || n!=nums[i-1]){
				nums[i++]=n;
			}
		}
		return i;
	}
}

class Ashutosh{
	public static void main(String [] args){
		Ashu a1=new Ashu();
		a1.fn();
		int arr[]={8,7,9,8,7,5,6,5};
		int len=Solution.dublicateVariable(arr);
		System.out.println("Length of Array " + len);
		System.out.println("Array after removing dublicate");
		for(int i=0 ; i<len ; i++){
			System.out.println(arr[i] + " ");
		}
	}
}