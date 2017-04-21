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

import DAO.UpdateClienteDAO;
import RegrasDeNegocio.LimitandoCaracteresTXT;
import RegrasDeNegocio.UpdateCliente;

import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JFormattedTextField;

import javax.swing.JTextArea;

public class TelaUpdateCliente extends JDialog {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField txtId = new JTextField();
	private JTextField txtNumeroDeAvaliacoes = new JTextField();
	private JTextField txtNome = new JTextField();
	private JTextField txtEndereco = new JTextField();
	private JTextField txtBairro = new JTextField();
	private JTextField txtCidade = new JTextField();
	private JTextField txtResponsavel = new JTextField();
	private JTextField txtEmail = new JTextField();
	private JTextField txtDataReavaliacao = new JTextField();
	private MaskFormatter mascaraCPF = new MaskFormatter(), mascaraNascimento = new MaskFormatter();
	private JTextField txtTelefone = new JTextField();
	private JTextField txtAnos;

	private JFormattedTextField ftxtCampoCPF = new JFormattedTextField(Mascara("###.###.###-##", mascaraCPF)),
			txtNascimento = new JFormattedTextField(Mascara("##/##/####", mascaraNascimento));

	private JButton btnEditar, btnCadastrar, btnCancelar, btnVoltar, btnBuscar;

	private Border semBorda = new MatteBorder(3, 3, 3, 3, (new Color(232, 232, 232))),
			brancaBorda = new MatteBorder(3, 3, 3, 3, (new Color(255, 255, 255))),
			vermelho = new MatteBorder(2, 2, 2, 2, (new Color(255, 69, 0)));
	
	private Color branco = new Color(255, 255, 255), cinzaBotoes = new Color(232, 232, 232);

	private JComboBox<?> cbbUF, cbbSexo, cbbEtnia, cbbClassificacao;

	private int dataInvalida = 0, ID;
	static int idade;

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		TelaUpdateCliente.idade = idade;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

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
	public TelaUpdateCliente() {
		getContentPane().setLayout(null);
		setSize(1024, 650);
		setTitle("Editar cliente");
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setModal(true);
		getContentPane().setBackground(new Color(190, 190, 190));
		this.setLocationRelativeTo(null);
		setResizable(false);
		
		URL url = this.getClass().getResource("/imagens/sistema_ico.png");
		
		Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url).getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		this.setIconImage(imagemTitulo);

		txtId.setFont(new Font("Arial", Font.PLAIN, 16));
		txtId.setBounds(17, 53, 64, 28);
		getContentPane().add(txtId);
		txtId.setColumns(10);

		txtNome.setDocument(new LimitandoCaracteresTXT(250));
		txtEndereco.setDocument(new LimitandoCaracteresTXT(250));
		txtBairro.setDocument(new LimitandoCaracteresTXT(50));
		txtCidade.setDocument(new LimitandoCaracteresTXT(80));
		txtResponsavel.setDocument(new LimitandoCaracteresTXT(150));
		txtEmail.setDocument(new LimitandoCaracteresTXT(250));
		txtTelefone.setDocument(new LimitandoCaracteresTXT(40));
		txtArea.setFont(new Font("Arial", Font.PLAIN, 16));
		txtArea.setDocument(new LimitandoCaracteresTXT(9950));

		txtAnos = new JTextField();
		txtAnos.setText("");
		txtAnos.setFont(new Font("Arial", Font.PLAIN, 16));
		txtAnos.setEditable(false);
		txtAnos.setColumns(10);
		txtAnos.setBorder(semBorda);
		txtAnos.setBounds(700, 112, 28, 28);
		getContentPane().add(txtAnos);
		
		btnEditar = new JButton("Editar");
		btnEditar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btnCadastrar.setEnabled(true);
				btnCancelar.setEnabled(true);
				btnBuscar.setEnabled(false);
				btnEditar.setEnabled(false);
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

				cbbEtnia.setEnabled(true);
				cbbSexo.setEnabled(true);
				cbbUF.setEnabled(true);
				cbbClassificacao.setEnabled(true);
			}
		});

		btnEditar.addMouseListener(new MouseAdapter() {

			public void mouseEntered(MouseEvent me) {
				btnEditar.setBackground(new Color(70, 130, 180));
				;
			}

			public void mouseExited(MouseEvent e) {
				btnEditar.setBackground(new Color(232, 232, 232));
				;
			}
		});

		btnEditar.setIcon(new ImageIcon(TelaCadastroCliente.class.getResource("/imagens/novo_ico.png")));
		btnEditar.setForeground(new Color(0, 0, 0));
		btnEditar.setBackground(new Color(232, 232, 232));
		btnEditar.setBounds(204, 550, 113, 33);
		getContentPane().add(btnEditar);

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

					setModal(false);

					UpdateCliente uc = new UpdateCliente();
					uc.setNome(txtNome.getText());
					uc.setCpf(ftxtCampoCPF.getText());
					uc.setEtnia((String) cbbEtnia.getSelectedItem());
					uc.setBairro(txtBairro.getText());
					uc.setCidade(txtCidade.getText());
					uc.setDataNascimento(txtNascimento.getText());
					uc.setEmail(txtEmail.getText());
					uc.setEndereco(txtEndereco.getText());
					uc.setResponsavel(txtResponsavel.getText());
					uc.setTelefone(txtTelefone.getText());
					uc.setSexo((String) cbbSexo.getSelectedItem());
					uc.setUf((String) cbbUF.getSelectedItem());
					uc.setClassificacao((String) cbbClassificacao.getSelectedItem());
					uc.setObservacoes(txtArea.getText());

					UpdateClienteDAO ucDAO = new UpdateClienteDAO();
					ucDAO.setID(Integer.parseInt(txtId.getText()));
					ucDAO.editarCliente(uc);

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
		
		txtNascimento.addFocusListener(new FocusListener(){

            public void focusGained(FocusEvent e) {   
            }
            public void focusLost(FocusEvent e) {
            	if(txtNascimento.getText().trim().length() == 10){
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
            }});

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

		JLabel lblId = new JLabel("ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblId.setBounds(17, 33, 46, 14);
		getContentPane().add(lblId);

		JLabel lblNumeroDeAvaliacoes = new JLabel("N\u00B0 Avalia\u00E7\u00F5es");
		lblNumeroDeAvaliacoes.setFont(new Font("Arial", Font.BOLD, 14));
		lblNumeroDeAvaliacoes.setBounds(896, 29, 96, 17);
		getContentPane().add(lblNumeroDeAvaliacoes);

		txtNumeroDeAvaliacoes.setFont(new Font("Arial", Font.PLAIN, 16));
		txtNumeroDeAvaliacoes.setBounds(879, 53, 113, 28);
		getContentPane().add(txtNumeroDeAvaliacoes);
		txtNumeroDeAvaliacoes.setColumns(10);

		txtNome.setToolTipText("Digite o nome do cliente");
		txtNome.setFont(new Font("Arial", Font.PLAIN, 16));
		txtNome.setBounds(17, 112, 533, 28);
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
		lblNome.setBounds(17, 92, 46, 14);
		getContentPane().add(lblNome);

		JLabel lblNascimento = new JLabel("Nascimento");
		lblNascimento.setFont(new Font("Arial", Font.BOLD, 14));
		lblNascimento.setBounds(562, 92, 82, 17);
		getContentPane().add(lblNascimento);
		txtNascimento.setToolTipText("Data de nascimento do cliente");

		txtNascimento.setFont(new Font("Arial", Font.PLAIN, 16));
		txtNascimento.setColumns(10);
		txtNascimento.setBounds(560, 112, 130, 28);
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
		lblSexo.setBounds(790, 92, 46, 14);
		getContentPane().add(lblSexo);

		cbbSexo = new JComboBox<Object>(sexo);
		cbbSexo.setFont(new Font("Arial", Font.PLAIN, 16));
		cbbSexo.setToolTipText("Informe o sexo (M) masculino (F) feminino");
		cbbSexo.setBounds(790, 113, 62, 28);
		getContentPane().add(cbbSexo);

		JLabel lblEtnia = new JLabel("Etnia");
		lblEtnia.setFont(new Font("Arial", Font.BOLD, 14));
		lblEtnia.setBounds(861, 88, 60, 20);
		getContentPane().add(lblEtnia);

		cbbEtnia = new JComboBox<Object>(etnia);
		cbbEtnia.setFont(new Font("Arial", Font.PLAIN, 16));
		cbbEtnia.setToolTipText("Informe a etnia do cliente");
		cbbEtnia.setBounds(861, 113, 131, 28);
		getContentPane().add(cbbEtnia);

		JLabel lblEndereco = new JLabel("Endere\u00E7o");
		lblEndereco.setFont(new Font("Arial", Font.BOLD, 14));
		lblEndereco.setBounds(17, 151, 74, 14);
		getContentPane().add(lblEndereco);

		txtEndereco.setToolTipText("Endere\u00E7o do cliente");
		txtEndereco.setFont(new Font("Arial", Font.PLAIN, 16));
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(17, 170, 533, 28);
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
		txtBairro.setBounds(560, 171, 201, 28);
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
		lblBairro.setBounds(560, 151, 66, 14);
		getContentPane().add(lblBairro);
		ftxtCampoCPF.setToolTipText("CPF do cliente");

		ftxtCampoCPF.setFont(new Font("Arial", Font.PLAIN, 16));
		ftxtCampoCPF.setColumns(10);
		ftxtCampoCPF.setBounds(771, 170, 221, 28);
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
		lblCPF.setBounds(771, 151, 66, 14);
		getContentPane().add(lblCPF);

		JLabel lblCidade = new JLabel("Cidade");
		lblCidade.setFont(new Font("Arial", Font.BOLD, 14));
		lblCidade.setBounds(17, 210, 55, 14);
		getContentPane().add(lblCidade);

		txtCidade.setToolTipText("Cidade do cliente ");
		txtCidade.setFont(new Font("Arial", Font.PLAIN, 16));
		txtCidade.setColumns(10);
		txtCidade.setBounds(17, 231, 265, 28);
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
		cbbUF.setBounds(292, 231, 62, 28);
		getContentPane().add(cbbUF);

		JLabel lblUF = new JLabel("UF");
		lblUF.setFont(new Font("Arial", Font.BOLD, 14));
		lblUF.setBounds(293, 210, 19, 17);
		getContentPane().add(lblUF);

		txtResponsavel.setToolTipText("Nome do respons\u00E1vel pelo cliente");
		txtResponsavel.setFont(new Font("Arial", Font.PLAIN, 16));
		txtResponsavel.setColumns(10);
		txtResponsavel.setBounds(560, 231, 432, 26);
		getContentPane().add(txtResponsavel);

		JLabel lblResponsavel = new JLabel("Respons\u00E1vel");
		lblResponsavel.setFont(new Font("Arial", Font.BOLD, 14));
		lblResponsavel.setBounds(560, 210, 101, 14);
		getContentPane().add(lblResponsavel);

		txtEmail.setToolTipText("Email do cliente");
		txtEmail.setFont(new Font("Arial", Font.PLAIN, 16));
		txtEmail.setColumns(10);
		txtEmail.setBounds(17, 291, 533, 28);
		getContentPane().add(txtEmail);

		JLabel lblEmail = new JLabel("E-mail");
		lblEmail.setFont(new Font("Arial", Font.BOLD, 14));
		lblEmail.setBounds(17, 270, 55, 14);
		getContentPane().add(lblEmail);

		cbbClassificacao = new JComboBox<Object>(classificacao);
		cbbClassificacao.setFont(new Font("Arial", Font.PLAIN, 16));
		cbbClassificacao.setToolTipText("Informe a classifica\u00E7\u00E3o em que o cliente se encaixa");
		cbbClassificacao.setBounds(562, 292, 313, 28);
		getContentPane().add(cbbClassificacao);

		JLabel lblClassificacao = new JLabel("Classifica\u00E7\u00E3o");
		lblClassificacao.setFont(new Font("Arial", Font.BOLD, 14));
		lblClassificacao.setBounds(560, 270, 101, 14);
		getContentPane().add(lblClassificacao);

		JLabel lblDataReavaliacao = new JLabel("Reavalia\u00E7\u00E3o");
		lblDataReavaliacao.setFont(new Font("Arial", Font.BOLD, 14));
		lblDataReavaliacao.setBounds(900, 270, 90, 14);
		getContentPane().add(lblDataReavaliacao);

		txtDataReavaliacao.setFont(new Font("Arial", Font.PLAIN, 16));
		txtDataReavaliacao.setColumns(10);
		txtDataReavaliacao.setBounds(883, 291, 109, 28);
		getContentPane().add(txtDataReavaliacao);

		txtId.setBorder(semBorda);
		txtNumeroDeAvaliacoes.setBorder(semBorda);
		txtNome.setBorder(semBorda);
		txtNascimento.setBorder(semBorda);
		txtEndereco.setBorder(semBorda);
		txtBairro.setBorder(semBorda);
		ftxtCampoCPF.setBorder(semBorda);
		txtCidade.setBorder(semBorda);
		txtResponsavel.setBorder(semBorda);
		txtEmail.setBorder(semBorda);
		txtDataReavaliacao.setBorder(semBorda);

		cbbClassificacao.setBackground(new Color(255, 255, 255));
		cbbEtnia.setBackground(new Color(255, 255, 255));
		cbbSexo.setBackground(new Color(255, 255, 255));
		cbbUF.setBackground(new Color(255, 255, 255));

		txtId.setEditable(false);
		txtNumeroDeAvaliacoes.setEditable(false);
		txtDataReavaliacao.setEditable(false);

		txtTelefone.setToolTipText("Telefone do cliente ou respons\u00E1vel");
		txtTelefone.setFont(new Font("Arial", Font.PLAIN, 16));
		txtTelefone.setColumns(10);
		txtTelefone.setBorder(semBorda);
		txtTelefone.setBounds(364, 231, 186, 28);
		getContentPane().add(txtTelefone);

		try {
			txtTelefone.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					txtTelefone.setBorder(semBorda);
				}

				public void mouseClicked(MouseEvent e) {
					txtTelefone.setBorder(semBorda);
				}
			});
		} catch (Exception exe) {

		}

		lblTelefone = new JLabel("Telefone");
		lblTelefone.setFont(new Font("Arial", Font.BOLD, 14));
		lblTelefone.setBounds(366, 210, 62, 17);
		getContentPane().add(lblTelefone);

		pane.setBounds(17, 364, 975, 150);
		getContentPane().add(pane);

		lblObservacoes = new JLabel("Observa\u00E7\u00F5es");
		lblObservacoes.setFont(new Font("Arial", Font.BOLD, 14));
		lblObservacoes.setBounds(17, 339, 94, 14);
		getContentPane().add(lblObservacoes);
		
		JLabel lblAnos = new JLabel("Anos");
		lblAnos.setFont(new Font("Arial", Font.BOLD, 14));
		lblAnos.setBounds(733, 120, 46, 14);
		getContentPane().add(lblAnos);

		limpar();
	}

	public void limpar() {
		txtArea.setToolTipText("Observa\u00E7\u00F5es m\u00E9dicas (caso exista)");
		txtArea.setWrapStyleWord(true);
		txtArea.setLineWrap(true);

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
		txtNumeroDeAvaliacoes.setBackground(cinzaBotoes);
		txtId.setBackground(cinzaBotoes);
		txtDataReavaliacao.setBackground(cinzaBotoes);

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
		btnEditar.setEnabled(true);
		btnVoltar.setEnabled(true);
	}

	public void setTXT() {
		UpdateCliente uc = new UpdateCliente();
		UpdateClienteDAO ucd = new UpdateClienteDAO();
		ucd.setID(getID());
		ucd.Idade();
		ucd.buscaCliente(uc);
		txtArea.setText(uc.getObservacoes());
		txtBairro.setText(uc.getBairro());
		txtCidade.setText(uc.getCidade());
		txtEmail.setText(uc.getEmail());
		txtEndereco.setText(uc.getEndereco());
		txtId.setText(Integer.toString(ucd.getID()));
		txtNascimento.setText(ucd.getDia() + ucd.getMes() + ucd.getAno());
		txtNome.setText(uc.getNome());
		txtResponsavel.setText(uc.getResponsavel());
		txtTelefone.setText(uc.getTelefone());
		ftxtCampoCPF.setText(uc.getCpf());
		cbbClassificacao.setSelectedItem(uc.getClassificacao());
		cbbEtnia.setSelectedItem(uc.getEtnia());
		cbbUF.setSelectedItem(uc.getUf());
		cbbSexo.setSelectedItem(uc.getSexo());
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
