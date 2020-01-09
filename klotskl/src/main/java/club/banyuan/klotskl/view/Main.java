package club.banyuan.klotskl.view;


import sun.applet.AppletAudioClip;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.print.DocFlavor;
import javax.swing.*;
import javax.swing.border.Border;
import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    private static BorderLayout borderLayout;
    private static JFrame jf;
    private static JPanel jp;
    private static JButton general1;
    private static JButton general2;
    private static JButton general3;
    private static JButton general4;
    private static JButton general5;
    private static JButton bigMan;
    private static JButton pawn1;
    private static JButton pawn2;
    private static JButton pawn3;
    private static JButton pawn4;
    private static JButton left;
    private static JButton right;
    private static JButton top;
    private static JButton bottom;
    private static JButton button;
    private static JButton restart;
    private static DocFlavor.URL m = null;
    private Point point = new Point(100, 300);




    public static void show() {
        jf = new JFrame("华容道");
        borderLayout = new BorderLayout();
        jp = new JPanel();
        button = new JButton();
        left = new JButton();
        right = new JButton();
        top = new JButton();
        bottom = new JButton();
        restart = new JButton("重新开始");
        general1 = new JButton("张飞");
        general2 = new JButton("马超");
        general3 = new JButton("黄忠");
        general4 = new JButton("赵云");
        general5 = new JButton("关羽");
        bigMan = new JButton("曹操");
        pawn1 = new JButton("兵");
        pawn2 = new JButton("兵");
        pawn3 = new JButton("兵");
        pawn4 = new JButton("兵");

        Border border = BorderFactory.createLineBorder(Color.black);
        button.setBounds(0, 0, 0, 0);

        restart.setBounds(250, 600, 100, 50);
        left.setBounds(1, 0, 1, 500);
        left.setBorder(border);
        right.setBounds(400, 0, 1, 500);
        right.setBorder(border);
        top.setBounds(0, 1, 400, 1);
        top.setBorder(border);
        bottom.setBounds(0, 500, 400, 1);
        bottom.setBorder(border);

        general1.setBounds(1, 1, 100, 200);

        general2.setBounds(301, 1, 100, 200);

        general3.setBounds(1, 201, 100, 200);

        general4.setBounds(301, 201, 100, 200);

        general5.setBounds(101, 301, 200, 100);

        bigMan.setBounds(101, 1, 200, 200);
        bigMan.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });


        pawn1.setBounds(1, 401, 100, 100);


        pawn2.setBounds(101, 401, 100, 100);


        pawn3.setBounds(201, 401, 100, 100);


        pawn4.setBounds(301, 401, 100, 100);

        jp.add(left);
        jp.add(right);
        jp.add(top);
        jp.add(bottom);
        jp.add(general1);
        jp.add(general2);
        jp.add(general3);
        jp.add(general4);
        jp.add(general5);
        jp.add(bigMan);
        jp.add(pawn1);
        jp.add(pawn2);
        jp.add(pawn3);
        jp.add(pawn4);
        jp.setLayout(borderLayout);
        jp.setBounds(99, 49, 402, 502);
        jf.dispatchEvent(new FocusEvent(jf, FocusEvent.FOCUS_GAINED, true));
        jf.requestFocusInWindow();
        jf.add(button);
        jf.add(restart);
        jf.add(jp);
        jf.setLayout(borderLayout);
        jf.setSize(600, 800);
        jf.setLocationRelativeTo(null);
        jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jf.setVisible(true);
    }


    public static MouseListener mouseListener(final int width, final int height) {
        MouseListener mouse = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                if (x < width / 2) {
                    //left
                } else if (x > width / 2) {
                    //right
                } else if (y < height / 2) {
                    //top
                } else if (y > height / 2) {
                    //bottom
                }

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        };
        return mouse;
    }

    public static void main(String[] args) {
        show();
    }
}
