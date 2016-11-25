package songsDTO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Help {
	
	public static List<String> textFromFile(String fileName) {
		  List<String> list = new ArrayList<String>();
		  File file = new File(fileName); // textMessLorem.txt
		  try {
		   BufferedReader br = new BufferedReader(new FileReader(file));
		   String s = br.readLine();
		   while (s != null) {
		    list.add(s);
		    s = br.readLine();
		   }
		   br.close();
		  } catch (IOException e) {
		   e.printStackTrace();
		  }
		  return list;
		 }
}
