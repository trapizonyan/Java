package Pr4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame extends JFrame {

    JButton Milan = new JButton("AC Milan");
    JButton Madrid = new JButton("Real Madrid");
    JLabel Result = new JLabel("Result: 0 X 0");
    JLabel Last = new JLabel("Last Scorer: N/A");
    JLabel Winner = new JLabel("Winner: DRAW");

    Frame(Score score) {

        super("MILAN VS MADRID");
        JPanel[] pnl = new JPanel[9];
        setLayout(new GridLayout(3, 3));

        for (int i = 0; i < pnl.length; i++) {
            pnl[i] = new JPanel();
            pnl[i].setBackground(new Color(255,249,135));
            add(pnl[i]);
        }
        Milan.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                score.inc_milan();
                Result.setText(score.get_score());
                Last.setText(score.get_last());
                Winner.setText(score.get_winer());

            }
        });
        Madrid.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                score.inc_madrid();
                Result.setText(score.get_score());
                Last.setText(score.get_last());
                Winner.setText(score.get_winer());
            }
        });

        setSize(500, 500);
        pnl[0].add(Milan);
        pnl[2].add(Madrid);
        pnl[1].add(Result);
        pnl[4].add(Last);
        pnl[7].add(Winner);
        setVisible(true);

    }


}