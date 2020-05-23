package org.example.base.service.impl;

import org.example.base.mapper.BaseMapper;
import org.example.base.query.BaseQuery;
import org.example.base.service.IBaseService;
import org.example.base.utils.PageList;


import java.io.Serializable;
import java.util.List;

/**
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/5/20
 */

public abstract class BaseServiceImpl<T,ID extends Serializable> implements IBaseService<T,ID > {

    /** 获取baseMapper 让子类去实现
     * @return
     */
    public abstract BaseMapper<T,ID> getBaseMapper();

    @Override
    public void save(T t) {
        getBaseMapper().save(t);
        //System.out.println(1/0);
    }

    @Override
    public void delete(ID id) {

    }

    @Override
    public void update(T t) {

    }

    @Override
    public T selectById(ID id) {
        return null;
    }

    @Override
    public List<T> selectAll() {

        return getBaseMapper().selectAll();
    }

    @Override
    public List<T> selectByQuery(BaseQuery<T> baseQuery) {
        return null;
    }

    @Override
    public PageList<T> selectByPage(BaseQuery<T> baseQuery) {
        Long count = getBaseMapper().selectCount();
        if (count ==0L){
            return new PageList<>();
        }
        List<T> list = getBaseMapper().selectByPage(baseQuery);
        return new PageList<>(count,list);
    }
}
