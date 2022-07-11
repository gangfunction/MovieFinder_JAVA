package dao.member;

import dao.register.regProcess;
import dto.dto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class idCheck {
    public static void action(String id) {
        String sql = "select * from member where id = '" + id + "'";
        try {
            Connection conn = dto.makeConnection();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            if (rs.next()) {
                System.out.println("아이디 중복 다시입력하세요");
                new regProcess();
            }
            else {
                System.out.println("사용가능한 아이디입니다.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
