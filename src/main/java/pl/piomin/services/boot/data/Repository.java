package pl.piomin.services.boot.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import pl.piomin.services.boot.model.location;

public interface Repository extends MongoRepository<location, String> {

}
