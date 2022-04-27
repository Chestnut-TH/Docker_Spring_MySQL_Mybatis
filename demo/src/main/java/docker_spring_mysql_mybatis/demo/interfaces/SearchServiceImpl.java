package docker_spring_mysql_mybatis.demo.interfaces;

import java.util.List;

import docker_spring_mysql_mybatis.demo.form.SearchForm;

public interface SearchServiceImpl {
    public List<SearchForm> callMethod();
}
