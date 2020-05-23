package org.example.crm.service.impl;

import org.example.base.mapper.BaseMapper;
import org.example.base.service.impl.BaseServiceImpl;
import org.example.crm.domain.Department;
import org.example.crm.mapper.DepartmentMapper;
import org.example.crm.service.IDepartmentService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
  * @author : 白桓宇  522858867@qq.com
  * @date: 2020/5/20
  */
@Service
public class DepartmentServiceImpl extends BaseServiceImpl<Department,Long>
    implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;


    @Override
    public BaseMapper<Department, Long> getBaseMapper() {
        return departmentMapper;
    }
}
