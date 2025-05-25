package gamepuzzle.Main;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class MainJF extends JFrame {

    int[][] rs = new int[4][4];

    //创建菜单对象
    JMenuBar jMenuBar = new JMenuBar();

    //创建菜单选项数组
    final String[] arr = {"功能","关于我们"};



    final String[] item1 = {"重新游戏","重新登陆","关闭游戏"};
    final String[] item2 = {"公众号"};

    final String[][] item = {item1,item2};

    JMenuItem[][] jMenuItems = new JMenuItem[2][3];






    //初始化数据(打乱图片)
    public void initDate(){
        int[] arr = new int[16];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        Random random = new Random();
        for (int i = 0; i < arr.length; i++) {
            int ran1 = random.nextInt(arr.length);
            int ran2 = random.nextInt(arr.length);
            int temp  = arr[ran1];
            arr[ran1] = arr[ran2];
            arr[ran2] = temp;
        }
        for (int i = 0; i < rs.length; i++) {
            for (int j = 0; j < rs[i].length; j++) {
                rs[i][j] = arr[4*i+j];
            }
        }
    }
    public MainJF(){
        init();
    }
    private void initImage() {
        for (int i = 0; i < 4 ; i++) {
            for (int j = 0; j < 4 ; j++) {
                //创建一个ImageIcon对象
                //创建一个JLabel对象(管理容器)
                int num = rs[i][j];
                if (num < 10){
                    ImageIcon icon = new ImageIcon("image\\girl\\张子璇\\5E84EDEE8816BBB591ADB5AABB9F3F1E_0"+num+".png");
                    JLabel jLabel = new JLabel(icon);
                    //0:让图片凸起来
                    //1:让图片凹下去
                    jLabel.setBorder(new BevelBorder(BevelBorder.RAISED));
                    jLabel.setBounds((j)*icon.getIconWidth()+84,(i)*icon.getIconWidth()+134,105,105);
                    this.add(jLabel);
                }else {
                    ImageIcon icon = new ImageIcon("image\\girl\\张子璇\\5E84EDEE8816BBB591ADB5AABB9F3F1E_"+num+".png");
                    JLabel jLabel = new JLabel(icon);
                    //0:让图片凸起来
                    //1:让图片凹下去
                    jLabel.setBorder(new BevelBorder(0));
                    jLabel.setBounds((j)*icon.getIconWidth()+84,(i)*icon.getIconWidth()+134,105,105);
                    this.add(jLabel);
                }
            }
        }
        JLabel bcground = new JLabel(new ImageIcon("..\\Learning\\image\\background.png"));
        bcground.setBounds(39,40,508,560);
        this.getContentPane().add(bcground);
    }

    //ctrl + alt + m ----> 代码块抽取成一个方法
    public void setMenuBar(){
        //初始化菜单
        Font font = new Font("微软雅黑",Font.BOLD,15);
        Font font1 = new Font("微软雅黑", Font.BOLD,12);

        for (int i = 0;i < arr.length;i++) {
            //添加条目对象
            JMenu Jmenu = new JMenu(arr[i]);
            Jmenu.setFont(font);
            for (int j = 0; j < item[i].length; j++) {
//                jMenuItems[i][j] = new JMenuItem();
                //创建条目对象下面的选项
                JMenuItem Item = new JMenuItem(item[i][j]);
                Item.setFont(font1);
                Jmenu.add(Item);
                jMenuItems[i][j] = Item;
            }
            //添加菜单选项
            jMenuBar.add(Jmenu);
        }
        //添加菜单对象至窗体当中
        this.setJMenuBar(jMenuBar);
    }
    public void events(){
        jMenuItems[0][2].addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(null, "确定退出吗?",
                        "退出",JOptionPane.YES_NO_OPTION);

                System.exit(0);
            }
        });

    }
    public void init(){
        this.setTitle("游戏主界面");
        this.setBounds(300,300,603,680);
        //设置居中
        this.setLocationRelativeTo(null);
        //设置置顶
//        this.setAlwaysOnTop(true);
        //设置布局
        this.setLayout(null);
        //设置不让调整大小
        this.setResizable(false);
        //默认关闭
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        setMenuBar();
        initDate();
        initImage();

        //展示放最后
        this.setVisible(true);

        events();
    }

}


