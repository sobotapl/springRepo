package pl.piotrsobocinski.demorepo.models.services;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class StringService {
    public String generateRandomString(){
        return UUID.randomUUID().toString();
    }
}
