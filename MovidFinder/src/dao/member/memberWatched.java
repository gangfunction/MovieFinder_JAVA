package dao.member;

import dto.dto;
import dto.memberDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class memberWatched {
    public memberWatched() throws SQLException, ClassNotFoundException {
        System.out.println("회원님이 시청하셨던 영화는 다음과 같습니다.");
        Connection conn = dto.makeConnection();
        String sql = "select * from reservation where id = ?";
        PreparedStatement stmt;
        try {
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, memberDTO.getId());
            ResultSet rs = stmt.executeQuery();
            if (!rs.next()) {
                System.out.println("시청하신 영화가 없으시군요? 프로그램을 종료하겠습니다.");
                System.exit(0);
            }
            rs=stmt.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("num") + " 번째 예약하셨던 " + rs.getString("movie_name") + " 영화입니다.");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
