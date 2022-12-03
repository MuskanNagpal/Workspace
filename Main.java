
package javaapplication102;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main implements ActionListener
{
    double num1=0,num2=0,result=0;
    int calculation;
    JFrame frame=new JFrame("CACULATOR");
    JLabel label=new JLabel();
    JTextField textfield=new JTextField();
   
    JButton buttonZero=new JButton("0");
    JButton buttonone=new JButton("1");
    JButton buttontwo=new JButton("2");
    JButton buttonthree=new JButton("3");
    JButton buttonfour=new JButton("4");
    JButton buttonfive=new JButton("5");
    JButton buttonsix=new JButton("6");
    JButton buttonseven=new JButton("7");
    JButton buttoneight=new JButton("8");
    JButton buttonnine=new JButton("9");
    JButton buttondot=new JButton(".");
    JButton buttonclear=new JButton("C");
    JButton buttondelete=new JButton("D");
    JButton buttonequal=new JButton("=");
    JButton buttonmul=new JButton("*");
    JButton buttondiv=new JButton("/");
    JButton buttonplus=new JButton("+");
    JButton buttonminus=new JButton("-");
    JButton buttonsquare=new JButton("x\u00B2");
    JButton buttonreciprocal=new JButton("1/x");
    JButton buttonsqrt=new JButton("\u221A");

     public Main()
    {
       prepareGUi();
       component();
       addactionevent();
    }
     public void prepareGUi()
     {
        frame.setSize(305,510);
        frame.getContentPane().setLayout(null);
        frame.getContentPane().setBackground(Color.black);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     }
     public void component()
     {
         label.setBounds(250,0,50,50);
         label.setBackground(Color.white);
         label.setForeground(Color.white);
         textfield.setFont(new Font("Arial",Font.BOLD,70));
         frame.add(label);

         textfield.setBounds(10,40,270,40);
         textfield.setFont(new Font("Arial",Font.BOLD,20));
         //textfield.setEditable(false);
         textfield.setHorizontalAlignment(SwingConstants.RIGHT);
         frame.add(textfield);

         

         buttonseven.setBounds(10,230,60,40);
         buttonseven.setFont(new Font("Arial",Font.BOLD,20));
         frame.add(buttonseven);

         buttoneight.setBounds(80,230,60,40);
         buttoneight.setFont(new Font("Arial",Font.BOLD,20));
         frame.add(buttoneight);

         buttonnine.setBounds(150,230,60,40);
         buttonnine.setFont(new Font("Arial",Font.BOLD,20));
         frame.add(buttonnine);

         buttonfour.setBounds(10,290,60,40);
         buttonfour.setFont(new Font("Arial",Font.BOLD,20));
         frame.add(buttonfour);

         buttonfive.setBounds(80,290,60,40);
         buttonfive.setFont(new Font("Arial",Font.BOLD,20));
         frame.add(buttonfive);

         buttonsix.setBounds(150,290,60,40);
         buttonsix.setFont(new Font("Arial",Font.BOLD,20));
         frame.add(buttonsix);

         buttonone.setBounds(10,350,60,40);
         buttonone.setFont(new Font("Arial",Font.BOLD,20));
         frame.add(buttonone);

         buttontwo.setBounds(80,350,60,40);
         buttontwo.setFont(new Font("Arial",Font.BOLD,20));
         frame.add(buttontwo);

         buttonthree.setBounds(150,350,60,40);
         buttonthree.setFont(new Font("Arial",Font.BOLD,20));
         frame.add(buttonthree);

         buttondot.setBounds(150,410,60,40);
         buttondot.setFont(new Font("Arial",Font.BOLD,20));
         frame.add(buttondot);

         buttonZero.setBounds(10,410,130,40);
         buttonZero.setFont(new Font("Arial",Font.BOLD,20));
         frame.add(buttonZero);

         buttonequal.setBounds(220,350,60,100);
         buttonequal.setFont(new Font("Arial",Font.BOLD,20));
         buttonequal.setBackground(new Color(239,188,2));
         frame.add(buttonequal);

         buttondiv.setBounds(220,110,60,40);
         buttondiv.setFont(new Font("Arial",Font.BOLD,20));
         buttondiv.setBackground(new Color(239,188,2));
         frame.add(buttondiv);

         buttonsqrt.setBounds(10,170,60,40);
         buttonsqrt.setFont(new Font("Arial",Font.BOLD,20));
         buttonsqrt.setBackground(new Color(239,188,2));
         frame.add(buttonsqrt);

         buttonmul.setBounds(220,230,60,40);
         buttonmul.setFont(new Font("Arial",Font.BOLD,20));
         buttonmul.setBackground(new Color(239,188,2));
         frame.add(buttonmul);

         buttonminus.setBounds(220,170,60,40);
         buttonminus.setFont(new Font("Arial",Font.BOLD,20));
         buttonminus.setBackground(new Color(239,188,2));
         frame.add(buttonminus);

         buttonplus.setBounds(220,290,60,40);
         buttonplus.setFont(new Font("Arial",Font.BOLD,20));
         buttonplus.setBackground(new Color(239,188,2));
         frame.add(buttonplus);

         buttonsquare.setBounds(80,170,60,40);
         buttonsquare.setFont(new Font("Arial",Font.BOLD,20));
         buttonsquare.setBackground(new Color(239,188,2));
         frame.add(buttonsquare);

         buttonreciprocal.setBounds(150,170,60,40);
         buttonreciprocal.setFont(new Font("Arial",Font.BOLD,20));
         buttonreciprocal.setBackground(new Color(239,188,2));
         frame.add(buttonreciprocal);

         buttondelete.setBounds(150,110,60,40);
         buttondelete.setFont(new Font("Arial",Font.BOLD,20));
         buttondelete.setBackground(Color.red);
         buttondelete.setForeground(Color.white);
         frame.add(buttondelete);

         buttonclear.setBounds(80,110,60,40);
         buttonclear.setFont(new Font("Arial",Font.BOLD,20));
         buttonclear.setBackground(Color.red);
         buttonclear.setForeground(Color.white);
         frame.add(buttonclear);

     }
     public void addactionevent()
     {
        
         buttonclear.addActionListener(this);
         buttondelete.addActionListener(this);
         buttondiv.addActionListener(this);
         buttonsqrt.addActionListener(this);
         buttonsquare.addActionListener(this);
         buttonreciprocal.addActionListener(this);
         buttonminus.addActionListener(this);
         buttonseven.addActionListener(this);
         buttoneight.addActionListener(this);
         buttonnine.addActionListener(this);
         buttonmul.addActionListener(this);
         buttonfour.addActionListener(this);
         buttonfive.addActionListener(this);
         buttonsix.addActionListener(this);
         buttonplus.addActionListener(this);
         buttonone.addActionListener(this);
         buttontwo.addActionListener(this);
         buttonthree.addActionListener(this);
         buttonequal.addActionListener(this);
         buttonZero.addActionListener(this);
         buttondot.addActionListener(this);
         buttontwo.addActionListener(this);
         buttontwo.addActionListener(this);
     }
     public void actionPerformed(ActionEvent e)
         {
            Object source=e.getSource();
           
            if(source==buttonclear)
           {
              label.setText("");
              textfield.setText("");
           }
           else if(source==buttondelete)
           {
               int length=textfield.getText().length();
               int number=length-1;
               if(length>0)
               {
                   StringBuilder back=new StringBuilder(textfield.getText());
                   back.deleteCharAt(number);
                   textfield.setText(back.toString());
               }
               if(textfield.getText().endsWith(""))
               {
                   label.setText("");
               }
           }
           else if(source==buttonZero)
           {
               if(textfield.getText().equals("0"))
               {
                   return;
               }
               else
               {
                   textfield.setText(textfield.getText()+"0");
               }
           }
           else if(source==buttonone)
           {
              textfield.setText(textfield.getText()+"1");
           }
           else if(source==buttontwo)
           {
             textfield.setText(textfield.getText()+"2");

           }
           else if(source==buttonthree)
           {
               textfield.setText(textfield.getText()+"3");

           }
           else if(source==buttonfour)
           {
             textfield.setText(textfield.getText()+"4");

           }
           else if(source==buttonfive)
           {
              textfield.setText(textfield.getText()+"5");

           }
           else if(source==buttonsix)
           {
               textfield.setText(textfield.getText()+"6");

           }
           else if(source==buttonseven)
           {
              textfield.setText(textfield.getText()+"7");

           }
           else if(source==buttoneight)
           {
              textfield.setText(textfield.getText()+"8");

           }
           else if(source==buttonnine)
           {
              textfield.setText(textfield.getText()+"9");

           }
           else if(source==buttondot)
           {
             if(textfield.getText().contains("."))
             {
                 return;
             }
             else
             {
                textfield.setText(textfield.getText()+".");
             }
           }
           else if(source==buttonplus)
           {
               String str=textfield.getText();
               num1=Double.parseDouble(textfield.getText());
               textfield.setText("");
               label.setText(str+"+");
               calculation=1;

           }
           else if(source==buttonminus)
           {
               String str=textfield.getText();
               num1=Double.parseDouble(textfield.getText());
               textfield.setText("");
               label.setText(str+"-");
               calculation=2;  
           }
           else if(source==buttonmul)
           {
               String str=textfield.getText();
               num1=Double.parseDouble(textfield.getText());
               textfield.setText("");
               label.setText(str+"x");
               calculation =3;
           }
           else if(source==buttondiv)
           {
               String str=textfield.getText();
               num1=Double.parseDouble(textfield.getText());
               textfield.setText("");
               label.setText(str+"/");
               calculation =4;
           }
           else if(source==buttonsquare)
           {
               
               num1=Double.parseDouble(textfield.getText());
               double square=Math.pow(num1,2);
               String string=Double.toString(square);
               if(string.endsWith("0"))
               {
                   textfield.setText(string.replace(".0", ""));
               }
               else
               {
                   textfield.setText(string);
               }
           }
           else if(source==buttonsqrt)
               
           {
               num1=Double.parseDouble(textfield.getText());
               double sqrt=Math.sqrt(num1);
               textfield.setText(Double.toString(sqrt));
           }
           else if(source==buttonreciprocal)
           {
             num1=Double.parseDouble(textfield.getText());
             double reciprocal=1/num1;
             String string=Double.toString(reciprocal);
             if(string.endsWith(".0"))
             {
                 textfield.setText(string.replace(".0", ""));
             }
             else
             {
                 textfield.setText(string);
             }
           }
           else if(source==buttonequal)
           {
               num2=Double.parseDouble(textfield.getText());   
               switch(calculation)
               {
                   case 1:
                          result=num1+num2;
                          break;
                   case 2:
                          result=num1-num2;
                          break;
                   case 3:
                          result=num1*num2;
                          break;
                   case 4:
                          result=num1/num2;
                          break;
               }
               if(Double.toString(result).endsWith(".0"))
               {
                  textfield.setText(Double.toString(result).replace(".0", ""));
               }
               else
               {
                  textfield.setText(Double.toString(result));
               }
                label.setText("");
                num1=result;
           }
         }
     
    public static void main(String[] args) 
    {
       Main we=new Main();
    }

}
