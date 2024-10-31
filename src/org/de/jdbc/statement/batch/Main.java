package org.de.jdbc.statement.batch;

import java.sql.Statement;
import java.sql.BatchUpdateException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Main {
    public static void main(String[] args) throws SQLException{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/de-jdbc", "root", "root!1234");
        Statement stmt = con.createStatement();
        stmt.addBatch("select `id`,`name`,`updated_at`,`contents`,`price` from product where id between 1 and 5");
        stmt.addBatch("UPDATE product SET `price` = `price` + 10000 where id = 1");
        try{
            stmt.executeBatch();
        }catch (BatchUpdateException batchUpdateException) {
            System.out.println(batchUpdateException.getMessage());
        }
        stmt.addBatch("UPDATE product SET `price`=`price` + 10000 where id = 1");
        stmt.addBatch("UPDATE product SET `price`=`price` + 10000 where id = 2");
        stmt.addBatch("UPDATE product SET `price`=`price` + 10000 where id between 3 and 5");
        int[] results = stmt.executeBatch();

        for(int result : results){
            if(result >= 0 ){
                System.out.println("result of update: " + result);
            }
        }

        con.close();
    }

}
