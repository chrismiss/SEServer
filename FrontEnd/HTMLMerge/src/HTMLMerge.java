import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;

public class HTMLMerge {

	public static void main(String[] args) throws IOException {
		ArrayList<String> listOfFiles = new ArrayList<String>();
		listOfFiles.add("template.html");
		listOfFiles.add("log-in.html");
		listOfFiles.add("calendar.html");
		listOfFiles.add("templateEnd.html");

		ArrayList<String> fileList = writeTo(listOfFiles.get(0));
		Writer w = new FileWriter("index.html");
		for (int i = 0; i < fileList.size(); i++) {
			w.write(fileList.get(i) + "\n");
		}
		for (int index = 1; index < listOfFiles.size() - 1; index++) {
			fileList = writeTo(listOfFiles.get(index));
			for (int i = 0; i < fileList.size(); i++) {
				w.write("\t" + fileList.get(i) + "\n");
			}
		}
		fileList = writeTo(listOfFiles.get(listOfFiles.size()-1));
		for (int i = 0; i < fileList.size(); i++) {
			w.write(fileList.get(i) + "\n");
		}
		w.close();
	}

	/*
	 * Takes a path string as an argument.
	 * Scans file from path and puts contents into
	 * an array list that's returned to user.
	 */
	private static ArrayList<String> writeTo(String path) {
		Scanner fin = null;
		try {
			fin = new Scanner(new FileInputStream(path));
		} catch (FileNotFoundException e) {
			System.out.println("Incorrect file name");
			System.exit(-1);
		}
		ArrayList<String> list = new ArrayList<String>();
		while (fin.hasNextLine()) {
			list.add(fin.nextLine());
		}
		fin.close();
		return list;
	}
}
