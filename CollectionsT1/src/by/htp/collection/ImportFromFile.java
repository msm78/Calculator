package by.htp.collection;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class ImportFromFile {
	
	private List<Student> list = new LinkedList<Student>();
	
	ImportFromFile(String inFileName){
	try {
		BufferedReader br = new BufferedReader(new FileReader(inFileName));
			String str;
			String name;
			int date;
			String[] splitStr = new String[2];
			while (br.ready()) {
				str = br.readLine();
				splitStr = str.split(" ");
				name = splitStr[0];
				date = Integer.valueOf(splitStr[1]);
				list.add(new Student(name, date));
				//System.out.println(name+" -"+date);
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public List<Student> getList() {
		return list;
	}
	
	
}
