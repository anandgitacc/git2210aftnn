package org.testgit;


public class Testgitaftnn {
	
	public void empName() {
		System.out.println("Employee name is Anand");
	}
	
	public void empMobno() {
		System.out.println("Employee mobile no is 8667070832");
	}
	
	private void empref() {
		System.out.println("ref one");}
	
//<<<<<<< HEAD
	private void empdata() {
		System.out.println("test data");
//=======
	
//>>>>>>> f80bd0c390deabfb794556b79dfa656f39312f60
	}
	
	public static void main(String[] args) {
		
		Testgitaftnn a = new Testgitaftnn();
		
		a.empName();
		a.empMobno();
		
	}
}
