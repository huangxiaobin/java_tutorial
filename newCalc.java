
//引入各种类文件
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
//定义JsqFrame继承Frame
class newCalc extends Frame {
 double d1, d2;  //定义两个double类型的变量
 int op = -1;  //定义两个int类型的变量
 static TextField tf;//定义静态对象TextField
 CalPanelL p1;  //定义CalPanelL对象
 // Constructor构造方法
 newCalc() {
  //以下设置属性
  super("计算器");
  setLayout(new FlowLayout());
  setResizable(false);
  setSize(250, 250);
  tf = new TextField(18);
  tf.setEditable(false);
  tf.setBackground(Color.lightGray);
  tf.setForeground(Color.red);
  tf.setFont(new Font("Arial", Font.BOLD, 16));
  add(tf);
  p1 = new CalPanelL();
  add(p1);
  setVisible(true);
  // addWindowListener(new Wclose());
 }
 //添加按钮继承Button类
 class CalButton extends Button {
  CalButton(String s) {
   //设置按钮属性
   super(s);
   setBackground(Color.WHITE); //设置颜色为白色
  }
 }
 //定义显示器继承Panel类
 class CalPanelL extends Panel {
  CalButton a, c, b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bPN, bPoint,
    bAdd, bSub, bMul, bDiv, bL, bR, bLn, bEqual, bCE, bQuit;
  CalPanelL() {
   //设置显示器的属性
   setLayout(new GridLayout(6, 4));
   setFont(new Font("TimesRoman", Font.BOLD, 16));
   a = new CalButton("");
   c = new CalButton("");
   b0 = new CalButton("0");
   b1 = new CalButton("1");
   b2 = new CalButton("2");
   b3 = new CalButton("3");
   b4 = new CalButton("4");
   b5 = new CalButton("5");
   b6 = new CalButton("6");
   b7 = new CalButton("7");
   b8 = new CalButton("8");
   b9 = new CalButton("9");
   bPN = new CalButton("+/-");
   bPoint = new CalButton(".");
   // 设置按钮
   bAdd = new CalButton("+");
   bSub = new CalButton("-");
   bMul = new CalButton("*");
   bDiv = new CalButton("/");
   bL = new CalButton("(");
   bR = new CalButton(")");
   bLn = new CalButton("ln");
   bEqual = new CalButton("=");
   bCE = new CalButton("CE");
   bQuit = new CalButton("退出");
   // 加入按钮
   add(a);
   add(c);
   add(bCE);
   bCE.addActionListener(new PressBCE());
   add(bQuit);
   bQuit.addActionListener(new PressBQuit());
   add(b7);
   b7.addActionListener(new PressB7());
   add(b8);
   b8.addActionListener(new PressB8());
   add(b9);
   b9.addActionListener(new PressB9());
   add(bDiv);
   bDiv.addActionListener(new PressBDiv());
   add(b4);
   b4.addActionListener(new PressB4());
   add(b5);
   b5.addActionListener(new PressB5());
   add(b6);
   b6.addActionListener(new PressB6());
   add(bMul);
   bMul.addActionListener(new PressBMul());
   add(b1);
   b1.addActionListener(new PressB1());
   add(b2);
   b2.addActionListener(new PressB2());
   add(b3);
   b3.addActionListener(new PressB3());
   add(bSub);
   bSub.addActionListener(new PressBSub());
   add(b0);
   b0.addActionListener(new PressB0());
   add(bPoint);
   bPoint.addActionListener(new PressBPoint());
   add(bPN);
   bPN.addActionListener(new PressBPN());
   ;
   add(bAdd);
   bAdd.addActionListener(new PressBAdd());
   add(bL);
   bL.addActionListener(new PressBL());
   add(bR);
   bR.addActionListener(new PressBR());
   add(bLn);
   bLn.addActionListener(new PressBLn());
   add(bEqual);
   bEqual.addActionListener(new PressBEqual());
  }
 }
 //定义PressBAdd实现ActionListener
 //大体的意思是按计算机按键的时出发的时间，设置按键的监听[加号的监听事件]
 class PressBAdd implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   try {
    String d1 = tf.getText();
    op = 0;
    tf.setText(d1 + "+");
   } catch (Exception ee) {
   }
  }
 }
 //定义PressBSub实现ActionListener
 //大体的意思是按计算机按键的时出发的时间，设置按键的监听[减号的监听事件]
 class PressBSub implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   try {
    String d1 = tf.getText();
    op = 1;
    tf.setText(d1 + "-");
   } catch (Exception ee) {
   }
  }
 }
  
 //定义PressBMul实现ActionListener
 //大体的意思是按计算机按键的时出发的时间，设置按键的监听[乘号的监听事件]
 class PressBMul implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   try {
    String d1 = tf.getText();
    op = 2;
    tf.setText(d1 + "*");
   } catch (Exception ee) {
   }
  }
 }
 //定义PressBDiv实现ActionListener
 //大体的意思是按计算机按键的时出发的时间，设置按键的监听[除号的监听事件]
 class PressBDiv implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   try {
    String d1 = tf.getText();
    op = 3;
    tf.setText(d1 + "/");
   } catch (Exception ee) {
   }
  }
 }
 //定义PressBL实现ActionListener
 //大体的意思是按计算机按键的时出发的时间，设置按键的监听[向左键的监听事件]
 class PressBL implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   try {
    String d1 = tf.getText();
    op = 3;
    tf.setText(d1 + "(");
   } catch (Exception ee) {
   }
  }
 }
 //定义PressBR实现ActionListener
 //大体的意思是按计算机按键的时出发的时间，设置按键的监听[向右键的监听事件]
 class PressBR implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   try {
    String d1 = tf.getText();
    op = 3;
    tf.setText(d1 + ")");
   } catch (Exception ee) {
   }
  }
 }
 //定义PressBEqual实现ActionListener
 //大体的意思是按计算机按键的时出发的时间，设置按键的监听[等号的监听事件]
 class PressBEqual implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   try {
    Jsq jsq = new Jsq();
    String s = tf.getText();
    System.out.println(s);
    while (s.indexOf("(") + 1 > 0 && s.indexOf(")") > 0) {
     String s1 = jsq.caculateHigh(s);
     System.out.println(s1);
     s = s1;
    }
    String str = jsq.cacluteMain(s);
    System.out.println(str);
    tf.setText(String.valueOf(str));
   } catch (Exception ee) {
   }
  }
 }
  
 /*
  * 批量写吧
  * 以下是按1、2、3等等的监听事件
  * 还有清零的等等监听事件
  */
 class PressBLn implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   try {
    double x = Double.parseDouble(tf.getText());
    double y;
    y = Math.log10(x);
    tf.setText(y + "");
   } catch (Exception ee) {
   }
  }
 }
 class PressBCE implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   tf.setText("");
  }
 }
 class PressBPN implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   try {
    String text = tf.getText();
    if (text != "") {
     if (text.charAt(0) == '-')
      tf.setText(text.substring(1));
     else if (text.charAt(0) >= '0' && text.charAt(0) <= '9')
      tf.setText("-" + text.substring(0));
     else if (text.charAt(0) == '.')
      tf.setText("-0" + text.substring(0));
    }
   } catch (Exception ee) {
   }
  }
 }
 class PressBPoint implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   String text = tf.getText();
   if (text.lastIndexOf(".") == -1)
    tf.setText(text + ".");
  }
 }
 class PressB0 implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   String text = tf.getText();
   tf.setText(text + "0");
  }
 }
 class PressB1 implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   String text = tf.getText();
   tf.setText(text + "1");
  }
 }
 class PressB2 implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   String text = tf.getText();
   tf.setText(text + "2");
  }
 }
 class PressB3 implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   String text = tf.getText();
   tf.setText(text + "3");
  }
 }
 class PressB4 implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   String text = tf.getText();
   tf.setText(text + "4");
  }
 }
 class PressB5 implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   String text = tf.getText();
   tf.setText(text + "5");
  }
 }
 class PressB6 implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   String text = tf.getText();
   tf.setText(text + "6");
  }
 }
 class PressB7 implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   String text = tf.getText();
   tf.setText(text + "7");
  }
 }
 class PressB8 implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   String text = tf.getText();
   tf.setText(text + "8");
  }
 }
 class PressB9 implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   String text = tf.getText();
   tf.setText(text + "9");
  }
 }
 class PressBQuit implements ActionListener {
  public void actionPerformed(ActionEvent e) {
   System.exit(0);
  }
 }
 public void Js() {
  String text = tf.getText();
  tf.setText(text);
 }
}