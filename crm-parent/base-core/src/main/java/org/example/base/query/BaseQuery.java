package org.example.base.query;

/**
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/5/20
 */
public class BaseQuery<T> {
    /**默认当前页为第一页*/
    private Integer currentPage =1;
    /**默认当前显示为10*/
    private Integer pageSize=10;
    /**起始页 默认是0*/
    private Integer startPage =0;

    public Integer getStartPage() {
        return (this.currentPage-1)*this.pageSize;
    }


    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }
}
