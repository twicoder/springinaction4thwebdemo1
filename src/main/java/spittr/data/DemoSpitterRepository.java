package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spitter;

import java.util.HashMap;
import java.util.Map;

@Component
public class DemoSpitterRepository implements SpitterRepository {
    Map<String, Spitter> spitterMap = new HashMap<>();
    private long counter = 1;

    @Override
    public Spitter save(Spitter spitter) {
        spitter.setId(counter++);
        spitterMap.put(spitter.getUsername(),spitter);
        return spitter;
    }

    @Override
    public Spitter findByUsername(String username) {
        return spitterMap.get(username);
    }
}
