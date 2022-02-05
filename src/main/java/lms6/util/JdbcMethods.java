package lms6.util;

import lms6.City;
import lms6.Country;
import lms6.Mayor;

import java.util.List;

public interface JdbcMethods {
        List<Mayor>  printMayor();

        List<Country>  printCountry();

        List<City>  printCity();

    }


