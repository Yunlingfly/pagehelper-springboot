package cn.yunlingfly.pagehelperdemo.service.impl;

import cn.yunlingfly.pagehelperdemo.entity.Country;
import cn.yunlingfly.pagehelperdemo.mapper.IPageHelperMapper;
import cn.yunlingfly.pagehelperdemo.service.IPageHelperService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PageHelperServiceImpl implements IPageHelperService {
    @Autowired
    IPageHelperMapper iPageHelperMapper;

    @Transactional(rollbackFor = RuntimeException.class)
    @Override
    public List<Country> listAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);

        return iPageHelperMapper.getAll();
    }

    @Override
    public Boolean greaterThanNums(int pageNum, int pageSize) {
        // 算法：除第一页以外（第一页就算不足也要全部展示出来），如果上一页就已经到达最大总数，则后面几页都不该存在。其他负数的情况PageHelper已经帮你处理了，有需要也可以自己在这编写算法
        if (pageNum > 1 && (pageNum - 1) * pageSize > iPageHelperMapper.selectCount()) return true;
        else return false;
    }
}
