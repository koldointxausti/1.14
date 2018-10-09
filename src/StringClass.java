import java.util.Scanner;
public class StringClass {

	public static void main(String[] args) {
		//length
		Scanner sc = new Scanner(System.in);
		System.out.println("Write one word:");
		String a = sc.next();
		System.out.println("The length of the word you've entered is " + a.length()+".");
		
		//trim
		String b = "   No spaces     ";
		System.out.println("Returns: " + b.trim());
		
		//charAt
		String c = "123456789";
		char result = c.charAt(5);
		System.out.println("Takes the 5th character: " + result);
		
		//compareTo		1=bigger	0=same	-1=lower
		System.out.println("Enter a number bigger thar 2: ");
		Integer d = sc.nextInt();
		while (d.compareTo(2) == -1) {
			System.out.println("The number has to be bigger than 2. Try again: ");
			d = sc.nextInt();
		}
		
		//compareToIgnoreCase	positive=bigger	0=same	negative=lower
		System.out.println("Write two words:");
		String e1 = sc.next();
		String e2 = sc.next();
		System.out.println(e1.compareToIgnoreCase(e2));
		
		//indexOf	counts how many characters far is the first of whatever we ask for from the beggining of the sentence
		String f = "Hi there";
		System.out.println(f);
		System.out.println("the first 'e' is "+ f.indexOf('e')+" characters away from the beggining of the sentence.");
		
		//lastIndexOf
		System.out.println(f);
		System.out.println("The last 'e' is "+ f.lastIndexOf('e')+" characters away from the beggining of the sentece.");
		
		//valueOf	shows the values we have asigned for the strings
		System.out.println("True or false");
			//nextBoolean asks to the user to enter "true or false"
		boolean g = sc.nextBoolean();
		System.out.println(String.valueOf(d));
		System.out.println(String.valueOf(g));
		
		//substring		it shows the characters we want to show instead of the whole sentence 
		String h = "Hello";
		System.out.println(h.substring(0,2));
	}

}
