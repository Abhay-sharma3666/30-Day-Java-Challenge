
//  Welcome to Day 30
// "Today, I tackled a problem involving a "Abstract Window Toolkit with GUI" .”
/* Problem 1 : Create a game Tic Tac Toe with java. */
import java.awt.*;
import java.awt.event.*;

class TTT extends Frame implements ActionListener  {

    Label title,footer,play1,play2,resultLabel,round_p1,round_p2,rules1,rules2,rules2_2,rules3,rules4,rules4_2;
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,Exit;
    int count_p1=0,count_p2;
    int t=1;

    TTT(){
        // this is for frame size,and title....
        setSize(500,500);
        setVisible(true);
        setTitle("Tic Tac Toe");
        setLayout(null);

        title = new Label("Two Player Game");
        title.setBounds(140, 20, 210, 60);
        title.setFont(new Font("Italic", Font.BOLD, 25));
        title.setBackground(Color.lightGray);
        add(title);

        // Exit button
        Exit = new Button("Exit-->");
        Exit.setBounds(452, 32, 40, 20);
        Exit.setFont(new Font("Arial", Font.BOLD, 10));
        Exit.addActionListener(this);// Register the button with the ActionListener
        Exit.setBackground(Color.red);
        add(Exit);

        play1 = new Label("Player 1 :");
        play1.setBounds(100, 80, 92, 30);
        play1.setFont(new Font("Italic", Font.BOLD, 20));
        play1.setBackground(Color.lightGray);
        add(play1);

        round_p1 = new Label("0");
        round_p1.setBounds(200,80,30,30);
        round_p1.setFont(new Font("Arila",Font.BOLD,20));
        round_p1.setBackground(Color.lightGray);
        add(round_p1);

        play2 = new Label("Player 2 :");
        play2.setBounds(260, 80, 92, 30);
        play2.setFont(new Font("Italic", Font.BOLD, 20));
        play2.setBackground(Color.lightGray);
        add(play2);

        round_p2 = new Label("0");
        round_p2.setBounds(360,80,30,30);
        round_p2.setFont(new Font("Arila",Font.BOLD,20));
        round_p2.setBackground(Color.lightGray);
        add(round_p2);

        b1 = new Button();
        b1.setBounds(169, 130, 50, 50);
        b1.setFont(new Font("Arial", Font.BOLD, 30));
        b1.addActionListener(this);// Register the button with the ActionListener
        add(b1);

        b2 = new Button();
        b2.setBounds(220, 130, 50, 50);
        b2.setFont(new Font("Arial", Font.BOLD, 30));
        b2.addActionListener(this);// Register the button with the ActionListener
        add(b2);

        b3 = new Button();
        b3.setBounds(271, 130, 50, 50);
        b3.setFont(new Font("Arial", Font.BOLD, 30));
        b3.addActionListener(this);// Register the button with the ActionListener
        add(b3);

        b4 = new Button();
        b4.setBounds(169, 183, 50, 50);
        b4.setFont(new Font("Arial", Font.BOLD, 30));
        b4.addActionListener(this);// Register the button with the ActionListener
        add(b4);

        b5 = new Button();
        b5.setBounds(220, 183, 50, 50);
        b5.setFont(new Font("Arial", Font.BOLD, 30));
        b5.addActionListener(this);// Register the button with the ActionListener
        add(b5);

        b6 = new Button();
        b6.setBounds(271, 183, 50, 50);
        b6.setFont(new Font("Arial", Font.BOLD, 30));
        b6.addActionListener(this);// Register the button with the ActionListener
        add(b6);

        b7 = new Button();
        b7.setBounds(169, 236, 50, 50);
        b7.setFont(new Font("Arial", Font.BOLD, 30));
        b7.addActionListener(this);// Register the button with the ActionListener
        add(b7);

        b8 = new Button();
        b8.setBounds(220, 236, 50, 50);
        b8.setFont(new Font("Arial", Font.BOLD, 30));
        b8.addActionListener(this);// Register the button with the ActionListener
        add(b8);

        b9 = new Button();
        b9.setBounds(271, 236, 50, 50);
        b9.setFont(new Font("Arial", Font.BOLD, 30));
        b9.addActionListener(this);// Register the button with the ActionListener
        add(b9);

        rules1 = new Label("Rules : 1. 1st player is 'X', and the 2nd player is 'O'.");
        rules1.setBounds(30, 290, 420, 20);
        rules1.setFont(new Font("Italic", Font.PLAIN, 15));
        rules1.setBackground(Color.lightGray);
        add(rules1);

        rules2 = new Label("             2. The first player to get three of their symbols in a row ");
        rules2.setBounds(30, 311, 420, 20);
        rules2.setFont(new Font("Italic", Font.PLAIN, 15));
        rules2.setBackground(Color.lightGray);
        add(rules2);
        rules2_2 = new Label("                 (horizontally, vertically, or diagonally) wins the game.");
        rules2_2.setBounds(30, 330, 420, 20);
        rules2_2.setFont(new Font("Italic", Font.PLAIN, 15));
        rules2_2.setBackground(Color.lightGray);
        add(rules2_2);

        rules3 = new Label("             3. Each time a player wins a round, they get a point." +
                "        4. The player who reaches three wins first is declared the winner of the match.");
        rules3.setBounds(30, 350, 420, 20);
        rules3.setFont(new Font("Italic", Font.PLAIN, 15));
        rules3.setBackground(Color.lightGray);
        add(rules3);

        rules4 = new Label("             4. The player who reaches three wins first is declared ");
        rules4.setBounds(30, 370, 420, 20);
        rules4.setFont(new Font("Italic", Font.PLAIN, 15));
        rules4.setBackground(Color.lightGray);
        add(rules4);
        rules4_2 = new Label("                 the winner of the match.");
        rules4_2.setBounds(30, 390, 430, 20);
        rules4_2.setFont(new Font("Italic", Font.PLAIN, 15));
        rules4_2.setBackground(Color.lightGray);
        add(rules4_2);

        Panel outer_panel = new Panel();
        outer_panel.setLayout(null);
        outer_panel.setBounds(40,407,420,50);
        outer_panel.setFont(new Font("Arial",Font.BOLD,30));
        outer_panel.setBackground(Color.WHITE);
        add(outer_panel);

        resultLabel = new Label("");
        resultLabel.setBounds(20,11,380,30);
        resultLabel.setFont(new Font("Italic",Font.BOLD,25));
        outer_panel.add(resultLabel);



        footer = new Label("Welcome to my mini Tic Tac Toe game, Play and Enjoy.");
        footer.setBounds(40, 460, 415, 20);
        footer.setFont(new Font("Italic", Font.BOLD, 15));
        footer.setBackground(Color.lightGray);
        add(footer);
    }
    public void restart()
    {
        b1.setLabel("");
        b2.setLabel("");
        b3.setLabel("");
        b4.setLabel("");
        b5.setLabel("");
        b6.setLabel("");
        b7.setLabel("");
        b8.setLabel("");
        b9.setLabel("");
        t=1;
        if (count_p1 == 3){
            count_p1=0;
            round_p1.setText(count_p1+"");
        }
        if (count_p2 == 3){
            count_p2=0;
            round_p2.setText(count_p2+"");
        }
    }

    public  void actionPerformed(ActionEvent e){

        // here we're giving validation for override
        if (b1.getLabel().length()==0){
            if (e.getSource() == b1){
                if (t%2 == 1) {
                    b1.setLabel("X");
                } else {
                    b1.setLabel("O");
                }
                t++;
            }
        }
        if (b2.getLabel().length()==0){
            if (e.getSource() == b2){
                if (t%2 == 1) {
                    b2.setLabel("X");
                } else {
                    b2.setLabel("O");
                }
                t++;
            }
        }
        if (b3.getLabel().length()==0){
            if (e.getSource() == b3){
                if (t%2 == 1) {
                    b3.setLabel("X");
                } else {
                    b3.setLabel("O");
                }
                t++;
            }
        }
        if (b4.getLabel().length()==0){
            if (e.getSource() == b4){
                if (t%2 == 1) {
                    b4.setLabel("X");
                } else {
                    b4.setLabel("O");
                }
                t++;
            }
        }
        if (b5.getLabel().length()==0){
            if (e.getSource() == b5){
                if (t%2 == 1) {
                    b5.setLabel("X");
                } else {
                    b5.setLabel("O");
                }
                t++;
            }
        }
        if (b6.getLabel().length()==0){
            if (e.getSource() == b6){
                if (t%2 == 1) {
                    b6.setLabel("X");
                } else {
                    b6.setLabel("O");
                }
                t++;
            }
        }
        if (b7.getLabel().length()==0){
            if (e.getSource() == b7){
                if (t%2 == 1) {
                    b7.setLabel("X");
                } else {
                    b7.setLabel("O");
                }
                t++;
            }
        }
        if (b8.getLabel().length()==0){
            if (e.getSource() == b8){
                if (t%2 == 1) {
                    b8.setLabel("X");
                } else {
                    b8.setLabel("O");
                }
                t++;
            }
        }
        if (b9.getLabel().length()==0){
            if (e.getSource() == b9){
                if (t%2 == 1) {
                    b9.setLabel("X");
                } else {
                    b9.setLabel("O");
                }
                t++;
            }
        }

        // Taking value in String for comparing
        String a1 = b1.getLabel();
        String a2 = b2.getLabel();
        String a3 = b3.getLabel();
        String a4 = b4.getLabel();
        String a5 = b5.getLabel();
        String a6 = b6.getLabel();
        String a7 = b7.getLabel();
        String a8 = b8.getLabel();
        String a9 = b9.getLabel();

        // here we compare the String value with 'X' for winning possible condition of player 1
        if (    a1.equals("X") && a2.equals("X") && a3.equals("X") ||
                a4.equals("X") && a5.equals("X") && a6.equals("X") ||
                a7.equals("X") && a8.equals("X") && a9.equals("X") ||
                a1.equals("X") && a4.equals("X") && a7.equals("X") ||
                a2.equals("X") && a5.equals("X") && a8.equals("X") ||
                a3.equals("X") && a6.equals("X") && a9.equals("X") ||
                a1.equals("X") && a5.equals("X") && a9.equals("X") ||
                a3.equals("X") && a5.equals("X") && a7.equals("X") )  {
            count_p1++;
            round_p1.setText(count_p1+"");
            if (count_p1 == 3){
                resultLabel.setText("Player 1 is Winner.");
                try{
                    Thread.sleep(3000);
                }catch (InterruptedException ea){
                    ea.printStackTrace();
                }
                resultLabel.setVisible(false);

            }
            restart();
        }

        // here we compare the String value with 'O' for winning possible condition of player 2
        else  if (    a1.equals("O") && a2.equals("O") && a3.equals("O") ||
                a4.equals("O") && a5.equals("O") && a6.equals("O") ||
                a7.equals("O") && a8.equals("O") && a9.equals("O") ||
                a1.equals("O") && a4.equals("O") && a7.equals("O") ||
                a2.equals("O") && a5.equals("O") && a8.equals("O") ||
                a3.equals("O") && a6.equals("O") && a9.equals("O") ||
                a1.equals("O") && a5.equals("O") && a9.equals("O") ||
                a3.equals("O") && a5.equals("O") && a7.equals("O") )  {
            count_p2++;
            round_p2.setText(count_p2+"");
            if (count_p2 == 3){
                resultLabel.setText("Player 2 is Winner.");
                try{
                    Thread.sleep(3000);
                }catch (InterruptedException ea){
                    ea.printStackTrace();
                }
                resultLabel.setVisible(false);
            }
            restart();
        }
        else if(t==10) {
            resultLabel.setText("Draw");
            restart();
            try{
                Thread.sleep(2000);
            }catch (InterruptedException ea){
                ea.printStackTrace();
            }
            resultLabel.setVisible(false);
        }

        if (e.getSource() == Exit){
            System.exit(0);
        }
    }
}
public class Day_30_AWT_Action_Listener_4_TTT {
    public static void main(String[] args) {
        TTT t1 = new TTT();
        t1.setBackground(Color.lightGray);
    }
}