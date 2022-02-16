package com.turgaydede.business;

import com.turgaydede.business.exceptions.UserNotFoundException;
import com.turgaydede.dataAccess.UserDao;
import com.turgaydede.entities.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserManager {
    private final UserDao userDao;

    public UserManager(UserDao userDao) {
        this.userDao = userDao;
    }

    public void add(User user){
        this.userDao.save(user);
    }
    public void delete(int userId){
        User user = this.userDao.findById(userId).orElseThrow(UserNotFoundException::new);
        this.userDao.delete(user);
    }
    public void update(User user){
        this.userDao.save(user);
    }
    public List<User> getAll(){
        return this.userDao.findAll();
    }
}
