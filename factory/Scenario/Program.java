package factory.Scenario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Program {

    public static void main(String[] args){

        //isolate this code to handle with only database connection
        Connection c = DriverManager.getConnection("");

        PreparedStatement prepared = c.prepareStatement("");
    }
}