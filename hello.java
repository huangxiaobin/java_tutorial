//import object
import java.util.Scanner;
import java.util.Random;
import java.util.EnumSet;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.*;
import java.io.File;
import java.util.*;
//import tuna;


public class hello {
	public static void tc4() {
		System.out.println("Hello Youtube");	
	}
	
	public static void tc5() {
		int tuna = 5;
		System.out.print("I want ");
		System.out.print(tuna);
		System.out.print(" movies\n");		
	}
	
	public static void tc6() {
		Scanner my_input = new Scanner(System.in);
		System.out.println(my_input.nextLine());		
	}
	
	public static void tc7() {
		Scanner my_input = new Scanner(System.in);
		int fnum;
		int snum;
		int result;
		
		System.out.println("input first num");
		fnum = my_input.nextInt();
		System.out.println("input second num");
		snum = my_input.nextInt();
		
		result = fnum + snum;
		System.out.print("the result is " + result + "\n");
	}
	
	public static void tc8() {
		int fnum = 9;
		int snum = 3;
		int result;
		
		result = fnum / snum;
		System.out.print("the result is " + result + "\n");
	}
	
	public static void tc9() {
		int num = 0;
		num++;
		System.out.println(num);	
		num = num + 9;
		System.out.println(num);
		num *= 2;
		System.out.println(num);
	}
	
	public static void tc10() {
		int num = 5;
		
		if (num == 10) {
			System.out.println("yes");
		} else {
			System.out.println("no");
		}
	}
	
	public static void tc11() {
		int boy = 19;
		int girl = 25;
		
		if (boy > 18 && girl > 18) {
			System.out.println("you can enter");
		} else {
			System.out.println("you can't enter");
		}
	}
	
	public static void tc12() {
		int age = 3;
		
		switch(age) {
		case 1:
			System.out.println("you can crawl");
			break;
		case 2:
			System.out.println("you can walk");
			break;
		case 3:
			System.out.println("you can make trouble");
			break;
		default:
			System.out.println("I don't konw how old you are");
			break;	
		}
	}
	
	public static void tc13() {
		int count = 0;
		
		while (count < 10) {
			System.out.println(count);
			count++;
		}
	}

	public static void tc14() {
		chris chrisObj = new chris();
		chrisObj.simpleMessage();
	}
	
	public static void tc15() {
		Scanner input =  new Scanner(System.in);
		chris chrisObj = new chris();
		System.out.println("enter your name:");
		String name = input.nextLine();
		chrisObj.simpleMessage(name);		
	}
	
	public static void tc16() {
		Scanner input =  new Scanner(System.in);
		System.out.println("enter gf name:");
		String name = input.nextLine();
		chris chrisObj = new chris();
		chrisObj.setName(name);
		chrisObj.saying();
	}
	
	public static void tc17() {
		chris chrisObj = new chris("xiaoyu");
		chrisObj.saying();
	}
	
	public static void tc18() {
		int age = 70;
		
		if (age < 60) {
			System.out.println("you are young");
		} else {
			System.out.println("you are old");
			if (age > 75) {
				System.out.println("you are really old");
			} else {
				System.out.println("don't worry you are not too old");
			}
		}
	}
	
	public static void tc19() {
		int age = 55;
		if (age > 60) {
			System.out.println("you are a senior citizen");
		} else if (age > 50) {
			System.out.println("you are in your 50s");
		} else if (age > 40) {
			System.out.println("you are in your 40s");
		} else {
			System.out.println("you are young");
		}
	}
	
	public static void tc20() {
		int age = 55;
		System.out.println(age > 50 ? "you are old": "you are young");
	}
	
	public static void tc21() {
		int total = 0;
		int grade = 0;
		int count = 0;
		Scanner input = new Scanner(System.in);
		
		while (count < 10) {
			grade = input.nextInt();
			total = total + grade;
			count++;
		}
		System.out.println("average is " + total/count);
	}
	
	public static void tc22() {
		
		for (int i  = 0; i < 10; i++) {
			System.out.println(i);
		}
	}
	
	public static void tc23() {
		double amount;
		double principle = 1000;
		double grade = 0.02;
		int year = 0;
		
		for (;year < 10; year++) {
			amount = principle* Math.pow(1+grade, year);
			System.out.println(year + "    " + amount);
		}
	}
	
	public static void tc24() {
		int count = 0;
		
		do {
			System.out.println(count);
			count++;
		} while(count < 10);
	}
	
	public static void tc25() {
		System.out.println(Math.abs(-1));
		System.out.println(Math.ceil(1.3));
		System.out.println(Math.floor(1.3));
		System.out.println(Math.max(2,3));
		System.out.println(Math.min(2,3));
		System.out.println(Math.pow(3,3));
		System.out.println(Math.sqrt(9));
	}
	
	public static void tc26() {
		int num = 0;
		
		Random r_num = new Random();
		
		for (int i = 0; i < 6; i++) {
			num = r_num.nextInt(6);
			System.out.println(num);
		}
	}
	
	public static void tc27() {
//		int arr[] = {0,1,2,3,4,5,6,7,8,9};
		int arr[] = new int[10];
		arr[0] = 0;
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 3;
		arr[4] = 4;
		System.out.println(arr[0]);
	}
	
	public static void tc28() {
		int arr[] = {0,1,2,3,4,5,6,7,8,9};
		System.out.println("Index\tValue");
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i+"\t"+arr[i]);
		}
	}
	
	public static void tc29() {
		int arr[] = {0,1,2,3,4,5,6,7,8,9};
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}	
		System.out.println(sum);
	}

	public static void tc31() {
		int arr[] = {0,1,2,3,4,5};
		int sum = 0;
		for (int x:arr) {
			sum += x;
		}
		System.out.println(sum);
	}
	
	public static void change(int array[]) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void tc32() {
		int arr[] = {0,1,2,3,4,5};
		
		for (int x:arr){
			System.out.println(x);
		}
		
		change(arr);
		
		for (int x:arr){
			System.out.println(x);
		}		
	}
	
	public static void tc33() {
		int arr[][] = {{1,2,3},{4,5,6}};
		
		System.out.println(arr[1][2]);
	}
	
	public static void tc34() {
		int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		for (int i = 0; i < arr.length; i++){
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static void average(int...num) {
		int total = 0;
		for (int x:num) {
			total += x;
		}
		System.out.println(total/num.length);
	}
	
	public static void tc35() {
		average(1,2,3,4,5,6,7,8,9);
	}
	
	public static void tc36() {
		tuna tobj = new tuna();
		tobj.displayTime();
		tobj.setTime(23, 20, 0);
		tobj.displayTime();
	}
	
	public static void tc37() {
		tuna tobj = new tuna();
		tobj.displayTime();
		tobj.setTime(23, 20, 0);
		tobj.displayTime();
		tobj.displayNormalTime();	
	}
	
	public static void tc41() {
		tuna obj1 = new tuna();
		tuna obj2 = new tuna(3,4,5);
		obj1.displayTime();
		obj1.displayNormalTime();	
		obj2.displayTime();
		obj2.displayNormalTime();
	}
	
	public static void tc42() {
		potpie obj = new potpie(12,2,2014);
		System.out.println(obj);
	}
	
	public static void tc43() {
		potpie po = new potpie(12,2,2014);
		people obj = new people("peter", po);
		System.out.println(obj);
	}
	
	public static void tc44() {
		for (friend fo:friend.values()) {
			System.out.println(fo);
		}
	}
	
	public static void tc45() {
		for (friend fo:EnumSet.range(friend.mary, friend.candy)) {
			System.out.println(fo);
		}
	}
	
	public static void tc46() {
		moviestar mo1 = new moviestar("Megan", "Fox");
		mo1.display();
		moviestar mo2 = new moviestar("Tom", "Cruise");
		mo2.display();
		moviestar mo3 = new moviestar("Tom", "Hanks");
		mo3.display();
		moviestar mo4 = new moviestar("Brad", "Pitt");
		mo4.display();
	}
	
	public static void tc47() {
		moviestar mo1 = new moviestar("Megan", "Fox");
		System.out.println(mo1.getMember());
		System.out.println(moviestar.getMember());		
	}
	
	public static void tc48() {
	}
	
	public static void tc49() {
		tuna tobj = new tuna();
		potpie pobj = new potpie();
		
		tobj.eat();
		pobj.eat();
	}
	
	public static void tc50() {
		String fn = JOptionPane.showInputDialog("Endter first number");
		String sn = JOptionPane.showInputDialog("Endter second number");
		int sum = Integer.parseInt(fn) + Integer.parseInt(sn);
		
		JOptionPane.showMessageDialog(null, "sum is " + sum);	
	}
	
	public static void tc51() {
		JFrame frm = new JFrame("my title");
		JLabel item1 = new JLabel("my label");
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(new FlowLayout());
		frm.setSize(270, 200);
		frm.add(item1);
		frm.setVisible(true);
	}
	
	public static void tc52() {
		JFrame frm = new JFrame("my application");
		JTextField item1 = new JTextField("text1");
		JTextField item2 = new JTextField("text2");
		//JTextField item3 = new JTextField("text3");
		JPasswordField item4 = new JPasswordField();
		
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.setLayout(new FlowLayout());
		frm.setSize(500, 200);
		frm.add(item1);
		frm.add(item2);
		//frm.add(item3);
		frm.add(item4);
		frm.setVisible(true);
		
		listener handler = new listener();
		
		item1.addActionListener(handler);
		item2.addActionListener(handler);
		//item3.addActionListener(handler);
		item4.addActionListener(handler);
	}
	
	public static void tc55() {
		food fo[] = new food[3];

		fo[0] = new food();
		fo[1] = new tuna();
		fo[2] = new potpie();
		
		fo[0].eat();
		fo[1].eat();
		fo[2].eat();
	}
	
	public static void digest(food x) {
		x.eat();
	}
	
	public static void tc56() {
		food fo = new food();
		tuna to = new tuna();
		potpie po = new potpie();
		
		digest(fo);
		digest(to);
		digest(po);
	}
	
	public static void tc57() {
		dogList dlo = new dogList();
		dog do1 = new dog();
		dog do2 = new dog();
		dlo.add(do1);
		dlo.add(do2);
	}
	
	public static void tc62() {
		GuiButton gbo = new GuiButton();
		gbo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gbo.setSize(300, 300);
		gbo.setVisible(true);
	}
	
	public static void tc64(){
		GuiCheckbox gco = new GuiCheckbox();
		gco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gco.setSize(300, 300);
		gco.setVisible(true);	
	}
	
	public static void tc66(){
		GuiRadiobutton gro = new GuiRadiobutton();
		gro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gro.setSize(300, 300);
		gro.setVisible(true);	
	}
	
	public static void tc68(){
		GuiCombobox gcb = new GuiCombobox();
		gcb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		gcb.setSize(300, 300);
		gcb.setVisible(true);	
	}
	
	public static void tc70(){
		GuiList glo = new GuiList();
		glo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		glo.setSize(300, 300);
		glo.setVisible(true);	
	}
	
	public static void tc72(){
		GuiMultilist glo = new GuiMultilist();
		glo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		glo.setSize(500, 300);
		glo.setVisible(true);	
	}
	
	public static void tc74(){
		GuiMouse glo = new GuiMouse();
		glo.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		glo.setSize(500, 300);
		glo.setVisible(true);	
	}
	
	public static void tc78() {
		File myfile = new File("test.txt");
		
		if (myfile.exists()) {
			System.out.println(myfile.getName() + " exist");
		} else {
			System.out.println(myfile.getName() + " not exist");
		}
	}
	
	public static void tc79() {
		final Formatter x;
		
		try {
			x = new Formatter("xxx.txt");
			System.out.println("you create a file");
		} catch (Exception e) {
			System.out.println("you got a error");
		}
	}
	
	public static void tc80() {	
		Formatter x = null;
		try {
			x = new Formatter("xxx.txt");
			System.out.println("write some data to the file");
			x.format("write one line to the file\n");
			x.format("write one line to the file\n");
			x.close();
		} catch (Exception e) {
			System.out.println("you got a error");
		}
	}
	
	public static void tc81() {
		try {
			Scanner file = new Scanner(new File("read.txt"));
			while (file.hasNextLine()) {
				String str = file.nextLine();
				System.out.println(str);
			}
		}
		catch (Exception e) {
			System.out.println("you got a error");
		}
	}
	
	public static void tc82() {
		Scanner input = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int sum = 0;
		
		try {
			System.out.println("please input first number");
			num1 = input.nextInt();
			System.out.println("please input second number");
			num2 = input.nextInt();
			
			sum = num1/num2;
			System.out.println("the sum is " + sum);
		}
		catch(Exception e) {
			System.out.println("can't devide " + num2);	
		}
	}
	
	public static void caculator(){
		caculator co = new caculator();
		co.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		co.setSize(500, 300);
		co.setVisible(true);	
		//co.setSize(300, 500);
	    //co.setBackground(Color.BLACK);
	}
	
	public static void newCalc(){
		newCalc co = new newCalc();
		//co.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		co.setSize(500, 300);
		co.setVisible(true);	
		//co.setSize(300, 500);
	    //co.setBackground(Color.BLACK);
	}
	
	public static void main(String args[]) {
		//tc4();
		//tc5();
		//tc6();
		//tc7();
		//tc8();
		//tc9();
		//tc10();
		//tc11();
		//tc12();
		//tc13();
		//tc14();
		//tc15();
		//tc16();
		//tc17();
		//tc18();
		//tc19();
		//tc20();
		//tc21();
		//tc22();
		//tc23();
		//tc24();
		//tc25();
		//tc26();
		//tc27();
		//tc28();
		//tc31();
		//tc32();
		//tc33();
		//tc34();
		//tc35();
		//tc36();
		//tc37();
		//tc41();
		//tc42();
		//tc43();
		//tc44();
		//tc45();
		//tc46();
		//tc47();
		//tc49();
		//tc50();
		//tc51();
		//tc52();
		//tc55();
		//tc56();
		//tc57();
		//tc62();
		//tc64();
		//tc66();
		//tc68();
		//tc70();
		//tc72();
		//tc74();
		//tc78();
		//tc79();
		//tc80();
		//tc81();
		//tc82();
		//sayhello();
		//caculator();
		newCalc();
	}
}