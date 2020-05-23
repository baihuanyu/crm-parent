package org.example.base.utils;

/**
 * @author shirokansakai
 * 返回前端的
 */
public class AjaxResult {
    private Boolean success = true;
    private String msg;

    public AjaxResult(){

    }

    public AjaxResult(Boolean success, String msg) {
        this.success = success;
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
