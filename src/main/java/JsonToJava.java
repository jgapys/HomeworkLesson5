import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonToJava {

    public static void mapFromJsonToJava(String fileName) {
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.readValue(
                    new File(fileName),
                    new TypeReference<MovieLibrary>() {
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}