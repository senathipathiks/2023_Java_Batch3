package Java_Day_3;



public class StringEncryption {

	public static void main(String[] args) {

        String text = "Varshinee";
        StringBuilder encryptedText = new StringBuilder();

        for (char c : text.toCharArray()) {
            if(Character.isLetter(c)) {
                
                int value = Character.toLowerCase(c) - 'a';
                encryptedText.append(value).append(" ");
            } else {
                encryptedText.append(c);
            }
        }

        System.out.println("Original Text: " + text);
        System.out.println("Encrypted Text: " + encryptedText.toString());
    }


	}


