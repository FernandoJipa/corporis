package Telas;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.URL;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.border.MatteBorder;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import Confirmacoes.ConfirmacaoExcluirCliente;
import Confirmacoes.SelecionaCliente;
import DAO.ConsultaClienteDAO;

import java.awt.Label;
import java.awt.Point;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;

public class TelaConsultaCliente extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JButton btnDetalhe = new JButton("Detalhes"), btnNovo = new JButton("Novo");

	private Border semBorda = new MatteBorder(3, 3, 3, 3, (new Color(255, 255, 255)));

	private String DEFAULT_QUERY = "SELECT cod_cli, cli_nome, cli_telefone, cli_cpf FROM cliente ORDER BY cli_nome";
	private Color cinzaPadrao = new Color(205, 201, 201), cinzaBotoes = new Color(232, 232, 232),
			mouseCima = new Color(70, 130, 180);

	private ConsultaClienteDAO tableModel = new ConsultaClienteDAO(DEFAULT_QUERY);

	private JTable resultTable = new JTable(tableModel);
	private JScrollPane scrollPane = new JScrollPane(resultTable);

	int lin = -1;
	int col = 0;
	private JTextField txtBusca;

	public TelaConsultaCliente() throws Exception {
		getContentPane().setLayout(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setResizable(false);
		setModal(true);
		setTitle("Clientes cadastrados");
		setSize(750, 500);
		setLocationRelativeTo(this);
		getContentPane().setBackground(cinzaPadrao);
		
		URL url = this.getClass().getResource("/imagens/sistema_ico.png");
		
		Image imagemTitulo = Toolkit.getDefaultToolkit().getImage(url).getScaledInstance(40, 40, Image.SCALE_SMOOTH);
		this.setIconImage(imagemTitulo);

		try {
			coresTabela();

			// adiciona a barra de rolagem ao centro do border layout
			// barra>table>AbstractTableModel
			scrollPane.setBounds(22, 80, 700, 301);
			getContentPane().add(scrollPane);
			final TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>((TableModel) tableModel);
			resultTable.setRowSorter(sorter);
			btnNovo.setToolTipText("Cadastrar cliente");
			btnNovo.setIcon(new ImageIcon(TelaConsultaCliente.class.getResource("/imagens/novo_ico.png")));
			btnNovo.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					setVisible(false);
					TelaCadastroCliente tcc = new TelaCadastroCliente();
					tcc.setVisible(true);
				}
			});

			btnNovo.addMouseListener(new MouseAdapter() {

				public void mouseEntered(MouseEvent me) {
					btnNovo.setBackground(mouseCima);
					;
				}

				public void mouseExited(MouseEvent e) {
					btnNovo.setBackground(cinzaBotoes);
					;
				}
			});

			btnNovo.setBackground(cinzaBotoes);
			btnDetalhe.setToolTipText("Exibir todos os dados do cliente");
			btnDetalhe.setIcon(new ImageIcon(TelaConsultaCliente.class.getResource("/imagens/detalhes_ico.png")));
			
			btnDetalhe.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (resultTable.getSelectedRow() == -1) {
						setModal(false);
						SelecionaCliente sc = new SelecionaCliente();
						sc.setVisible(true);
						setModal(true);
					} else {
						lin = resultTable.getSelectedRow();
						Object conteudo = resultTable.getValueAt(lin, col);
						int cod = (Integer) conteudo;
						setVisible(false);
						TelaUpdateCliente tuc = new TelaUpdateCliente();
						tuc.setID(cod);
						tuc.setTXT();
						tuc.setVisible(true);						
					}
				}
			});
			
			resultTable.setDefaultEditor(Object.class, null); 
			resultTable.addMouseListener(new MouseAdapter() {  
			    public void mouseClicked(MouseEvent e)  
			    {  
			        if (e.getClickCount() == 2) //Se o usuário der um clique duplo com o mouse na linha da tabela faça!
			        {  
			            Point p = e.getPoint(); //Define um ponto p para a extração dos dados da JTable
			            int row = resultTable.rowAtPoint(p); //Pega a linha que o usuario clicou com o mouse
			            int col = 0; //Coluna recebe 0 para que o valor buscado seja o da primeira coluna que é a coluna de COD dos clientes
			            Object conteudo = resultTable.getValueAt(row, col);//Pega o conteúdo da célulasque contém o ID do cliente selecionado
			            int cod = (Integer) conteudo; //Converte o conteudo da celula para um valor do tipo Inteiro
						setVisible(false);//Fecha a tela de Busca
						TelaUpdateCliente tuc = new TelaUpdateCliente();//Instacia a classe TelaUpdateCliente
						tuc.setID(cod);//Envia o codigo convertido acima para a classe UpdateCliente, em que será usado para trazer os dados vindos do banco de dados
						tuc.setTXT();//Coloca os valores vindos do Banco de Dados nos campos de texto da tela "TelaUpdateCliente"
						tuc.setVisible(true);  
			        }  
			    }  
			}); 
			
			btnDetalhe.addMouseListener(new MouseAdapter() {

				public void mouseEntered(MouseEvent me) {
					btnDetalhe.setBackground(mouseCima);
					;
				}

				public void mouseExited(MouseEvent e) {
					btnDetalhe.setBackground(cinzaBotoes);
					;
				}
			});
			
			btnDetalhe.setBounds(157, 408, 118, 33);
			getContentPane().add(btnDetalhe);
			btnDetalhe.setBackground(cinzaBotoes);

			btnNovo.setBounds(285, 408, 83, 33);
			getContentPane().add(btnNovo);

			JButton btnVoltar = new JButton("Voltar");
			btnVoltar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					setVisible(false);
				}
			});
			
			btnVoltar.addMouseListener(new MouseAdapter() {

				public void mouseEntered(MouseEvent me) {
					btnVoltar.setBackground(mouseCima);
					;
				}

				public void mouseExited(MouseEvent e) {
					btnVoltar.setBackground(cinzaBotoes);
					;
				}
			}); 
			
			btnVoltar.setIcon(new ImageIcon(TelaConsultaCliente.class.getResource("/imagens/voltar_ico.png")));
			btnVoltar.setBounds(492, 408, 93, 33);
			getContentPane().add(btnVoltar);
			btnVoltar.setBackground(cinzaBotoes);

			Label lblBuscar = new Label("Buscar Cliente");
			lblBuscar.setFont(new Font("Dialog", Font.BOLD, 14));
			lblBuscar.setBounds(153, 33, 110, 23);
			getContentPane().add(lblBuscar);

			txtBusca = new JTextField();
			txtBusca.setToolTipText("Digite o nome do cliente");
			txtBusca.setFont(new Font("Tahoma", Font.PLAIN, 16));
			txtBusca.setBounds(269, 33, 329, 20);
			txtBusca.setBorder(semBorda);
			getContentPane().add(txtBusca);
			txtBusca.setColumns(10);
			
			JButton btnApagar = new JButton("Apagar");
			btnApagar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if (resultTable.getSelectedRow() == -1) {
						setModal(false);
						SelecionaCliente sc = new SelecionaCliente();
						sc.setVisible(true);
						setModal(true);
					} else {
						ConfirmacaoExcluirCliente cec = new ConfirmacaoExcluirCliente();
						int linNome = resultTable.getSelectedRow(), colNome = 1;
						Object NomeCliente = resultTable.getValueAt(linNome, colNome);
						String NomeDoCliente = String.valueOf(NomeCliente);
						cec.setNome(NomeDoCliente);
						cec.setLabel();
						lin = resultTable.getSelectedRow();
						Object conteudo = resultTable.getValueAt(lin, col);
						int cod = (Integer) conteudo;
						cec.setID(cod);
						cec.setVisible(true);
						resetTable(DEFAULT_QUERY);
					}
				}
			});
			btnApagar.setIcon(new ImageIcon(TelaConsultaCliente.class.getResource("/imagens/apagar_ico.png")));
			btnApagar.setBackground(new Color(232, 232, 232));
			btnApagar.setBounds(378, 408, 104, 33);
			getContentPane().add(btnApagar);
			txtBusca.addKeyListener(new KeyAdapter() {

				public void keyReleased(KeyEvent ke) {
					if (txtBusca.getText().equals("")) {
						resetTable("SELECT cod_cli, cli_nome, cli_telefone, cli_cpf FROM cliente");
					} else {
						resetTable("SELECT cod_cli, cli_nome, cli_telefone, cli_cpf FROM cliente WHERE cli_nome like '%"
								+ txtBusca.getText() + "%' ");
					}
				}
			});
			
			btnApagar.addMouseListener(new MouseAdapter() {

				public void mouseEntered(MouseEvent me) {
					btnApagar.setBackground(mouseCima);
					;
				}

				public void mouseExited(MouseEvent e) {
					btnApagar.setBackground(cinzaBotoes);
					;
				}
			}); 

			// tamanho das colunas
			resultTable.getColumnModel().getColumn(0).setPreferredWidth(1);
			resultTable.getColumnModel().getColumn(1).setPreferredWidth(250);
			resultTable.getColumnModel().getColumn(2).setPreferredWidth(50);
			resultTable.getColumnModel().getColumn(3).setPreferredWidth(50);

		} catch (Exception sql) {
			sql.printStackTrace();
		}
	}

	public void resetTable(String newQuery) {
		try {
			tableModel.setQuery(newQuery);
		} catch (IllegalStateException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		coresTabela();
	}

	public void coresTabela() {
		// implemente o renderer da Classe EvenOddRenderer
		TableCellRenderer renderer = new EvenOddRenderer();
		resultTable.getColumnModel().getColumn(0).setCellRenderer(renderer);
		resultTable.getColumnModel().getColumn(1).setCellRenderer(renderer);
		resultTable.getColumnModel().getColumn(2).setCellRenderer(renderer);
		resultTable.getColumnModel().getColumn(3).setCellRenderer(renderer);

		// cor de fundo da barra de rolagem
		scrollPane.setBorder(new MatteBorder(2, 2, 2, 2, cinzaPadrao));
		scrollPane.setBackground(cinzaPadrao);

		// tamanho das colunas
		resultTable.getColumnModel().getColumn(0).setPreferredWidth(1);
		resultTable.getColumnModel().getColumn(1).setPreferredWidth(250);
		resultTable.getColumnModel().getColumn(2).setPreferredWidth(50);
		resultTable.getColumnModel().getColumn(3).setPreferredWidth(50);

		EvenOddRenderer eor = new EvenOddRenderer();
		eor.pintarTabela(resultTable);
	}
}
