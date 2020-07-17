package com.lizhen.finance.web.mp.checkservice.controller;


import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lizhen.finance.web.mp.checkservice.entity.CheckBase;
import com.lizhen.finance.web.mp.checkservice.service.ICheckBaseService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 检测订单记录表 前端控制器
 * </p>
 *
 * @author wangyz
 * @since 2020-07-03
 */
@RestController
@RequestMapping("/checkservice/checkBase")
@Api(tags = "服务检测相关接口")
public class CheckBaseController {
    @Autowired
    private ICheckBaseService iCheckBaseService;

    @PostMapping("getCheckList")
    @ApiOperation(value = "分页",notes = "分页",
            httpMethod = "POST")
    public List<CheckBase> getCheckList(){
        return iCheckBaseService.list();

    }
    /**
     * 分页查询全部数据
     * 这里只做演示，不写前端
     * @return IPage<User> 分页数据
     */
    @PostMapping("/getCheckListPage")
    @ApiOperation(value = "分页",notes = "分页",
            httpMethod = "POST")
    public IPage<CheckBase> getUserListPage(){
        IPage<CheckBase> page = new Page<>();
        //当前页
        page.setCurrent(4);
        //每页条数
        page.setSize(2);
        return iCheckBaseService.page(page);
    }
}
