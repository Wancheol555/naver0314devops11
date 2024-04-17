package day0405;

import java.sql.*;

public class Ex1MysqlSawonGroup {

    static final String MYSQL_DRIVER="com.mysql.cj.jdbc.Driver";
    static final String MYSQL_URL="jdbc:mysql://localhost:3306/bit701?serverTimezone=Asia/Seoul";
    static final String USERNAME="root";
    static final String PASSWORD="1234";


    public Ex1MysqlSawonGroup() {
        try {
            Class.forName(MYSQL_DRIVER);
            System.out.println("Mysql8 드라이버 성공!");
        } catch (ClassNotFoundException e) {
            System.out.println("Mysql8 드라이버 오류: "+e.getMessage());
        }
    }

    public void writeSawonGroup()
    {
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;
        String sql= """
                select buseo 부서명,count(*) 명수,max(score) 최고점,ceiling(avg(score)) 평균
                from sawon
                group by buseo;
                """;
        try {
            conn= DriverManager.getConnection(MYSQL_URL,USERNAME,PASSWORD);
            stmt=conn.createStatement();
            rs=stmt.executeQuery(sql);

            System.out.println("\t** 부서별 현황 **\n");
            System.out.println("부서명\t인원수\t최고점수\t평균점수");
            System.out.println("=".repeat(30));
            while (rs.next())
            {
                String buseo=rs.getString("부서명");
                int inwon=rs.getInt("명수");
                int max=rs.getInt("최고점");
                int avg=rs.getInt("평균");

                System.out.println(buseo+"\t"+inwon+"명\t\t"+max+"점\t\t"+avg+"점");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {

            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {
               e.printStackTrace();
            }
        }

    }
    public static void main(String[] args) {
        Ex1MysqlSawonGroup ex1=new Ex1MysqlSawonGroup();
        ex1.writeSawonGroup();
    }
}
