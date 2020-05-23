package factory.Solution;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Program {

    public static void main(String[] args){

        //isolate this code to handle with only database connection
        Connection connection = new ConnectionFactory().getConnection();

        PreparedStatement prepared = c.prepareStatement("");
    }
}