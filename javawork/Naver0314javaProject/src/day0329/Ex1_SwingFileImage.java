//package day0329;
//import java.awt.*;
//import java.awt.event.ActionListener;
//
//import javax.swing.*;
//
//public class Ex1_SwingFileImage  extends JFrame {
//        public SwingGibon(String title) {
//            // TODO Auto-generated constructor stub
//            super(title);
//            this.setLocation(100, 100);//시작위치
//            this.setSize(300, 300);//창크기
//            this.getContentPane().setBackground(new Color(93, 199, 187));//배경색 변경
//            //this.getContentPane().setBackground(Color.yellow);//배경색 변경
//            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 종료
//            this.initDesign();//각종 컴포넌트 생성
//            this.setVisible(true);
//        }
//
//        class MyPhoto extends Canvas
//        {
//            @Override
//            public void paint(Graphics g) {
//
//                super.paint(g);
//                Image image=new ImageIcon(photo).getImage();
//                g.drawImage(image,0,0,this.getWidth()),this.getHeight(),this);
//                }
//
//            public void initDesign()
//        {
//
//        }
//        btnImageOpen.addActionListener new ActionListener()
//        {
//            public void
//        }
//
//        public static void main(String[] args) {
//            // TODO Auto-generated method stub
//            Ex1_SwingFileImage a=new Ex1_SwingFileImage("기본창");
//        }
//
//    }
//
//}
