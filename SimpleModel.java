import java.util.Vector;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

class SimpleModel extends DefaultTableModel {

  Vector<String[]> textData = new Vector<String[]>();

  public void addText(String f1,String f2,String f3,String f4) {
	System.out.println("in add text");
	String [] field = new String [4];
	field[0] = f1;
	field[1] = f2;
	field[2] = f3;
	field[3] = f4;
    textData.addElement(field);
    fireTableDataChanged();
  }



}