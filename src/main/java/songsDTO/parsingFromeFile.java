package songsDTO;

import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class parsingFromeFile {

	public static void main(String[] args) {

		JSONObject arrayObj;

		try {
			
			System.out.println("Albums " + Help.textFromFile("alboms.json").get(0));
			arrayObj = new JSONObject(Help.textFromFile("alboms.json").get(0));
			
//			arrayObj = new JSONObject(
//					"{\"sounds\":[{\"artist\":\"Nerevar Rising\",\"song\":\"Call Of Magic\",\"time\":\"1:56\"}, {\"artist\":\"Bright Spears\",\"song\":\"Dark Blood\",\"time\":\"1:02\"},{\"artist\":\"Ambush!\",\"song\":\"gundave\",\"time\":\"3:08\"},{\"artist\":\"Caprice\",\"song\":\"Ending Theme\",\"time\":\"2:00\"},{\"artist\":\"Caprice\",\"song\":\"Ending Theme\",\"time\":\"5:00\"}]}");
//			JSONArray jsArray = (arrayObj.getJSONArray("sounds"));
//			for (int i = 0; i <= jsArray.length(); i++) {
//				System.out.println(jsArray.getJSONObject(i)); //ËÓ×ØÅ ÞÇÀÒÜ getJSONObject ÒÎÃÄÀ ÌÎÆÍÎ ÞÇÀÒÜ ÁÎËÜØÅ ÌÅÒÎÄÎÂ, getJSONObject(i).getString(key).
//				System.out.println(jsArray.getJSONObject(i).getString("name"));
//				System.out.println(jsArray.getJSONObject(i).getInt("age"));
//			}

//			System.out.println(jsArray.getJSONObject(0).getString("name"));
//			System.out.println(jsArray.getJSONObject(2).getInt("age"));

		} catch (JSONException e) {

		}

	}

}
