package dao.admin;

import dto.dto;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class adminMemberList {
    protected adminMemberList() {
        try{
            String sql = "select * from member ";
            PreparedStatement stmt = dto.makeConnection().prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getString ("num")+" "+rs.getString("id")  + " " + rs.getString("pwd") +"  "+rs.getString("isin")+"  "+ rs.getString("admin"));
            }
            System.out.println("----------------------------------------------------");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
