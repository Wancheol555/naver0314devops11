package day0404;

import java.sql.*;

public class Ex1MysqlSawon {
    static final String MYSQL_DRIVER="com.mysql.cj.jdbc.Driver";
    static final String MYSQL_URL="jdbc:mysql://localhost:3306/bit701?serverTimezone=Asia/Seoul";
    static final String USERNAME="root";
    static final String PASSWORD="1234";


    public Ex1MysqlSawon() {
        try {
            Class.forName(MYSQL_DRIVER);
            System.out.println("Mysql8 드라이버 성공!");
        } catch (ClassNotFoundException e) {
            System.out.println("Mysql8 드라이버 오류: "+e.getMessage());
        }
    }

    static public void showTitle()
    {
        System.out.println("=".repeat(40));
        System.out.println("시퀀스 이름\t성별\t부서\t\t점수");
        System.out.println("=".repeat(40));

    }

    public void wirteSawon()
    {
        //URL이 맞으면 Connection을 얻는다
        Connection conn=null;
        Statement stmt=null;
        ResultSet rs=null;//select 문일 경우에만 필요한 클래스
        String sql="select*from sawon order by num";
        try {
            conn= DriverManager.getConnection(MYSQL_URL,USERNAME,PASSWORD);
            System.out.println("Mysql 서버에 연결 성공!");

            showTitle();

            stmt=conn.createStatement();//sql을 실행하기 위한 statement 얻기
            rs=stmt.executeQuery(sql); //select문일 경우는 무조건 excuteQuery문으로 실행한다

            //rs.next() 다음 레코드로 이동을 하면서 true반환, 그런데 이동할 데이타가 더 이상 없으면 false반환
            while (rs.next())
            {
                //데이타를 가져올때는 컬럼번호 또는 컬럼명으로 가져오면 된다
                //1.컬럼번호로 가져오기
//                int num=rs.getInt(1);
//                String name=rs.getString(2);
//                int score=rs.getInt(3);
//                String gender=rs.getString(4);
//                String buseo=rs.getString(5);

                //2.컬럼명으로 가져오기
                int num=rs.getInt("num");
                String name=rs.getString("name");
                int score=rs.getInt("score");
                String gender=rs.getString("gender");
                String buseo=rs.getString("buseo");

                System.out.println(num+"\t"+name+"\t"+gender+"\t"+buseo+"\t"+score);

            }
        } catch (SQLException e) {
            System.out.println("URL,USERNAME,PASSWORD 확인:"+e.getMessage());
        } finally {

            try {
                rs.close();
                stmt.close();
                conn.close();
            } catch (SQLException e) {

            }
        }
    }
    public static void main(String[] args) {
        Ex1MysqlSawon ex1=new Ex1MysqlSawon();
        showTitle();;
        ex1.wirteSawon();
    }
}
