package JavaAPI;

import java.util.Random;//Import random class

public class LoopRandom {

	public static void main(String[] args) {
		Random rm = new Random();//Create new instance from random class
		
		int array[] = new int [6];//Create an array of 6 items 
		
		int x = 0;
		System.out.println("Pick up 6 numbers using While Loop");	
		
		while(x<array.length)
			{
				array[x] = rm.nextInt(59);
				System.out.println(array[x]);//Pick up 6 numbers in range of 0..59
				x++;
			}
		System.out.println("Pick up 6 numbers using For Loop");		
		
		for(int i=0; i<array.length; i++){
		   array[i] = rm.nextInt(59);
		}
		
		for(int j=0; j<array.length; j++){
			System.out.println(array[j]);
		}
		System.out.println("Pick up 6 numbers using Do...While Loop");
		int y=0;
		do{
			array[y] = rm.nextInt(59);
			System.out.println(array[y]);
			y++;
		}
		while(y<array.length);

	}

}
