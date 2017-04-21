package Confirmacoes;

import javax.swing.JDialog;
import javax.swing.JLabel;

import DAO.DeleteClienteDAO;
import RegrasDeNegocio.DeleteCliente;
import Telas.TelaConsultaCliente;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
public class ConfirmacaoExcluirCliente extends JDialog {
	
	private int ID;
	private String nome;
	private JLabel label;
	
	public JLabel getLabel() {
		return label;
	}

	public void setLabel() {
		JLabel labelmetodo = new JLabel(getNome()+"?");
		this.label = labelmetodo;
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 16));
		label.setBounds(10, 51, 356, 14);
		getContentPane().add(label);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public ConfirmacaoExcluirCliente() {
		getContentPane().setLayout(null);
		getContentPane().setBackground(new Color(205, 201, 201));
		
		JLabel lblMensagem = new JLabel("Deseja excluir o cliente");
		lblMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		lblMensagem.setFont(new Font("Arial", Font.BOLD, 16));
		lblMensagem.setBounds(10, 30, 356, 14);
		getContentPane().add(lblMensagem);
		
		JButton btnExcluir = new JButton("Excluir");
		btnExcluir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DeleteCliente dc = new DeleteCliente();
				dc.setID(getID());
				DeleteClienteDAO dcd = new DeleteClienteDAO();
				dcd.apagarRegistro(dc);
				setVisible(false);
			}
		});
		btnExcluir.setIcon(new ImageIcon(ConfirmacaoExcluirCliente.class.getResource("/imagens/cancelar_ico.png")));
		btnExcluir.setBounds(75, 91, 104, 33);
		getContentPane().add(btnExcluir);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				TelaConsultaCliente dqr;
				try {
					dqr = new TelaConsultaCliente();
					dqr.setModal(true);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnVoltar.setIcon(new ImageIcon(ConfirmacaoExcluirCliente.class.getResource("/imagens/voltar_ico.png")));
		btnVoltar.setBounds(193, 91, 104, 33);
		
		btnVoltar.setForeground(new Color(0, 0, 0));
		btnVoltar.setBackground(new Color(232, 232, 232));
		
		btnExcluir.setForeground(new Color(0, 0, 0));
		btnExcluir.setBackground(new Color(232, 232, 232));
		
		getContentPane().add(btnVoltar);
		
		setTitle("Confirmação");
		setBounds(100, 100, 392, 181);
		setModal(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLocationRelativeTo(this);
	}
}
