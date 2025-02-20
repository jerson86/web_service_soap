package country.com.jer86.springsoap;

import country.com.jer86.springsoap.gen.Country;
import country.com.jer86.springsoap.gen.Currency;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class CountryRepository {

    private static final Map<String, Country> countries = new HashMap<>();

    @PostConstruct
    public void initData() {
        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);

        countries.put(spain.getName(), spain);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);

        countries.put(poland.getName(), poland);

        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(63705000);

        countries.put(uk.getName(), uk);

        Country col = new Country();
        col.setName("Colombia");
        col.setCapital("Bogota");
        col.setCurrency(Currency.PESO);
        col.setPopulation(50000000);

        countries.put(col.getName(), col);
    }

    public Country findCountry(String name) {
        return countries.get(name);
    }
}
