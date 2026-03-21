package loops;
import java.util.*;
import java.util.Scanner;

public class num {
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    for(int i=0;i<100;i++) {
    	if(i%4==0 && i%6==0) {
    		continue;
    	}
    	System.out.println(i+" ");
    }
    }

}
