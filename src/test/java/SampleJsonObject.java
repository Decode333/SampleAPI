import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class SampleJsonObject {

	public static void main(String[] args) throws IOException, ParseException {

		FileReader reader = new FileReader(
				"C:\\Users\\NITHIN RAJ E\\eclipse-workspace\\SampleAPI\\src\\test\\resources\\sampleData.json");
		JSONParser parser = new JSONParser();
		Object parse = parser.parse(reader);
		JSONObject obj = (JSONObject) parse;
		Object dataObj = obj.get("data");
		JSONObject data = (JSONObject) dataObj;
		Object supportObj = obj.get("support");
		JSONObject support = (JSONObject) supportObj;

		Object id = data.get("id");
		System.out.println(id);
		Object email = data.get("email");
		System.out.println(email);
		Object fName = data.get("first_name");
		System.out.println(fName);
		Object lName = data.get("last_name");
		System.out.println(lName);
		Object avatar = data.get("avatar");
		System.out.println(avatar);
		Object url = support.get("url");
		System.out.println(url);
		Object text = support.get("text");
		System.out.println(text);

	}

}
