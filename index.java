import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.AncestorListener;
class project4 extends JFrame implements ActionListener{
    JLabel label;
    JRadioButton option[]= new JRadioButton[5];
    JButton b1,b2;
    ButtonGroup bg;
    static int count=0;
    int current=0,x=1,y=1,now=0;
    int m[] = new int[10];
    project4(){
        label = new JLabel();
        add(label);
        bg = new ButtonGroup();
        for(int i=0; i<5; i++){
            option[i] = new JRadioButton();
            add(option[i]);
            bg.add(option[i]);
        }
        b1 = new JButton("Next");
        b2 = new JButton("Result");
        b1.addActionListener(this);
        b2.setEnabled(false);
        b2.addActionListener(this);
        add(b1);
        add(b2);
        set();
        label.setBounds(30,40,450,20);
        option[0].setBounds(50,80,100,20);
        option[1].setBounds(50,110,100,20);
        option[2].setBounds(50,140,100,20);
        option[3].setBounds(50,170,100,20);
        b1.setBounds(100,240,100,30);
        b2.setBounds(270,240,100,30);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setLocation(250,100);
        setVisible(true);
        setSize(600,350);
    }
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            if(check()){
                count=count+1;
            }
            current++;
            set();
            if(current==9){
                b1.setEnabled(false);
                b2.setEnabled(true);
                b2.setText("Result");
            }
        }
        if(e.getActionCommand().equals("Result")){
        if(check()){
            count=count+1;
        }
        JOptionPane.showMessageDialog(this,"Correct Answers ="+count);
        System.exit(0);
    }
}
void set(){
    option[4].setSelected(true);
    if(current==0){
        label.setText("Que1: Which of the following is my name?");
        option[0].setText("Champu");
        option[1].setText("Vivek");
        option[2].setText("Jack");
        option[3].setText("Deep");
    }
    if(current == 1){
        label.setText("Que2: Which class is available to all the class automatically");
        option[0].setText("Swing");
        option[1].setText("Applet");
        option[2].setText("Object");
        option[3].setText("ActionEvent");
    }
    if(current == 2){
        label.setText("Que3: Which package is directly available to our class without importing it");
        option[0].setText("Swing");
        option[1].setText("Applet");
        option[2].setText("Net");
        option[3].setText("Lang");
    }
    if(current == 3){
        label.setText("Que4: String class is defined in which package");
        option[0].setText("Lang");
        option[1].setText("Swing");
        option[2].setText("Applet");
        option[3].setText("Awt");
    }
    if(current == 4){
        label.setText("Que5: Which institute is best for java coaching");
        option[0].setText("GURU99");
        option[1].setText("DataFlair");
        option[2].setText("GreekforGeeks");
        option[3].setText("W3School");
    }
    if(current == 5){
        label.setText("Que6: Which one among these is not a keyword");
        option[0].setText("class");
        option[1].setText("int");
        option[2].setText("if");
        option[3].setText("get");
    }
    if(current == 6){
        label.setText("Que7: which one among these is not a function of Object class");
        option[0].setText("toString");
        option[1].setText("Finalize");
        option[2].setText("getDocument");
        option[3].setText("equals");
    }
    if(current == 7){
        label.setText("Que8: which function is not present in Applet class");
        option[0].setText("init");
        option[1].setText("main");
        option[2].setText("destroy");
        option[3].setText("start");
    }
    if(current == 8){
        label.setText("Que9: Which one among these is not a valid component");
        option[0].setText("JButtom");
        option[1].setText("JButtonGroup");
        option[2].setText("JList");
        option[3].setText("JTextArea");
    }
    if(current == 9){
        label.setText("Que10: In which company I will be placed first?");
        option[0].setText("Infosys");
        option[1].setText("Wipro");
        option[2].setText("Accenture");
        option[3].setText("Cognizant");
    }
    label.setBounds(30,40,450,20);
    for(int i=0,j=0; i<=90; i+=30,j++)
        option[j].setBounds(50,80+i,200,20);
    }
    boolean check(){
        if(current==0)
            return(option[1].isSelected());
        if(current==1)
            return(option[2].isSelected());
        if(current==2)
            return(option[3].isSelected());
        if(current==3)
            return(option[0].isSelected());
        if(current==4)
            return(option[0].isSelected());
        if(current==5)
            return(option[1].isSelected());
        if(current==6)
            return(option[2].isSelected());
        if(current==7)
            return(option[1].isSelected());
        if(current==8)
            return(option[1].isSelected());
        if(current==9)
            return(option[3].isSelected());
        return false;
}
    public static void main(String s[]) {
        new project4();
    }
}