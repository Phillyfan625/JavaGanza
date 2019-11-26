package App;

import View.LessonTemplate;
import View.MainMenu;
import java.util.ArrayList;
import  java.util.Collections.*;
import java.util.Random;


public class App
{
        public static void main(String[] args){
            LessonTemplate lessonOne = new LessonTemplate();
            LessonTemplate lessonTwo = new LessonTemplate();
            LessonTemplate lessonThree = new LessonTemplate();
            ArrayList<LessonTemplate> lessons = new ArrayList<>();
            lessons.add(lessonOne);
            lessons.add(lessonTwo);
            lessons.add(lessonThree);
            
            
            MainMenu mm = new MainMenu();
            mm.setVisible(true);
        }

}