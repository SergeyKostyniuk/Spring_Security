package ua.sergey.test.persistence;

import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import ua.sergey.test.domain.User;

import java.util.Optional;

import static org.springframework.data.mongodb.core.query.Criteria.where;
import static org.springframework.data.mongodb.core.query.Query.query;

@Component
public class UserDao {
    @Autowired
    private MongoTemplate mongoTemplate;

    public Optional<User>findByUsername(@NonNull String username) {
        return Optional.ofNullable(mongoTemplate.findOne(query(where("username").is(username)), User.class));

    }
}
