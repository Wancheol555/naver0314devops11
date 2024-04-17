package day0405;

import day0404.Ex1MysqlSawon;

import java.sql.*;
import java.util.Scanner;

public class Ex12Student {

    static final String MYSQL_DRIVER="com.mysql.cj.jdbc.Driver";
    static final String MYSQL_URL="jdbc:mysql://localhost:3306/bit701?serverTimezone=Asia/Seoul";
    static final String USERNAME="root";
    static final String PASSWORD="1234";


    public Ex12Student() {
        try {
            Class.forName(MYSQL_DRIVER);
            System.out.println("Mysql8 드라이버 성공!");
        } catch (ClassNotFoundException e) {
            System.out.println("Mysql8 드라이버 오류: "+e.getMessage());
        }
    }

    public void  insertStudent(String name,int java,int html,int spring) {
        String sql = "insert into student (name,java,html,spring,testday) values (?,?,?,?,now())";
        //db저장하는 코드 추가
        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            conn = DriverManager.getConnection(MYSQL_URL, USERNAME, PASSWORD);
            pstmt = conn.prepareStatement(sql);
            //4개 바인딩
            pstmt.setString(1, name);
            pstmt.setInt(2, java);
            pstmt.setInt(3, html);
            pstmt.setInt(4, spring);

            //실행
            pstmt.execute();

            System.out.println(name + "님의 성적을 등록하였습니다");

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException | NullPointerException e) {
                e.printStackTrace();
            }

        }
    }
    public void deleteStudent(String name)
    {

        //삭제하는 db코드 추가
        Ex12Student st=new Ex12Student();
        st.wirteStudent();

        Scanner sc = new Scanner(System.in);
        String delName="";
        System.out.println("삭제할 이름을 입력하세요");
        delName=sc.nextLine();

        String sql="delete from student where name=?";
        System.out.println(sql);

        Connection conn=null;
        PreparedStatement pstmt=null;

        try {
            conn= DriverManager.getConnection(MYSQL_URL,USERNAME,PASSWORD);
            pstmt=conn.prepareStatement(sql);
            //바인딩
            pstmt.setString(1, delName);



            //executeUpdate : sql문을 실행 후 실행한 레코드의 갯수를 반환
            int n=pstmt.executeUpdate();
            if(n==0)
                System.out.println(delName+"님은 명단에 없습니다");
            else
                System.out.println(delName+"님의 성적 정보를 삭제했습니다");

            //매번 워크벤치가서 확인하기 싫으면

            st.wirteStudent();

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            try {
                pstmt.close();
                conn.close();
            } catch (SQLException |NullPointerException e) {
                e.printStackTrace();
            }
        }
        //해당 학생이 없을 경우 "xxx 님은 명단에 없어요!"
        //있을경우 "xxx님의 성적 정보를 삭제하였습니다"
    }
    public void wirteStudent()
    {

        String sql = """
                select num,name,java,html,spring,
                       java+html+spring tot, round((java+html+spring)/3,1) avg ,
                       date_format(testday ,'%Y-%m-%d %H:%i') testday
                from student
                """;

        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;

        try {
            conn= DriverManager.getConnection(MYSQL_URL,USERNAME,PASSWORD);
            pstmt=conn.prepareStatement(sql);
            rs=pstmt.executeQuery();

            System.out.println("\t**Student Table**\n");
            System.out.println("시퀀스\t이름\t자바\thtml\tspring\t시험날짜");
            System.out.println("=".repeat(40));

            while (rs.next())
            {
                int num=rs.getInt("num");
                String name = rs.getString("name");
                int java = rs.getInt("java");
                int html = rs.getInt("html");
                int spring = rs.getInt("spring");
                int tot = rs.getInt("tot");
                int avg = rs.getInt("avg");
                String testday = rs.getString("testday");

                System.out.println(num+"\t"+name+"\t"+java+"\t"+html+"\t"+spring+"\t"+tot+"\t"+avg+"\t"+testday);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

            try {
                rs.close();
                pstmt.close();
                conn.close();
            } catch (SQLException |NullPointerException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        Ex12Student ex12= new Ex12Student();
        Scanner sc = new Scanner(System.in);
        int menu=0;
        String name;
        int java,html,spring;

        while (true)
        {
            System.out.println("1.학생정보추가 2.이름으로 삭제 3.전체출력 4.종료");
            menu=Integer.parseInt(sc.nextLine());
            if(menu==1)
            {
                System.out.println("추가할 이름은?");
                name=sc.nextLine();
                System.out.println("자바 점수는?");
                java=Integer.parseInt(sc.nextLine());
                System.out.println("html 점수는?");
                html=Integer.parseInt(sc.nextLine());
                System.out.println("spring 점수는?");
                spring=Integer.parseInt(sc.nextLine());

                ex12.insertStudent(name,java,html,spring);
            } else if(menu==2)
            {
                System.out.println("삭제할학생의 이름은?");
                name = sc.nextLine();

                ex12.deleteStudent(name);
            } else if(menu==3)
            {

                ex12.wirteStudent();
            } else
            {
                System.out.println("프로그램을 종료합니다");
                break;
            }
            System.out.println("-".repeat(30));
        }
    }
    }

