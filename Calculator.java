import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Calculator implements ActionListener {
    JFrame jf;
    Container container;
    JLabel number1, number2;
    JTextField jTextField, jTextField2, jTextField_result;
    JLabel result;
    JButton btn_plus, btn_minus, btn_mul, btn_div;

    Calculator(){
        jf = new JFrame("Calculator");
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
        jf.setBounds(200,200,600,500);

        container = jf.getContentPane();
        container.setLayout(null);
        JLabel number1 = new JLabel("Number 1: ");
        number1.setBounds(50,50,100,30);
        container.add(number1);

        JTextField jTextField = new JTextField("");
        jTextField.setBounds(150,50,120,30);
        container.add(jTextField);

        JLabel number2 = new JLabel("Number 2: ");
        number2.setBounds(50,85,100,60);
        container.add(number2);

        JTextField jTextField2 = new JTextField("");
        jTextField2.setBounds(150,100,120,30);
        container.add(jTextField2);

        //Creating buttons
        JButton btn_plus = new JButton("+");
        btn_plus.setBounds(150,150,50,30);
        container.add(btn_plus);

        JButton btn_minus = new JButton("-");
        btn_minus.setBounds(200,150,50,30);
        container.add(btn_minus);

        JButton btn_mul = new JButton("*");
        btn_mul.setBounds(250,150,50,30);
        container.add(btn_mul);

        JButton btn_div = new JButton("/");
        btn_div.setBounds(300,150,50,30);
        container.add(btn_div);

        JLabel Result = new JLabel("Result: ");
        Result.setBounds(50,185,200,60);
        container.add(Result);

        JTextField jTextField_result = new JTextField("");
        jTextField_result.setBounds(150,200,120,30);
        container.add(jTextField_result);

        JButton btn_equal = new JButton("=");
        btn_equal.setBounds(150,250,50,30);
        container.add(btn_equal);

        jf.setVisible(true);
    }
    public static void main(String[] args){
        Calculator Interface = new Calculator();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btn_plus){
            btn_plus.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent actionEvent){
                int num1 = Integer.parseInt(jTextField.getText());
                int num2 = Integer.parseInt(jTextField2.getText());
                int res = num1 + num2;
                jTextField_result.setText(String.valueOf(res));
            }
        });
        }
        else if(e.getSource()==btn_minus){
            btn_minus.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent actionEvent){
                    int num1 = Integer.parseInt(jTextField.getText());
                    int num2 = Integer.parseInt(jTextField2.getText());
                    int res = num1 - num2;
                    jTextField_result.setText(String.valueOf(res));
                }
            });
        }
        else if(e.getSource()==btn_mul){
            btn_mul.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent actionEvent){
                    int num1 = Integer.parseInt(jTextField.getText());
                    int num2 = Integer.parseInt(jTextField2.getText());
                    int res = num1 * num2;
                    
                    jTextField_result.setText(String.valueOf(res));
                }
            });
        }
        else if(e.getSource()==btn_div){
            btn_div.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent actionEvent){
                    int num1 = Integer.parseInt(jTextField.getText());
                    int num2 = Integer.parseInt(jTextField2.getText());
                    
                    if(num2==0){
                        jTextField_result.setText("Cannot divide by zero");
                    }
                    else{
                        int res = num1 / num2;
                        jTextField_result.setText(String.valueOf(res));
                    }
                }
            });
        }
    }
}
