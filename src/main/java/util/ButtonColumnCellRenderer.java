package util;

import java.awt.Color;
import java.awt.Component;
import java.util.Date;
import javax.swing.JLabel;
import javax.swing.JTable;
import static javax.swing.SwingConstants.CENTER;
import javax.swing.table.DefaultTableCellRenderer;
import model.Task;

/**
 *
 * @author jessi
 */
public class ButtonColumnCellRenderer extends DefaultTableCellRenderer{
    
    private String buttonType;
    
    public ButtonColumnCellRenderer(String buttonType) {
        this.buttonType = buttonType;
    }

    public String getButtonType() {
        return buttonType;
    }

    public void setButtonType(String buttonType) {
        this.buttonType = buttonType;
    }
        
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int col){
        //Cells  are by default  rendered as a jLabel
        jLabel label = (jLabel) super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, col);
        
        label.setHorizontalAlignment(CENTER);
        label.setIcon(new java.swing.ImageIcon(getClass().getResource("/" + buttonType + ".png")));

        //Return  the jLabel which renders the cell
        return label;
    
}
