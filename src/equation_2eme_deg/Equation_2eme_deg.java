package equation_2eme_deg;

import javax.swing.JOptionPane;

public class Equation_2eme_deg 
{
    public static void main(String[] args) 
    {
             int a1,b1,c1,a2,b2,c2,x,y;
            a1=Integer.parseInt(JOptionPane.showInputDialog("donner A"));
            b1=Integer.parseInt(JOptionPane.showInputDialog("donner B"));
            c1=Integer.parseInt(JOptionPane.showInputDialog("donner C"));
            a2=Integer.parseInt(JOptionPane.showInputDialog("donner A"));
            b2=Integer.parseInt(JOptionPane.showInputDialog("donner B"));
            c2=Integer.parseInt(JOptionPane.showInputDialog("donner C"));

            x=(c1-b1)/a1;
            y=(c2-((a2*c1)/a1))/((b2-(a2*b1)/a1));
            x=(c1-b1*y)/a1;
            
            System.out.println(a1+"x+"+b1+"y"+"="+c1);
            System.out.println(a2+"x+"+b2+"y"+"="+c2);
            JOptionPane.showMessageDialog(null,a1+"x+"+b1+"y"+"="+c1+"\n"+a2+"x+"+b2+"y"+"="+c2+"\ny = "+y+"\nx = "+x);
   
    }
    
}
