
package com.swingprojects.swingpro;
import javax.swing.*;
import java.awt.event.*;
public class WeightEvaluator {
    public static void main(String[] args){
        JFrame frame =new JFrame("Weight Evaluate");
        frame.setSize(500, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JLabel weightlabel=new JLabel("Enter weight Kg");
        weightlabel.setBounds(30, 30, 200, 30);
        frame.add(weightlabel);
        
        JTextField weightfield=new JTextField();
        weightfield.setBounds(180, 30, 200, 30);
        frame.add(weightfield);
        
        
        JLabel heightlabel=new JLabel("Enter Height(m) ");
        heightlabel.setBounds(30,80,200,30);
        frame.add(heightlabel);
        
        JTextField heightfield=new JTextField();
        heightfield.setBounds(180, 80, 200, 30);
        frame.add(heightfield);
        
        
        JLabel resultslabel=new JLabel("Results");
        resultslabel.setBounds(30,120,200,30);
        frame.add(resultslabel);
        
        JTextField resultsfield=new JTextField();
        resultsfield.setBounds(180, 120, 200, 30);
        frame.add(resultsfield);
        
        JLabel commentlabel=new JLabel("Comment");
        commentlabel.setBounds(30, 170, 200, 30);
        frame.add(commentlabel);
        
        JTextField commentfield=new JTextField();
        commentfield.setBounds(180,170,200,30);
        frame.add(commentfield);
        
        
        JButton button=new JButton("Calculate BMI");
        button.setBounds(80, 220, 200, 30);
        frame.add(button);
        
        frame.setVisible(true);
        
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double w=Double.parseDouble(weightfield.getText());
                    double h=Double.parseDouble(heightfield.getText());
                    double bmi=w/(h*h);
                    
                    resultsfield.setText(String.format("%.2f", bmi));
                    
                    
                    if(bmi<18){
                       commentfield.setText("under weight");
                    }else if(bmi<25){
                        commentfield.setText("Normal");
                    }else if(bmi<30){
                        commentfield.setText("Overweight");
                    }else {
                        commentfield.setText("Obase");
                    }
                
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(frame,"Enter valid Number","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }
    
}
