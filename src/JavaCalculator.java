import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaCalculator {

    private double totalValue;
    private double totalValue2;
    private char math_operator;

    private JPanel JavaCalculator;
    private JButton btnOne;
    private JButton btnTwo;
    private JButton btnThree;
    private JButton btnFour;
    private JButton btnFive;
    private JButton btnSix;
    private JButton btnSeven;
    private JButton btnEight;
    private JButton btnNine;
    private JButton btnZero;
    private JButton btnMultiply;
    private JButton btnPlus;
    private JButton btnMinus;
    private JButton btnPoint;
    private JButton btnDivide;
    private JTextField textDisplay;
    private JButton btnEquals;
    private JButton Cl;

    private void getOperator (String btnText){
        math_operator = btnText.charAt(0);
        totalValue = totalValue + Double.parseDouble(textDisplay.getText());
        textDisplay.setText("");
    }

    public JavaCalculator() {
        totalValue = 0;
        totalValue2 = 0;
        btnOne.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textDisplay.getText() +  btnOne.getText();
                textDisplay.setText(btnOneText);
            }
        });

        btnTwo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = textDisplay.getText() + btnTwo.getText();
                textDisplay.setText(btnTwoText);
            }
        });

        btnThree.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = textDisplay.getText() + btnThree.getText();
                textDisplay.setText(btnThreeText);
            }
        });

        btnFour.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText =  textDisplay.getText() + btnFour.getText();
                textDisplay.setText(btnFourText);
            }
        });

        btnFive.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText =  textDisplay.getText() + btnFive.getText();
                textDisplay.setText(btnFiveText);
            }
        });

        btnSix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText =  textDisplay.getText() + btnSix.getText();
                textDisplay.setText(btnSixText);
            }
        });

        btnSeven.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText =  textDisplay.getText() + btnSeven.getText();
                textDisplay.setText(btnSevenText);
            }
        });

        btnEight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText =  textDisplay.getText() + btnEight.getText();
                textDisplay.setText(btnEightText);
            }
        });

        btnNine.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText =  textDisplay.getText() + btnNine.getText();
                textDisplay.setText(btnNineText);
            }
        });

        btnZero.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText =  textDisplay.getText() + btnZero.getText();
                textDisplay.setText(btnZeroText);
            }
        });

        Cl.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                totalValue2 = 0;
                textDisplay.setText("");
            }
        });

        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator){
                    case '+':
                        totalValue2 = totalValue + Double.parseDouble(textDisplay.getText());
                        break;
                    case '-':
                        totalValue2 = totalValue - Double.parseDouble(textDisplay.getText());
                        break;
                    case '/':
                        totalValue2 = totalValue / Double.parseDouble(textDisplay.getText());
                        break;
                    case '*':
                        totalValue2 = totalValue * Double.parseDouble(textDisplay.getText());
                        break;
                }
                textDisplay.setText(Double.toString(totalValue2));
                totalValue = 0;
            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnPlus.getText();
                getOperator(btnText);
            }
        });

        btnPoint.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textDisplay.getText().equals("")){
                    textDisplay.setText("0.");
                } else if (textDisplay.getText().contains(".")){
                    btnPoint.setEnabled(false);
                } else {
                    String btnPointText = textDisplay.getText() + btnPoint.getText();
                    textDisplay.setText(btnPointText);
                }
                btnPoint.setEnabled(true);
            }
        });

        btnMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnMinus.getText();
                getOperator(btnText);
            }
        });

        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnMultiply.getText();
                getOperator(btnText);
            }
        });

        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnText = btnDivide.getText();
                getOperator(btnText);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JavaCalculator");
        frame.setContentPane(new JavaCalculator().JavaCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(250, 350);


    }

}

