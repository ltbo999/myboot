package com.hunau.mydatauser.Dao;

import com.hunau.mydatauser.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Systemname:湖南灾害应急管理系统
 * @Author:唐耿涛
 * @Description:
 * @Date:Created in $[TIME] $[DATE]
 * @Unitname:湖南农业大学信息学院物联网工程系
 * @Copyright:综合训练系统V1.0
 * @Rewriting:刘波
 */
@Mapper
@Repository
public interface UserDao {
    @Select("select id,name,pwd,isuse ,birthhday from tb_user where name like'%${value}%'")
        //@Transactional(readOnly = true)
    List<User> findBy(String name);

    @Select("select id,name,pwd,isuse birthhday from tb_user where id=#{id}")
    User selectUser(int id);
}
