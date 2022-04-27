package docker_spring_mysql_mybatis.demo.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import docker_spring_mysql_mybatis.demo.form.SearchForm;

@Mapper
public interface SearchMapper {
    List<SearchForm> selectAll();
}
