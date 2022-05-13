import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SCalculator {
    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;

    private JPanel SCalculator;
    private JTextField textField1;
    private JLabel label1;
    private JButton btnEq;
    private JButton btnMin;
    private JButton btnKali;
    private JButton btnCe;
    private JButton btnC;
    private JButton btn1;
    private JButton btn4;
    private JButton btnMinPlus;
    private JButton btnBs;
    private JButton btn2;
    private JButton btn5;
    private JButton btn0;
    private JButton btnBagi;
    private JButton btn3;
    private JButton btn6;
    private JButton btnTitik;
    private JButton btn9;
    private JButton btnPlus;
    private JButton btn8;
    private JButton btn7;
    private JButton btnPersen;
    private JButton btnAkar;
    private JButton btnPangkat;
    private JButton btnPer;
    private JButton btnMod;
    private JButton btnN;
    private JButton btnTtp;
    private JButton btnLog;
    private JComboBox comboBox1;

    private void getOperator(String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(textField1.getText());
        textField1.setText("");
    }

    private void setMath_operator(String btnText){
        math_operator = btnText.charAt(0);
    }

    private void init(){
        btnTtp.setVisible(false);
        btnLog.setVisible(false);
        btnN.setVisible(false);
        btnMod.setVisible(false);
    }

    public SCalculator() {
        init();

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + btn1.getText();
                textField1.setText(btnOneText);

            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + btn2.getText();
                textField1.setText(btnOneText);

            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + btn3.getText();
                textField1.setText(btnOneText);

            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + btn4.getText();
                textField1.setText(btnOneText);

            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + btn5.getText();
                textField1.setText(btnOneText);

            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + btn6.getText();
                textField1.setText(btnOneText);

            }
        });
        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + btn7.getText();
                textField1.setText(btnOneText);

            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + btn8.getText();
                textField1.setText(btnOneText);

            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + btn9.getText();
                textField1.setText(btnOneText);

            }
        });

        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = textField1.getText() + btn0.getText();
                textField1.setText(btnOneText);
            }
        });

        btnPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnPlus.getText();
                getOperator(button_text);
            }
        });
        btnMin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnMin.getText();
                getOperator(button_text);
            }
        });
        btnBagi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnBagi.getText();
                getOperator(button_text);
            }
        });
        btnKali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_text = btnKali.getText();
                getOperator(button_text);
            }
        });
        btnMinPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double plusmin = Double.parseDouble(String.valueOf(textField1.getText()));
                plusmin = plusmin*(-1);
                textField1.setText(String.valueOf(plusmin));
            }
        });
        btnEq.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                doCalculat();
            }
        });
        btnPangkat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = Double.parseDouble(textField1.getText()) * Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(total2));
            }
        });
        btnPer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 1/Double.parseDouble(textField1.getText());
                textField1.setText(Double.toString(total2));
            }
        });
        btnPersen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = Double.parseDouble(textField1.getText())/100;
                textField1.setText(Double.toString(total2));
            }
        });
        btnAkar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = Math.sqrt(Double.parseDouble(textField1.getText()));
                textField1.setText(Double.toString(total2));
            }
        });
        btnCe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total1 = 0;
                total2 = 0;
                textField1.setText("");
            }
        });
        btnTitik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textField1.getText().equals("")){
                    textField1.setText("0.");
                }
                else if(textField1.getText().contains(".")){
                    btnTitik.setEnabled(false);
                }
                else{
                    String btnTitikText = textField1.getText() + btnTitik.getText();
                    textField1.setText(btnTitikText);
                }
                btnTitik.setEnabled(true);
            }
        });
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
            }
        });
        btnBs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int length = textField1.getText().length();
                int angka = textField1.getText().length()-1;
                String store;

                if(length>0){
                    StringBuilder back = new StringBuilder(textField1.getText());
                    back.deleteCharAt(angka);
                    store=back.toString();
                    textField1.setText(store);
                }
            }
        });

        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedIndex() == 0){
                    btnTtp.setVisible(false);
                    btnLog.setVisible(false);
                    btnN.setVisible(false);
                    btnMod.setVisible(false);
                } else {
                    btnTtp.setVisible(true);
                    btnLog.setVisible(true);
                    btnN.setVisible(true);
                    btnMod.setVisible(true);
                }
            }
        });
        btnMod.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperator(btnMod.getText());
            }
        });
        btnN.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setMath_operator("factorial");
                doCalculat();
            }
        });
        btnTtp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                getOperator("ttp");
            }
        });
        btnLog.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setMath_operator(btnLog.getText());
                doCalculat();
            }
        });
    }

    private void doCalculat(){
        switch (math_operator){
            case '+':
                total2 = total1+ Double.parseDouble(textField1.getText());
                break;
            case '-':
                total2 = total1- Double.parseDouble(textField1.getText());
                break;
            case '÷':
                total2 = total1/ Double.parseDouble(textField1.getText());
                break;
            case '×':
                total2 = total1* Double.parseDouble(textField1.getText());
                break;
            case 'm':
                total2 = total1% Double.parseDouble(textField1.getText());
                break;
            case 'f':
                total2 = 1;
                int n = Integer.parseInt(textField1.getText());
                for (int i = n; i > 0; i--){
                    total2 *= i;
                }
                break;
            case 't':
                total2 = 1;
                int x = (int)Math.round(total1);
                int y = Integer.parseInt(textField1.getText());
                for (int i = y; i > 0; i--){
                    total2 *= x;
                }
                break;
            case 'l':
                String btnOne = textField1.getText();
                total2 = Math.log10(Double.parseDouble(btnOne));
                break;

        }
        textField1.setText(Double.toString(total2));
        total1 = 0;
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("SCalculator");
        frame.setContentPane(new SCalculator().SCalculator);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
