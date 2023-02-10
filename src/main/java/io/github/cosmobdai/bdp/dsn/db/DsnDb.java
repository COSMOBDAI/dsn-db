package io.github.cosmobdai.bdp.dsn.db;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import io.github.cosmobdai.bdp.dsn.db.model.ExecuteResult;
import io.github.cosmobdai.bdp.dsn.db.model.QueryResult;
import io.github.cosmobdai.bdp.dsn.db.utils.RestTemplateUtil;
import org.junit.Test;
import org.springframework.http.HttpMethod;

public class DsnDb {
    private String dsnUrl;
    private static final String HTTP = "http://";
    private static final String URL_TITLE = "/bdp/dsn/hive/management/v1";
    private static final String QUERY = "/query";
    private static final String QUESTION_MARK = "?";
    private static final String SQL = "sql";
    private static final String SHIFT_13 = "=";
    private static final String EXECUTE = "/execute";

    public DsnDb(String dsnUrl){
        this.dsnUrl = dsnUrl;
    }
    public QueryResult query(String sql){
        String querySqlUrl = HTTP + dsnUrl + URL_TITLE + QUERY + QUESTION_MARK + SQL + SHIFT_13 + sql;
        JSONObject result = RestTemplateUtil.exchange(querySqlUrl, HttpMethod.GET);
        QueryResult queryResult = JSON.toJavaObject(result,QueryResult.class);
        return queryResult;
    }
    public ExecuteResult execute(String sql){
        String querySqlUrl = HTTP + dsnUrl + URL_TITLE + EXECUTE + QUESTION_MARK + SQL + SHIFT_13 + sql;
        JSONObject result = RestTemplateUtil.exchange(querySqlUrl, HttpMethod.POST);
        ExecuteResult queryResult = JSON.toJavaObject(result,ExecuteResult.class);
        return queryResult;
    }

}
