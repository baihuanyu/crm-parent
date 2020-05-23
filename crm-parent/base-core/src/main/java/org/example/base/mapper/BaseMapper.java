package org.example.base.mapper;

import org.example.base.query.BaseQuery;
import org.example.base.utils.PageList;
import java.io.Serializable;
import java.util.List;

/**
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/5/20
 */
public interface BaseMapper<T,ID extends Serializable> {
    /**新增
     * @param t
     */
    void save(T t);

    /**删除
     * @param id id
     */
    void delete(ID id);

    /**修改
     * @param t
     */
    void update(T t);

    /** 查询单个
     * @param id id
     * @return
     */
    T selectById(ID id);

    /**查询总条数
     * @return
     */
    Long selectCount();
    /**查询所有
     * @return
     */
    List<T> selectAll();

    /** 条件查询
     * @param baseQuery
     * @return
     */
    List<T> selectByQuery(BaseQuery<T> baseQuery);

    /** 分页查询
     * @param baseQuery
     * @return
     */
    List<T> selectByPage(BaseQuery<T> baseQuery);
}
