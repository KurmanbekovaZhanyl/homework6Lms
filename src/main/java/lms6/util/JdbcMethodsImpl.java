package lms6.util;
import lms6.City;
import lms6.Country;
import lms6.Mayor;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static lms6.HibernetRealisation.connection;
public class JdbcMethodsImpl implements JdbcMethods {

    @Override
    public  List<Mayor> printMayor() {
        ArrayList<Mayor> mayors = new ArrayList<>();
        String SQL = "SELECT * FROM mayor";
        try (Connection conn = connection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                mayors.add(new Mayor(
                        rs.getString("name"),
                        rs.getString("surname")));
            }
            return mayors;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }

    @Override
    public  List<Country> printCountry() {
        ArrayList<Country> countries = new ArrayList<>();
        String SQL = "SELECT * FROM country";
        try (Connection conn = connection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                countries.add(new Country(
                        rs.getString("name"),
                        rs.getString("capital")));
            }
            return countries;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;

    }

    @Override
    public  List<City> printCity() {
        ArrayList<City> cities = new ArrayList<>();
        String SQL = "SELECT * FROM city";
        try (Connection conn = connection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(SQL)) {
            while (rs.next()) {
                cities.add(new City(
                        rs.getString("name"),
                        rs.getInt("age")));
            }
            return cities;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        return null;

    }
}
