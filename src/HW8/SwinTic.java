package HW8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

import static java.lang.System.*;

public class SwinTic extends JFrame {
    private static final int SIZE = 3;
    private JButton[][] mapButtons = new JButton[SIZE][SIZE];
    private JPanel game;
    private JLabel label;
    private static TicTacToe ticTacToe = new TicTacToe();

    public SwinTic(String title) throws HeadlessException {
        super(title);
        game = new JPanel();
        game.setLayout(new GridLayout(SIZE, SIZE));
        setSize(300, 400);
        setLayout(new GridLayout(2, 1));
        label = new JLabel("Игра крестики-нолики");
        AtomicInteger col = new AtomicInteger();
        AtomicInteger row = new AtomicInteger();
        for (int i = 0; i < mapButtons.length; i++) {
            for (int j = 0; j < mapButtons[i].length; j++) {
                mapButtons[i][j] = new JButton("•");
                mapButtons[i][j].setName(col + "" + row); //Каждой кнопке писваеваем имя-координаты

                JButton finalJButton = mapButtons[i][j];
                mapButtons[i][j].addActionListener(new ActionListener() {
                    int colNumber = -1;
                    int rowNumber = -1;

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String motion = finalJButton.getName();
                        toInt(motion);
                        if (ticTacToe.isCellValid(colNumber, rowNumber)) {
                            ticTacToe.humanTurn(colNumber, rowNumber);
                            finalJButton.setName(String.valueOf(ticTacToe.getMap()[colNumber][rowNumber]));
                            finalJButton.setText(String.valueOf(ticTacToe.getMap()[colNumber][rowNumber]));
                            finalJButton.setEnabled(false);
                            if (ticTacToe.checkWin(ticTacToe.getMap()[colNumber][rowNumber])) {
                                label.setText("Вы выиграли!");
                                buttonsDisabled();
                                return;
                            }
                            if (ticTacToe.isMapFull()) {
                                label.setText("Ничья!");
                                buttonsDisabled();
                                return;
                            }
                            toInt(ticTacToe.aiTurn());
                            mapButtons[colNumber][rowNumber].setName(String.valueOf(ticTacToe.getMap()[colNumber][rowNumber]));
                            mapButtons[colNumber][rowNumber].setText(String.valueOf(ticTacToe.getMap()[colNumber][rowNumber]));
                            mapButtons[colNumber][rowNumber].setEnabled(false);
                            if (ticTacToe.checkWin(ticTacToe.getMap()[colNumber][rowNumber])) {
                                label.setText("Компьютер выиграл!");
                                buttonsDisabled();
                                return;
                            }
                            if (ticTacToe.isMapFull()) {
                                label.setText("Ничья!");
                                buttonsDisabled();
                                return;
                            }
                        }
                    }

                    /**
                     * Метод для конвертации Имени кнопки в переменные int
                     * @param motion - Имя кнопки
                     */
                    private void toInt(String motion) {
                        try {
                            colNumber = Integer.parseInt(String.valueOf(motion.charAt(0)));
                            rowNumber = Integer.parseInt(String.valueOf(motion.charAt(1)));
                        } catch (NumberFormatException ex) {
                            out.println("Неверный ход");
                        }
                    }

                    /**
                     * Метод для отключения кнопок
                     */
                    private void buttonsDisabled(){
                        for (int i = 0; i < mapButtons.length; i++) {
                            for (int j = 0; j < mapButtons[i].length; j++) {
                                mapButtons[i][j].setEnabled(false);
                            }
                        }
                    }
                });

                game.add(mapButtons[i][j]);
                row.getAndIncrement();
            }
            row.set(0);
            col.getAndIncrement();
        }

        add(label);
        add(game);

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwinTic game = new SwinTic("TicTacToe");
        game.label.setText("Ход игрока");
    }
}
