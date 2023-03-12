import java.io.*;

public class Main{
	public static void main(String[] args){

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		String s = "Esto es una prueba;";
		String t = "Esto es otra prueba pero 2.0";
		byte [] arr = s.getBytes();
		for(byte b: arr){
			System.out.println(b);
		}
		String s2 = new String(arr);
		System.out.println(s.substring(3));
		System.out.println(s.substring(7));
		System.out.println(s.contains("mama"));
		System.out.println(s.toUpperCase().contains("MAMA"));
		System.out.println(s.indexOf("i"));
		System.out.println(s.charAt(5));
		System.out.println(s.endsWith(";"));

		String nombres = "Juan; Alberto; Maria; Teresa";
		String[] sarr = nombres.split(" ");
		for(String f : sarr){
			System.out.println(f);
		}
	}
}