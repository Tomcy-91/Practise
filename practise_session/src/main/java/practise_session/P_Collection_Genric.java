package practise_session;

import java.util.ArrayList;

public class P_Collection_Genric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <String> obj = new ArrayList<String>();
		
		obj.add("Red");
		obj.add("Yello");
		obj.add("Blue");
		
		obj.remove(1);
		System.out.println(obj);
		boolean c = obj.contains("Red");
		System.out.println(c);



		
	}

}
