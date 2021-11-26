package game;

import java.util.Random;

import game.object.Gameobject;
import game.object.Paper;
import game.object.Rock;
import game.object.Scissors;

public class Game {
	// 사용할 가위,바위,보 객체를배열로 생성
	Gameobject[] objects = { new Scissors(), new Rock(), new Paper() };
    Random random = new Random();
    
	public void run() {
		System.out.println("게임시작...");
		
		int num = random.nextInt(objects.length);
		Gameobject ob = objects[num];
		System.out.println(ob);
        }
	}


