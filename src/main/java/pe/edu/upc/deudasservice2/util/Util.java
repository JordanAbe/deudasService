package pe.edu.upc.deudasservice2.util;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Util {
	
	public static String objectToJson(Object object) {
		ObjectMapper mapper = new ObjectMapper();
		String jsonInString = null;
		try {
			jsonInString = mapper.writeValueAsString(object);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return jsonInString;
	}

	public static Object jsonToObject(String json, Object object) {
		if (json != null && !json.isEmpty()) {
			ObjectMapper mapper = new ObjectMapper();
			try {
				object = mapper.readValue(json, object.getClass());
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return object;
	}

}
