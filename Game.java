
package question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Game {
    private ArrayList<Question>qusset;
    public Game()
    {
        qusset=new ArrayList<Question>();
        String s="1.Which of the following is not a Java features?";
        String[] a={"a.Dynamic","b.Architecture Neutral","c.Use of pointers","d.Object-oriented"};
        qusset.add(new Question(s,a,"c.Use of pointers"));
        
        s="2.What is the return type of the hashCode() method in the Object class?";
        a=new String[]{"a.Object","b.int","c.long","d.void"};
        qusset.add(new Question(s,a,"b.int"));
        
        s="3. What does the expression float a = 35 / 0 return?";
        a=new String[]{"a.0","b.infinity","c.Not a Number","d.Run time exception"};
        qusset.add(new Question(s,a,"b.infinity"));
        
        s="4. Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?";
        a=new String[]{"a.javap tool","b.javaw command","c.Javadoc tool","d.javah command"};
        qusset.add(new Question(s,a,"c.Javadoc tool"));
        
        
        s="5. Which method of the Class.class is used to determine the name of a class represented by the class object as a String?";
        a=new String[]{"a.getClass()","b.intern()","c.getName()","d.toString()"};
        qusset.add(new Question(s,a,"c.Use of pointers"));
        
        
        s="6. Which of the following is true about the anonymous inner class?";
        a=new String[]{"a.It has only methods","b.Objects can't be created","c.It has a fixed class name","(d) It has no class name"};
        qusset.add(new Question(s,a,"(d) It has no class name"));
        
        s="7.Which package contains the Random class?";
        a=new String[]{"a.java.util package","b.java.lang package","c.java.awt package","d.java.io package"};
        qusset.add(new Question(s,a,"a.java.util package"));
        
        
        
        
        Collections.shuffle(qusset,new Random());
    }
    public void start()
    {
        Scanner scan=new Scanner(System.in);
        int c=0;
        for(int i=0;i<qusset.size();i++){        
            System.out.println(qusset.get(i).getq());
        int x=qusset.get(i).geta().size();
        
        for(int j=0;j<x;j++){        
            System.out.println((j+1)+": "+qusset.get(i).geta().get(j));
        }
        int p=scan.nextInt();
        ArrayList<String>cset=qusset.get(i).geta();
        String cans=qusset.get(i).getans();
        int correctans=cset.indexOf(cans);
        if(p==correctans+1)
        {
            c++;
        }
    }

    scan.close();
        System.out.println("You Got "+c+"correct answer");
    }
    public static void main(String[] args) {
        Game g=new Game();
   g.start();
    }
}
