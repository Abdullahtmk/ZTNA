package postgresql.parameters;

import com.google.gson.annotations.SerializedName;
import com.jcraft.jsch.JSchException;
import postgresql.tasks.AuthDb;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class DatabaseParameters {

    @SerializedName("rdbms")
    public String rdbms;

    @SerializedName("host")
    public String host;

    @SerializedName("db")
    public String db;

    @SerializedName("dbUser")
    public String dbUser;

    @SerializedName("dbPassword")
    public String dbPassword;
}
