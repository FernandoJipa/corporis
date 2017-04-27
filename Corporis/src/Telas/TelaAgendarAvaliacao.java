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
import javax.swing.JLabel;

import java.awt.Panel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import RegrasDeNegocio.LimitandoCaracteresTXT;
import javax.swing.JTextField;

public class TelaAgendarAvaliacao extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	boolean verificaClique1 = false;
	boolean verificaClique2 = false;
	boolean verificaClique3 = false;
	boolean verificaClique4 = false;
	boolean verificaClique5 = false;
	boolean verificaClique6 = false;
	boolean verificaClique7 = false;
	boolean verificaClique8 = false;
	boolean verificaClique9 = false;
	boolean verificaClique10 = false;
	boolean verificaClique11 = false;
	boolean verificaClique12 = false;
	boolean verificaClique13 = false;
	boolean verificaClique14 = false;
	boolean verificaClique15 = false;
	boolean verificaClique16 = false;
	boolean verificaClique17 = false;
	boolean verificaClique18 = false;
	boolean verificaClique19 = false;
	boolean verificaClique20 = false;
	boolean verificaClique21 = false;
	boolean verificaClique22 = false;
	boolean verificaClique23 = false;
	boolean verificaClique24 = false;
	boolean verificaClique25 = false;
	boolean verificaClique26 = false;
	boolean verificaClique27 = false;
	boolean verificaClique28 = false;
	boolean verificaClique29 = false;
	boolean verificaClique30 = false;
	boolean verificaClique31 = false;
	boolean verificaClique32 = false;
	boolean verificaClique33 = false;
	boolean verificaClique34 = false;
	boolean verificaClique35 = false;
	boolean verificaClique36 = false;
	boolean verificaClique37 = false;
	boolean verificaClique38 = false;
	boolean verificaClique39 = false;
	boolean verificaClique41 = false;
	boolean verificaClique42 = false;
	boolean verificaClique40 = false;
	
	private String nomeMes = "Dezembro", nomeDia = "Terça-Feira";
	
	private JButton btnNovo, btnCadastrar, btnCancelar, btnVoltar;
	private JLabel lblDomingo;
	private JLabel lblSegunda;
	private JLabel lblTerca;
	private JLabel lblQuarta;
	private JLabel lblQuinta;
	private JLabel lblSexta;
	private JLabel lblSabado;
	private JLabel lbl1;
	private JLabel lbl2;
	private JLabel lbl3;
	private JLabel lbl4;
	private JLabel lbl5;
	private JLabel lbl6;
	private JLabel lbl7;
	private JLabel lbl8;
	private JLabel lbl9;
	private JLabel lbl10;
	private JLabel lbl11;
	private JLabel lbl12;
	private JLabel lbl13;
	private JLabel lbl14;
	private JLabel lbl22;
	private JLabel lbl23;
	private JLabel lbl16;
	private JLabel lbl15;
	private JLabel lbl17;
	private JLabel lbl24;
	private JLabel lbl25;
	private JLabel lbl18;
	private JLabel lbl19;
	private JLabel lbl26;
	private JLabel lbl27;
	private JLabel lbl20;
	private JLabel lbl21;
	private JLabel lbl28;
	private JLabel lbl36;
	private JLabel lbl29;
	private JLabel lbl30;
	private JLabel lbl37;
	private JLabel lbl38;
	private JLabel lbl31;
	private JLabel lbl32;
	private JLabel lbl39;
	private JLabel lbl40;
	private JLabel lbl33;
	private JLabel lbl34;
	private JLabel lbl41;
	private JLabel lbl42;
	private JLabel lbl35;

	private int anoFixo = 0, mesFixo = 0, diaFixo = 0, diaAltera = 0, mesAltera = 0, anoAltera = 0;

	private String meses[] = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
			"Outubro", "Novembro", "Dezembro" };

	private JComboBox<Object> cbbAno = new JComboBox<Object>(), cbbMes = new JComboBox<Object>(meses);
	
	private Color corPassaMouse = new Color(240, 240, 240), corClicaMouse = new Color(250, 128, 114), vermelhoCalendario = new Color(237, 38, 45);

	private Panel panel = new Panel();
	private JLabel lblDiaSemana;
	private JLabel lblSelecionaMes;
	private JLabel lblSelecionaAno;
	private JLabel lblSelecionaDia;
	private JLabel lblDiaSelecionado;
	private JTextField lblNomeProfessor;
	private JTextField textField_1;

	/**
	 * Create the panel.
	 */
	public TelaAgendarAvaliacao() {
		getContentPane().setLayout(null);
		setSize(1024, 650);
		setTitle("Agendar avaliação física");
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
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(diaAltera);
				System.out.println(diaFixo);
				System.out.println(mesAltera);
				System.out.println(mesFixo);
				System.out.println(anoAltera);
				System.out.println(anoAltera);
			}
		});

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
		panel.setBounds(28, 41, 316, 267);
		getContentPane().add(panel);

		lblDomingo = new JLabel("Dom");
		lblDomingo.setForeground(Color.WHITE);
		lblDomingo.setBackground(vermelhoCalendario);
		lblDomingo.setHorizontalAlignment(JLabel.CENTER);
		lblDomingo.setFont(new Font("Arial", Font.BOLD, 14));
		lblDomingo.setBounds(0, 0, 45, 30);
		panel.add(lblDomingo);

		lblSegunda = new JLabel("Seg");
		lblSegunda.setForeground(Color.WHITE);
		lblSegunda.setBackground(vermelhoCalendario);
		lblSegunda.setFont(new Font("Arial", Font.BOLD, 14));
		lblSegunda.setHorizontalAlignment(JLabel.CENTER);
		lblSegunda.setBounds(45, 0, 45, 30);
		panel.add(lblSegunda);

		lblTerca = new JLabel("Ter");
		lblTerca.setForeground(Color.WHITE);
		lblTerca.setBackground(vermelhoCalendario);
		lblTerca.setFont(new Font("Arial", Font.BOLD, 14));
		lblTerca.setHorizontalAlignment(JLabel.CENTER);
		lblTerca.setBounds(90, 0, 45, 30);
		panel.add(lblTerca);

		lblQuarta = new JLabel("Qua");
		lblQuarta.setForeground(Color.WHITE);
		lblQuarta.setBackground(vermelhoCalendario);
		lblQuarta.setFont(new Font("Arial", Font.BOLD, 14));
		lblQuarta.setHorizontalAlignment(JLabel.CENTER);
		lblQuarta.setBounds(135, 0, 45, 30);
		panel.add(lblQuarta);

		lblQuinta = new JLabel("Qui");
		lblQuinta.setForeground(Color.WHITE);
		lblQuinta.setBackground(vermelhoCalendario);
		lblQuinta.setFont(new Font("Arial", Font.BOLD, 14));
		lblQuinta.setHorizontalAlignment(JLabel.CENTER);
		lblQuinta.setBounds(180, 0, 45, 30);
		panel.add(lblQuinta);

		lblSexta = new JLabel("Sex");
		lblSexta.setForeground(Color.WHITE);
		lblSexta.setBackground(vermelhoCalendario);
		lblSexta.setFont(new Font("Arial", Font.BOLD, 14));
		lblSexta.setHorizontalAlignment(JLabel.CENTER);
		lblSexta.setBounds(225, 0, 45, 30);
		panel.add(lblSexta);

		lblSabado = new JLabel("S\u00E1b");
		lblSabado.setForeground(Color.WHITE);
		lblSabado.setBackground(vermelhoCalendario);
		lblSabado.setFont(new Font("Arial", Font.BOLD, 14));
		lblSabado.setHorizontalAlignment(JLabel.CENTER);
		lblSabado.setBounds(270, 0, 45, 30);
		panel.add(lblSabado);

		lbl1 = new JLabel("0");
		lbl1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl1.getText().length()!=0 && verificaClique1 == false){
				lbl1.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl1.getText().length()!=0 && verificaClique1 == false){
					lbl1.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl1.getText().length()!=0 && verificaClique1 == false){
					lbl1.setBackground(corClicaMouse);
					verificaClique1 = true;
					
					diaAltera = Integer.parseInt(lbl1.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl1.setForeground(vermelhoCalendario);
		lbl1.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl1.setBackground(Color.WHITE);
		lbl1.setHorizontalAlignment(JLabel.CENTER);
		lbl1.setBounds(0, 30, 45, 30);
		panel.add(lbl1);

		lbl2 = new JLabel("0");
		lbl2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl2.getText().length()!=0 && verificaClique2 == false){
				lbl2.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl2.getText().length()!=0 && verificaClique2 == false){
					lbl2.setBackground(Color.WHITE);
				}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl2.getText().length()!=0 && verificaClique2 == false){
					lbl2.setBackground(corClicaMouse);
					verificaClique2 = true;
					
					diaAltera = Integer.parseInt(lbl2.getText());
					
					verificaClique1 = false;
					verificaClique3 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl2.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl2.setBackground(Color.WHITE);
		lbl2.setHorizontalAlignment(JLabel.CENTER);
		lbl2.setBounds(45, 30, 45, 30);
		panel.add(lbl2);

		lbl3 = new JLabel("0");
		lbl3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl3.getText().length()!=0 && verificaClique3 == false){
				lbl3.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl3.getText().length()!=0 && verificaClique3 == false){
					lbl3.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl3.getText().length()!=0 && verificaClique3 == false){
					lbl3.setBackground(corClicaMouse);
					verificaClique3 = true;
					
					diaAltera = Integer.parseInt(lbl3.getText());
					
					verificaClique1 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl3.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl3.setBackground(Color.WHITE);
		lbl3.setHorizontalAlignment(JLabel.CENTER);
		lbl3.setBounds(90, 30, 45, 30);
		panel.add(lbl3);

		lbl4 = new JLabel("0");
		lbl4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl4.getText().length()!=0 && verificaClique4 == false){
				lbl4.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl4.getText().length()!=0 && verificaClique4 == false){
					lbl4.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl4.getText().length()!=0 && verificaClique4 == false){
					lbl4.setBackground(corClicaMouse);
					verificaClique4 = true;
					
					diaAltera = Integer.parseInt(lbl4.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl4.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl4.setBackground(Color.WHITE);
		lbl4.setHorizontalAlignment(JLabel.CENTER);
		lbl4.setBounds(135, 30, 45, 30);
		panel.add(lbl4);

		lbl5 = new JLabel("0");
		lbl5.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl5.getText().length()!=0 && verificaClique5 == false){
				lbl5.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl5.getText().length()!=0 && verificaClique5 == false){
					lbl5.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl5.getText().length()!=0 && verificaClique5 == false){
					lbl5.setBackground(corClicaMouse);
					verificaClique5 = true;
					
					diaAltera = Integer.parseInt(lbl5.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique4 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
			
		});
		lbl5.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl5.setBackground(Color.WHITE);
		lbl5.setHorizontalAlignment(JLabel.CENTER);
		lbl5.setBounds(180, 30, 45, 30);
		panel.add(lbl5);

		lbl6 = new JLabel("0");
		lbl6.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl6.getText().length()!=0 && verificaClique6 == false){
				lbl6.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl6.getText().length()!=0 && verificaClique6 == false){
					lbl6.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl6.getText().length()!=0 && verificaClique6 == false){
					lbl6.setBackground(corClicaMouse);
					verificaClique6 = true;
					
					diaAltera = Integer.parseInt(lbl6.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique4 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl6.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl6.setBackground(Color.WHITE);
		lbl6.setHorizontalAlignment(JLabel.CENTER);
		lbl6.setBounds(225, 30, 45, 30);
		panel.add(lbl6);

		lbl7 = new JLabel("0");
		lbl7.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl7.getText().length()!=0 && verificaClique7 == false){
				lbl7.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl7.getText().length()!=0 && verificaClique7 == false){
					lbl7.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl7.getText().length()!=0 && verificaClique7 == false){
					lbl7.setBackground(corClicaMouse);
					verificaClique7 = true;
					
					diaAltera = Integer.parseInt(lbl7.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique4 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl7.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl7.setBackground(Color.WHITE);
		lbl7.setHorizontalAlignment(JLabel.CENTER);
		lbl7.setBounds(270, 30, 45, 30);
		panel.add(lbl7);

		lbl8 = new JLabel("0");
		lbl8.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl8.getText().length()!=0 && verificaClique8 == false){
				lbl8.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl8.getText().length()!=0 && verificaClique8 == false){
					lbl8.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl8.getText().length()!=0 && verificaClique8 == false){
					lbl8.setBackground(corClicaMouse);
					verificaClique8 = true;
					
					diaAltera = Integer.parseInt(lbl8.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique4 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl8.setForeground(vermelhoCalendario);
		lbl8.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl8.setBackground(Color.WHITE);
		lbl8.setHorizontalAlignment(JLabel.CENTER);
		lbl8.setBounds(0, 60, 45, 30);
		panel.add(lbl8);

		lbl9 = new JLabel("0");
		lbl9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl9.getText().length()!=0 && verificaClique9 == false){
				lbl9.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl9.getText().length()!=0 && verificaClique9 == false){
					lbl9.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl9.getText().length()!=0 && verificaClique9 == false){
					lbl9.setBackground(corClicaMouse);
					verificaClique9 = true;
					
					diaAltera = Integer.parseInt(lbl9.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique4 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl9.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl9.setBackground(Color.WHITE);
		lbl9.setHorizontalAlignment(JLabel.CENTER);
		lbl9.setBounds(45, 60, 45, 30);
		panel.add(lbl9);

		lbl10 = new JLabel("0");
		lbl10.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl10.getText().length()!=0 && verificaClique10 == false){
				lbl10.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl10.getText().length()!=0 && verificaClique10 == false){
					lbl10.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl10.getText().length()!=0 && verificaClique10 == false){
					lbl10.setBackground(corClicaMouse);
					verificaClique10 = true;
					
					diaAltera = Integer.parseInt(lbl10.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique4 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl10.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl10.setBackground(Color.WHITE);
		lbl10.setHorizontalAlignment(JLabel.CENTER);
		lbl10.setBounds(90, 60, 45, 30);
		panel.add(lbl10);

		lbl11 = new JLabel("0");
		lbl11.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl11.getText().length()!=0 && verificaClique11 == false){
				lbl11.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl11.getText().length()!=0 && verificaClique11 == false){
					lbl11.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl11.getText().length()!=0 && verificaClique11 == false){
					lbl11.setBackground(corClicaMouse);
					verificaClique11 = true;
					
					diaAltera = Integer.parseInt(lbl11.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique4 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl11.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl11.setBackground(Color.WHITE);
		lbl11.setHorizontalAlignment(JLabel.CENTER);
		lbl11.setBounds(135, 60, 45, 30);
		panel.add(lbl11);

		lbl12 = new JLabel("0");
		lbl12.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl12.getText().length()!=0 && verificaClique12 == false){
				lbl12.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl12.getText().length()!=0 && verificaClique12 == false){
					lbl12.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl12.getText().length()!=0 && verificaClique12 == false){
					lbl12.setBackground(corClicaMouse);
					verificaClique12 = true;
					
					diaAltera = Integer.parseInt(lbl12.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique4 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl12.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl12.setBackground(Color.WHITE);
		lbl12.setHorizontalAlignment(JLabel.CENTER);
		lbl12.setBounds(180, 60, 45, 30);
		panel.add(lbl12);

		lbl13 = new JLabel("0");
		lbl13.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl13.getText().length()!=0 && verificaClique13 == false){
				lbl13.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl13.getText().length()!=0 && verificaClique13 == false){
					lbl13.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl13.getText().length()!=0 && verificaClique13 == false){
					lbl13.setBackground(corClicaMouse);
					verificaClique13 = true;
					
					diaAltera = Integer.parseInt(lbl13.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique4 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl13.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl13.setBackground(Color.WHITE);
		lbl13.setHorizontalAlignment(JLabel.CENTER);
		lbl13.setBounds(225, 60, 45, 30);
		panel.add(lbl13);

		lbl14 = new JLabel("0");
		lbl14.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl14.getText().length()!=0 && verificaClique14 == false){
				lbl14.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl14.getText().length()!=0 && verificaClique14 == false){
					lbl14.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl14.getText().length()!=0 && verificaClique14 == false){
					lbl14.setBackground(corClicaMouse);
					verificaClique14 = true;
					
					diaAltera = Integer.parseInt(lbl14.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique4 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl14.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl14.setBackground(Color.WHITE);
		lbl14.setHorizontalAlignment(JLabel.CENTER);
		lbl14.setBounds(270, 60, 45, 30);
		panel.add(lbl14);

		lbl22 = new JLabel("0");
		lbl22.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl22.getText().length()!=0 && verificaClique22 == false){
				lbl22.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl22.getText().length()!=0 && verificaClique22 == false){
					lbl22.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl22.getText().length()!=0 && verificaClique22 == false){
					lbl22.setBackground(corClicaMouse);
					verificaClique22 = true;
					
					diaAltera = Integer.parseInt(lbl22.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique4 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl22.setForeground(vermelhoCalendario);
		lbl22.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl22.setBackground(Color.WHITE);
		lbl22.setHorizontalAlignment(JLabel.CENTER);
		lbl22.setBounds(0, 120, 45, 30);
		panel.add(lbl22);

		lbl23 = new JLabel("0");
		lbl23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl23.getText().length()!=0 && verificaClique23 == false){
				lbl23.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl23.getText().length()!=0 && verificaClique23 == false){
					lbl23.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl23.getText().length()!=0 && verificaClique23 == false){
					lbl23.setBackground(corClicaMouse);
					verificaClique23 = true;
					
					diaAltera = Integer.parseInt(lbl23.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique4 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl23.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl23.setBackground(Color.WHITE);
		lbl23.setHorizontalAlignment(JLabel.CENTER);
		lbl23.setBounds(45, 120, 45, 30);
		panel.add(lbl23);

		lbl16 = new JLabel("0");
		lbl16.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl16.getText().length()!=0 && verificaClique16 == false){
				lbl16.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl16.getText().length()!=0 && verificaClique16 == false){
					lbl16.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl16.getText().length()!=0 && verificaClique16 == false){
					lbl16.setBackground(corClicaMouse);
					verificaClique16 = true;
					
					diaAltera = Integer.parseInt(lbl16.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique4 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl16.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl16.setBackground(Color.WHITE);
		lbl16.setHorizontalAlignment(JLabel.CENTER);
		lbl16.setBounds(45, 90, 45, 30);
		panel.add(lbl16);

		lbl15 = new JLabel("0");
		lbl15.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl15.getText().length()!=0 && verificaClique15 == false){
				lbl15.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl15.getText().length()!=0 && verificaClique15 == false){
					lbl15.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl15.getText().length()!=0 && verificaClique15 == false){
					lbl15.setBackground(corClicaMouse);
					verificaClique15 = true;
					
					diaAltera = Integer.parseInt(lbl15.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique4 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl15.setForeground(vermelhoCalendario);
		lbl15.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl15.setBackground(Color.WHITE);
		lbl15.setHorizontalAlignment(JLabel.CENTER);
		lbl15.setBounds(0, 90, 45, 30);
		panel.add(lbl15);

		lbl17 = new JLabel("0");
		lbl17.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl17.getText().length()!=0 && verificaClique17 == false){
				lbl17.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl17.getText().length()!=0 && verificaClique17 == false){
					lbl17.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl17.getText().length()!=0 && verificaClique17 == false){
					lbl17.setBackground(corClicaMouse);
					verificaClique17 = true;
					
					diaAltera = Integer.parseInt(lbl17.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique4 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl17.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl17.setBackground(Color.WHITE);
		lbl17.setHorizontalAlignment(JLabel.CENTER);
		lbl17.setBounds(90, 90, 45, 30);
		panel.add(lbl17);

		lbl24 = new JLabel("0");
		lbl24.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl24.getText().length()!=0 && verificaClique24 == false){
				lbl24.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl24.getText().length()!=0 && verificaClique24 == false){
					lbl24.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl24.getText().length()!=0 && verificaClique24 == false){
					lbl24.setBackground(corClicaMouse);
					verificaClique24 = true;
					
					diaAltera = Integer.parseInt(lbl24.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique4 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl24.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl24.setBackground(Color.WHITE);
		lbl24.setHorizontalAlignment(JLabel.CENTER);
		lbl24.setBounds(90, 120, 45, 30);
		panel.add(lbl24);

		lbl25 = new JLabel("0");
		lbl25.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl25.getText().length()!=0 && verificaClique25 == false){
				lbl25.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl25.getText().length()!=0 && verificaClique25 == false){
					lbl25.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl25.getText().length()!=0 && verificaClique25 == false){
					lbl25.setBackground(corClicaMouse);
					verificaClique25 = true;
					
					diaAltera = Integer.parseInt(lbl25.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique4 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl25.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl25.setBackground(Color.WHITE);
		lbl25.setHorizontalAlignment(JLabel.CENTER);
		lbl25.setBounds(135, 120, 45, 30);
		panel.add(lbl25);

		lbl18 = new JLabel("0");
		lbl18.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl18.getText().length()!=0 && verificaClique18 == false){
				lbl18.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl18.getText().length()!=0 && verificaClique18 == false){
					lbl18.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl18.getText().length()!=0 && verificaClique18 == false){
					lbl18.setBackground(corClicaMouse);
					verificaClique18 = true;
					
					diaAltera = Integer.parseInt(lbl18.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique4 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl18.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl18.setBackground(Color.WHITE);
		lbl18.setHorizontalAlignment(JLabel.CENTER);
		lbl18.setBounds(135, 90, 45, 30);
		panel.add(lbl18);

		lbl19 = new JLabel("0");
		lbl19.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl19.getText().length()!=0 && verificaClique19 == false){
				lbl19.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl19.getText().length()!=0 && verificaClique19 == false){
					lbl19.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl19.getText().length()!=0 && verificaClique19 == false){
					lbl19.setBackground(corClicaMouse);
					verificaClique19 = true;
					
					diaAltera = Integer.parseInt(lbl19.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique4 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl19.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl19.setBackground(Color.WHITE);
		lbl19.setHorizontalAlignment(JLabel.CENTER);
		lbl19.setBounds(180, 90, 45, 30);
		panel.add(lbl19);

		lbl26 = new JLabel("0");
		lbl26.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl26.getText().length()!=0 && verificaClique26 == false){
				lbl26.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl26.getText().length()!=0 && verificaClique26 == false){
					lbl26.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl26.getText().length()!=0 && verificaClique26 == false){
					lbl26.setBackground(corClicaMouse);
					verificaClique26 = true;
					
					diaAltera = Integer.parseInt(lbl26.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique1 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique4 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl26.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl26.setBackground(Color.WHITE);
		lbl26.setHorizontalAlignment(JLabel.CENTER);
		lbl26.setBounds(180, 120, 45, 30);
		panel.add(lbl26);

		lbl27 = new JLabel("0");
		lbl27.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl27.getText().length()!=0 && verificaClique27 == false){
				lbl27.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl27.getText().length()!=0 && verificaClique27 == false){
					lbl27.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl27.getText().length()!=0 && verificaClique27 == false){
					lbl27.setBackground(corClicaMouse);
					verificaClique27 = true;
					
					diaAltera = Integer.parseInt(lbl27.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique1 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl27.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl27.setBackground(Color.WHITE);
		lbl27.setHorizontalAlignment(JLabel.CENTER);
		lbl27.setBounds(225, 120, 45, 30);
		panel.add(lbl27);

		lbl20 = new JLabel("0");
		lbl20.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl20.getText().length()!=0 && verificaClique20 == false){
				lbl20.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl20.getText().length()!=0 && verificaClique20 == false){
					lbl20.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl20.getText().length()!=0 && verificaClique20 == false){
					lbl20.setBackground(corClicaMouse);
					verificaClique20 = true;
					
					diaAltera = Integer.parseInt(lbl20.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique1 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl20.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl20.setBackground(Color.WHITE);
		lbl20.setHorizontalAlignment(JLabel.CENTER);
		lbl20.setBounds(225, 90, 45, 30);
		panel.add(lbl20);

		lbl21 = new JLabel("0");
		lbl21.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl21.getText().length()!=0 && verificaClique21 == false){
				lbl21.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl21.getText().length()!=0 && verificaClique21 == false){
					lbl21.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl21.getText().length()!=0 && verificaClique21 == false){
					lbl21.setBackground(corClicaMouse);
					verificaClique21 = true;
					
					diaAltera = Integer.parseInt(lbl21.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique1 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl21.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl21.setBackground(Color.WHITE);
		lbl21.setHorizontalAlignment(JLabel.CENTER);
		lbl21.setBounds(270, 90, 45, 30);
		panel.add(lbl21);

		lbl28 = new JLabel("0");
		lbl28.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl28.getText().length()!=0 && verificaClique28 == false){
				lbl28.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl28.getText().length()!=0 && verificaClique28 == false){
					lbl28.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl28.getText().length()!=0 && verificaClique28 == false){
					lbl28.setBackground(corClicaMouse);
					verificaClique28 = true;
					
					diaAltera = Integer.parseInt(lbl28.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique1 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl28.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl28.setBackground(Color.WHITE);
		lbl28.setHorizontalAlignment(JLabel.CENTER);
		lbl28.setBounds(270, 120, 45, 30);
		panel.add(lbl28);

		lbl36 = new JLabel("0");
		lbl36.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl36.getText().length()!=0 && verificaClique36 == false){
				lbl36.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl36.getText().length()!=0 && verificaClique36 == false){
					lbl36.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl36.getText().length()!=0 && verificaClique36 == false){
					lbl36.setBackground(corClicaMouse);
					verificaClique36 = true;
					
					diaAltera = Integer.parseInt(lbl36.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique1 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl36.setForeground(vermelhoCalendario);
		lbl36.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl36.setBackground(Color.WHITE);
		lbl36.setHorizontalAlignment(JLabel.CENTER);
		lbl36.setBounds(0, 180, 45, 30);
		panel.add(lbl36);

		lbl29 = new JLabel("0");
		lbl29.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl29.getText().length()!=0 && verificaClique29 == false){
				lbl29.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl29.getText().length()!=0 && verificaClique29 == false){
					lbl29.setBackground(Color.WHITE);
					}
			}public void mouseClicked(MouseEvent arg0){
				if(lbl29.getText().length()!=0 && verificaClique29 == false){
					lbl29.setBackground(corClicaMouse);
					verificaClique29 = true;
					
					diaAltera = Integer.parseInt(lbl29.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique1 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl29.setForeground(vermelhoCalendario);
		lbl29.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl29.setBackground(Color.WHITE);
		lbl29.setHorizontalAlignment(JLabel.CENTER);
		lbl29.setBounds(0, 150, 45, 30);
		panel.add(lbl29);

		lbl30 = new JLabel("0");
		lbl30.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl30.getText().length()!=0 && verificaClique30 == false){
				lbl30.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl30.getText().length()!=0 && verificaClique30 == false){
					lbl30.setBackground(Color.WHITE);
					}
			}public void mouseClicked(MouseEvent arg0){
				if(lbl30.getText().length()!=0 && verificaClique30 == false){
					lbl30.setBackground(corClicaMouse);
					verificaClique30 = true;
					
					diaAltera = Integer.parseInt(lbl30.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique1 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl30.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl30.setBackground(Color.WHITE);
		lbl30.setHorizontalAlignment(JLabel.CENTER);
		lbl30.setBounds(45, 150, 45, 30);
		panel.add(lbl30);

		lbl37 = new JLabel("0");
		lbl37.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl37.getText().length()!=0 && verificaClique37 == false){
				lbl37.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl37.getText().length()!=0 && verificaClique37 == false){
					lbl37.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl37.getText().length()!=0 && verificaClique37 == false){
					lbl37.setBackground(corClicaMouse);
					verificaClique37 = true;
					
					diaAltera = Integer.parseInt(lbl37.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique1 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl37.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl37.setBackground(Color.WHITE);
		lbl37.setHorizontalAlignment(JLabel.CENTER);
		lbl37.setBounds(45, 180, 45, 30);
		panel.add(lbl37);

		lbl38 = new JLabel("0");
		lbl38.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl38.getText().length()!=0 && verificaClique38 == false){
				lbl38.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl38.getText().length()!=0 && verificaClique38 == false){
					lbl38.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl38.getText().length()!=0 && verificaClique38 == false){
					lbl38.setBackground(corClicaMouse);
					verificaClique38 = true;
					
					diaAltera = Integer.parseInt(lbl38.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique1 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl38.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl38.setBackground(Color.WHITE);
		lbl38.setHorizontalAlignment(JLabel.CENTER);
		lbl38.setBounds(90, 180, 45, 30);
		panel.add(lbl38);

		lbl31 = new JLabel("0");
		lbl31.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl31.getText().length()!=0 && verificaClique31 == false){
				lbl31.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl31.getText().length()!=0 && verificaClique31 == false){
					lbl31.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl31.getText().length()!=0 && verificaClique31 == false){
					lbl31.setBackground(corClicaMouse);
					verificaClique31 = true;
					
					diaAltera = Integer.parseInt(lbl31.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique1 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl31.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl31.setBackground(Color.WHITE);
		lbl31.setHorizontalAlignment(JLabel.CENTER);
		lbl31.setBounds(90, 150, 45, 30);
		panel.add(lbl31);

		lbl32 = new JLabel("0");
		lbl32.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl32.getText().length()!=0 && verificaClique32 == false){
				lbl32.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl32.getText().length()!=0 && verificaClique32 == false){
					lbl32.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl32.getText().length()!=0 && verificaClique32 == false){
					lbl32.setBackground(corClicaMouse);
					verificaClique32 = true;
					
					diaAltera = Integer.parseInt(lbl32.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique1 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl32.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl32.setBackground(Color.WHITE);
		lbl32.setHorizontalAlignment(JLabel.CENTER);
		lbl32.setBounds(135, 150, 45, 30);
		panel.add(lbl32);

		lbl39 = new JLabel("0");
		lbl39.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl39.getText().length()!=0 && verificaClique39 == false){
				lbl39.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl39.getText().length()!=0 && verificaClique39 == false){
					lbl39.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl39.getText().length()!=0 && verificaClique39 == false){
					lbl39.setBackground(corClicaMouse);
					verificaClique39 = true;
					
					diaAltera = Integer.parseInt(lbl39.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique1 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl39.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl39.setBackground(Color.WHITE);
		lbl39.setHorizontalAlignment(JLabel.CENTER);
		lbl39.setBounds(135, 180, 45, 30);
		panel.add(lbl39);

		lbl40 = new JLabel("0");
		lbl40.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl40.getText().length()!=0 && verificaClique40 == false){
				lbl40.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl40.getText().length()!=0 && verificaClique40 == false){
					lbl40.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl40.getText().length()!=0 && verificaClique40 == false){
					lbl40.setBackground(corClicaMouse);
					verificaClique40 = true;
					
					diaAltera = Integer.parseInt(lbl40.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique1 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl40.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl40.setBackground(Color.WHITE);
		lbl40.setHorizontalAlignment(JLabel.CENTER);
		lbl40.setBounds(180, 180, 45, 30);
		panel.add(lbl40);

		lbl33 = new JLabel("0");
		lbl33.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl33.getText().length()!=0 && verificaClique33 == false){
				lbl33.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl33.getText().length()!=0 && verificaClique33 == false){
					lbl33.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl33.getText().length()!=0 && verificaClique33 == false){
					lbl33.setBackground(corClicaMouse);
					verificaClique33 = true;
					
					diaAltera = Integer.parseInt(lbl33.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique1 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl33.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl33.setBackground(Color.WHITE);
		lbl33.setHorizontalAlignment(JLabel.CENTER);
		lbl33.setBounds(180, 150, 45, 30);
		panel.add(lbl33);

		lbl34 = new JLabel("0");
		lbl34.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl34.getText().length()!=0 && verificaClique34 == false){
				lbl34.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl34.getText().length()!=0 && verificaClique34 == false){
					lbl34.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl34.getText().length()!=0 && verificaClique34 == false){
					lbl34.setBackground(corClicaMouse);
					verificaClique34 = true;
					
					diaAltera = Integer.parseInt(lbl34.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique1 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl34.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl34.setBackground(Color.WHITE);
		lbl34.setHorizontalAlignment(JLabel.CENTER);
		lbl34.setBounds(225, 150, 45, 30);
		panel.add(lbl34);

		lbl41 = new JLabel("0");
		lbl41.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl41.getText().length()!=0 && verificaClique41 == false){
				lbl41.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl41.getText().length()!=0 && verificaClique41 == false){
					lbl41.setBackground(Color.WHITE);
					}
			}public void mouseClicked(MouseEvent arg0){
				if(lbl41.getText().length()!=0 && verificaClique41 == false){
					lbl41.setBackground(corClicaMouse);
					verificaClique41 = true;
					
					diaAltera = Integer.parseInt(lbl41.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique1 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl41.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl41.setBackground(Color.WHITE);
		lbl41.setHorizontalAlignment(JLabel.CENTER);
		lbl41.setBounds(225, 180, 45, 30);
		panel.add(lbl41);

		lbl42 = new JLabel("0");
		lbl42.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl42.getText().length()!=0 && verificaClique42 == false){
				lbl42.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl42.getText().length()!=0 && verificaClique42 == false){
					lbl42.setBackground(Color.WHITE);
					}
			}
			public void mouseClicked(MouseEvent arg0){
				if(lbl42.getText().length()!=0 && verificaClique42 == false){
					lbl42.setBackground(corClicaMouse);
					verificaClique42 = true;
					
					diaAltera = Integer.parseInt(lbl42.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique35 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique1 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl42.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl42.setBackground(Color.WHITE);
		lbl42.setHorizontalAlignment(JLabel.CENTER);
		lbl42.setBounds(270, 180, 45, 30);
		panel.add(lbl42);

		lbl35 = new JLabel("0");
		lbl35.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseEntered(MouseEvent arg0) {
				if(lbl35.getText().length()!=0 && verificaClique35 == false){
				lbl35.setBackground(corPassaMouse);
				}
			}
			public void mouseExited(MouseEvent arg0) {
				if(lbl35.getText().length()!=0 && verificaClique35 == false){
					lbl35.setBackground(Color.WHITE);
					}
			}public void mouseClicked(MouseEvent arg0){
				if(lbl35.getText().length()!=0 && verificaClique35 == false){
					lbl35.setBackground(corClicaMouse);
					verificaClique35 = true;
					
					diaAltera = Integer.parseInt(lbl35.getText());
					
					verificaClique3 = false;
					verificaClique2 = false;
					verificaClique4 = false;
					verificaClique5 = false;
					verificaClique6 = false;
					verificaClique7 = false;
					verificaClique8 = false;
					verificaClique9 = false;
					verificaClique10 = false;
					verificaClique11 = false;
					verificaClique12 = false;
					verificaClique13 = false;
					verificaClique14 = false;
					verificaClique15 = false;
					verificaClique16 = false;
					verificaClique17 = false;
					verificaClique18 = false;
					verificaClique19 = false;
					verificaClique20 = false;
					verificaClique21 = false;
					verificaClique22 = false;
					verificaClique23 = false;
					verificaClique24 = false;
					verificaClique25 = false;
					verificaClique26 = false;
					verificaClique27 = false;
					verificaClique28 = false;
					verificaClique29 = false;
					verificaClique30 = false;
					verificaClique31 = false;
					verificaClique32 = false;
					verificaClique33 = false;
					verificaClique34 = false;
					verificaClique1 = false;
					verificaClique36 = false;
					verificaClique37 = false;
					verificaClique38 = false;
					verificaClique39 = false;
					verificaClique40 = false;
					verificaClique41 = false;
					verificaClique42 = false;
					
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl35.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
					setCalendario();
				}
			}
		});
		lbl35.setFont(new Font("Arial", Font.PLAIN, 14));
		lbl35.setBackground(Color.WHITE);
		lbl35.setHorizontalAlignment(JLabel.CENTER);
		lbl35.setBounds(270, 150, 45, 30);
		panel.add(lbl35);
		cbbMes.setBounds(0, 228, 135, 28);
		panel.add(cbbMes);
		cbbMes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				diaAltera = diaFixo;
				calendario();
				
				lbl1.setBackground(Color.WHITE);
				lbl2.setBackground(Color.WHITE);
				lbl3.setBackground(Color.WHITE);
				lbl4.setBackground(Color.WHITE);
				lbl5.setBackground(Color.WHITE);
				lbl6.setBackground(Color.WHITE);
				lbl7.setBackground(Color.WHITE);
				lbl8.setBackground(Color.WHITE);
				lbl9.setBackground(Color.WHITE);
				lbl10.setBackground(Color.WHITE);
				lbl11.setBackground(Color.WHITE);
				lbl12.setBackground(Color.WHITE);
				lbl13.setBackground(Color.WHITE);
				lbl14.setBackground(Color.WHITE);
				lbl15.setBackground(Color.WHITE);
				lbl16.setBackground(Color.WHITE);
				lbl17.setBackground(Color.WHITE);
				lbl18.setBackground(Color.WHITE);
				lbl19.setBackground(Color.WHITE);
				lbl20.setBackground(Color.WHITE);
				lbl21.setBackground(Color.WHITE);
				lbl22.setBackground(Color.WHITE);
				lbl23.setBackground(Color.WHITE);
				lbl24.setBackground(Color.WHITE);
				lbl25.setBackground(Color.WHITE);
				lbl26.setBackground(Color.WHITE);
				lbl27.setBackground(Color.WHITE);
				lbl28.setBackground(Color.WHITE);
				lbl29.setBackground(Color.WHITE);
				lbl30.setBackground(Color.WHITE);
				lbl31.setBackground(Color.WHITE);
				lbl32.setBackground(Color.WHITE);
				lbl33.setBackground(Color.WHITE);
				lbl34.setBackground(Color.WHITE);
				lbl1.setBackground(Color.WHITE);
				lbl36.setBackground(Color.WHITE);
				lbl37.setBackground(Color.WHITE);
				lbl38.setBackground(Color.WHITE);
				lbl39.setBackground(Color.WHITE);
				lbl40.setBackground(Color.WHITE);
				lbl41.setBackground(Color.WHITE);
				lbl42.setBackground(Color.WHITE);
				
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
					
					lbl1.setBackground(Color.WHITE);
					lbl2.setBackground(Color.WHITE);
					lbl3.setBackground(Color.WHITE);
					lbl4.setBackground(Color.WHITE);
					lbl5.setBackground(Color.WHITE);
					lbl6.setBackground(Color.WHITE);
					lbl7.setBackground(Color.WHITE);
					lbl8.setBackground(Color.WHITE);
					lbl9.setBackground(Color.WHITE);
					lbl10.setBackground(Color.WHITE);
					lbl11.setBackground(Color.WHITE);
					lbl12.setBackground(Color.WHITE);
					lbl13.setBackground(Color.WHITE);
					lbl14.setBackground(Color.WHITE);
					lbl15.setBackground(Color.WHITE);
					lbl16.setBackground(Color.WHITE);
					lbl17.setBackground(Color.WHITE);
					lbl18.setBackground(Color.WHITE);
					lbl19.setBackground(Color.WHITE);
					lbl20.setBackground(Color.WHITE);
					lbl21.setBackground(Color.WHITE);
					lbl22.setBackground(Color.WHITE);
					lbl23.setBackground(Color.WHITE);
					lbl24.setBackground(Color.WHITE);
					lbl25.setBackground(Color.WHITE);
					lbl26.setBackground(Color.WHITE);
					lbl27.setBackground(Color.WHITE);
					lbl28.setBackground(Color.WHITE);
					lbl29.setBackground(Color.WHITE);
					lbl30.setBackground(Color.WHITE);
					lbl31.setBackground(Color.WHITE);
					lbl32.setBackground(Color.WHITE);
					lbl33.setBackground(Color.WHITE);
					lbl34.setBackground(Color.WHITE);
					lbl1.setBackground(Color.WHITE);
					lbl36.setBackground(Color.WHITE);
					lbl37.setBackground(Color.WHITE);
					lbl38.setBackground(Color.WHITE);
					lbl39.setBackground(Color.WHITE);
					lbl40.setBackground(Color.WHITE);
					lbl41.setBackground(Color.WHITE);
					lbl42.setBackground(Color.WHITE);
					
				} catch (Exception x) {
					cbbAno.setSelectedItem(anoFixo);
				}
			}
		});
		cbbAno.setEditable(true);

		cbbAno.setToolTipText("Selecione o ano");
		cbbAno.setFont(new Font("Arial", Font.PLAIN, 14));
		cbbAno.setBackground(Color.WHITE);
		
		lblDiaSemana = new JLabel("Ter\u00E7a-Feira");
		lblDiaSemana.setFont(new Font("Arial", Font.BOLD, 20));
		lblDiaSemana.setForeground(Color.WHITE);
		lblDiaSemana.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiaSemana.setBounds(393, 44, 170, 26);
		getContentPane().add(lblDiaSemana);
		
		lblSelecionaMes = new JLabel("Dezembro");
		lblSelecionaMes.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelecionaMes.setForeground(Color.DARK_GRAY);
		lblSelecionaMes.setFont(new Font("Arial", Font.BOLD, 20));
		lblSelecionaMes.setBounds(393, 184, 170, 21);
		getContentPane().add(lblSelecionaMes);
		
		lblSelecionaAno = new JLabel("1998");
		lblSelecionaAno.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelecionaAno.setForeground(Color.DARK_GRAY);
		lblSelecionaAno.setFont(new Font("Arial", Font.BOLD, 16));
		lblSelecionaAno.setBounds(401, 78, 44, 14);
		getContentPane().add(lblSelecionaAno);
		
		lblSelecionaDia = new JLabel("22");
		lblSelecionaDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblSelecionaDia.setForeground(Color.DARK_GRAY);
		lblSelecionaDia.setFont(new Font("Arial", Font.BOLD, 70));
		lblSelecionaDia.setBounds(429, 92, 101, 86);
		getContentPane().add(lblSelecionaDia);
		
		lblDiaSelecionado = new JLabel("");
		lblDiaSelecionado.setHorizontalAlignment(SwingConstants.CENTER);
		lblDiaSelecionado.setIcon(new ImageIcon(TelaAgendarAvaliacao.class.getResource("/imagens/dia_img.png")));
		lblDiaSelecionado.setBounds(393, 40, 170, 170);
		getContentPane().add(lblDiaSelecionado);
		
		lblNomeProfessor = new JTextField();
		lblNomeProfessor.setFont(new Font("Arial", Font.PLAIN, 14));
		lblNomeProfessor.setBounds(573, 77, 412, 33);
		getContentPane().add(lblNomeProfessor);
		lblNomeProfessor.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Arial", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(573, 146, 412, 33);
		getContentPane().add(textField_1);
		
		JLabel lblNomeDoProfessor = new JLabel("Nome do Professor");
		lblNomeDoProfessor.setFont(new Font("Arial", Font.BOLD, 14));
		lblNomeDoProfessor.setBounds(573, 53, 141, 14);
		getContentPane().add(lblNomeDoProfessor);

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
		setCalendario();
		
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
			nomeMes = "Janeiro";
		} else if (mesFixo == 2) {
			cbbMes.setSelectedIndex(1);
			nomeMes = "Fevereiro";
		} else if (mesFixo == 3) {
			cbbMes.setSelectedIndex(2);
			nomeMes = "Março";
		} else if (mesFixo == 4) {
			cbbMes.setSelectedIndex(3);
			nomeMes = "Abril";
		} else if (mesFixo == 5) {
			cbbMes.setSelectedIndex(4);
			nomeMes = "Maio";
		} else if (mesFixo == 6) {
			cbbMes.setSelectedIndex(5);
			nomeMes = "Junho";
		} else if (mesFixo == 7) {
			cbbMes.setSelectedIndex(6);
			nomeMes = "Julho";
		} else if (mesFixo == 8) {
			cbbMes.setSelectedIndex(7);
			nomeMes = "Agosto";
		} else if (mesFixo == 9) {
			cbbMes.setSelectedIndex(8);
			nomeMes = "Setembro";
		} else if (mesFixo == 10) {
			cbbMes.setSelectedIndex(9);
			nomeMes = "Outubro";
		} else if (mesFixo == 11) {
			cbbMes.setSelectedIndex(10);
			nomeMes = "Novembro";
		} else if (mesFixo == 12) {
			cbbMes.setSelectedIndex(11);
			nomeMes = "Dezembro";
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
		
		lbl1.setOpaque(true);
		lbl2.setOpaque(true);
		lbl3.setOpaque(true);
		lbl4.setOpaque(true);
		lbl5.setOpaque(true);
		lbl6.setOpaque(true);
		lbl7.setOpaque(true);
		lbl8.setOpaque(true);
		lbl9.setOpaque(true);;
		lbl10.setOpaque(true);
		lbl11.setOpaque(true);
		lbl12.setOpaque(true);
		lbl13.setOpaque(true);
		lbl14.setOpaque(true);
		lbl15.setOpaque(true);
		lbl16.setOpaque(true);
		lbl17.setOpaque(true);
		lbl18.setOpaque(true);
		lbl19.setOpaque(true);
		lbl20.setOpaque(true);
		lbl21.setOpaque(true);
		lbl22.setOpaque(true);
		lbl23.setOpaque(true);
		lbl24.setOpaque(true);
		lbl25.setOpaque(true);
		lbl26.setOpaque(true);
		lbl27.setOpaque(true);
		lbl28.setOpaque(true);
		lbl29.setOpaque(true);
		lbl30.setOpaque(true);
		lbl31.setOpaque(true);
		lbl32.setOpaque(true);
		lbl33.setOpaque(true);
		lbl34.setOpaque(true);
		lbl35.setOpaque(true);
		lbl36.setOpaque(true);
		lbl37.setOpaque(true);
		lbl38.setOpaque(true);
		lbl39.setOpaque(true);
		lbl40.setOpaque(true);
		lbl41.setOpaque(true);
		lbl42.setOpaque(true);
		lblDomingo.setOpaque(true);
		lblSegunda.setOpaque(true);
		lblTerca.setOpaque(true);
		lblQuarta.setOpaque(true);
		lblQuinta.setOpaque(true);
		lblSexta.setOpaque(true);
		lblSabado.setOpaque(true);

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
	
	public void setCalendario(){
		mesAltera = cbbMes.getSelectedIndex();
		anoAltera = Integer.parseInt(cbbAno.getSelectedItem().toString());
		
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(anoAltera, mesAltera, diaAltera);
		
		int semana2 = calendar2.get(Calendar.DAY_OF_WEEK);
		if (semana2 == Calendar.SUNDAY) {
			nomeDia = "Domingo";
		} else if (semana2 == Calendar.MONDAY) {
			nomeDia = "Segunda-Feira";
		} else if (semana2 == Calendar.TUESDAY) {
			nomeDia = "Terça-Feira";
		} else if (semana2 == Calendar.WEDNESDAY) {
			nomeDia = "Quarta-Feira";
		} else if (semana2 == Calendar.THURSDAY) {
			nomeDia = "Quinta-Feira";
		} else if (semana2 == Calendar.FRIDAY) {
			nomeDia = "Sexta-Feira";
		} else if (semana2 == Calendar.SATURDAY) {
			nomeDia = "Sábado";
		}
		
		if (mesAltera == 0) {
			nomeMes = "Janeiro";
		} else if (mesAltera == 1) {
			nomeMes = "Fevereiro";
		} else if (mesAltera == 2) {
			nomeMes = "Março";
		} else if (mesAltera == 3) {
			nomeMes = "Abril";
		} else if (mesAltera == 4) {
			nomeMes = "Maio";
		} else if (mesAltera == 5) {
			nomeMes = "Junho";
		} else if (mesAltera == 6) {
			nomeMes = "Julho";
		} else if (mesAltera == 7) {
			nomeMes = "Agosto";
		} else if (mesAltera == 8) {
			nomeMes = "Setembro";
		} else if (mesAltera == 9) {
			nomeMes = "Outubro";
		} else if (mesAltera == 10) {
			nomeMes = "Novembro";
		} else if (mesAltera == 11) {
			nomeMes = "Dezembro";
		}
		
		lblSelecionaDia.setText(Integer.toString(diaAltera));
		lblSelecionaAno.setText(Integer.toString(anoAltera));
		lblSelecionaMes.setText(nomeMes);
		lblDiaSemana.setText(nomeDia);
		
	}

	public void limpar() {

		btnCadastrar.setEnabled(false);
		btnCancelar.setEnabled(false);
		btnNovo.setEnabled(true);
		btnVoltar.setEnabled(true);
	}
}
