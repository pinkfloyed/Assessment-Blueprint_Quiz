
package question;

import java.util.ArrayList;
import java.util.Collections;

public class Question {
    private String qus;
    private String ans;
    private ArrayList<String>a;
    
    public Question(String qus,String[] a,String ans) /// parameterized constructor
    {
        this.qus=qus;
        this.ans=ans;
        this.a=new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
           this.a.add(a[i]);
        }
        Collections.shuffle(this.a);
    }
    public String getq()
    {
        return qus;
    }
    public ArrayList<String>geta()
    {
        return a;
    }
    public String getans()
    {
        return ans;
    }
}

