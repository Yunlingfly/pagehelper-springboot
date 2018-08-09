package cn.yunlingfly.pagehelperdemo.controller;

import cn.yunlingfly.pagehelperdemo.entity.Country;
import cn.yunlingfly.pagehelperdemo.service.IPageHelperService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PageHelperController {
    @Autowired
    IPageHelperService pageHelperService;

    @RequestMapping(value = "/getAll", method = RequestMethod.GET)
    public List<Country> getAllCount(int pageNum, int pageSize) {
        // 如果超过最大总数则直接返回null
        if (pageHelperService.greaterThanNums(pageNum, pageSize)) return null;

        return pageHelperService.listAll(pageNum, pageSize);
    }
}
