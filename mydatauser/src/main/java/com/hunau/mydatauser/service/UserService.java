package com.hunau.mydatauser.service;

/**
 * @Systemname:湖南灾害应急管理系统
 * @Author:唐耿涛
 * @Description:
 * @Date:Created in $[TIME] $[DATE]
 * @Unitname:湖南农业大学信息学院物联网工程系
 * @Copyright:综合训练系统V1.0
 * @Rewriting:唐耿涛
 */
import com.hunau.mydatauser.Dao.UserDao;
import com.hunau.mydatauser.entity.User;
import com.hunau.mydatauser.Dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public User selectUser(int id){
        return userDao.selectUser(id);
    }

    public List<User> findBy(String name){
        return userDao.findBy(name);
    }
}
