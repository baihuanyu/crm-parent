package org.example.base.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * PageList对象
 * @author shirokansakai
 * @param <T>
 */
public class PageResult<T> {
    //返回总条数
    private Long total;
    //返回分页数据
    private List<T> result = new ArrayList<>();

    public PageResult(){

    }
    public PageResult(Long total, List<T> result) {
        this.total = total;
        this.result = result;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<T> getResult() {
        return result;
    }

    public void setResult(List<T> result) {
        this.result = result;
    }
}
