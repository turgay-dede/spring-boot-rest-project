package com.turgaydede.business.annotations;

import com.turgaydede.dataAccess.UserDao;
import com.turgaydede.entities.User;
import org.springframework.beans.factory.annotation.Autowired;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Optional;

public class UniqueUsernameValidator implements ConstraintValidator<UniqueUsername,String> {

    @Autowired
    UserDao userDao;

    @Override
    public boolean isValid(String username, ConstraintValidatorContext context) {
        Optional<User> user = this.userDao.findByUserName(username);
        return user.isEmpty();
    }
}