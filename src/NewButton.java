import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;

public class NewButton extends JButton {

    public NewButton(String text) {
        super(text);
        this.setSize(200,150);
        this.setForeground(new Color(255,255,255));
        this.setBackground(new Color(91, 171, 77));

        this.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {

            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if(e.isControlDown()){
                    NewButton.this.setBackground(Color.gray);
                }else{
                    NewButton.this.setBackground(Color.orange);
                }

            }

            @Override
            public void mouseExited(MouseEvent e) {
                NewButton.this.setBackground(new Color(91, 171, 77));
            }
        });

    }
}
