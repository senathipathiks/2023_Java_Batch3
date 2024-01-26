package Day_3;

public class StringEncryption {

	public static void main(String[] args) {

        String text = "weqr";
        StringBuilder s1 = new StringBuilder();

        for (char c : text.toCharArray()) {
            if(Character.isLetter(c)) {
                
                int value = Character.toLowerCase(c) - '0';
                s1.append(value).append(" ");
            } else {
                s1.append(c);
            }
        }

        System.out.println("Original Text: " + text);
        System.out.println("Encrypted Text: " + s1.toString());
    }

	}


