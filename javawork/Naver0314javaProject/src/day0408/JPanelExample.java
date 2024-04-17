import javax.swing.*;

public class JPanelExample {
    public static void main(String[] args) {
        // 프레임 생성
        JFrame frame = new JFrame("JPanel Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // JPanel 생성
        JPanel panel = new JPanel();

        // JButton 생성 및 JPanel에 추가
        JButton button = new JButton("Click me!");
        panel.add(button);

        // JPanel을 프레임에 추가하고 화면에 표시
        frame.add(panel);
        frame.setVisible(true);
    }
}
