package json.utils;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import postgresql.parameters.PostgreSQLConnectionParameters;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Deserialize {

    public static PostgreSQLConnectionParameters databaseConnectionParameters() throws FileNotFoundException {
        Gson gson = new Gson();
        JsonReader json = new JsonReader(new FileReader("src/test/resources/postgresql_credentials.json"));
        PostgreSQLConnectionParameters parameters = gson.fromJson(json, PostgreSQLConnectionParameters.class);
        return parameters;
    }
}
