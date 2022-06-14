import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import com.fasterxml.jackson.databind.ObjectMapper;

public class SampleJsonObject2Of2 {

	public static void main(String[] args) throws IOException, ParseException {

		File f = new File(
				"C:\\Users\\NITHIN RAJ E\\eclipse-workspace\\SampleAPI\\src\\test\\resources\\sampleData2.json");
		ObjectMapper map = new ObjectMapper();
		SampleObj2Of2POJO readValue = map.readValue(f, SampleObj2Of2POJO.class);
		System.out.println("page: " + readValue.getPage());
		System.out.println("per_page: " + readValue.getPer_page());
		System.out.println("total" + readValue.getTotal());
		System.out.println("total_pages: " + readValue.getTotal_pages());
		System.out.println("data:");
		System.out.println("----------------------------------------");
		ArrayList<Datum> data = readValue.getData();
		for (int i = 0; i < data.size(); i++) {
			Datum datum = data.get(i);
			System.out.println("id: " + datum.getId());
			System.out.println("email: " + datum.getEmail());
			System.out.println("first_name: " + datum.getFirst_name());
			System.out.println("last_name: " + datum.getLast_name());
			System.out.println("avatar: " + datum.getAvatar());
			System.out.println("======================================");
		}
		Support support = readValue.getSupport();
		System.out.println("support:");
		System.out.println("----------------------------------------");
		System.out.println("url: " + support.getUrl());
		System.out.println("text: " + support.getUrl());
		
	}

}
