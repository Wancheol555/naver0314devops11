package day0328;

import javax.swing.*;
import java.awt.*;

public class Ex5_SwingCanvas extends JFrame{
    MyDraw draw=new MyDraw();
    //음식사진 경로
    String foodImage="/Users/wancheol/Desktop/naver0314devops11/image/음식사진/1.jpg";
    String foodImage2="/Users/wancheol/Desktop/naver0314devops11/image/음식사진/11.jpg";

    public Ex5_SwingCanvas(String title) {
        // TODO Auto-generated constructor stub
        super(title);
        this.setLocation(100, 100);//시작위치
        this.setSize(500, 500);//창크기
        this.getContentPane();
        //this.getContentPane().setBackground(Color.yellow);//배경색 변경
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 종료
        this.initDesign();//각종 컴포넌트 생성
        this.setVisible(true);
    }
    //캔바스를 상속받는 내부클래스
    class MyDraw extends Canvas
    {
        //처음 시작시,그리고 프레임 크기 변경시에는 자동 호
        //그 이외에는 강제호출(repaint)
        @Override
        public void paint(Graphics g) {
            super.paint(g);
            //색상변경
            g.setColor(Color.magenta);
            //타원그리기
            g.drawOval(30,30,100,100);
            //채워진 타원
            g.setColor(Color.yellow);
            g.fillOval(150,30,100,100);

            //테두리만 있는 사각형
            g.setColor(new Color(8,20,77));
            g.drawRect(30,150,100,100);

            //채워진 사각형
            g.setColor(new Color(239,136,190));
            g.fillRect(150,150,100,100);

            //글꼴 출력
            g.setFont(new Font("Comic sans MS",Font.BOLD,30));
            g.drawString("Good Day!",50,400);

            g.setFont(new Font("궁서체",Font.BOLD,30));
            g.drawString("안녕하세요!",250,400);

            //음식이미지 그리기1
            Image image1=new ImageIcon(foodImage).getImage();
            g.drawImage(image1,300,50,130,130,this);

            //음식이미지 방법2
            Image Image2=Toolkit.getDefaultToolkit().getImage(foodImage2);
            g.drawImage(Image2,300,200,130,130,this);
        }
    }
    public void initDesign()
    {
        //기본 레이아웃의 Center 에 캔바스 추가
        this.add("Center",draw);
    }

    public static void main(String[] args) {
        Ex5_SwingCanvas a=new Ex5_SwingCanvas("캔바스");

    }
}
