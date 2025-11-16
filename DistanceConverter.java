
package com.swingprojects.swingpro;
import javax.swing.*;
import java.util.*;

import java.awt.event.*;
public class DistanceConverter {
    public static void main(String[] args){
        JFrame frame =new JFrame("Distance Converter");
        frame.setSize(500,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        
        JLabel label=new JLabel("Enter Distance in KM");
        label.setBounds(30,50,200,30);
        frame.add(label);
        
        JTextField txt=new JTextField();
        txt.setBounds(220, 50, 200, 30);
        frame.add(txt);
        
        
        
        String[] units={"cm","km","miles","mm"};
        
        JLabel boxlabel=new JLabel("Select Units");
        boxlabel.setBounds(30, 130, 100, 30);
        frame.add(boxlabel);
        
        JComboBox box=new JComboBox(units);
        box.setBounds(220, 130, 200, 30);
        frame.add(box);
        
        JLabel results=new JLabel("Results");
        results.setBounds(30, 180, 200, 30);
        frame.add(results);
        
        JTextField resultsField=new JTextField();
        resultsField.setBounds(220, 180, 200, 30);
        frame.add(resultsField);
        
        JButton button=new JButton("converter");
        button.setBounds(220, 220, 200, 30);
        frame.add(button);
        
        frame.setVisible(true);
        
        
        Map<String ,Double> kmUnits =new HashMap<>();
        kmUnits.put("cm", 100000.0);
        kmUnits.put("km", 1.0);
        kmUnits.put("miles", 0.621371);
        kmUnits.put("mm", 1000000.0);
        
        
        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try{
                    double distance=Double.parseDouble(txt.getText());
                    
                    String unitsPick=(String) box.getSelectedItem();
                    
                    double value=distance*kmUnits.get(unitsPick);
                    
                    resultsField.setText(String.format("%.2f", value));
                }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(frame, "Enter a valid number", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        
        
    }
}
