package org.example.base.utils;

/**
 * @author : 白桓宇  522858867@qq.com
 * @date: 2020/5/20
 */
public class Result {
    /**状态嘛*/
    private Integer status;
    /**信息*/
    private String message;

    public Result() {
    }

    public Result(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
