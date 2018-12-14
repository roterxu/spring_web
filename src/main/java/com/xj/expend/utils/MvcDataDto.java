package com.xj.expend.utils;

public class MvcDataDto {
    public static final String Success="success";
    public static final String Fail="fail";

    private String resultCode;
    private String resiltMessage;
    private Object resultObj;
    private Object param;
    private Page page;

    public static String getSuccess() {
        return Success;
    }

    public static String getFail() {
        return Fail;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResiltMessage() {
        return resiltMessage;
    }

    public void setResiltMessage(String resiltMessage) {
        this.resiltMessage = resiltMessage;
    }

    public Object getResultObj() {
        return resultObj;
    }

    public void setResultObj(Object resultObj) {
        this.resultObj = resultObj;
    }

    public Object getParam() {
        return param;
    }

    public void setParam(Object param) {
        this.param = param;
    }

    public Page getPage() {
        return page;
    }

    public void setPage(Page page) {
        this.page = page;
    }
}
