package cn.edu.qdu.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Answer {
	List<Integer> rightAnswer = new ArrayList<Integer>();
    public void readAnswer(BufferedReader in) throws IOException{
    	 int temp;
    	 while ((temp=in.read())!=-1) {
			rightAnswer.add(temp);
		}
    }
}
