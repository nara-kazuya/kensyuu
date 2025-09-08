package com.example;

public class App {
    public static void main(String[] args) {
    	boolean	tenki	=	true;
    	int a = 10;
       	int b = 10;
       	String day = "";
       	String[] days = {"日曜","月曜","火曜","水曜","木曜","金曜","土曜"};
       	System.out.println("あなたの運勢を占います");
       	for(int i = 0;i < 7; i++) {

       		switch(i) {
       		case 0 ->{
       			day = "日曜";
       		}
       		case 1 ->{
       			day = "月曜";
       		}
       		case 2 ->{ 
       			day = "火曜";
       		}
       		case 3 ->{
       			day = "水曜";
       		}
       		case 4 ->{
       			day = "木曜";
       		}
       		case 5 ->{
       			day = "金曜";
       		}
       		case 6 ->{
       			day = "土曜";
       		}
       		}
       		int fortune = new java.util.Random().nextInt(5) +1;
       		switch(fortune){
       		case 1, 2 ->{
       			System.out.println(days[i] +"の運勢はいいね！");
       		}
       		case 3 ->{
       			System.out.println(days[i] +"の運勢は普通です");       			
       		}
       		case 4, 5 ->{
       			System.out.println(days[i] +"の運勢はびみょい");
       		}
       		       	}
       	}
       	System.out.println(++a + 50);
       	System.out.println(b++ + 50);
        System.out.println("Hello, Guys");
        if(tenki == false) {
        	System.out.println("洗濯をします");
        	System.out.println("散歩に行きます");
        }else {
        	System.out.println("映画を見ます");
        }
    }
}
