package cn.tju.scs.c01;

import java.util.Arrays;

public class PerfectNumber {

	public static void main(String[] args) {
		perfectNum(50000);

	}
	
	public static void perfectNum(int input){
		
		int sum,num,i,j;
		int count;
		for(i=0;i<input;i++){
			num = i;
			sum = num;
			count = 0;
			long p[] = new long[500];
			for (j=1;j<num;j++){
				if (num%j==0){
					p[count++] = j;
					sum = sum - j;
				}
			}
			
			long newp[];
			newp = Arrays.copyOfRange(p, 0, count);
			if (sum == 0 && num != 0){
				System.out.println(num + "=" + Arrays.toString(newp));
			}
		}
	}

}
