package org.example.crm.domain;

import org.example.base.domain.BaseDomain;

import java.io.Serializable;

/**
  * @author : 白桓宇  522858867@qq.com
  * @date: 2020/5/22
  */
public class Department extends BaseDomain implements Serializable {

    private String sn;

    private String name;

    private String dirPath;

    private Integer state;

    private Long managerId;

    private Long parentId;

    private Long tenantId;

    private static final long serialVersionUID = 1L;



    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirPath() {
        return dirPath;
    }

    public void setDirPath(String dirPath) {
        this.dirPath = dirPath;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Long getManagerId() {
        return managerId;
    }

    public void setManagerId(Long managerId) {
        this.managerId = managerId;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getTenantId() {
        return tenantId;
    }

    public void setTenantId(Long tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public String toString() {
        return "Department{" +
                "sn='" + sn + '\'' +
                ", name='" + name + '\'' +
                ", dirPath='" + dirPath + '\'' +
                ", state=" + state +
                ", managerId=" + managerId +
                ", parentId=" + parentId +
                ", tenantId=" + tenantId +
                '}';
    }
}