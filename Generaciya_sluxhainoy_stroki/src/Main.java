
public class Main {

	public static void main(String[] args) {
		String symbols = "qwerty";
        StringBuilder randString = new StringBuilder();
        int count = 30+(int)(Math.random()*2);
        for(int i=0;i<count;i++)
          randString.append(symbols.charAt((int)(Math.random()*symbols.length())));
        
        System.out.println(randString);
        System.out.println(randString.length());
	}

}
