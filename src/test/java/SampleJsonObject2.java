import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SampleJsonObject2 {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader reader = new FileReader(
				"C:\\Users\\NITHIN RAJ E\\eclipse-workspace\\SampleAPI\\src\\test\\resources\\sampleData2.json");
		JSONParser parser = new JSONParser();
		Object parseObj = parser.parse(reader);
		JSONObject parse = (JSONObject) parseObj;
		System.out.println("page: " + parse.get("page"));
		System.out.println("per_page: " + parse.get("per_page"));
		System.out.println("total" + parse.get("total"));
		System.out.println("total_pages: " + parse.get("total_pages"));
		System.out.println("data:");
		System.out.println("----------------------------------------");
		Object object = parse.get("data");
		JSONArray data = (JSONArray) object;
		for (int i = 0; i < data.size(); i++) {
			Object object2 = data.get(i);
			JSONObject objs = (JSONObject) object2;
			System.out.println("id: " + objs.get("id"));
			System.out.println("email: " + objs.get("email"));
			System.out.println("first_name: " + objs.get("first_name"));
			System.out.println("last_name: " + objs.get("last_name"));
			System.out.println("avatar: " + objs.get("avatar"));
			System.out.println("======================================");
		}
		Object supportObj = parse.get("support");
		System.out.println("support:");
		System.out.println("----------------------------------------");
		JSONObject support = (JSONObject) supportObj;
		System.out.println("url: " + support.get("url"));
		System.out.println("text: " + support.get("text"));
	}

}
