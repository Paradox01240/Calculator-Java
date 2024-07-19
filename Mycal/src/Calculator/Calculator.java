package Calculator;

import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


class Close extends WindowAdapter {

    @Override
    public void windowClosing(WindowEvent d) {
        System.exit(0);
    }
}

class cal implements ActionListener {

    Frame frame = new Frame();
    Button btn0 = new Button("0");
    Button btn1 = new Button("1");
    Button btn2 = new Button("2");
    Button btn3 = new Button("3");
    Button btn4 = new Button("4");
    Button btn5 = new Button("5");
    Button btn6 = new Button("6");
    Button btn7 = new Button("7");
    Button btn8 = new Button("8");
    Button btn9 = new Button("9");
    Button btnAdd = new Button("+");
    Button btnSubtract = new Button("-");
    Button btnMultiply = new Button("\u00D7");
    Button btnDivide = new Button("\u00F7");
    Button btnEqual = new Button("=");
    Button btnClear = new Button("C");
    Button btnSqRt = new Button("\u221A");
    Button btnDot = new Button(".");
    Button btnNegativeMark = new Button("+/-");
    Button btnPercentage = new Button("%");
    Color darkButtonBack_for_numberPad = new Color(51, 51, 51);
    TextField result_textField = new TextField();
    String firstValue, secondValue, operator, copiedText;
    double firstDoubleValue, secondDoubleValue, Answer;
    int decimalCount = 0, zeroCount = 0;

    Panel pannel_north = new Panel();

    Panel pannel_north_sub2 = new Panel();
    Panel pannel_center = new Panel();
    Panel pannel_east = new Panel();
    Panel pannel_west = new Panel();
    Panel pannel_south = new Panel();
Font Segoe_UI_24 , Ebrima_24,times_36 , times_48;

    cal() {

        frame.addWindowListener(new Close());
        frame.setBackground(Color.WHITE);
        frame.setBounds(700, 200, 400, 600);
        frame.setTitle("Calculator");
        frame.setResizable(true);

        Font Segoe_UI_15 = new Font("Segoe UI", Font.PLAIN, 15);

        MenuBar menuBar = new MenuBar();
        menuBar.setFont(Segoe_UI_15);

        Menu view_menu = new Menu("View");
        Menu Edit_menu = new Menu("Edit");

        Menu help_menu = new Menu("Help");

        MenuItem view_menu_item_Dark_mode = new MenuItem("Dark mode");
        MenuItem view_menu_item_lightMode = new MenuItem("Light mode");
MenuItem view_menu_item_BlueMode = new MenuItem("Blue mode");
MenuItem view_menu_item_PinkMode = new MenuItem("Pink mode");
        MenuItem help_menu_item_onlineSupport = new MenuItem("Online support");
        MenuItem help_menu_item_checkForUpdates = new MenuItem("Check for updates");
        MenuItem help_menu_item_about = new MenuItem("About");
        MenuItem edit_menu_item_fonts = new MenuItem("Fonts-size +");
  MenuItem edit_menu_item_fonts_ = new MenuItem("Fonts-size -");
        MenuItem edit_menu_item_Reset = new MenuItem("Reset");
        view_menu.add(view_menu_item_lightMode);
        view_menu.add(view_menu_item_Dark_mode);
      view_menu.add(view_menu_item_BlueMode);
view_menu.add(view_menu_item_PinkMode);
        help_menu.add(help_menu_item_onlineSupport);
        help_menu.add(help_menu_item_checkForUpdates);
        help_menu.add(help_menu_item_about);
        Edit_menu.add(edit_menu_item_fonts);
Edit_menu.add(edit_menu_item_fonts_);
        Edit_menu.add(edit_menu_item_Reset);
        menuBar.add(view_menu);
        menuBar.add(Edit_menu);
        menuBar.add(help_menu);

        frame.setMenuBar(menuBar);

         Segoe_UI_24 = new Font("Segoe UI", 0, 24);
         Ebrima_24 = new Font("Ebrima", 0, 24);
         times_36 = new Font("Times New Roman", 0, 36);
         times_48 = new Font("Times New Roman", 0, 48);

        btn0.setFont(Segoe_UI_24);
        btn1.setFont(Segoe_UI_24);
        btn2.setFont(Segoe_UI_24);
        btn3.setFont(Segoe_UI_24);
        btn4.setFont(Segoe_UI_24);
        btn5.setFont(Segoe_UI_24);
        btn6.setFont(Segoe_UI_24);
        btn7.setFont(Segoe_UI_24);
        btn8.setFont(Segoe_UI_24);
        btn9.setFont(Segoe_UI_24);
        btnEqual.setFont(times_36);
        btnAdd.setFont(times_36);
        btnSubtract.setFont(times_48);
        btnNegativeMark.setFont(Segoe_UI_24);
        btnSqRt.setFont(times_36);
        btnDivide.setFont(times_36);
        btnClear.setFont(Segoe_UI_24);
        btnPercentage.setFont(Ebrima_24);
        btnDot.setFont(times_36);
        btnMultiply.setFont(times_36);

        btn0.setBackground(new Color(255, 255, 255));
        btn1.setBackground(new Color(255, 255, 255));
        btn2.setBackground(new Color(255, 255, 255));
        btn3.setBackground(new Color(255, 255, 255));
        btn4.setBackground(new Color(255, 255, 255));
        btn5.setBackground(new Color(255, 255, 255));
        btn6.setBackground(new Color(255, 255, 255));
        btn7.setBackground(new Color(255, 255, 255));
        btn8.setBackground(new Color(255, 255, 255));
        btn9.setBackground(new Color(255, 255, 255));
        btnDot.setBackground(new Color(255, 255, 255));
        btnNegativeMark.setBackground(new Color(255, 255, 255));
        btnEqual.setBackground(new Color(220, 64, 53));
        btnAdd.setBackground(new Color(240, 240, 240));
        btnSubtract.setBackground(new Color(240, 240, 240));
        btnSqRt.setBackground(new Color(240, 240, 240));
        btnDivide.setBackground(new Color(240, 240, 240));
        btnPercentage.setBackground(new Color(240, 240, 240));
        btnClear.setBackground(new Color(240, 240, 240));
        btnMultiply.setBackground(new Color(240, 240, 240));

//GridLayout grid_sub1 = new GridLayout(2,1,5,0);
        GridLayout grid_sub1 = new GridLayout(1, 2, 10, 3);
        btn0.setForeground(Color.BLACK);
        btn1.setForeground(Color.BLACK);
        btn2.setForeground(Color.BLACK);
        btn3.setForeground(Color.BLACK);
        btn4.setForeground(Color.BLACK);
        btn5.setForeground(Color.BLACK);
        btn6.setForeground(Color.BLACK);
        btn7.setForeground(Color.BLACK);
        btn8.setForeground(Color.BLACK);
        btn9.setForeground(Color.BLACK);
        btnDot.setForeground(Color.BLACK);
        btnNegativeMark.setForeground(Color.BLACK);
        btnEqual.setForeground(Color.BLACK);
        btnAdd.setForeground(Color.BLACK);
        btnSubtract.setForeground(Color.BLACK);
        btnSqRt.setForeground(Color.BLACK);
        btnDivide.setForeground(Color.BLACK);
        btnPercentage.setForeground(Color.BLACK);
        btnClear.setForeground(Color.BLACK);
        btnMultiply.setForeground(Color.BLACK);

        Font segeo_55 = new Font("Segoe UI", Font.PLAIN, 55);

        result_textField.setFont(segeo_55);
        result_textField.setEditable(false);
        result_textField.setBackground(Color.WHITE);
        result_textField.setForeground(Color.BLACK);
        result_textField.setPreferredSize(new Dimension(370, 70));
        result_textField.setText("0");
        result_textField.setFocusable(false);

        GridLayout grid_centerPanel = new GridLayout(5, 4, 3, 3);
        FlowLayout flow1 = new FlowLayout(FlowLayout.CENTER, 0, 5);
        pannel_north.setLayout(flow1);
        pannel_center.setCursor(new Cursor(Cursor.HAND_CURSOR));
        pannel_north_sub2.add(result_textField);
        pannel_north.add(pannel_north_sub2);
        pannel_center.setLayout(grid_centerPanel);

        pannel_north.setBackground(new Color(240, 240, 240));
        pannel_center.setBackground(new Color(240, 240, 240));
        pannel_east.setBackground(new Color(240, 240, 240));
        pannel_west.setBackground(new Color(240, 240, 240));
        pannel_south.setBackground(new Color(240, 240, 240));

        pannel_north_sub2.setBackground(new Color(240, 240, 240));

        pannel_north.setPreferredSize(new Dimension(300, 150));

        pannel_center.add(btnClear);
        pannel_center.add(btnPercentage);
        pannel_center.add(btnSqRt);
        pannel_center.add(btnDivide);
        pannel_center.add(btn7);
        pannel_center.add(btn8);
        pannel_center.add(btn9);
        pannel_center.add(btnMultiply);
        pannel_center.add(btn4);
        pannel_center.add(btn5);
        pannel_center.add(btn6);
        pannel_center.add(btnSubtract);
        pannel_center.add(btn1);
        pannel_center.add(btn2);
        pannel_center.add(btn3);
        pannel_center.add(btnAdd);
        pannel_center.add(btnNegativeMark);
        pannel_center.add(btn0);
        pannel_center.add(btnDot);
        pannel_center.add(btnEqual);

        frame.add(pannel_north, BorderLayout.NORTH);
        frame.add(pannel_center, BorderLayout.CENTER);
        frame.add(pannel_east, BorderLayout.EAST);
        frame.add(pannel_west, BorderLayout.WEST);
        frame.add(pannel_south, BorderLayout.SOUTH);

        view_menu_item_Dark_mode.addActionListener(this);
        view_menu_item_lightMode.addActionListener(this);
        view_menu_item_BlueMode.addActionListener(this);
view_menu_item_PinkMode.addActionListener(this);
edit_menu_item_Reset.addActionListener(this);
edit_menu_item_fonts.addActionListener(this);
edit_menu_item_fonts_.addActionListener(this);
help_menu_item_onlineSupport.addActionListener(this);
        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnDot.addActionListener(this);
        btnNegativeMark.addActionListener(this);
        btnEqual.addActionListener(this);
        btnAdd.addActionListener(this);
        btnSubtract.addActionListener(this);
        btnMultiply.addActionListener(this);
        btnDivide.addActionListener(this);
        btnSqRt.addActionListener(this);
        btnPercentage.addActionListener(this);
        btnClear.addActionListener(this);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Object object1 = ae.getSource();

        if (object1.equals(btn0) & zeroCount != 0) {
            result_textField.setText(result_textField.getText() + btn0.getLabel());

        } else if (object1.equals(btn1)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn1.getLabel()) : (result_textField.getText() + btn1.getLabel()));
            zeroCount++;
        } else if (object1.equals(btn2)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn2.getLabel()) : result_textField.getText() + btn2.getLabel());
            zeroCount++;
        } else if (object1.equals(btn3)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn3.getLabel()) : result_textField.getText() + btn3.getLabel());
            zeroCount++;
        } else if (object1.equals(btn4)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn4.getLabel()) : result_textField.getText() + btn4.getLabel());
            zeroCount++;
        } else if (object1.equals(btn5)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn5.getLabel()) : result_textField.getText() + btn5.getLabel());
            zeroCount++;
        } else if (object1.equals(btn6)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn6.getLabel()) : result_textField.getText() + btn6.getLabel());
            zeroCount++;
        } else if (object1.equals(btn7)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn7.getLabel()) : result_textField.getText() + btn7.getLabel());
            zeroCount++;
        } else if (object1.equals(btn8)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn8.getLabel()) : result_textField.getText() + btn8.getLabel());
            zeroCount++;
        } else if (object1.equals(btn9)) {
            result_textField.setText(zeroCount == 0 ? (" " + btn9.getLabel()) : result_textField.getText() + btn9.getLabel());
            zeroCount++;
        } else if (object1.equals(btnDot) & decimalCount == 0) {
            decimalCount++;
            zeroCount++;
            result_textField.setText(result_textField.getText() + btnDot.getLabel());

        } else if (object1.equals(btnAdd)) {
            if (firstValue == null) {
                firstValue = result_textField.getText();

            } else {
                secondValue = result_textField.getText();

                firstDoubleValue = Double.parseDouble(firstValue);
                secondDoubleValue = Double.parseDouble(secondValue);

                Answer = firstDoubleValue + secondDoubleValue;
                firstValue = "" + Answer;

            }
            result_textField.setText(" ");
            operator = btnAdd.getLabel();
            decimalCount = 0;

        } else if (object1.equals(btnSubtract)) {
            if (firstValue == null) {
                firstValue = result_textField.getText();
            } else {
                secondValue = result_textField.getText();

                firstDoubleValue = Double.parseDouble(firstValue);
                secondDoubleValue = Double.parseDouble(secondValue);
                Answer = firstDoubleValue - secondDoubleValue;
                firstValue = "" + Answer;
            }
            result_textField.setText(" ");
            operator = btnSubtract.getLabel();
            decimalCount = 0;

        } else if (object1.equals(btnMultiply)) {
            if (firstValue == null) {
                firstValue = result_textField.getText();
            } else {
                secondValue = result_textField.getText();

                firstDoubleValue = Double.parseDouble(firstValue);
                secondDoubleValue = Double.parseDouble(secondValue);
                Answer = firstDoubleValue * secondDoubleValue;
                firstValue = "" + Answer;
            }
            result_textField.setText(" ");
            operator = btnMultiply.getLabel();
            decimalCount = 0;

        } else if (object1.equals(btnDivide)) {
            if (firstValue == null) {
                firstValue = result_textField.getText();
            } else {
                secondValue = result_textField.getText();

                firstDoubleValue = Double.parseDouble(firstValue);
                secondDoubleValue = Double.parseDouble(secondValue);
                Answer = firstDoubleValue / secondDoubleValue;
                firstValue = "" + Answer;
            }
            result_textField.setText(" ");
            operator = btnDivide.getLabel();
            decimalCount = 0;

        } else if (object1.equals(btnSqRt)) {
            firstValue = result_textField.getText();
            firstDoubleValue = Double.parseDouble(firstValue);
            Answer = Math.sqrt(firstDoubleValue);
            result_textField.setText(" " + Answer);

        } else if (object1.equals(btnPercentage)) {
            secondValue = result_textField.getText();

            firstDoubleValue = Double.parseDouble(firstValue);
            secondDoubleValue = Double.parseDouble(secondValue);

            if (operator == "÷") {
                Answer = (firstDoubleValue / secondDoubleValue) * 100;
                result_textField.setText(" " + Answer);
            }
            firstValue = null;
            decimalCount = 0;
        } else if (object1.equals(btnNegativeMark)) {
            if (zeroCount != 0 & Double.parseDouble(result_textField.getText()) > 0) {
                firstDoubleValue = Double.parseDouble(result_textField.getText());
                result_textField.setText(" -" + firstDoubleValue);
            }
        } else if (object1.equals(btnEqual)) {
            secondValue = result_textField.getText();

            firstDoubleValue = Double.parseDouble(firstValue);
            secondDoubleValue = Double.parseDouble(secondValue);

            if (operator == "+") {
                Answer = firstDoubleValue + secondDoubleValue;
                result_textField.setText(" " + Answer);
            } else if (operator == "-") {
                Answer = firstDoubleValue - secondDoubleValue;
                result_textField.setText(" " + Answer);
            } else if (operator == "\u00D7") {
                Answer = firstDoubleValue * secondDoubleValue;
                result_textField.setText(" " + Answer);
            } else if (operator == "\u00F7") {
                Answer = firstDoubleValue / secondDoubleValue;
                result_textField.setText(" " + Answer);
            }

            firstValue = null;
            decimalCount = 0;
        } else if (object1.equals(btnClear)) {
            result_textField.setText(" 0");
            firstValue = null;
            secondValue = null;
            firstDoubleValue = 0;
            secondDoubleValue = 0;
            Answer = 0;
            decimalCount = 0;
            zeroCount = 0;
        }

        if (ae.getActionCommand().equals("Light mode")) {
            frame.setBackground(new Color(240, 240, 240));
            pannel_north.setBackground(new Color(240, 240, 240));
            pannel_center.setBackground(new Color(240, 240, 240));
            pannel_east.setBackground(new Color(240, 240, 240));
            pannel_west.setBackground(new Color(240, 240, 240));
            pannel_south.setBackground(new Color(240, 240, 240));

            pannel_north_sub2.setBackground(new Color(240, 240, 240));

            result_textField.setBackground(Color.WHITE);
            result_textField.setForeground(Color.BLACK);

            btn0.setBackground(new Color(255, 255, 255));
            btn1.setBackground(new Color(255, 255, 255));
            btn2.setBackground(new Color(255, 255, 255));
            btn3.setBackground(new Color(255, 255, 255));
            btn4.setBackground(new Color(255, 255, 255));
            btn5.setBackground(new Color(255, 255, 255));
            btn6.setBackground(new Color(255, 255, 255));
            btn7.setBackground(new Color(255, 255, 255));
            btn8.setBackground(new Color(255, 255, 255));
            btn9.setBackground(new Color(255, 255, 255));
            btnDot.setBackground(new Color(255, 255, 255));
            btnNegativeMark.setBackground(new Color(255, 255, 255));
            btnEqual.setBackground(new Color(220, 64, 53));
            btnAdd.setBackground(new Color(240, 240, 240));
            btnSubtract.setBackground(new Color(240, 240, 240));
            btnSqRt.setBackground(new Color(240, 240, 240));
            btnDivide.setBackground(new Color(240, 240, 240));
            btnPercentage.setBackground(new Color(240, 240, 240));
            btnClear.setBackground(new Color(240, 240, 240));
            btnMultiply.setBackground(new Color(240, 240, 240));

            btn0.setForeground(Color.BLACK);
            btn1.setForeground(Color.BLACK);
            btn2.setForeground(Color.BLACK);
            btn3.setForeground(Color.BLACK);
            btn4.setForeground(Color.BLACK);
            btn5.setForeground(Color.BLACK);
            btn6.setForeground(Color.BLACK);
            btn7.setForeground(Color.BLACK);
            btn8.setForeground(Color.BLACK);
            btn9.setForeground(Color.BLACK);
            btnDot.setForeground(Color.BLACK);
            btnNegativeMark.setForeground(Color.BLACK);
            btnEqual.setForeground(Color.WHITE);
            btnAdd.setForeground(Color.BLACK);
            btnSubtract.setForeground(Color.BLACK);
            btnSqRt.setForeground(Color.BLACK);
            btnDivide.setForeground(Color.BLACK);
            btnPercentage.setForeground(Color.BLACK);
            btnClear.setForeground(Color.BLACK);
            btnMultiply.setForeground(Color.BLACK);

        } else if (ae.getActionCommand().equals("Dark mode")) {
            frame.setBackground(Color.BLACK);
            pannel_north.setBackground(Color.BLACK);
            pannel_center.setBackground(Color.BLACK);
            pannel_east.setBackground(Color.BLACK);
            pannel_west.setBackground(Color.BLACK);
            pannel_south.setBackground(Color.BLACK);
            pannel_north_sub2.setBackground(Color.BLACK);
            result_textField.setBackground(Color.BLACK);
            result_textField.setForeground(Color.WHITE);

            btn0.setBackground(new Color(51, 51, 51));
            btn1.setBackground(new Color(51, 51, 51));
            btn2.setBackground(new Color(51, 51, 51));
            btn3.setBackground(new Color(51, 51, 51));
            btn4.setBackground(new Color(51, 51, 51));
            btn5.setBackground(new Color(51, 51, 51));
            btn6.setBackground(new Color(51, 51, 51));
            btn7.setBackground(new Color(51, 51, 51));
            btn8.setBackground(new Color(51, 51, 51));
            btn9.setBackground(new Color(51, 51, 51));
            btnDot.setBackground(new Color(51, 51, 51));
            btnNegativeMark.setBackground(new Color(51, 51, 51));
            btnEqual.setBackground(new Color(220, 64, 53));
            btnAdd.setBackground(Color.black);
            btnSubtract.setBackground(Color.black);
            btnSqRt.setBackground(Color.black);
            btnDivide.setBackground(Color.black);
            btnPercentage.setBackground(Color.black);
            btnClear.setBackground(Color.black);
            btnMultiply.setBackground(Color.black);
            btn0.setForeground(Color.WHITE);
            btn1.setForeground(Color.WHITE);
            btn2.setForeground(Color.WHITE);
            btn3.setForeground(Color.WHITE);
            btn4.setForeground(Color.WHITE);
            btn5.setForeground(Color.WHITE);
            btn6.setForeground(Color.WHITE);
            btn7.setForeground(Color.WHITE);
            btn8.setForeground(Color.WHITE);
            btn9.setForeground(Color.WHITE);
            btnDot.setForeground(Color.WHITE);
            btnNegativeMark.setForeground(Color.WHITE);
            btnEqual.setForeground(Color.BLACK);
            btnAdd.setForeground(Color.WHITE);
            btnSubtract.setForeground(Color.WHITE);
            btnSqRt.setForeground(Color.WHITE);
            btnDivide.setForeground(Color.WHITE);
            btnPercentage.setForeground(Color.WHITE);
            btnClear.setForeground(Color.WHITE);
            btnMultiply.setForeground(Color.WHITE);
        }else if (ae.getActionCommand().equals("Blue mode")) {
             frame.setBackground(new Color(173, 216, 230)); // Light blue
    pannel_north.setBackground(new Color(173, 216, 230)); // Light blue
    pannel_center.setBackground(new Color(173, 216, 230)); // Light blue
    pannel_east.setBackground(new Color(173, 216, 230)); // Light blue
    pannel_west.setBackground(new Color(173, 216, 230)); // Light blue
    pannel_south.setBackground(new Color(173, 216, 230)); // Light blue
    pannel_north_sub2.setBackground(new Color(173, 216, 230)); // Light blue
    result_textField.setBackground(new Color(240, 248, 255)); // Alice blue
    result_textField.setForeground(Color.BLACK);

    btn0.setBackground(new Color(135, 206, 250)); // Sky blue
    btn1.setBackground(new Color(135, 206, 250)); // Sky blue
    btn2.setBackground(new Color(135, 206, 250)); // Sky blue
    btn3.setBackground(new Color(135, 206, 250)); // Sky blue
    btn4.setBackground(new Color(135, 206, 250)); // Sky blue
    btn5.setBackground(new Color(135, 206, 250)); // Sky blue
    btn6.setBackground(new Color(135, 206, 250)); // Sky blue
    btn7.setBackground(new Color(135, 206, 250)); // Sky blue
    btn8.setBackground(new Color(135, 206, 250)); // Sky blue
    btn9.setBackground(new Color(135, 206, 250)); // Sky blue
    btnDot.setBackground(new Color(135, 206, 250)); // Sky blue
    btnNegativeMark.setBackground(new Color(135, 206, 250)); // Sky blue
    btnEqual.setBackground(new Color(70, 130, 180)); // Steel blue
    btnAdd.setBackground(new Color(173, 216, 230)); // Light blue
    btnSubtract.setBackground(new Color(173, 216, 230)); // Light blue
    btnSqRt.setBackground(new Color(173, 216, 230)); // Light blue
    btnDivide.setBackground(new Color(173, 216, 230)); // Light blue
    btnPercentage.setBackground(new Color(173, 216, 230)); // Light blue
    btnClear.setBackground(new Color(173, 216, 230)); // Light blue
    btnMultiply.setBackground(new Color(173, 216, 230)); // Light blue

    btn0.setForeground(Color.BLACK);
    btn1.setForeground(Color.BLACK);
    btn2.setForeground(Color.BLACK);
    btn3.setForeground(Color.BLACK);
    btn4.setForeground(Color.BLACK);
    btn5.setForeground(Color.BLACK);
    btn6.setForeground(Color.BLACK);
    btn7.setForeground(Color.BLACK);
    btn8.setForeground(Color.BLACK);
    btn9.setForeground(Color.BLACK);
    btnDot.setForeground(Color.BLACK);
    btnNegativeMark.setForeground(Color.BLACK);
    btnEqual.setForeground(Color.WHITE);
    btnAdd.setForeground(Color.BLACK);
    btnSubtract.setForeground(Color.BLACK);
    btnSqRt.setForeground(Color.BLACK);
    btnDivide.setForeground(Color.BLACK);
    btnPercentage.setForeground(Color.BLACK);
    btnClear.setForeground(Color.BLACK);
    btnMultiply.setForeground(Color.BLACK);
        }else if (ae.getActionCommand().equals("Pink mode")) {
             frame.setBackground(new Color(255, 182, 193)); // Light pink
    pannel_north.setBackground(new Color(255, 182, 193)); // Light pink
    pannel_center.setBackground(new Color(255, 182, 193)); // Light pink
    pannel_east.setBackground(new Color(255, 182, 193)); // Light pink
    pannel_west.setBackground(new Color(255, 182, 193)); // Light pink
    pannel_south.setBackground(new Color(255, 182, 193)); // Light pink
    pannel_north_sub2.setBackground(new Color(255, 182, 193)); // Light pink
    result_textField.setBackground(new Color(255, 240, 245)); // Lavender blush
    result_textField.setForeground(Color.BLACK);

    btn0.setBackground(new Color(255, 192, 203)); // Pink
    btn1.setBackground(new Color(255, 192, 203)); // Pink
    btn2.setBackground(new Color(255, 192, 203)); // Pink
    btn3.setBackground(new Color(255, 192, 203)); // Pink
    btn4.setBackground(new Color(255, 192, 203)); // Pink
    btn5.setBackground(new Color(255, 192, 203)); // Pink
    btn6.setBackground(new Color(255, 192, 203)); // Pink
    btn7.setBackground(new Color(255, 192, 203)); // Pink
    btn8.setBackground(new Color(255, 192, 203)); // Pink
    btn9.setBackground(new Color(255, 192, 203)); // Pink
    btnDot.setBackground(new Color(255, 192, 203)); // Pink
    btnNegativeMark.setBackground(new Color(255, 192, 203)); // Pink
    btnEqual.setBackground(new Color(219, 112, 147)); // Pale violet red
    btnAdd.setBackground(new Color(255, 182, 193)); // Light pink
    btnSubtract.setBackground(new Color(255, 182, 193)); // Light pink
    btnSqRt.setBackground(new Color(255, 182, 193)); // Light pink
    btnDivide.setBackground(new Color(255, 182, 193)); // Light pink
    btnPercentage.setBackground(new Color(255, 182, 193)); // Light pink
    btnClear.setBackground(new Color(255, 182, 193)); // Light pink
    btnMultiply.setBackground(new Color(255, 182, 193)); // Light pink

    btn0.setForeground(Color.BLACK);
    btn1.setForeground(Color.BLACK);
    btn2.setForeground(Color.BLACK);
    btn3.setForeground(Color.BLACK);
    btn4.setForeground(Color.BLACK);
    btn5.setForeground(Color.BLACK);
    btn6.setForeground(Color.BLACK);
    btn7.setForeground(Color.BLACK);
    btn8.setForeground(Color.BLACK);
    btn9.setForeground(Color.BLACK);
    btnDot.setForeground(Color.BLACK);
    btnNegativeMark.setForeground(Color.BLACK);
    btnEqual.setForeground(Color.WHITE);
    btnAdd.setForeground(Color.BLACK);
    btnSubtract.setForeground(Color.BLACK);
    btnSqRt.setForeground(Color.BLACK);
    btnDivide.setForeground(Color.BLACK);
    btnPercentage.setForeground(Color.BLACK);
    btnClear.setForeground(Color.BLACK);
    btnMultiply.setForeground(Color.BLACK);

        }else if (ae.getActionCommand().equals("Reset")) {
            result_textField.setText("0");
        firstDoubleValue = 0;
        secondDoubleValue = 0;
        firstValue = null;
        secondValue = null;
        operator = null;
        decimalCount = 0;
        zeroCount = 0;
btn0.setFont(Segoe_UI_24);
        btn1.setFont(Segoe_UI_24);
        btn2.setFont(Segoe_UI_24);
        btn3.setFont(Segoe_UI_24);
        btn4.setFont(Segoe_UI_24);
        btn5.setFont(Segoe_UI_24);
        btn6.setFont(Segoe_UI_24);
        btn7.setFont(Segoe_UI_24);
        btn8.setFont(Segoe_UI_24);
        btn9.setFont(Segoe_UI_24);
        btnEqual.setFont(times_36);
        btnAdd.setFont(times_36);
        btnSubtract.setFont(times_48);
        btnNegativeMark.setFont(Segoe_UI_24);
        btnSqRt.setFont(times_36);
        btnDivide.setFont(times_36);
        btnClear.setFont(Segoe_UI_24);
        btnPercentage.setFont(Ebrima_24);
        btnDot.setFont(times_36);
        btnMultiply.setFont(times_36);
        }else if (ae.getActionCommand().equals("Fonts-size +")) {
           btn0.setFont(times_36);
        btn1.setFont(times_36);
        btn2.setFont(times_36);
        btn3.setFont(times_36);
        btn4.setFont(times_36);
        btn5.setFont(times_36);
        btn6.setFont(times_36);
        btn7.setFont(times_36);
        btn8.setFont(times_36);
        btn9.setFont(times_36);
        btnEqual.setFont(times_36);
        btnAdd.setFont(times_36);
        btnSubtract.setFont(times_48);
        btnNegativeMark.setFont(Segoe_UI_24);
        btnSqRt.setFont(times_36);
        btnDivide.setFont(times_36);
        btnClear.setFont(Segoe_UI_24);
        btnPercentage.setFont(Ebrima_24);
        btnDot.setFont(times_36);
        btnMultiply.setFont(times_36);
        }else if (ae.getActionCommand().equals("Online support")) {
           try {
            Desktop.getDesktop().browse(new URI("http://www.astrea.lk"));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
        }else if (ae.getActionCommand().equals("Fonts-size -")) {
           btn0.setFont(Segoe_UI_24);
        btn1.setFont(Segoe_UI_24);
        btn2.setFont(Segoe_UI_24);
        btn3.setFont(Segoe_UI_24);
        btn4.setFont(Segoe_UI_24);
        btn5.setFont(Segoe_UI_24);
        btn6.setFont(Segoe_UI_24);
        btn7.setFont(Segoe_UI_24);
        btn8.setFont(Segoe_UI_24);
        btn9.setFont(Segoe_UI_24);
        btnEqual.setFont(times_36);
        btnAdd.setFont(times_36);
        btnSubtract.setFont(times_48);
        btnNegativeMark.setFont(Segoe_UI_24);
        btnSqRt.setFont(times_36);
        btnDivide.setFont(times_36);
        btnClear.setFont(Segoe_UI_24);
        btnPercentage.setFont(Ebrima_24);
        btnDot.setFont(times_36);
        btnMultiply.setFont(times_36);
        }
    }

}

public class Calculator {

    public static void main(String[] args) {
        cal cal = new cal();
    }
}
