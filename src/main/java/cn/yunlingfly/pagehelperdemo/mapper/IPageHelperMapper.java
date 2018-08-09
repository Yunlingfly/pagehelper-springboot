package cn.yunlingfly.pagehelperdemo.mapper;

import cn.yunlingfly.pagehelperdemo.entity.Country;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface IPageHelperMapper {
    @Select("SELECT * FROM country")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "countryname", column = "countryname"),
            @Result(property = "countrycode", column = "countrycode")
    })
    List<Country> getAll();

    @Select("SELECT count(*) from country")
    Integer selectCount();
}