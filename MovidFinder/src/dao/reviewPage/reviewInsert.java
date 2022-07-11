package dao.reviewPage;

import dto.dto;
import dto.memberDTO;
import dto.movieDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class reviewInsert {
    reviewInsert() {
        String sql = "insert into review(id,title,content,movie_name) values(?,?,?,?)";
        PreparedStatement stmt;
        try {
            Connection conn = dto.makeConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, memberDTO.getId());
            stmt.setString(2, reviewDto.getTitle());
            stmt.setString(3, reviewDto.getContent());
            stmt.setString(4, movieDTO.getMovieName());
            stmt.executeUpdate();
            System.out.println("등록 완료");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
