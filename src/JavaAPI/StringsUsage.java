package JavaAPI;

public class StringsUsage {

	public static void main(String[] args) {

		String me = "i'm a java developper";
		
		//Display Me content 		
		System.out.println(me);
		//Convert me to Up case
		System.out.println(me.toUpperCase());
		//Convert me to Low case
		System.out.println(me.toLowerCase());
		//Reverse		
		String reverse = new StringBuffer(me).reverse().toString();
		System.out.println(me+" reversed "+reverse);
		//Length
		System.out.println(me+" Has "+me.length()+" characters");
		//Replace
		System.out.println(me.replace("i'm", "He's"));
		//Index of a char
		System.out.println(me.indexOf("j"));
	}

}
