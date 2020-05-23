package org.example.base.utils;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/5/20
 * 分页查询
 */
public class PageList<T> {
    private Long total;
    private List<T> rows = new ArrayList<T>();

    public PageList() {
    }

    public PageList(Long total, List<T> rows) {
        this.total = total;
        this.rows = rows;
    }

    public Long getTotal() {
        return total;
    }

    public List<T> getRows() {
        return rows;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public void setRows(List<T> rows) {
        this.rows = rows;
    }
}
