import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CalendarService {
    private final RestTemplate restTemplate;

    @Autowired
    public CalendarService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void saveDate(LocalDate date) {

        String url = "http://localhost:8080/services/dates";
        restTemplate.postForObject(url, date, Void.class);
    }
}
