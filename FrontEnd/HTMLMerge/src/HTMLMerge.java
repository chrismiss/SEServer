import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class HTMLMerge {

	public static void main(String[] args) {
			ArrayList<String> list = new ArrayList<String>();
			list.add("log-in.html");
			list.add("calendar.html");
			Scanner fin = null;
			try {
				fin = new Scanner(new FileInputStream(list.get(0)));
			} catch (FileNotFoundException e) {
				System.out.println("Incorrect file name");
				System.exit(-1);
			}
	}

}
