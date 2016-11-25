package songsDTO;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.TypeFactory;

public class ShowFile {
	public static void main(String[] args) throws JsonParseException, JsonMappingException, IOException {
		InputStream input = new FileInputStream("alboms.json");
		ObjectMapper objectMapper = new ObjectMapper();

		TypeFactory typeFactory = TypeFactory.defaultInstance();
		List<songsDTO> albom = objectMapper.readValue(input,
				typeFactory.constructCollectionType(ArrayList.class, songsDTO.class));

		for (int i = 0; i < albom.size(); i++) {
//			System.out.println(drivers.size());
			System.out.println("\n Artist: " + albom.get(i).getArtist() );
			System.out.println("Song: " + albom.get(i).getSong() + "\t" + albom.get(i).getTime());
		}
	}

}
