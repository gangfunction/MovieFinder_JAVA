package dao.admin;

import dto.dto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AutoBReset {
    AutoBReset(){
        String sql= "alter table `box_office` auto_increment=1";
        String sql2=  "set @count =0";
        String sql3= "update `box_office` set `box_office`.num = @count:=@count+1";
        try{
            PreparedStatement stmt = dto.makeConnection().prepareStatement(sql);
            stmt.execute();
            PreparedStatement stmt2 = dto.makeConnection().prepareStatement(sql2);
            stmt2.execute();
            PreparedStatement stmt3 = dto.makeConnection().prepareStatement(sql3);
            stmt3.execute();
            System.out.println("자동증가 초기화가 완료되었습니다.");
            new adminMenu();
        }
        catch(SQLException | ClassNotFoundException e){
            throw new RuntimeException(e);
        }
    }
}
