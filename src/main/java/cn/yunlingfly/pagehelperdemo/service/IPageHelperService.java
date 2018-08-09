package cn.yunlingfly.pagehelperdemo.service;

import cn.yunlingfly.pagehelperdemo.entity.Country;

import java.util.List;

public interface IPageHelperService {
    // 列出所有城市
    List<Country> listAll(int pageNum, int pageSize);

    // 判断最大值
    Boolean greaterThanNums(int pageNum, int pageSize);
}
