package org.example.crm.controller;

import org.example.base.utils.PageList;
import org.example.crm.domain.Department;
import org.example.crm.query.DepartmentQuery;
import org.example.crm.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/5/20
 */
@CrossOrigin
@Controller
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    private IDepartmentService deptService;

    @RequestMapping(value = "/index",method = RequestMethod.PATCH)
    @ResponseBody
    public List<Department> index() {
        return deptService.selectAll();
    }

    /**
     *  分页查询
     * @return
     */
    @RequestMapping(value = "/pageList",method = RequestMethod.PATCH)
    @ResponseBody
    public PageList<Department> selectPageByQuery(@RequestBody DepartmentQuery departmentQuery) {
        return deptService.selectByPage(departmentQuery);
    }

    @RequestMapping(value = "/test" , method = RequestMethod.GET)
    @ResponseBody
    public String text(){
        return "可以访问";
    }

}
