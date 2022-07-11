package dao.admin;

import dto.dto;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AutoMReset {
    public AutoMReset(){
        String sql= "alter table `member` auto_increment=1";
        String sql2=  "set @count =0";
        String sql3= "update `member` set `member`.`id` = @count:=@count+1";
        try{
            PreparedStatement stmt = dto.makeConnection().prepareStatement(sql);
            stmt.execute();
            System.out.println("alter table `member` auto_increment=1 성공");
            PreparedStatement stmt2 = dto.makeConnection().prepareStatement(sql2);
            stmt2.execute();
            System.out.println("set @count =0 성공");
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
