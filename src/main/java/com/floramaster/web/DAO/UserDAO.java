package com.floramaster.web.DAO;

import com.floramaster.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by VFrancishko on 12.12.2016.
 */
@Repository
public class UserDAO {
    @Autowired private MongoOperations mongoOperations;

    public void save(User user){
        mongoOperations.save(user);
    }

    public User get(Long id){
        return mongoOperations.findOne(Query.query(Criteria.where("id").is(id)),User.class);
    }

    public List<User> getAll(){
        return mongoOperations.findAll(User.class);
    }

    public void remove (Long id){
        mongoOperations.remove(Query.query(Criteria.where("id").is(id)), User.class);
    }
}
