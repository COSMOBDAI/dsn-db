package io.github.cosmobdai.bdp.dsn.db.model;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;

public class QueryResult {
    private int code;
    private String msg;
    //private ResultSet data;
    private List<Map<String, Object>> data;
    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<Map<String, Object>> getData() {
        return data;
    }

    public void setData(List<Map<String, Object>> data) {
        this.data = data;
    }
}
