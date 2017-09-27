package my.com.adminpanel.controller;

public class TestController {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int febCount = 15;
		int[] feb = new int[febCount];
		feb[0] = 0;
		feb[1] = 1;
		for (int i = 2; i < febCount; i++) {
			
			
			//1+0=1 feb[2]
			//1+1=3 feb[3]
			
			feb[i] = feb[i - 1] + feb[i - 2];
		}

		for (int i = 0; i < febCount; i++) {
			System.out.print(feb[i] + " ");
		}
	}

}
