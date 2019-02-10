
import java.io.File;
import java.io.IOException;

import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jsonDataModels.User;


/*
     This will not work unless
     Jackson {core/databind/annotations} -> 2.9.8 (tested with this version)
     are added as external libraries

     despite being added as pom dependency
 */
public class JsonToPojo {

    public static void  main(String args[]) {
        ObjectMapper mapper = new ObjectMapper();

        try {

            // Convert JSON string from file to Object
            User user = mapper.readValue(new File("user.json"), User.class);
            System.out.println(user);

            // Convert JSON string to Object
            String jsonInString = "{\"age\":33,\"messages\":[\"msg 1\",\"msg 2\"],\"name\":\"mkyong\"}";
            User user1 = mapper.readValue(jsonInString, User.class);
            System.out.println(user1);

        } catch (JsonGenerationException e) {
            e.printStackTrace();
        } catch (JsonMappingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
