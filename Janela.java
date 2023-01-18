import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;
import javax.swing.JPanel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.ArrayList;
import javax.swing.JComboBox;


public class Janela extends JFrame implements ActionListener {
	ArrayList<Departamento> ListaDep;
	ArrayList<Servidor> ListaServ;
	ArrayList<Estagiario> ListaEstag;
	private JTabbedPane abas;
	private JPanel departamento, servidor, estagiario;
	private JLabel textoNome, textoNome2, textoNome3, textoSexo, textoSexo2, textoCPF, textoCPF2, textoCelular, textoCelular2, textoSalario, textoSalario2, textoFaculdade, textoCurso, textoPeriodo, textoTurno, textoMatricula, textoDep, textoDep2;
	private JTextField campoNome, campoNome2, campoNome3, campoSexo, campoSexo2, campoCPF, campoCPF2, campoCelular, campoCelular2, campoSalario, campoSalario2, campoFaculdade, campoCurso, campoPeriodo, campoTurno, campoMatricula;
	private JButton botaoEnviar, botaoProximo, botaoEnviar2, botaoProximo2, botaoEnviar3;
	private JComboBox comboboxDep, comboboxDep2;

	public Janela() {
		super("Cadastro de Funcionários");
		abas = new JTabbedPane();
		add(BorderLayout.CENTER, abas);
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


		comboboxDep = new JComboBox();
		comboboxDep2 = new JComboBox();
		comboboxDep.setBounds(150, 280, 100, 20);
		comboboxDep2.setBounds(150, 400, 100, 20);

		ListaDep = new ArrayList<>();
		ListaServ = new ArrayList<>();
		ListaEstag = new ArrayList<>();
		
		departamento = new JPanel();
		servidor = new JPanel();
		estagiario = new JPanel();

		textoNome = new JLabel("Departamento: ");
		textoNome.setBounds(50,200,100,20);
		textoNome2 = new JLabel("Nome: ");
		textoNome2.setBounds(50,40,100,20);
		textoSexo = new JLabel("Sexo: ");
		textoSexo.setBounds(50,80,100,20);
		textoCPF = new JLabel("CPF: ");
		textoCPF.setBounds(50,120,100,20);
		textoCelular = new JLabel("Celular: ");
		textoCelular.setBounds(50,160,100,20);
		textoSalario = new JLabel("Salário: ");
		textoSalario.setBounds(50,200,100,20);
		textoNome3 = new JLabel("Nome: ");
		textoNome3.setBounds(50,40,100,20);
		textoSexo2 = new JLabel("Sexo: ");
		textoSexo2.setBounds(50,80,100,20);
		textoCPF2 = new JLabel("CPF: ");
		textoCPF2.setBounds(50,120,100,20);
		textoCelular2 = new JLabel("Celular: ");
		textoCelular2.setBounds(50,160,100,20);
		textoSalario2 = new JLabel("Salário: ");
		textoSalario2.setBounds(50,200,100,20);
		textoFaculdade = new JLabel("Faculdade: ");
		textoFaculdade.setBounds(50, 240, 100, 20);
		textoCurso = new JLabel("Curso: ");
		textoCurso.setBounds(50, 280, 100, 20);
		textoPeriodo = new JLabel("Período: ");
		textoPeriodo.setBounds(50, 320, 100, 20);
		textoTurno = new JLabel("Turno: ");
		textoTurno.setBounds(50, 360, 100, 20);
		textoMatricula = new JLabel("Matrícula: ");
		textoMatricula.setBounds(50, 240, 100, 20);
		textoDep = new JLabel("Departamento");
		textoDep.setBounds(50, 280, 100, 20);
		textoDep2 = new JLabel("Dep: ");
		textoDep2.setBounds(50, 400, 100, 20);

		campoNome = new JTextField();
		campoNome.setBounds(150, 200, 100, 20);
		campoNome2 = new JTextField();
		campoNome2.setBounds(150, 40, 100, 20);
		campoNome3 = new JTextField();
		campoNome3.setBounds(150, 40, 100, 20);
		campoSexo = new JTextField();
		campoSexo.setBounds(150, 80, 100, 20);
		campoSexo2 = new JTextField();
		campoSexo2.setBounds(150, 80, 100, 20);
		campoCPF = new JTextField();
		campoCPF.setBounds(150, 120, 100, 20);
		campoCPF2 = new JTextField();
		campoCPF2.setBounds(150, 120, 100, 20);
		campoCelular = new JTextField();
		campoCelular.setBounds(150, 160, 100, 20);
		campoCelular2 = new JTextField();
		campoCelular2.setBounds(150, 160, 100, 20);
		campoSalario = new JTextField();
		campoSalario.setBounds(150, 200, 100, 20);
		campoSalario2 = new JTextField();
		campoSalario2.setBounds(150, 200, 100, 20);
		campoFaculdade = new JTextField();
		campoFaculdade.setBounds(150, 240, 100, 20);
		campoCurso = new JTextField();
		campoCurso.setBounds(150, 280, 100, 20);
		campoPeriodo = new JTextField();
		campoPeriodo.setBounds(150, 320, 100, 20);
		campoTurno = new JTextField();
		campoTurno.setBounds(150, 360, 100, 20);
		campoMatricula = new JTextField();
		campoMatricula.setBounds(150, 240, 100, 20);
		

		botaoEnviar = new JButton("Enviar");
		botaoEnviar.setBounds(270, 400, 100, 20);
		botaoProximo = new JButton("Próximo");
		botaoProximo.setBounds(370, 400, 100, 20);
		botaoEnviar2 = new JButton("Enviar");
		botaoEnviar2.setBounds(270, 400, 100, 20);
		botaoProximo2 = new JButton("Próximo");
		botaoProximo2.setBounds(370, 400, 100, 20);
		botaoEnviar3 = new JButton("Enviar");
		botaoEnviar3.setBounds(370, 400, 100, 20);

		botaoEnviar.addActionListener(this);
		botaoEnviar2.addActionListener(this);
		botaoEnviar3.addActionListener(this);
		botaoProximo.addActionListener(this);
		botaoProximo2.addActionListener(this);	
		

		abas.addTab("Departamento", departamento);
		abas.addTab("Servidor", servidor);
		abas.addTab("Estagiário", estagiario);
		abas.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int aba = abas.getSelectedIndex();
                System.out.println(aba);
			}
		});

		departamento.setLayout(null);
		departamento.add(textoNome);
		servidor.setLayout(null);
		servidor.add(textoNome2);
		servidor.add(textoSexo);
		servidor.add(textoCPF);
		servidor.add(textoCelular);
		servidor.add(textoSalario);
		servidor.add(textoMatricula);
		servidor.add(textoDep);
		estagiario.setLayout(null);
		estagiario.add(textoNome3);
		estagiario.add(textoSexo2);
		estagiario.add(textoCPF2);
		estagiario.add(textoCelular2);
		estagiario.add(textoSalario2);
		estagiario.add(textoFaculdade);
		estagiario.add(textoCurso);
		estagiario.add(textoPeriodo);
		estagiario.add(textoTurno);
		estagiario.add(textoDep2);
		departamento.add(campoNome);
		servidor.add(campoNome2);
		servidor.add(campoSexo);
		servidor.add(campoCPF);
		servidor.add(campoCelular);
		servidor.add(campoSalario);
		servidor.add(campoMatricula);
		estagiario.add(campoNome3);
		estagiario.add(campoSexo2);
		estagiario.add(campoCPF2);
		estagiario.add(campoCelular2);
		estagiario.add(campoSalario2);
		estagiario.add(campoFaculdade);
		estagiario.add(campoCurso);
		estagiario.add(campoPeriodo);
		estagiario.add(campoTurno);
		departamento.add(botaoEnviar);
		departamento.add(botaoProximo);
		servidor.add(botaoEnviar2);
		servidor.add(botaoProximo2);
		estagiario.add(botaoEnviar3);
		servidor.add(comboboxDep);
		estagiario.add(comboboxDep2);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == botaoProximo) {
			abas.setSelectedIndex(1);
		}

		if(e.getSource() == botaoProximo2) {
			abas.setSelectedIndex(2);
		}

		if(e.getSource() == botaoEnviar) {
			Departamento dep = new Departamento();
			ArrayList ListFunc = new ArrayList<>();
			dep.setNome(campoNome.getText());
			dep.setFuncionarios(ListFunc);
			ListaDep.add(dep);
			campoNome.setText("");
			cbDeps();
		}

		if(e.getSource() == botaoEnviar2) {
			int index = comboboxDep.getSelectedIndex();
			Servidor serv = new Servidor();
			serv.setNome(campoNome2.getText());
			serv.setSexo(campoSexo.getText());
			serv.setCpf(campoCPF.getText());
			serv.setCelular(campoCelular.getText());
			serv.setSalario(Double.parseDouble(campoSalario.getText()));
			serv.setDepartamento(ListaDep.get(index-1));
			serv.setMatricula(Integer.parseInt(campoMatricula.getText()));
			ListaServ.add(serv);
			ListaDep.get(index-1).adicionarFuncionario(serv);
			campoNome2.setText("");
			campoSexo.setText("");
			campoCPF.setText("");
			campoCelular.setText("");
			campoSalario.setText("");
			campoMatricula.setText("");
			cbDeps();
		}

		if(e.getSource() == botaoEnviar3) {
			int index2 = comboboxDep2.getSelectedIndex();
			Estagiario estagi = new Estagiario();
			Instituicao instituicao = new Instituicao();
			estagi.setNome(campoNome3.getText());
			estagi.setSexo(campoSexo2.getText());
			estagi.setCpf(campoCPF2.getText());
			estagi.setCelular(campoCelular2.getText());
			estagi.setSalario(Double.parseDouble(campoSalario2.getText()));
			estagi.setDepartamento(ListaDep.get(index2-1));
			estagi.setCurso(instituicao);
			estagi.getCurso().setNome(campoFaculdade.getText());
			estagi.getCurso().setCurso(campoCurso.getText());
			estagi.getCurso().setPeriodo(Integer.parseInt(campoPeriodo.getText()));
			estagi.getCurso().setTurno(campoTurno.getText());
			ListaEstag.add(estagi);
			ListaDep.get(index2-1).adicionarFuncionario(estagi);
			campoNome3.setText("");
			campoSexo2.setText("");
			campoCPF2.setText("");
			campoCelular2.setText("");
			campoSalario2.setText("");
			campoFaculdade.setText("");
			campoCurso.setText("");
			campoPeriodo.setText("");
			campoTurno.setText("");
			cbDeps();
		}
	}

	public void cbDeps() {
		comboboxDep.removeAllItems();
		comboboxDep.addItem("Selecione");
		comboboxDep2.removeAllItems();
		comboboxDep2.addItem("Selecione");
		for(int i = 0; i < ListaDep.size(); i++) {
			comboboxDep.addItem(ListaDep.get(i).getNome());
			comboboxDep2.addItem(ListaDep.get(i).getNome());
		}
	}
}
