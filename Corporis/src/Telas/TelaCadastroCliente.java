package Telas;

import javax.swing.JLabel;
import javax.swing.JScrollPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.text.MaskFormatter;

import DAO.Cadastro_ClienteDAO;
import RegrasDeNegocio.Cadastro_Cliente;
import RegrasDeNegocio.LimitandoCaracteresTXT;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;

import javax.swing.JTextArea;

public class TelaCadastroCliente extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtNome = new JTextField();
	private JTextField txtEndereco = new JTextField();
	private JTextField txtBairro = new JTextField();
	private JTextField txtCidade = new JTextField();
	private JTextField txtResponsavel = new JTextField();
	private JTextField txtEmail = new JTextField();
	private MaskFormatter mascaraCPF = new MaskFormatter(), mascaraNascimento = new MaskFormatter();
	private JTextField txtTelefone = new JTextField();

	private JFormattedTextField ftxtCampoCPF = new JFormattedTextField(Mascara("###.###.###-##", mascaraCPF)),
			txtNascimento = new JFormattedTextField(Mascara("##/##/####", mascaraNascimento));

	private JButton btnNovo, btnCadastrar, btnCancelar, btnVoltar, btnBuscar;

	private Border semBorda = new MatteBorder(3, 3, 3, 3, (new Color(232, 232, 232))),
			brancaBorda = new MatteBorder(3, 3, 3, 3, (new Color(255, 255, 255))),
			vermelho = new MatteBorder(2, 2, 2, 2, (new Color(255, 69, 0)));

	private JComboBox<?> cbbUF, cbbSexo, cbbEtnia, cbbClassificacao;

	private int dataInvalida = 0;

	private String[] UF = { "AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB",
			"PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SC", "SE", "SP", "TO" },
			etnia = { "Branco", "Negro", "Pardo", "Indígena", "Asiático" },
			classificacao = { "Criança", "Adolescentes", "Adulto", "Meia-idade", "Idoso", "Lesados Medulares",
					"Mulheres Ativas", "Melheres Anoréxicas", "Mulheres Obesas", "Obesos", "Universitários",
					"Altetas Universitários", "Atletas", "Atletas de Alto Nível", "Atleta de Balé",
					"Atleta Paraplégico" },
			sexo = { "M", "F" };
	private JLabel lblTelefone;
	private JTextArea txtArea = new JTextArea();
	private JScrollPane pane = new JScrollPane(txtArea);
	private JLabel lblObservacoes;
	private JTextField txtAnos;

	private Color branco = new Color(255, 255, 255), cinzaBotoes = new Color(232, 232, 232);

	public MaskFormatter Mascara(String Mascara, MaskFormatter mask) {
		try {
			mask.setMask(Mascara); // Atribui a mascara
			mask.setPlaceholderCharacter(' '); // Caracter para preencimento
		} catch (Exception excecao) {
			excecao.printStackTrace();
		}
		return mask;
	}

	/**
	 * Create the panel.
	 */
	public TelaCadastroCliente() {
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

		txtNome.setDocument(new LimitandoCaracteresTXT(250));
		txtEndereco.setDocument(new LimitandoCaracteresTXT(250));
		txtBairro.setDocument(new LimitandoCaracteresTXT(50));
		txtCidade.setDocument(new LimitandoCaracteresTXT(80));
		txtResponsavel.setDocument(new LimitandoCaracteresTXT(150));
		txtEmail.setDocument(new LimitandoCaracteresTXT(250));
		txtTelefone.setDocument(new LimitandoCaracteresTXT(40));
		txtArea.setFont(new Font("Arial", Font.PLAIN, 14));
		txtArea.setDocument(new LimitandoCaracteresTXT(9950));

		txtAnos = new JTextField();
		txtAnos.setText("");
		txtAnos.setFont(new Font("Arial", Font.PLAIN, 16));
		txtAnos.setEditable(false);
		txtAnos.setColumns(10);
		txtAnos.setBorder(semBorda);
		txtAnos.setBounds(700, 80, 28, 28);
		getContentPane().add(txtAnos);

		btnNovo = new JButton("Novo");
		btnNovo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnCadastrar.setEnabled(true);
				btnCancelar.setEnabled(true);
				btnBuscar.setEnabled(false);
				btnNovo.setEnabled(false);
				btnVoltar.setEnabled(false);

				txtNome.setBackground(branco);
				txtNascimento.setBackground(branco);
				txtEndereco.setBackground(branco);
				txtBairro.setBackground(branco);
				ftxtCampoCPF.setBackground(branco);
				txtCidade.setBackground(branco);
				txtResponsavel.setBackground(branco);
				txtEmail.setBackground(branco);
				txtTelefone.setBackground(branco);
				txtArea.setBackground(branco);
				txtAnos.setBackground(branco);
				
				txtNome.setBorder(brancaBorda);
				txtNascimento.setBorder(brancaBorda);
				txtEndereco.setBorder(brancaBorda);
				txtBairro.setBorder(brancaBorda);
				ftxtCampoCPF.setBorder(brancaBorda);
				txtCidade.setBorder(brancaBorda);
				txtResponsavel.setBorder(brancaBorda);
				txtEmail.setBorder(brancaBorda);
				txtTelefone.setBorder(brancaBorda);
				txtArea.setBorder(brancaBorda);
				txtAnos.setBorder(brancaBorda);

				txtNome.setEditable(true);
				txtNascimento.setEditable(true);
				txtEndereco.setEditable(true);
				txtBairro.setEditable(true);
				ftxtCampoCPF.setEditable(true);
				txtCidade.setEditable(true);
				txtTelefone.setEditable(true);
				txtResponsavel.setEditable(true);
				txtArea.setEditable(true);
				txtEmail.setEditable(true);
				cbbUF.setEnabled(true);
				;
				cbbEtnia.setEnabled(true);
				cbbSexo.setEnabled(true);
				cbbUF.setEnabled(true);
				cbbClassificacao.setEnabled(true);
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

		btnNovo.setIcon(new ImageIcon(TelaCadastroCliente.class.getResource("/imagens/novo_ico.png")));
		btnNovo.setForeground(new Color(0, 0, 0));
		btnNovo.setBackground(new Color(232, 232, 232));
		btnNovo.setBounds(204, 550, 113, 33);
		getContentPane().add(btnNovo);

		btnCadastrar = new JButton("Salvar");
		btnCadastrar.setBackground(new Color(232, 232, 232));
		btnCadastrar.setIcon(new ImageIcon(TelaCadastroCliente.class.getResource("/imagens/salvar_ico.png")));

		btnCadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				sdf.setLenient(false);

				if (txtNome.getText().trim().equals("") || txtNome.getText() == null) {
					txtNome.setBorder(vermelho);
				}

				if (txtNascimento.getText().trim().equals("//") || txtNascimento.getText().trim() != "//") {
					try {
						sdf.parse(txtNascimento.getText());

						// se passou pra cá, é porque a data é válida
						dataInvalida = 0;
					} catch (ParseException e) {
						// se cair aqui, a data é inválida
						txtNascimento.setBorder(vermelho);
						dataInvalida = 1;
						txtNascimento.setText("");
					}
				}

				if (txtEndereco.getText().trim().equals("") || txtEndereco.getText() == null) {
					txtEndereco.setBorder(vermelho);
				}

				if (txtBairro.getText().trim().equals("") || txtBairro.getText() == null) {
					txtBairro.setBorder(vermelho);
				}

				if (ftxtCampoCPF.getText().trim().equals("..-") || ftxtCampoCPF.getText() == null
						|| ftxtCampoCPF.getText().trim().length() != 14) {
					ftxtCampoCPF.setBorder(vermelho);
				}

				if (txtCidade.getText().trim().equals("") || txtCidade.getText() == null) {
					txtCidade.setBorder(vermelho);
				} else if (!(txtNome.getText().trim().equals("")) && !(txtEndereco.getText().trim().equals(""))
						&& !(txtBairro.getText().trim().equals("")) && (ftxtCampoCPF.getText().trim().length() == 14)
						&& !(txtCidade.getText().trim().equals("")) && dataInvalida == 0) {
					
					String tiraPontoCpf;
					tiraPontoCpf = ftxtCampoCPF.getText().replaceAll(".","");
					tiraPontoCpf = tiraPontoCpf.replaceAll("-","");
					
					
					
					
					setModal(false);

					Cadastro_Cliente cc = new Cadastro_Cliente();
					cc.setNome(txtNome.getText());
					cc.setCpf(ftxtCampoCPF.getText());
					cc.setEtnia((String) cbbEtnia.getSelectedItem());
					cc.setBairro(txtBairro.getText());
					cc.setCidade(txtCidade.getText());
					cc.setDataNascimento(txtNascimento.getText());
					cc.setEmail(txtEmail.getText());
					cc.setEndereco(txtEndereco.getText());
					cc.setResponsavel(txtResponsavel.getText());
					cc.setTelefone(txtTelefone.getText());
					cc.setSexo((String) cbbSexo.getSelectedItem());
					cc.setUf((String) cbbUF.getSelectedItem());
					cc.setClassificacao((String) cbbClassificacao.getSelectedItem());
					cc.setObservacoes(txtArea.getText());

					Cadastro_ClienteDAO ccDAO = new Cadastro_ClienteDAO();
					ccDAO.cadastrarCliente(cc);

					limpar();

					setModal(true);
				}

			}
		});
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

		txtNascimento.addFocusListener(new FocusListener() {

			public void focusGained(FocusEvent e) {

			}

			public void focusLost(FocusEvent e) {
				if (txtNascimento.getText().trim().length() == 10) {
					SimpleDateFormat nasc = new SimpleDateFormat("dd/MM/yyyy");
					nasc.setLenient(false);
					try {
						nasc.parse(txtNascimento.getText());
						Date dataNascimento = nasc.parse(txtNascimento.getText());
						txtAnos.setText(Integer.toString(calculaIdade(dataNascimento)));
					} catch (ParseException exception) {
						// TODO Auto-generated catch block
						exception.printStackTrace();
					}
				}
			}
		});

		btnCancelar = new JButton("Cancelar");
		btnCancelar.setIcon(new ImageIcon(TelaCadastroCliente.class.getResource("/imagens/cancelar_ico.png")));
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

		btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					setVisible(false);
					TelaConsultaCliente dqr = new TelaConsultaCliente();
					dqr.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		btnBuscar.setIcon(new ImageIcon(TelaCadastroCliente.class.getResource("/imagens/buscar_ico.png")));
		btnBuscar.setBackground(new Color(232, 232, 232));
		btnBuscar.setBounds(574, 550, 113, 33);
		getContentPane().add(btnBuscar);

		btnBuscar.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent me) {
				btnBuscar.setBackground(new Color(70, 130, 180));
				;
			}

			public void mouseExited(MouseEvent e) {
				btnBuscar.setBackground(new Color(232, 232, 232));
				;
			}
		});

		btnVoltar = new JButton(" Voltar");
		btnVoltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
			}
		});
		btnVoltar.setIcon(new ImageIcon(TelaCadastroCliente.class.getResource("/imagens/voltar_ico.png")));
		btnVoltar.setBackground(new Color(232, 232, 232));
		btnVoltar.setBounds(698, 550, 113, 33);
		getContentPane().add(btnVoltar);

		btnVoltar.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent me) {
				btnVoltar.setBackground(new Color(70, 130, 180));
			}

			public void mouseExited(MouseEvent e) {
				btnVoltar.setBackground(new Color(232, 232, 232));
			}
		});

		txtNome.setToolTipText("Digite o nome do cliente");
		txtNome.setFont(new Font("Arial", Font.PLAIN, 16));
		txtNome.setBounds(17, 80, 533, 28);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		try {
			txtNome.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					txtNome.setBorder(brancaBorda);
				}

				public void mouseClicked(MouseEvent e) {
					txtNome.setBorder(brancaBorda);
				}
			});
		} catch (Exception exe) {

		}

		JLabel lblNome = new JLabel("Nome");
		lblNome.setFont(new Font("Arial", Font.BOLD, 14));
		lblNome.setBounds(17, 60, 46, 14);
		getContentPane().add(lblNome);

		JLabel lblNascimento = new JLabel("Nascimento");
		lblNascimento.setFont(new Font("Arial", Font.BOLD, 14));
		lblNascimento.setBounds(560, 60, 84, 14);
		getContentPane().add(lblNascimento);
		txtNascimento.setToolTipText("Data de nascimento do cliente");

		txtNascimento.setFont(new Font("Arial", Font.PLAIN, 16));
		txtNascimento.setColumns(10);
		txtNascimento.setBounds(560, 80, 130, 28);
		getContentPane().add(txtNascimento);

		try {
			txtNascimento.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					txtNascimento.setBorder(brancaBorda);
					txtNascimento.setCaretPosition(0);
				}

				public void mouseClicked(MouseEvent e) {
					txtNascimento.setBorder(brancaBorda);
					txtNascimento.setCaretPosition(0);
				}
			});
		} catch (Exception exe) {

		}

		JLabel lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Arial", Font.BOLD, 14));
		lblSexo.setBounds(789, 60, 46, 14);
		getContentPane().add(lblSexo);

		cbbSexo = new JComboBox<Object>(sexo);
		cbbSexo.setFont(new Font("Arial", Font.PLAIN, 16));
		cbbSexo.setToolTipText("Informe o sexo (M) masculino (F) feminino");
		cbbSexo.setBounds(789, 80, 62, 28);
		getContentPane().add(cbbSexo);

		JLabel lblEtnia = new JLabel("Etnia");
		lblEtnia.setFont(new Font("Arial", Font.BOLD, 14));
		lblEtnia.setBounds(861, 56, 60, 20);
		getContentPane().add(lblEtnia);

		cbbEtnia = new JComboBox<Object>(etnia);
		cbbEtnia.setFont(new Font("Arial", Font.PLAIN, 16));
		cbbEtnia.setToolTipText("Informe a etnia do cliente");
		cbbEtnia.setBounds(861, 80, 131, 28);
		getContentPane().add(cbbEtnia);

		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setFont(new Font("Arial", Font.BOLD, 14));
		lblEndereco.setBounds(17, 119, 74, 14);
		getContentPane().add(lblEndereco);

		txtEndereco.setToolTipText("Endere\u00E7o do cliente");
		txtEndereco.setFont(new Font("Arial", Font.PLAIN, 16));
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(17, 138, 533, 28);
		getContentPane().add(txtEndereco);

		try {
			txtEndereco.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					txtEndereco.setBorder(brancaBorda);
				}

				public void mouseClicked(MouseEvent e) {
					txtEndereco.setBorder(brancaBorda);
				}
			});
		} catch (Exception exe) {

		}

		txtBairro.setToolTipText("Bairro do cliente");
		txtBairro.setFont(new Font("Arial", Font.PLAIN, 16));
		txtBairro.setColumns(10);
		txtBairro.setBounds(560, 138, 201, 28);
		getContentPane().add(txtBairro);

		try {
			txtBairro.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					txtBairro.setBorder(brancaBorda);
				}

				public void mouseClicked(MouseEvent e) {
					txtBairro.setBorder(brancaBorda);
				}
			});
		} catch (Exception exe) {

		}

		JLabel lblBairro = new JLabel("Bairro");
		lblBairro.setFont(new Font("Arial", Font.BOLD, 14));
		lblBairro.setBounds(560, 119, 66, 14);
		getContentPane().add(lblBairro);
		ftxtCampoCPF.setToolTipText("CPF do cliente");

		ftxtCampoCPF.setFont(new Font("Arial", Font.PLAIN, 16));
		ftxtCampoCPF.setColumns(10);
		ftxtCampoCPF.setBounds(771, 138, 221, 28);
		getContentPane().add(ftxtCampoCPF);

		try {
			ftxtCampoCPF.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					ftxtCampoCPF.setBorder(brancaBorda);
					ftxtCampoCPF.setCaretPosition(0);
				}

				public void mouseClicked(MouseEvent e) {
					ftxtCampoCPF.setBorder(brancaBorda);
					ftxtCampoCPF.setCaretPosition(0);
				}
			});
		} catch (Exception exe) {

		}

		JLabel lblCPF = new JLabel("CPF");
		lblCPF.setFont(new Font("Arial", Font.BOLD, 14));
		lblCPF.setBounds(771, 119, 66, 14);
		getContentPane().add(lblCPF);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Arial", Font.BOLD, 14));
		lblCidade.setBounds(17, 178, 55, 14);
		getContentPane().add(lblCidade);

		txtCidade.setToolTipText("Cidade do cliente ");
		txtCidade.setFont(new Font("Arial", Font.PLAIN, 16));
		txtCidade.setColumns(10);
		txtCidade.setBounds(17, 199, 265, 28);
		getContentPane().add(txtCidade);

		try {
			txtCidade.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					txtCidade.setBorder(brancaBorda);
				}

				public void mouseClicked(MouseEvent e) {
					txtCidade.setBorder(brancaBorda);
				}
			});
		} catch (Exception exe) {

		}

		cbbUF = new JComboBox<Object>(UF);
		cbbUF.setFont(new Font("Arial", Font.PLAIN, 16));
		cbbUF.setToolTipText("Estado em que o cliente reside");
		cbbUF.setBounds(292, 199, 62, 28);
		getContentPane().add(cbbUF);

		JLabel lblUF = new JLabel("UF");
		lblUF.setFont(new Font("Arial", Font.BOLD, 14));
		lblUF.setBounds(293, 178, 28, 14);
		getContentPane().add(lblUF);

		txtResponsavel.setToolTipText("Nome do respons\u00E1vel pelo cliente");
		txtResponsavel.setFont(new Font("Arial", Font.PLAIN, 16));
		txtResponsavel.setColumns(10);
		txtResponsavel.setBounds(560, 199, 432, 26);
		getContentPane().add(txtResponsavel);

		JLabel lblResponsavel = new JLabel("Respons\u00E1vel");
		lblResponsavel.setFont(new Font("Arial", Font.BOLD, 14));
		lblResponsavel.setBounds(560, 178, 101, 14);
		getContentPane().add(lblResponsavel);

		txtEmail.setToolTipText("Email do cliente");
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		txtEmail.setColumns(10);
		txtEmail.setBounds(17, 259, 651, 28);
		getContentPane().add(txtEmail);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 14));
		lblEmail.setBounds(17, 238, 55, 14);
		getContentPane().add(lblEmail);

		cbbClassificacao = new JComboBox<Object>(classificacao);
		cbbClassificacao.setFont(new Font("Arial", Font.PLAIN, 16));
		cbbClassificacao.setToolTipText("Informe a classifica\u00E7\u00E3o em que o cliente se encaixa");
		cbbClassificacao.setBounds(679, 259, 313, 28);
		getContentPane().add(cbbClassificacao);

		JLabel lblClassificacao = new JLabel("Classifica\u00E7\u00E3o");
		lblClassificacao.setFont(new Font("Arial", Font.BOLD, 14));
		lblClassificacao.setBounds(679, 238, 101, 14);
		getContentPane().add(lblClassificacao);
		txtNome.setBorder(semBorda);
		txtNascimento.setBorder(semBorda);
		txtEndereco.setBorder(semBorda);
		txtBairro.setBorder(semBorda);
		ftxtCampoCPF.setBorder(semBorda);
		txtCidade.setBorder(semBorda);
		txtResponsavel.setBorder(semBorda);
		txtEmail.setBorder(semBorda);

		cbbClassificacao.setBackground(new Color(255, 255, 255));
		cbbEtnia.setBackground(new Color(255, 255, 255));
		cbbSexo.setBackground(new Color(255, 255, 255));
		cbbUF.setBackground(new Color(255, 255, 255));

		txtTelefone.setToolTipText("Telefone do cliente ou respons\u00E1vel");
		txtTelefone.setFont(new Font("Arial", Font.PLAIN, 16));
		txtTelefone.setColumns(10);
		txtTelefone.setBorder(semBorda);
		txtTelefone.setBounds(364, 199, 186, 28);
		getContentPane().add(txtTelefone);

		try {
			txtTelefone.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					txtTelefone.setBorder(brancaBorda);
				}

				public void mouseClicked(MouseEvent e) {
					txtTelefone.setBorder(brancaBorda);
				}
			});
		} catch (Exception exe) {

		}

		lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Arial", Font.BOLD, 14));
		lblTelefone.setBounds(366, 178, 74, 14);
		getContentPane().add(lblTelefone);

		pane.setBounds(17, 364, 975, 150);
		getContentPane().add(pane);

		lblObservacoes = new JLabel("Observa\u00E7\u00F5es");
		lblObservacoes.setFont(new Font("Arial", Font.BOLD, 14));
		lblObservacoes.setBounds(17, 339, 94, 14);
		getContentPane().add(lblObservacoes);

		JLabel lblAnos = new JLabel("Anos");
		lblAnos.setFont(new Font("Arial", Font.BOLD, 14));
		lblAnos.setBounds(733, 88, 46, 14);
		getContentPane().add(lblAnos);

		limpar();
	}

	public void limpar() {
		txtNome.setText("");
		txtNascimento.setText("");
		txtEndereco.setText("");
		txtBairro.setText("");
		ftxtCampoCPF.setText("");
		txtCidade.setText("");
		txtResponsavel.setText("");
		txtEmail.setText("");
		txtTelefone.setText("");
		txtArea.setToolTipText("Observa\u00E7\u00F5es m\u00E9dicas (caso exista)");
		txtArea.setWrapStyleWord(true);
		txtArea.setLineWrap(true);
		txtArea.setText("");
		txtAnos.setText("");

		txtNome.setBackground(cinzaBotoes);
		txtNascimento.setBackground(cinzaBotoes);
		txtEndereco.setBackground(cinzaBotoes);
		txtBairro.setBackground(cinzaBotoes);
		ftxtCampoCPF.setBackground(cinzaBotoes);
		txtCidade.setBackground(cinzaBotoes);
		txtResponsavel.setBackground(cinzaBotoes);
		txtEmail.setBackground(cinzaBotoes);
		txtTelefone.setBackground(cinzaBotoes);
		txtArea.setBackground(cinzaBotoes);
		txtAnos.setBackground(cinzaBotoes);

		cbbClassificacao.setSelectedIndex(0);
		cbbEtnia.setSelectedIndex(0);
		cbbSexo.setSelectedIndex(0);
		cbbUF.setSelectedIndex(0);

		txtNome.setEditable(false);
		txtNascimento.setEditable(false);
		txtEndereco.setEditable(false);
		txtBairro.setEditable(false);
		ftxtCampoCPF.setEditable(false);
		txtCidade.setEditable(false);
		txtResponsavel.setEditable(false);
		txtEmail.setEditable(false);
		txtTelefone.setEditable(false);
		txtArea.setEditable(false);
		cbbUF.setEnabled(false);
		cbbEtnia.setEnabled(false);
		cbbSexo.setEnabled(false);
		cbbUF.setEnabled(false);
		cbbClassificacao.setEnabled(false);

		txtNome.setBorder(semBorda);
		txtNascimento.setBorder(semBorda);
		txtEndereco.setBorder(semBorda);
		txtBairro.setBorder(semBorda);
		ftxtCampoCPF.setBorder(semBorda);
		txtCidade.setBorder(semBorda);
		txtResponsavel.setBorder(semBorda);
		txtEmail.setBorder(semBorda);
		txtTelefone.setBorder(semBorda);
		txtArea.setBorder(semBorda);
		txtAnos.setBorder(semBorda);

		btnCadastrar.setEnabled(false);
		btnCancelar.setEnabled(false);
		btnBuscar.setEnabled(true);
		btnNovo.setEnabled(true);
		btnVoltar.setEnabled(true);
	}

	public static int calculaIdade(java.util.Date dataNasc) {

		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(dataNasc);
		Calendar hoje = Calendar.getInstance();

		int idade = hoje.get(Calendar.YEAR) - dataNascimento.get(Calendar.YEAR);

		if (hoje.get(Calendar.MONTH) < dataNascimento.get(Calendar.MONTH)) {
			idade--;
		} else {
			if (hoje.get(Calendar.MONTH) == dataNascimento.get(Calendar.MONTH)
					&& hoje.get(Calendar.DAY_OF_MONTH) < dataNascimento.get(Calendar.DAY_OF_MONTH)) {
				idade--;
			}
		}

		return idade;
	}
}
