//package day0328;
//import java.awt.Canvas;
//import java.awt.Color;
//import java.awt.Graphics;
//import java.awt.Image;
//
//import javax.swing.*;
//
//public class Ex6_SwingCanvasRadio extends JFrame{
//
//
//final static String PHOTO1 ="/Users/wancheol/Desktop/naver0314devops11/image/연예인사진/soojee.jpg";//수지
//final static String PHOTO2 ="/Users/wancheol/Desktop/naver0314devops11/image/연예인사진/shinminah.jpg";//신민아
//final static String PHOTO3 ="/Users/wancheol/Desktop/naver0314devops11/image/연예인사진/shinsekyeong.jpg";
//
//
//final static String PHOTO4 ="/Users/wancheol/Desktop/naver0314devops11/image/연예인사진/parkshinhye.jpg";
//
//Color boxColor=new Color(67,196,207);//초기 박스 색상
//        JRadioButton rbBox1,rbBox2,rbBox3,rbBox4;
//        JRadioButton rbPhoto1,rbPhoto2,rbPhoto3,rbPhoto4;
//int photoIndex=2;//처음에 수지사진
//
//MyDraw draw=new MyDraw();
//
//public Ex6_SwingCanvasRadio(String title) {
//    // TODO Auto-generated constructor stub
//    super(title);
//    this.setLocation(100, 100);//시작위치
//    this.setSize(400, 500);//창크기
//    //this.getContentPane().setBackground(new Color(93, 199, 187));//배경색 변경
//    //this.getContentPane().setBackground(Color.yellow);//배경색 변경
//    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프레임 종료
//    this.initDesign();//각종 컴포넌트 생성
//    this.setVisible(true);
//}
//
////캔바스 내부 클래스
//class MyDraw extends Canvas
//{
//    @Override
//    public void paint(Graphics g) {
//        // TODO Auto-generated method stub
//        super.paint(g);
//
//        //채워진 박스 그리기
//        g.setColor(boxColor);
//        g.fillRect(30, 70, 320, 320);
//
//        Image image=null;
//        switch(photoIndex)
//        {
//            case 1:
//                image=new ImageIcon(PHOTO1).getImage();
//                break;
//            case 2:
//                image=new ImageIcon(PHOTO2).getImage();
//                break;
//            case 3:
//                image=new ImageIcon(PHOTO3).getImage();
//                break;
//            case 4:
//                image=new ImageIcon(PHOTO4).getImage();
//                break;
//        }
//        g.drawImage(image, 80, 100, 220, 260, this);
//
//    }
//}
//
//public void initDesign()
//{
//    this.add("Center",draw);
//    JPanel pTop=new JPanel();
//    ButtonGroup bg1=new ButtonGroup();
//    rbBox1=new JRadioButton("초록색");
//    bg1.add(rbBox1);
//    pTop.add(rbBox1);
//
//    //프레임 상단에 Panel 추가
//    this.add("North",pTop);
//
//    JPanel pBottom=new JPanel();
//    ButtonGroup bg2=new ButtonGroup();
//
//    String []s= {"수지","신세경","설현","김우빈"};
//    for(int i=0;i<rbPhoto.length;i++)
//    {
//      //  rbPhoto[i]
//
//    }
//}
//
//public static void main(String[] args) {
//    // TODO Auto-generated method stub
//    Ex6_SwingCanvasRadio a=new Ex6_SwingCanvasRadio("캔바스2");
//}
//
//}