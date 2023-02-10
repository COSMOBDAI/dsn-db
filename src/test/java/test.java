import io.github.cosmobdai.bdp.dsn.db.DsnDb;
import io.github.cosmobdai.bdp.dsn.db.model.ExecuteResult;
import io.github.cosmobdai.bdp.dsn.db.model.QueryResult;
import org.junit.Test;

public class test {
    @Test
    public void queryTest(){
        DsnDb dsnDb = new DsnDb("192.168.0.149:2345");
        QueryResult queryResult = dsnDb.query("select * from lixiao11");
        System.out.println(queryResult.getData().toString());
    }


    @Test
    public void executeTest(){
        DsnDb dsnDb = new DsnDb("192.168.0.149:2345");
        ExecuteResult executeResult = dsnDb.execute("create table lixiao12(user_id int,user_name int)");
        System.out.println(executeResult.isResult());
    }
}
