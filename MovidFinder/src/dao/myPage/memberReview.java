package dao.myPage;

import dto.dto;
import dto.memberDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class memberReview {
    protected memberReview(){
        System.out.println("작성자가 만든 리뷰입니다.");
        String sql= "select * from review where id= ?";
        try{
            Connection conn = dto.makeConnection();
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, memberDTO.getId());
            ResultSet rs = stmt.executeQuery();
            while(rs.next()){
                System.out.println(rs.getString("num") + "   " + rs.getString("id") + " " + rs.getString("movie_name") + " " + rs.getString("title") + " " + rs.getString("content"));
            }
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
