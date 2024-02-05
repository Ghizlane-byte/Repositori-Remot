package activitat5;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exercici1 {

public static void main(String[] args) throws IOException {
	InputStreamReader entrada = new InputStreamReader(System.in);
	BufferedReader teclat = new BufferedReader(entrada);
	
	String pregunta = "2+6=?";
	String respostaUsuari = "";
	String respostaCorrecta = "8";
	int punts = 0;
	
	System.out.println("Comenença el test!!!\n Per superar els test has de contestar la pregunta correctament.\n");
	System.out.println(pregunta);
	
	respostaUsuari = teclat.readLine();
	
		if (compararResultats(respostaUsuari,respostaCorrecta)) {
		punts = 10;
		}else {
			punts = 0;
		}
		
		if (punts != 10) {
			System.out.println("\nPunts totals: " + punts);
			System.out.println("Ho sento no has superat el test!!!");
			
		} else {
			System.out.println("\nPunts totals: " + punts);
			System.out.println("Felcitats, resposta correcta!!!");
		}
	}
	private static boolean compararResultats(String x, String y){
		return x.equals(y);
	}
}


