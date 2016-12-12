package com.floramaster.web.services;

import com.floramaster.web.DAO.SequenceDAO;
import com.floramaster.web.DAO.UserDAO;
import com.floramaster.web.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


/**
 * Created by Администратор on 12.12.2016.
 */
@Service
public class UserService {
    @Autowired private SequenceDAO sequenceDAO;
    @Autowired private UserDAO userDAO;

    public void add(User user){
        user.setId(sequenceDAO.getNextSequenceId(User.COLLECTION_NAME));
        userDAO.save(user);
    }

    public void update(User user){
        userDAO.save(user);
    }

    public User get(Long id){
        return userDAO.get(id);
    }

    public List<User> getAll(){
        return userDAO.getAll();
    }

    public void remove(Long id){
        userDAO.remove(id);
    }
}
