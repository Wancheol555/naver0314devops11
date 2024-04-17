package day0408;

import db.common.DbConnect;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.Vector;

public class Ex2_DBSawon extends JFrame{

    DbConnect db = new DbConnect();
    JTable table;
    DefaultTableModel tableModel;
    JTextField tfName, tfscore;
    JButton btnAdd, btnDel;
    JComboBox<String> cbResult,tfgender, tfbuseo;

    JRadioButton total,male,female;
    int order = 1;
    public Ex2_DBSawon(String title) {
        // TODO Auto-generated constructor stub
        super(title);
        this.setLocation(100, 100);//시작위치
        this.setSize(500, 400);//창크기
        //  this.getContentPane().setBackground(new Color(93, 199, 187));//배경색 변경
        //this.getContentPane().setBackground(Color.yellow);//배경색 변경
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 종료
        this.initDesign();//각종 컴포넌트 생성
        this.setVisible(true);
    }

    public void initDesign() {
        JPanel p1 = new JPanel();
        p1.add(new JLabel("이름"));
        tfName = new JTextField(5);
        p1.add(tfName);

        p1.add(new JLabel("점수"));
        tfscore = new JTextField(5);
        p1.add(tfscore);

        p1.add(new JLabel("성별"));
        String[] ge = {"남자","여자"};
        tfgender = new JComboBox<String>(ge);
        // p2.add(new JLabel("출력순서"));
        p1.add(tfgender);



        p1.add(new JLabel("부서"));
        String[] bu = {"인사부","홍보부","교육부"};
        tfbuseo = new JComboBox<String>(bu);
        // p2.add(new JLabel("출력순서"));
        p1.add(tfbuseo);

        this.add("North", p1);
        //////////////////////////////
        String[] title = {"시퀀스", "이름", "점수", "성별", "부서"};
        tableModel = new DefaultTableModel(title, 0);
        table = new JTable(tableModel);
        this.add("Center", new JScrollPane(table));

        /////////////////////////////
        JPanel p2 = new JPanel();
        btnAdd = new JButton("추가");
        btnDel = new JButton("삭제");
        p2.add(btnAdd);
        p2.add(btnDel);

        String[] de = {"인사부", "홍보부", "교육부"};
        cbResult = new JComboBox<String>(de);
       // p2.add(new JLabel("출력순서"));
        p2.add(cbResult);
        this.add("South", p2);

        // JRadioButton 인스턴스 생성
        JRadioButton total = new JRadioButton();
        JRadioButton male = new JRadioButton();
        JRadioButton female = new JRadioButton();

// ButtonGroup 생성
        ButtonGroup genderGroup = new ButtonGroup();


// ButtonGroup에 라디오 버튼 추가
        genderGroup.add(total);
        genderGroup.add(male);
        genderGroup.add(female);

// JPanel p2에 라디오 버튼과 라벨 추가
        p2.add(new JLabel("전체"));
        p2.add(total);

        p2.add(new JLabel("남자"));
        p2.add(male);
        p2.add(new JLabel("여자"));
        p2.add(female);

        total.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order = 1; // 전체 선택
                writeStudent(); // DB에서 전체 데이터 출력
            }
        });

        male.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order = 2; // 남자 선택
                writeStudent(); // DB에서 남자 데이터 출력
            }
        });

        female.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                order = 3; // 여자 선택
                writeStudent(); // DB에서 여자 데이터 출력
            }
        });

        //콤보박스 이벤트
        cbResult.addItemListener(new ItemListener() {

            @Override
            public void itemStateChanged(ItemEvent e) {
                // TODO Auto-generated method stub
                order = cbResult.getSelectedIndex() + 1;
                //다시 출력
                writeStudent();
            }
        });

        //추가버튼 이벤트
        btnAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                //입력안했을경우 이벤트 종료
                if (tfName.getText().length() == 0)
                    return;
                if (tfscore.getText().length() == 0)
                    return;
              //  if (tfgender.getSelectedIndex() == 0)
                  //  return;
                //if (tfbuseo.getText().length() == 0)
                    //return;

                //입력값을 db 에 insert
                Connection conn = db.getConnection();
                PreparedStatement pstmt = null;
                String sql = "insert into student values (null,?,?)";

                try {
                    pstmt = conn.prepareStatement(sql);
                    //? 갯수만큼 바인딩
                    pstmt.setString(1, tfName.getText());
                    pstmt.setInt(2, Integer.parseInt(tfscore.getText()));
                    //pstmt.setInt(3, Integer.parseInt(tfgender.get()));
                    //pstmt.setInt(4, Integer.parseInt(tfbuseo.getText()));

                    //실행
                    pstmt.execute();
                    //입력값 초기화
                    tfName.setText("");
                    tfscore.setText("");
                   // tfgender.setText("");
                    //tfbuseo.setText("");

                    //다시 출력
                    writeStudent();

                } catch (SQLException e1) {
                    // TODO Auto-generated catch block
                    e1.printStackTrace();
                } finally {
                    db.dbClose(pstmt, conn);
                }




            }
        });

        //삭제 이벤트
        btnDel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //테이블의 선택한 행번호 row를 얻는다
                int row = table.getSelectedRow();
                //row가 -1이면 경고메세지후 이벤트 종료
                if (row == -1) {
                    JOptionPane.showMessageDialog(Ex2_DBSawon.this, "삭제할 행을 선택해주세요");
                    return;
                }

                String num = table.getValueAt(row, 0).toString();

                String sql = "delete from student where num=?";

                Connection conn = db.getConnection();
                PreparedStatement pstmt = null;

                try {
                    pstmt = conn.prepareStatement(sql);
                    pstmt.setString(1, num);
                    pstmt.execute(); //db에서 삭제

                    //db 다시 불러오기
                    writeStudent();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                } finally {
                    db.dbClose(pstmt, conn);
                }
            }
        });

        //출력 메서드 호출
        writeStudent();
    }

    //출력 메서드
    public void writeStudent() {
        Connection conn = db.getConnection();
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        String sql = "";
        if (order == 1)
            sql = "select * FROM sawon where buseo='인사부'";
        else if (order == 2)
            sql = "select * FROM sawon where buseo='홍보부'";
        else if (order == 3)
            sql = "select * FROM sawon where buseo='교육부'";
        else if (order == 4)
            sql = "select * FROM sawon where buseo='인사부' and gender ='남자'";
        else if (order == 5)
            sql = "select * FROM sawon where buseo='인사부' and gender ='여자'";
        else if (order == 6)
            sql = "select * FROM sawon where buseo='홍보부'and gender ='남자'";
        else if (order == 7)
            sql = "select * FROM sawon where buseo='홍보부'and gender ='여자'";
        else if (order == 8)
            sql = "select * FROM sawon where buseo='인사부' and gender ='남자'";
        else if (order == 9)
            sql = "select * FROM sawon where buseo='인사부' and gender =''";



        try {
            pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();

            //기존 테이블의 데이타 지운후 추가하기
            tableModel.setRowCount(0);

            while (rs.next()) {
                Vector<String> data = new Vector<String>();
                data.add(rs.getString("num"));
                data.add(rs.getString("name"));
                data.add(rs.getString("score"));
                data.add(rs.getString("gender"));
                data.add(rs.getString("buseo"));


                //table에 추가
                tableModel.addRow(data);
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } finally {
            db.dbClose(pstmt, conn, rs);
        }

    }


    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Ex2_DBSawon a = new Ex2_DBSawon("학생관리DB");
    }

}