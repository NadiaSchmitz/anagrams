import Prog1Tools.IOTools; 

public class Main {

	public static void main(String[] args) {
		
		String text_1, text_2, result;
		char[] text_1_array, text_2_array;
		int i, j;
		boolean [] result_array; 
		
		text_1 = IOTools.readString("Geben Sie den Text#1 ein: ");
		text_2 = IOTools.readString("Geben Sie den Text#2 ein: ");
		
		text_1_array = text_1.toLowerCase().toCharArray();
		text_2_array = text_2.toLowerCase().toCharArray();
		
		// true - text_2 kann aus Buchstaben text_1 erstellt werden, false - nein
		// groﬂe Buchstaben und Leerzeichen werden ignoriert
		
		result_array = new boolean [text_2_array.length]; 
		result = "Der Text#2 kann aus den Text#1 erstellt werden.";
		
		for (j = 0; j < result_array.length; j++) {
			result_array[j] = false;
		}
		
		for (i = 0; i < text_1_array.length; i++) {
			for (j = 0; j < text_2_array.length; j++) {
				if (text_2_array[j] == text_1_array[i]) {
					result_array[j] = true;
				} 
			}
		}
			
		for (j = 0; j < result_array.length; j++) {
			if (!result_array[j]) {
				result = "Der Text#2 kann nicht aus den Text#1 erstellt werden.";
			}
		}
		
		System.out.println(result);
		
	}

}
