package Telas;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableCellRenderer;

public class EvenOddRenderer extends DefaultTableCellRenderer implements TableCellRenderer{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private DefaultTableCellRenderer DEFAULT_RENDERER = new DefaultTableCellRenderer(),
			header = new DefaultTableCellRenderer();
	DefaultTableCellRenderer cellRender = new DefaultTableCellRenderer();
	
	private Color  preto = new Color(000, 000, 000), amareloOcre = new Color(220,220,220), branco = new Color(255, 255, 255);
	
	private Font f = new Font("Arial", 0, 14);
	int LIN;

	public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus,
			int row, int column) {

		Component renderer = DEFAULT_RENDERER.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

		if (isSelected) {
			renderer.setForeground(Color.BLACK);
			renderer.setBackground(Color.YELLOW);
			
		} else {
			if (row % 2 == 0) {
				renderer.setForeground(preto);
				renderer.setBackground(amareloOcre);
				((JLabel) renderer).setHorizontalAlignment(JLabel.CENTER);
				
				
			} else {
				renderer.setForeground(preto);
				renderer.setBackground(branco);
			}
		}
		renderer.setFont(f);
		return renderer;
	}

	public void pintarTabela(JTable tabela) {
		header.setBackground(Color.darkGray);
		header.setForeground(Color.WHITE);
		header.setHorizontalAlignment(SwingConstants.CENTER);
		
		tabela.getColumnModel().getColumn(0).setHeaderRenderer(header);
		tabela.getColumnModel().getColumn(1).setHeaderRenderer(header);
		tabela.getColumnModel().getColumn(2).setHeaderRenderer(header);
		tabela.getColumnModel().getColumn(3).setHeaderRenderer(header);
		
		/*for (int i = 0; i < tabela.getColumnCount();) {
			tabela.getColumnModel().getColumn(i).setHeaderRenderer(header);
			i = i + 2;
			
		}

		for (int i = 1; i < tabela.getColumnCount();) {
			tabela.getColumnModel().getColumn(i).setHeaderRenderer(header2);
			i = i + 2;
		}*/
	}
}
	
	