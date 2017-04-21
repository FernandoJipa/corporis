package Telas;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;

import javax.swing.JDialog;
import java.awt.Panel;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JComboBox;

public class TelaAgendarAvaliacao extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JButton btnNovo, btnCadastrar, btnCancelar, btnVoltar;
	private Label lblDomingo;
	private Label lblSegunda;
	private Label lblTerca;
	private Label lblQuarta;
	private Label lblQuinta;
	private Label lblSexta;
	private Label lblSabado;
	private Label lbl1;
	private Label lbl2;
	private Label lbl3;
	private Label lbl4;
	private Label lbl5;
	private Label lbl6;
	private Label lbl7;
	private Label lbl8;
	private Label lbl9;
	private Label lbl10;
	private Label lbl11;
	private Label lbl12;
	private Label lbl13;
	private Label lbl14;
	private Label lbl22;
	private Label lbl23;
	private Label lbl16;
	private Label lbl15;
	private Label lbl17;
	private Label lbl24;
	private Label lbl25;
	private Label lbl18;
	private Label lbl19;
	private Label lbl26;
	private Label lbl27;
	private Label lbl20;
	private Label lbl21;
	private Label lbl28;
	private Label lbl36;
	private Label lbl29;
	private Label lbl30;
	private Label lbl37;
	private Label lbl38;
	private Label lbl31;
	private Label lbl32;
	private Label lbl39;
	private Label lbl40;
	private Label lbl33;
	private Label lbl34;
	private Label lbl41;
	private Label lbl42;
	private Label lbl35;

	private int anoFixo = 0, mesFixo = 0, diaFixo = 0, diaAltera = 0, mesAltera = 0, anoAltera = 0;

	private String meses[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
			"Outubro", "Novembro", "Dezembro" };

	private JComboBox<Object> cbbAno = new JComboBox<Object>(), cbbMes = new JComboBox<Object>(meses);
	
	private Color corPassaMouse = new Color(240, 240, 240);

	private Panel panel = new Panel();

	/**
	 * Create the panel.
	 */
	public TelaAgendarAvaliacao() {
		getContentPane().setLayout(null);
		setSize(1024, 650);
		setTitle("Cadastro de clientes");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setModal(true);
		getContentPane().setBackground(new Color(190, 190, 190));
		this.setLocationRelativeTo(null);
		setResizable(false);

		URL url = this.getClass().getResource("/imagens/sistema_ico.png");

		Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url).getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		this.setIconImage(imagemTitulo);

		inicializaCalendario();

		btnNovo = new JButton("Novo");

		btnNovo.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent me) {
				btnNovo.setBackground(new Color(70, 130, 180));
				;
			}

			public void mouseExited(MouseEvent e) {
				btnNovo.setBackground(new Color(220, 220, 220));
				;
			}
		});

		btnNovo.setIcon(new ImageIcon(TelaAgendarAvaliacao.class.getResource("/imagens/novo_ico.png")));
		btnNovo.setForeground(new Color(0, 0, 0));
		btnNovo.setBackground(new Color(232, 232, 232));
		btnNovo.setBounds(204, 550, 113, 33);
		getContentPane().add(btnNovo);

		btnCadastrar = new JButton("Salvar");
		btnCadastrar.setBackground(new Color(232, 232, 232));
		btnCadastrar.setIcon(new ImageIcon(TelaAgendarAvaliacao.class.getResource("/imagens/salvar_ico.png")));

		btnCadastrar.setBounds(327, 550, 113, 33);
		getContentPane().add(btnCadastrar);

		btnCadastrar.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent me) {
				btnCadastrar.setBackground(new Color(70, 130, 180));
				;
			}

			public void mouseExited(MouseEvent e) {
				btnCadastrar.setBackground(new Color(232, 232, 232));
				;
			}
		});

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(TelaAgendarAvaliacao.class.getResource("/imagens/cancelar_ico.png")));
		btnCancelar.setBackground(new Color(232, 232, 232));
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limpar();

			}
		});
		btnCancelar.setBounds(450, 550, 113, 33);
		getContentPane().add(btnCancelar);

		btnCancelar.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent me) {
				btnCancelar.setBackground(new Color(70, 130, 180));
				;
			}

			public void mouseExited(MouseEvent e) {
				btnCancelar.setBackground(new Color(232, 232, 232));
				;
			}
		});

		btnVoltar = new JButton(" Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnVoltar.setIcon(new ImageIcon(TelaAgendarAvaliacao.class.getResource("/imagens/voltar_ico.png")));
		btnVoltar.setBackground(new Color(232, 232, 232));
		btnVoltar.setBounds(698, 550, 113, 33);
		getContentPane().add(btnVoltar);

		panel.setLayout(null);
		panel.setBounds(46, 41, 316, 267);
		getContentPane().add(panel);

		lblDomingo = new Label("Dom");
		lblDomingo.setForeground(Color.WHITE);
		lblDomingo.setBackground(Color.RED);
		lblDomingo.setAlignment(Label.CENTER);
		lblDomingo.setFont(new Font("Arial", Font.BOLD, 14));
		lblDomingo.setBounds(0, 0, 45, 30);
		panel.add(lblDomingo);

		lblSegunda = new Label("Seg");
		lblSegunda.setForeground(Color.WHITE);
		lblSegunda.setBackground(Color.RED);
		lblSegunda.setFont(new Font("Arial", Font.BOLD, 14));
		lblSegunda.setAlignment(Label.CENTER);
		lblSegunda.setBounds(45, 0, 45, 30);
		panel.add(lblSegunda);

		lblTerca = new Label("Ter");
		lblTerca.setForeground(Color.WHITE);
		lblTerca.setBackground(Color.RED);
		lblTerca.setFont(new Font("Arial", Font.BOLD, 14));
		lblTerca.setAlignment(Label.CENTER);
		lblTerca.setBounds(90, 0, 45, 30);
		panel.add(lblTerca);

		lblQuarta = new Label("Qua");
		lblQuarta.setForeground(Color.WHITE);
		lblQuarta.setBackground(Color.RED);
		lblQuarta.setFont(new Font("Arial", Font.BOLD, 14));
		lblQuarta.setAlignment(Label.CENTER);
		lblQuarta.setBounds(135, 0, 45, 30);
		panel.add(lblQuarta);

		lblQuinta = new Label("Qui");
		lblQuinta.setForeground(Color.WHITE);
		lblQuinta.setBackground(Color.RED);
		lblQuinta.setFont(new Font("Arial", Font.BOLD, 14));
		lblQuinta.setAlignment(Label.CENTER);
		lblQuinta.setBounds(180, 0, 45, 30);
		panel.add(lblQuinta);

		lblSexta = new Label("Sex");
		lblSexta.setForeground(Color.WHITE);
		lblSexta.setBackground(Color.RED);
		lblSexta.setFont(new Font("Arial", Font.BOLD, 14));
		lblSexta.setAlignment(Label.CENTER);
		lblSexta.setBounds(225, 0, 45, 30);
		panel.add(lblSexta);

		lblSabado = new Label("S\u00E1b");
		lblSabado.setForeground(Color.WHITE);
		lblSabado.setBackground(Color.RED);
		lblSabado.setFont(new Font("Arial", Font.BOLD, 14));
		lblSabado.setAlignment(Label.CENTER);
		lblSabado.setBounds(270, 0, 45, 30);
		panel.add(lblSabado);

		lbl1 = new Label("0");
		lbl1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl1.getText().length()!=0){
				lbl1.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl1.getText().length()!=0){
					lbl1.setBackground(Color.WHITE);
					}
			}
		});
		lbl1.setForeground(Color.RED);
		lbl1.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl1.setBackground(Color.WHITE);
		lbl1.setAlignment(Label.CENTER);
		lbl1.setBounds(0, 30, 45, 30);
		panel.add(lbl1);

		lbl2 = new Label("0");
		lbl2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl2.getText().length()!=0){
				lbl2.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl2.getText().length()!=0){
					lbl2.setBackground(Color.WHITE);
					}
			}
		});
		lbl2.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl2.setBackground(Color.WHITE);
		lbl2.setAlignment(Label.CENTER);
		lbl2.setBounds(45, 30, 45, 30);
		panel.add(lbl2);

		lbl3 = new Label("0");
		lbl3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl3.getText().length()!=0){
				lbl3.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl3.getText().length()!=0){
					lbl3.setBackground(Color.WHITE);
					}
			}
		});
		lbl3.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl3.setBackground(Color.WHITE);
		lbl3.setAlignment(Label.CENTER);
		lbl3.setBounds(90, 30, 45, 30);
		panel.add(lbl3);

		lbl4 = new Label("0");
		lbl4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl4.getText().length()!=0){
				lbl4.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl4.getText().length()!=0){
					lbl4.setBackground(Color.WHITE);
					}
			}
		});
		lbl4.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl4.setBackground(Color.WHITE);
		lbl4.setAlignment(Label.CENTER);
		lbl4.setBounds(135, 30, 45, 30);
		panel.add(lbl4);

		lbl5 = new Label("0");
		lbl5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl5.getText().length()!=0){
				lbl5.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl5.getText().length()!=0){
					lbl5.setBackground(Color.WHITE);
					}
			}
		});
		lbl5.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl5.setBackground(Color.WHITE);
		lbl5.setAlignment(Label.CENTER);
		lbl5.setBounds(180, 30, 45, 30);
		panel.add(lbl5);

		lbl6 = new Label("0");
		lbl6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl6.getText().length()!=0){
				lbl6.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl6.getText().length()!=0){
					lbl6.setBackground(Color.WHITE);
					}
			}
		});
		lbl6.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl6.setBackground(Color.WHITE);
		lbl6.setAlignment(Label.CENTER);
		lbl6.setBounds(225, 30, 45, 30);
		panel.add(lbl6);

		lbl7 = new Label("0");
		lbl7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl7.getText().length()!=0){
				lbl7.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl7.getText().length()!=0){
					lbl7.setBackground(Color.WHITE);
					}
			}
		});
		lbl7.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl7.setBackground(Color.WHITE);
		lbl7.setAlignment(Label.CENTER);
		lbl7.setBounds(270, 30, 45, 30);
		panel.add(lbl7);

		lbl8 = new Label("0");
		lbl8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl8.getText().length()!=0){
				lbl8.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl8.getText().length()!=0){
					lbl8.setBackground(Color.WHITE);
					}
			}
		});
		lbl8.setForeground(Color.RED);
		lbl8.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl8.setBackground(Color.WHITE);
		lbl8.setAlignment(Label.CENTER);
		lbl8.setBounds(0, 60, 45, 30);
		panel.add(lbl8);

		lbl9 = new Label("0");
		lbl9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl9.getText().length()!=0){
				lbl9.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl9.getText().length()!=0){
					lbl9.setBackground(Color.WHITE);
					}
			}
		});
		lbl9.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl9.setBackground(Color.WHITE);
		lbl9.setAlignment(Label.CENTER);
		lbl9.setBounds(45, 60, 45, 30);
		panel.add(lbl9);

		lbl10 = new Label("0");
		lbl10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl10.getText().length()!=0){
				lbl10.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl10.getText().length()!=0){
					lbl10.setBackground(Color.WHITE);
					}
			}
		});
		lbl10.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl10.setBackground(Color.WHITE);
		lbl10.setAlignment(Label.CENTER);
		lbl10.setBounds(90, 60, 45, 30);
		panel.add(lbl10);

		lbl11 = new Label("0");
		lbl11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl11.getText().length()!=0){
				lbl11.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl11.getText().length()!=0){
					lbl11.setBackground(Color.WHITE);
					}
			}
		});
		lbl11.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl11.setBackground(Color.WHITE);
		lbl11.setAlignment(Label.CENTER);
		lbl11.setBounds(135, 60, 45, 30);
		panel.add(lbl11);

		lbl12 = new Label("0");
		lbl12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl12.getText().length()!=0){
				lbl12.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl12.getText().length()!=0){
					lbl12.setBackground(Color.WHITE);
					}
			}
		});
		lbl12.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl12.setBackground(Color.WHITE);
		lbl12.setAlignment(Label.CENTER);
		lbl12.setBounds(180, 60, 45, 30);
		panel.add(lbl12);

		lbl13 = new Label("0");
		lbl13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl13.getText().length()!=0){
				lbl13.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl13.getText().length()!=0){
					lbl13.setBackground(Color.WHITE);
					}
			}
		});
		lbl13.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl13.setBackground(Color.WHITE);
		lbl13.setAlignment(Label.CENTER);
		lbl13.setBounds(225, 60, 45, 30);
		panel.add(lbl13);

		lbl14 = new Label("0");
		lbl14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl14.getText().length()!=0){
				lbl14.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl14.getText().length()!=0){
					lbl14.setBackground(Color.WHITE);
					}
			}
		});
		lbl14.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl14.setBackground(Color.WHITE);
		lbl14.setAlignment(Label.CENTER);
		lbl14.setBounds(270, 60, 45, 30);
		panel.add(lbl14);

		lbl22 = new Label("0");
		lbl22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl22.getText().length()!=0){
				lbl22.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl22.getText().length()!=0){
					lbl22.setBackground(Color.WHITE);
					}
			}
		});
		lbl22.setForeground(Color.RED);
		lbl22.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl22.setBackground(Color.WHITE);
		lbl22.setAlignment(Label.CENTER);
		lbl22.setBounds(0, 120, 45, 30);
		panel.add(lbl22);

		lbl23 = new Label("0");
		lbl23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl23.getText().length()!=0){
				lbl23.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl23.getText().length()!=0){
					lbl23.setBackground(Color.WHITE);
					}
			}
		});
		lbl23.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl23.setBackground(Color.WHITE);
		lbl23.setAlignment(Label.CENTER);
		lbl23.setBounds(45, 120, 45, 30);
		panel.add(lbl23);

		lbl16 = new Label("0");
		lbl16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl16.getText().length()!=0){
				lbl16.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl16.getText().length()!=0){
					lbl16.setBackground(Color.WHITE);
					}
			}
		});
		lbl16.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl16.setBackground(Color.WHITE);
		lbl16.setAlignment(Label.CENTER);
		lbl16.setBounds(45, 90, 45, 30);
		panel.add(lbl16);

		lbl15 = new Label("0");
		lbl15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl15.getText().length()!=0){
				lbl15.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl15.getText().length()!=0){
					lbl15.setBackground(Color.WHITE);
					}
			}
		});
		lbl15.setForeground(Color.RED);
		lbl15.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl15.setBackground(Color.WHITE);
		lbl15.setAlignment(Label.CENTER);
		lbl15.setBounds(0, 90, 45, 30);
		panel.add(lbl15);

		lbl17 = new Label("0");
		lbl17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl17.getText().length()!=0){
				lbl17.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl17.getText().length()!=0){
					lbl17.setBackground(Color.WHITE);
					}
			}
		});
		lbl17.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl17.setBackground(Color.WHITE);
		lbl17.setAlignment(Label.CENTER);
		lbl17.setBounds(90, 90, 45, 30);
		panel.add(lbl17);

		lbl24 = new Label("0");
		lbl24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl24.getText().length()!=0){
				lbl24.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl24.getText().length()!=0){
					lbl24.setBackground(Color.WHITE);
					}
			}
		});
		lbl24.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl24.setBackground(Color.WHITE);
		lbl24.setAlignment(Label.CENTER);
		lbl24.setBounds(90, 120, 45, 30);
		panel.add(lbl24);

		lbl25 = new Label("0");
		lbl25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl25.getText().length()!=0){
				lbl25.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl25.getText().length()!=0){
					lbl25.setBackground(Color.WHITE);
					}
			}
		});
		lbl25.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl25.setBackground(Color.WHITE);
		lbl25.setAlignment(Label.CENTER);
		lbl25.setBounds(135, 120, 45, 30);
		panel.add(lbl25);

		lbl18 = new Label("0");
		lbl18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl18.getText().length()!=0){
				lbl18.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl18.getText().length()!=0){
					lbl18.setBackground(Color.WHITE);
					}
			}
		});
		lbl18.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl18.setBackground(Color.WHITE);
		lbl18.setAlignment(Label.CENTER);
		lbl18.setBounds(135, 90, 45, 30);
		panel.add(lbl18);

		lbl19 = new Label("0");
		lbl19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl19.getText().length()!=0){
				lbl19.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl19.getText().length()!=0){
					lbl19.setBackground(Color.WHITE);
					}
			}
		});
		lbl19.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl19.setBackground(Color.WHITE);
		lbl19.setAlignment(Label.CENTER);
		lbl19.setBounds(180, 90, 45, 30);
		panel.add(lbl19);

		lbl26 = new Label("0");
		lbl26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl26.getText().length()!=0){
				lbl26.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl26.getText().length()!=0){
					lbl26.setBackground(Color.WHITE);
					}
			}
		});
		lbl26.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl26.setBackground(Color.WHITE);
		lbl26.setAlignment(Label.CENTER);
		lbl26.setBounds(180, 120, 45, 30);
		panel.add(lbl26);

		lbl27 = new Label("0");
		lbl27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl27.getText().length()!=0){
				lbl27.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl27.getText().length()!=0){
					lbl27.setBackground(Color.WHITE);
					}
			}
		});
		lbl27.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl27.setBackground(Color.WHITE);
		lbl27.setAlignment(Label.CENTER);
		lbl27.setBounds(225, 120, 45, 30);
		panel.add(lbl27);

		lbl20 = new Label("0");
		lbl20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl20.getText().length()!=0){
				lbl20.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl20.getText().length()!=0){
					lbl20.setBackground(Color.WHITE);
					}
			}
		});
		lbl20.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl20.setBackground(Color.WHITE);
		lbl20.setAlignment(Label.CENTER);
		lbl20.setBounds(225, 90, 45, 30);
		panel.add(lbl20);

		lbl21 = new Label("0");
		lbl21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl21.getText().length()!=0){
				lbl21.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl21.getText().length()!=0){
					lbl21.setBackground(Color.WHITE);
					}
			}
		});
		lbl21.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl21.setBackground(Color.WHITE);
		lbl21.setAlignment(Label.CENTER);
		lbl21.setBounds(270, 90, 45, 30);
		panel.add(lbl21);

		lbl28 = new Label("0");
		lbl28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl28.getText().length()!=0){
				lbl28.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl28.getText().length()!=0){
					lbl28.setBackground(Color.WHITE);
					}
			}
		});
		lbl28.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl28.setBackground(Color.WHITE);
		lbl28.setAlignment(Label.CENTER);
		lbl28.setBounds(270, 120, 45, 30);
		panel.add(lbl28);

		lbl36 = new Label("0");
		lbl36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl36.getText().length()!=0){
				lbl36.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl36.getText().length()!=0){
					lbl36.setBackground(Color.WHITE);
					}
			}
		});
		lbl36.setForeground(Color.RED);
		lbl36.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl36.setBackground(Color.WHITE);
		lbl36.setAlignment(Label.CENTER);
		lbl36.setBounds(0, 180, 45, 30);
		panel.add(lbl36);

		lbl29 = new Label("0");
		lbl29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl29.getText().length()!=0){
				lbl29.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl29.getText().length()!=0){
					lbl29.setBackground(Color.WHITE);
					}
			}
		});
		lbl29.setForeground(Color.RED);
		lbl29.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl29.setBackground(Color.WHITE);
		lbl29.setAlignment(Label.CENTER);
		lbl29.setBounds(0, 150, 45, 30);
		panel.add(lbl29);

		lbl30 = new Label("0");
		lbl30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl30.getText().length()!=0){
				lbl30.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl30.getText().length()!=0){
					lbl30.setBackground(Color.WHITE);
					}
			}
		});
		lbl30.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl30.setBackground(Color.WHITE);
		lbl30.setAlignment(Label.CENTER);
		lbl30.setBounds(45, 150, 45, 30);
		panel.add(lbl30);

		lbl37 = new Label("0");
		lbl37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl37.getText().length()!=0){
				lbl37.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl37.getText().length()!=0){
					lbl37.setBackground(Color.WHITE);
					}
			}
		});
		lbl37.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl37.setBackground(Color.WHITE);
		lbl37.setAlignment(Label.CENTER);
		lbl37.setBounds(45, 180, 45, 30);
		panel.add(lbl37);

		lbl38 = new Label("0");
		lbl38.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl38.getText().length()!=0){
				lbl38.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl38.getText().length()!=0){
					lbl38.setBackground(Color.WHITE);
					}
			}
		});
		lbl38.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl38.setBackground(Color.WHITE);
		lbl38.setAlignment(Label.CENTER);
		lbl38.setBounds(90, 180, 45, 30);
		panel.add(lbl38);

		lbl31 = new Label("0");
		lbl31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl31.getText().length()!=0){
				lbl31.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl31.getText().length()!=0){
					lbl31.setBackground(Color.WHITE);
					}
			}
		});
		lbl31.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl31.setBackground(Color.WHITE);
		lbl31.setAlignment(Label.CENTER);
		lbl31.setBounds(90, 150, 45, 30);
		panel.add(lbl31);

		lbl32 = new Label("0");
		lbl32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl32.getText().length()!=0){
				lbl32.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl32.getText().length()!=0){
					lbl32.setBackground(Color.WHITE);
					}
			}
		});
		lbl32.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl32.setBackground(Color.WHITE);
		lbl32.setAlignment(Label.CENTER);
		lbl32.setBounds(135, 150, 45, 30);
		panel.add(lbl32);

		lbl39 = new Label("0");
		lbl39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl39.getText().length()!=0){
				lbl39.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl39.getText().length()!=0){
					lbl39.setBackground(Color.WHITE);
					}
			}
		});
		lbl39.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl39.setBackground(Color.WHITE);
		lbl39.setAlignment(Label.CENTER);
		lbl39.setBounds(135, 180, 45, 30);
		panel.add(lbl39);

		lbl40 = new Label("0");
		lbl40.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl40.getText().length()!=0){
				lbl40.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl40.getText().length()!=0){
					lbl40.setBackground(Color.WHITE);
					}
			}
		});
		lbl40.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl40.setBackground(Color.WHITE);
		lbl40.setAlignment(Label.CENTER);
		lbl40.setBounds(180, 180, 45, 30);
		panel.add(lbl40);

		lbl33 = new Label("0");
		lbl33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl33.getText().length()!=0){
				lbl33.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl33.getText().length()!=0){
					lbl33.setBackground(Color.WHITE);
					}
			}
		});
		lbl33.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl33.setBackground(Color.WHITE);
		lbl33.setAlignment(Label.CENTER);
		lbl33.setBounds(180, 150, 45, 30);
		panel.add(lbl33);

		lbl34 = new Label("0");
		lbl34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl34.getText().length()!=0){
				lbl34.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl34.getText().length()!=0){
					lbl34.setBackground(Color.WHITE);
					}
			}
		});
		lbl34.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl34.setBackground(Color.WHITE);
		lbl34.setAlignment(Label.CENTER);
		lbl34.setBounds(225, 150, 45, 30);
		panel.add(lbl34);

		lbl41 = new Label("0");
		lbl41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl41.getText().length()!=0){
				lbl41.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl41.getText().length()!=0){
					lbl41.setBackground(Color.WHITE);
					}
			}
		});
		lbl41.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl41.setBackground(Color.WHITE);
		lbl41.setAlignment(Label.CENTER);
		lbl41.setBounds(225, 180, 45, 30);
		panel.add(lbl41);

		lbl42 = new Label("0");
		lbl42.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl42.getText().length()!=0){
				lbl42.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl42.getText().length()!=0){
					lbl42.setBackground(Color.WHITE);
					}
			}
		});
		lbl42.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl42.setBackground(Color.WHITE);
		lbl42.setAlignment(Label.CENTER);
		lbl42.setBounds(270, 180, 45, 30);
		panel.add(lbl42);

		lbl35 = new Label("0");
		lbl35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl35.getText().length()!=0){
				lbl35.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl35.getText().length()!=0){
					lbl35.setBackground(Color.WHITE);
					}
			}
		});
		lbl35.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl35.setBackground(Color.WHITE);
		lbl35.setAlignment(Label.CENTER);
		lbl35.setBounds(270, 150, 45, 30);
		panel.add(lbl35);
		cbbMes.setBounds(0, 228, 135, 28);
		panel.add(cbbMes);
		cbbMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				diaAltera = diaFixo;
				calendario();
			}
		});

		cbbMes.setToolTipText("Selecione o m\u00EAs");
		cbbMes.setMaximumRowCount(6);
		cbbMes.setFont(new Font("Arial", Font.PLAIN, 14));
		cbbMes.setBackground(Color.WHITE);
		cbbAno.setBounds(180, 228, 135, 28);
		panel.add(cbbAno);
		cbbAno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					// int x =
					// Integer.parseInt(cbbAno.getSelectedItem().toString());
					diaAltera = diaFixo;
					calendario();
				} catch (Exception x) {
					cbbAno.setSelectedItem(anoFixo);
				}
			}
		});
		cbbAno.setEditable(true);

		cbbAno.setToolTipText("Selecione o ano");
		cbbAno.setFont(new Font("Arial", Font.PLAIN, 14));
		cbbAno.setBackground(Color.WHITE);

		btnVoltar.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent me) {
				btnVoltar.setBackground(new Color(70, 130, 180));
			}

			public void mouseExited(MouseEvent e) {
				btnVoltar.setBackground(new Color(232, 232, 232));
			}
		});

		limpar();
		calendario();
	}

	public void inicializaCalendario() {
		SimpleDateFormat ano = new SimpleDateFormat("yyyy");
		SimpleDateFormat mes = new SimpleDateFormat("MM");
		SimpleDateFormat dia = new SimpleDateFormat("dd");

		anoFixo = Integer.parseInt(ano.format(new Date()));
		mesFixo = Integer.parseInt(mes.format(new Date()));
		diaFixo = Integer.parseInt(dia.format(new Date()));

		// System.out.print(anoFixo);

		int anoMaximo = anoFixo + 50;

		for (int i = 2000; i <= anoMaximo; i++) {
			cbbAno.addItem(i);
		}
		cbbAno.setSelectedItem(anoFixo);

		if (mesFixo == 1) {
			cbbMes.setSelectedIndex(0);
		} else if (mesFixo == 2) {
			cbbMes.setSelectedIndex(1);
		} else if (mesFixo == 3) {
			cbbMes.setSelectedIndex(2);
		} else if (mesFixo == 4) {
			cbbMes.setSelectedIndex(3);
		} else if (mesFixo == 5) {
			cbbMes.setSelectedIndex(4);
		} else if (mesFixo == 6) {
			cbbMes.setSelectedIndex(5);
		} else if (mesFixo == 7) {
			cbbMes.setSelectedIndex(6);
		} else if (mesFixo == 8) {
			cbbMes.setSelectedIndex(7);
		} else if (mesFixo == 9) {
			cbbMes.setSelectedIndex(8);
		} else if (mesFixo == 10) {
			cbbMes.setSelectedIndex(9);
		} else if (mesFixo == 11) {
			cbbMes.setSelectedIndex(10);
		} else if (mesFixo == 12) {
			cbbMes.setSelectedIndex(11);
		}
	}

	public void calendario() {
		lbl1.setText("");
		lbl2.setText("");
		lbl3.setText("");
		lbl4.setText("");
		lbl5.setText("");
		lbl6.setText("");
		lbl7.setText("");
		lbl8.setText("");
		lbl9.setText("");
		lbl10.setText("");
		lbl11.setText("");
		lbl12.setText("");
		lbl13.setText("");
		lbl14.setText("");
		lbl15.setText("");
		lbl16.setText("");
		lbl17.setText("");
		lbl18.setText("");
		lbl19.setText("");
		lbl20.setText("");
		lbl21.setText("");
		lbl22.setText("");
		lbl23.setText("");
		lbl24.setText("");
		lbl25.setText("");
		lbl26.setText("");
		lbl27.setText("");
		lbl28.setText("");
		lbl29.setText("");
		lbl30.setText("");
		lbl31.setText("");
		lbl32.setText("");
		lbl33.setText("");
		lbl34.setText("");
		lbl35.setText("");
		lbl36.setText("");
		lbl37.setText("");
		lbl38.setText("");
		lbl39.setText("");
		lbl40.setText("");
		lbl41.setText("");
		lbl42.setText("");

		diaAltera = diaFixo;
		mesAltera = cbbMes.getSelectedIndex();
		anoAltera = Integer.parseInt(cbbAno.getSelectedItem().toString());

		int totalDiaMes = 0;

		if (mesAltera == 0 || mesAltera == 2 || mesAltera == 4 || mesAltera == 6 || mesAltera == 8 || mesAltera == 10) {
			totalDiaMes = 31;
		} else if (mesAltera == 1) {
			int sum = (anoAltera % 4);
			if (sum == 0) {
				totalDiaMes = 29;
			} else {
				totalDiaMes = 28;
			}
		} else if (mesAltera == 3 || mesAltera == 5 || mesAltera == 7 || mesAltera == 9 || mesAltera == 11) {
			totalDiaMes = 30;
		}

		Calendar calendar = Calendar.getInstance();
		calendar.set(anoAltera, mesAltera, 1);
		int setDia = 0;

		int semana = calendar.get(Calendar.DAY_OF_WEEK);
		if (semana == Calendar.SUNDAY) {
			setDia = 1;
		} else if (semana == Calendar.MONDAY) {
			setDia = 2;
		} else if (semana == Calendar.TUESDAY) {
			setDia = 3;
		} else if (semana == Calendar.WEDNESDAY) {
			setDia = 4;
		} else if (semana == Calendar.THURSDAY) {
			setDia = 5;
		} else if (semana == Calendar.FRIDAY) {
			setDia = 6;
		} else if (semana == Calendar.SATURDAY) {
			setDia = 7;
		}

		for (int i = 1; i <= totalDiaMes; i++) {
			switch (setDia) {
			case 1:
				lbl1.setText("" + i);
				break;
			case 2:
				lbl2.setText("" + i);
				break;
			case 3:
				lbl3.setText("" + i);
				break;
			case 4:
				lbl4.setText("" + i);
				break;
			case 5:
				lbl5.setText("" + i);
				break;
			case 6:
				lbl6.setText("" + i);
				break;
			case 7:
				lbl7.setText("" + i);
				break;
			case 8:
				lbl8.setText("" + i);
				break;
			case 9:
				lbl9.setText("" + i);
				break;
			case 10:
				lbl10.setText("" + i);
				break;
			case 11:
				lbl11.setText("" + i);
				break;
			case 12:
				lbl12.setText("" + i);
				break;
			case 13:
				lbl13.setText("" + i);
				break;
			case 14:
				lbl14.setText("" + i);
				break;
			case 15:
				lbl15.setText("" + i);
				break;
			case 16:
				lbl16.setText("" + i);
				break;
			case 17:
				lbl17.setText("" + i);
				break;
			case 18:
				lbl18.setText("" + i);
				break;
			case 19:
				lbl19.setText("" + i);
				break;
			case 20:
				lbl20.setText("" + i);
				break;
			case 21:
				lbl21.setText("" + i);
				break;
			case 22:
				lbl22.setText("" + i);
				break;
			case 23:
				lbl23.setText("" + i);
				break;
			case 24:
				lbl24.setText("" + i);
				break;
			case 25:
				lbl25.setText("" + i);
				break;
			case 26:
				lbl26.setText("" + i);
				break;
			case 27:
				lbl27.setText("" + i);
				break;
			case 28:
				lbl28.setText("" + i);
				break;
			case 29:
				lbl29.setText("" + i);
				break;
			case 30:
				lbl30.setText("" + i);
				break;
			case 31:
				lbl31.setText("" + i);
				break;
			case 32:
				lbl32.setText("" + i);
				break;
			case 33:
				lbl33.setText("" + i);
				break;
			case 34:
				lbl34.setText("" + i);
				break;
			case 35:
				lbl35.setText("" + i);
				break;
			case 36:
				lbl36.setText("" + i);
				break;
			case 37:
				lbl37.setText("" + i);
				break;
			case 38:
				lbl38.setText("" + i);
				break;
			case 39:
				lbl39.setText("" + i);
				break;
			case 40:
				lbl40.setText("" + i);
				break;
			case 41:
				lbl41.setText("" + i);
				break;
			case 42:
				lbl42.setText("" + i);
				break;
			}
			setDia++;
		}
	}

	public void limpar() {

		btnCadastrar.setEnabled(false);
		btnCancelar.setEnabled(false);
		btnNovo.setEnabled(true);
		btnVoltar.setEnabled(true);
	}
}
