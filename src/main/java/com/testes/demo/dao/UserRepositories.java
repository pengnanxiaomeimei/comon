package com.testes.demo.dao;

import com.testes.demo.entity.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @Description:
 * @Author:cdd
 * @CreateDate:
 * @UpdateDate:
 */
@Repository
public interface UserRepositories  extends ElasticsearchRepository<User,String > {
    @Override
    Iterable<User> findAll();
    //github make the change
    List findUserByNameLike(String like);
}
