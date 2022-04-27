package docker_spring_mysql_mybatis.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import docker_spring_mysql_mybatis.demo.form.SearchForm;
import docker_spring_mysql_mybatis.demo.interfaces.SearchServiceImpl;
import docker_spring_mysql_mybatis.demo.mapper.SearchMapper;

@Service
public class SearchService implements SearchServiceImpl{
    @Autowired
    SearchMapper mapper;

    @Override
    public List<SearchForm> callMethod() {
        return mapper.selectAll();
    }
    
}
