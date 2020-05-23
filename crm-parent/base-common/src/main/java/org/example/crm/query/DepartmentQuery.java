package org.example.crm.query;

import org.example.base.query.BaseQuery;
import org.example.crm.domain.Department;

/**
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/5/20
 */
public class DepartmentQuery extends BaseQuery<Department> {
    /**名字进行模糊查询*/
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
