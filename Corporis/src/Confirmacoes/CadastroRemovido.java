package Confirmacoes;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.KeyStroke;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.InputMap;

public class CadastroRemovido extends JDialog {
	
	private Color cinzaPadrao = new Color(205, 201, 201), cinzaBotoes = new Color(232, 232, 232);

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Create the dialog.
	 */
	public CadastroRemovido() {
		setBounds(100, 100, 400, 178);
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setModal(true);
		getContentPane().setBackground(cinzaPadrao);
		setLocationRelativeTo(this);
		setResizable(false);
		
		JLabel lblCadastroRemovido = new JLabel("Cadastro removido com sucesso!!!");
		lblCadastroRemovido.setFont(new Font("Arial", Font.BOLD, 16));
		lblCadastroRemovido.setBounds(82, 56, 264, 14);
		getContentPane().add(lblCadastroRemovido);
		
		JButton btnOk = new JButton("OK");
		btnOk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnOk.setBounds(152, 90, 89, 23);
		getContentPane().add(btnOk);
		btnOk.setBackground(cinzaBotoes);
		
		InputMap inputMap = this.getRootPane().getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
		inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, 0),"forward");
		this.getRootPane().setInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW, inputMap);
		this.getRootPane().getActionMap().put("forward", new AbstractAction(){
		    private static final long serialVersionUID = 1L;
		    @Override
		    public void actionPerformed(ActionEvent arg0) {
		        setVisible(false);
		    }
		});
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(CadastroRemovido.class.getResource("/imagens/sucesso.png")));
		label.setBounds(49, 50, 24, 29);
		getContentPane().add(label);
	}
}
