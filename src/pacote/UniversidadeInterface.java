/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pacote;

import exception.DisciplinaNaoInformadaException;
import exception.ProfessorNaoAtribuidoException;
import exception.TipoDeAulaNaoAtribuidoException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author nathan
 */
public class UniversidadeInterface extends javax.swing.JFrame {
    Universidade unb = new Universidade("UnB");
    Campus campus;
    Predio predio;
    Disciplina disciplina;
    Matriculado matriculado;
    Turma turma;
    Sala sala;
    
    public UniversidadeInterface() {
        initComponents();
        setLocationRelativeTo(null);
        unb.addCampus("FGA");
        unb.addCampus("Darcy Ribeiro");
	unb.addProfessor("Lanna", "130000000");
        unb.addProfessor("Andre", "130000001");
        unb.addProfessor("Marcela", "130000002");
        unb.addProfessor("Joao", "130000003");
        unb.addProfessor("Mariana", "130000004");
        unb.addProfessor("Luiza", "130000005");
	unb.addAluno("Vitor", "130000006");
	unb.addAluno("Nathan", "130000007");
	unb.addAluno("Tomás", "130000008");
	unb.addAluno("Eric", "130000009");
        unb.addAluno("Carlos", "130000010");
	unb.addAluno("Luis", "130000011");
	unb.addAluno("Marcio", "130000012");
	unb.addAluno("Janaina", "130000013");
        unb.addAluno("Carla", "130000014");
	unb.addAluno("Roberto", "130000015");
	unb.addAluno("Anna Flávia", "130000016");
	unb.addAluno("Tereza", "130000017");
        unb.addAluno("Mario", "130000018");
	unb.addAluno("Fabio", "130000019");
	unb.addAluno("Ítalo", "130000020");
	unb.addAluno("Davi", "130000021");
        unb.addAluno("Letícia", "130000022");
	unb.addAluno("Thaise", "130000023");
	unb.addAluno("Ana Clara", "130000024");
	unb.addAluno("Genelides", "130000025");
        unb.addAluno("Herberth", "130000026");
	unb.addAluno("Nicole", "130000027");
	unb.addAluno("Nathalia", "130000028");
	unb.addAluno("Lorena", "130000029");
        unb.addAluno("Samuel", "130000030");
	campus = unb.campus.get(unb.getIDCampusStr("FGA"));
        campus.addPredio("Restaurante Universitário");
	campus.addPredio("UED");
	predio = campus.predios.get(campus.getIDPredioStr("UED"));
	predio.addSala("Lab SS",40, "Graduação");
	predio.addSala("Mocap",40, "Extensão");
	predio.addSala("Lab NEI",20, "Graduação");
	predio.addSala("Lab Eletricidade",20, "Graduação");
	predio.addSala("Lab Materiais",20, "Extensão");
	predio.addSala("Lab Termo",20, "Extensão");
	predio.addSala("Lab LEI",20, "Graduação");
	predio.addSala("Lab Física",20, "Graduação");
	predio.addSala("Lab Química",20, "Extensão");
	campus.addPredio("UAC");
	predio = campus.predios.get(campus.getIDPredioStr("UAC"));
	predio.addSala("S1",120, "Graduação");
	predio.addSala("S2",120, "Graduação");
	predio.addSala("S3",120, "Graduação");
	predio.addSala("S4",120, "Graduação");
	predio.addSala("S5",120, "Extensão");
	predio.addSala("S6",120, "Extensão");
	predio.addSala("S7",120, "Extensão");
	predio.addSala("S8",120, "Extensão");
	predio.addSala("S9",120, "Graduação");
	predio.addSala("S10",60, "Graduação");
	predio.addSala("I1",40, "Graduação");
	predio.addSala("I2",40, "Graduação");
	predio.addSala("I3",40, "Graduação");
	predio.addSala("I4",40, "Graduação");
	predio.addSala("I5",40, "Graduação");
	predio.addSala("I6",40, "Extensão");
	predio.addSala("I7",40, "Extensão");
	predio.addSala("I8",40, "Extensão");
	predio.addSala("I9",40, "Extensão");
	predio.addSala("I10",60, "Graduação");
	predio.addSala("fake",19, "Graduação");
	campus.addDisciplina("Orientação a Objeto", 4, "Graduação");
	disciplina = campus.disciplinas.get(campus.getIDDisciplinaStr("Orientação a Objeto"));
	disciplina.addTurma("A",41,1,4,2,3);
	disciplina.addTurma("B",41,1,4,2,4);
	disciplina.addTurma("C",40,1,4,2,4);
	disciplina.addTurma("D",41,1,4,2,4);
	campus.addDisciplina("Princípios de Comunicação", 6, "Graduação");
	disciplina = campus.disciplinas.get(campus.getIDDisciplinaStr("Princípios de Comunicação"));
	disciplina.addTurma("A",20,4,2,5,3,5,5);
	disciplina.addTurma("fake",19,4,2,5,3,5,5);
	campus.addDisciplina("Cálculo 3", 6, "Extensão");
	disciplina = campus.disciplinas.get(campus.getIDDisciplinaStr("Cálculo 3"));
	disciplina.addTurma("A",40,4,2,5,3,5,5);
	disciplina.addTurma("B",120,4,2,5,3,5,5);
	disciplina.addTurma("C",41,4,2,5,3,5,5);
	disciplina.addTurma("D",40,4,2,5,3,5,5);
	disciplina.addTurma("E",121,4,2,5,3,5,5);
	disciplina.addTurma("F",120,4,2,5,3,5,5);
	disciplina.addTurma("G",120,4,2,5,3,5,5);
        
        
        
        jTextFieldNomeCampus.setEnabled(false);
        jButtonCampusExcluir1.setEnabled(false);
        jButtonCancelarCampus.setEnabled(false);
        jButtonCadastrarCampus.setEnabled(false);
        
        jTextFieldNomePredio.setEnabled(false);
        jTextFieldCampusPredio.setEnabled(false);
        jButtonExcluirPredio1.setEnabled(false);
        jButtonCancelarPredio.setEnabled(false);
        jButtonCadastrarPredio.setEnabled(false);
        
        jTextFieldCampusSala.setEnabled(false);
        jTextFieldCapacidadeSala.setEnabled(false);
        jTextFieldNomeSala.setEnabled(false);
        jTextFieldPredioSala.setEnabled(false);
        jButtonExcluirSala1.setEnabled(false);
        jButtonCadastrarSala.setEnabled(false);
        jButtonCancelarSala.setEnabled(false);
        jRadioButtonExtensao.setEnabled(false);
        jRadioButtonGraduacao.setEnabled(false);
        jRadioButtonPosGraduacao.setEnabled(false);
    
        jTextFieldNomeDisciplina.setEnabled(false);
        jTextFieldCampusDisciplina.setEnabled(false);
        jTextFieldCredito.setEnabled(false);
        jRadioButtonGraduacao1.setEnabled(false);
        jRadioButtonPosGraduacao1.setEnabled(false);
        jRadioButtonExtensao1.setEnabled(false);
        jButtonExcluirDisciplina1.setEnabled(false);
        jButtonCancelarDisciplina.setEnabled(false);
        jButtonCadastrarDisciplina.setEnabled(false);
        
        jTextFieldNomeTurma.setEnabled(false);
        jTextFieldCampusTurma.setEnabled(false);
        jTextFieldDisciplinaTurma.setEnabled(false);
        jTextFieldProfessorTurma.setEnabled(false);
        jTextFieldQtdAlunosTurma.setEnabled(false);
        jTextFieldDia.setEnabled(false);
        jTextFieldHorario.setEnabled(false);
        jButtonExcluirTurma1.setEnabled(false);
        jButtonCancelarTurma.setEnabled(false);
        jButtonCadastrarTurma.setEnabled(false);
        
        
        loadJTableCampus();
        loadJTablePredio();
        loadJTableSala();
        loadJTableDisciplina();
        loadJTableMatriculado();
        loadJTableTurma();
    }
    
    public void loadJTableCampus(){
         Object colunas[] = {"Campus"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
        
        for(int i=0; i<unb.campus.size() ;i++){
            Object linha[] = new Object[]{unb.campus.get(i).getNome()};
            
            modelo.addRow(linha);    
        }
        
        jTableCampus.setModel(modelo);


    }
    
    public void loadJTablePredio(){
         Object colunas[] = {"Predio", "Campus"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
        
        for(int i=0; i<unb.campus.size() ;i++){
            for(int j=0; j<unb.campus.get(i).predios.size(); j++){
                Object linha[] = new Object[]{unb.campus.get(i).predios.get(j).getNome(),unb.campus.get(i).getNome()};
                modelo.addRow(linha); 
            }   
        }
        
        jTablePredio.setModel(modelo);


    }
    
    public void loadJTableSala(){
         Object colunas[] = {"Sala","Predio", "Campus"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
        
        for(int i=0; i<unb.campus.size() ;i++){
            for(int j=0; j<unb.campus.get(i).predios.size(); j++){
                for(int w=0; w<unb.campus.get(i).predios.get(j).salas.size(); w++){
                    Object linha[] = new Object[]{unb.campus.get(i).predios.get(j).salas.get(w).getNome(),unb.campus.get(i).predios.get(j).getNome(),unb.campus.get(i).getNome()};
                    modelo.addRow(linha);
                }
            }   
        }
        
        jTableSala.setModel(modelo);


    }
    
    public void loadJTableDisciplina(){
         Object colunas[] = {"Disciplina", "Campus"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
        
        for(int i=0; i<unb.campus.size() ;i++){
            for(int j=0; j<unb.campus.get(i).disciplinas.size(); j++){
                Object linha[] = new Object[]{unb.campus.get(i).disciplinas.get(j).getNome(),unb.campus.get(i).getNome()};
                modelo.addRow(linha); 
            }   
        }
        
        jTableDisciplina.setModel(modelo);


    }
    
    public void loadJTableMatriculado(){
         Object colunas[] = {"Matriculado", "Ocupação", "Matricula"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
        
        for(int i=0; i<unb.matriculado.size() ;i++){
            Object linha[];
            if(unb.matriculado.get(i).isProfessor()) 
		linha = new Object[]{unb.matriculado.get(i).getNome(), "Professor", unb.matriculado.get(i).getMatricula()};
            else
                linha = new Object[]{unb.matriculado.get(i).getNome(), "Aluno", unb.matriculado.get(i).getMatricula()};
            
            modelo.addRow(linha);
        }
        
        jTableMatriculado.setModel(modelo);


    }
    
    public void loadJTableTurma(){
         Object colunas[] = {"Turma", "Disciplina"};
        DefaultTableModel modelo = new DefaultTableModel(colunas, 0);
        
        for(int i=0; i<unb.campus.size() ;i++){
            for(int j=0; j<unb.campus.get(i).disciplinas.size(); j++){
                 for(int w=0; w<unb.campus.get(i).disciplinas.get(j).turmas.size(); w++){
                    Object linha[];
                     linha = new Object[]{unb.campus.get(i).disciplinas.get(j).turmas.get(w).getNome(), 
                                          unb.campus.get(i).disciplinas.get(j).turmas.get(w).disciplina.getNome()};
                    modelo.addRow(linha);
                 }
            }   
        }
        
        jTableTurma.setModel(modelo);
        

    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCampus = new javax.swing.JTable();
        jButtonExcluirCampus = new javax.swing.JButton();
        jButtonNovoCampus = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldNomeCampus = new javax.swing.JTextField();
        jButtonCadastrarCampus = new javax.swing.JButton();
        jButtonCancelarCampus = new javax.swing.JButton();
        jButtonCampusExcluir1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTablePredio = new javax.swing.JTable();
        jButtonExcluirPredio = new javax.swing.JButton();
        jButtonNovoPredio = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldNomePredio = new javax.swing.JTextField();
        jTextFieldCampusPredio = new javax.swing.JTextField();
        jButtonCadastrarPredio = new javax.swing.JButton();
        jButtonCancelarPredio = new javax.swing.JButton();
        jButtonExcluirPredio1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableSala = new javax.swing.JTable();
        jButtonExcluirSala = new javax.swing.JButton();
        jButtonNovoSala = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextFieldNomeSala = new javax.swing.JTextField();
        jTextFieldPredioSala = new javax.swing.JTextField();
        jTextFieldCampusSala = new javax.swing.JTextField();
        jTextFieldCapacidadeSala = new javax.swing.JTextField();
        jRadioButtonGraduacao = new javax.swing.JRadioButton();
        jRadioButtonPosGraduacao = new javax.swing.JRadioButton();
        jRadioButtonExtensao = new javax.swing.JRadioButton();
        jButtonCadastrarSala = new javax.swing.JButton();
        jButtonCancelarSala = new javax.swing.JButton();
        jButtonExcluirSala1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableDisciplina = new javax.swing.JTable();
        jButtonNovoDisciplina = new javax.swing.JButton();
        jButtonExcluirDisciplina = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldNomeDisciplina = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jTextFieldCampusDisciplina = new javax.swing.JTextField();
        jButtonCancelarDisciplina = new javax.swing.JButton();
        jButtonCadastrarDisciplina = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextFieldCredito = new javax.swing.JTextField();
        jRadioButtonGraduacao1 = new javax.swing.JRadioButton();
        jRadioButtonPosGraduacao1 = new javax.swing.JRadioButton();
        jRadioButtonExtensao1 = new javax.swing.JRadioButton();
        jButtonExcluirDisciplina1 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTableTurma = new javax.swing.JTable();
        jButtonExcluirTurma = new javax.swing.JButton();
        jButtonNovoTurma = new javax.swing.JButton();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jTextFieldNomeTurma = new javax.swing.JTextField();
        jTextFieldDisciplinaTurma = new javax.swing.JTextField();
        jTextFieldProfessorTurma = new javax.swing.JTextField();
        jTextFieldQtdAlunosTurma = new javax.swing.JTextField();
        jTextFieldDia = new javax.swing.JTextField();
        jTextFieldHorario = new javax.swing.JTextField();
        jButtonCadastrarTurma = new javax.swing.JButton();
        jButtonCancelarTurma = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jTextFieldCampusTurma = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jButtonExcluirTurma1 = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTableMatriculado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTableCampus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Campus"
            }
        ));
        jScrollPane1.setViewportView(jTableCampus);

        jButtonExcluirCampus.setText("Excluir");
        jButtonExcluirCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirCampusActionPerformed(evt);
            }
        });

        jButtonNovoCampus.setText("Novo");
        jButtonNovoCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoCampusActionPerformed(evt);
            }
        });

        jLabel1.setText("Cadastrar campus");

        jLabel2.setText("Nome:");

        jTextFieldNomeCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeCampusActionPerformed(evt);
            }
        });

        jButtonCadastrarCampus.setText("Cadastrar");
        jButtonCadastrarCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarCampusActionPerformed(evt);
            }
        });

        jButtonCancelarCampus.setText("Cancelar");
        jButtonCancelarCampus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarCampusActionPerformed(evt);
            }
        });

        jButtonCampusExcluir1.setText("Excluir");
        jButtonCampusExcluir1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCampusExcluir1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNomeCampus))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonNovoCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExcluirCampus, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jButtonCampusExcluir1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelarCampus)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCadastrarCampus)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluirCampus)
                    .addComponent(jButtonNovoCampus))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldNomeCampus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrarCampus)
                    .addComponent(jButtonCancelarCampus)
                    .addComponent(jButtonCampusExcluir1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Campus", jPanel1);

        jTablePredio.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Predio", "Campus"
            }
        ));
        jScrollPane2.setViewportView(jTablePredio);

        jButtonExcluirPredio.setText("Excluir");
        jButtonExcluirPredio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirPredioActionPerformed(evt);
            }
        });

        jButtonNovoPredio.setText("Novo");
        jButtonNovoPredio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoPredioActionPerformed(evt);
            }
        });

        jLabel3.setText("Cadastrar predio");

        jLabel4.setText("Nome:");

        jLabel5.setText("Campus:");

        jTextFieldNomePredio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomePredioActionPerformed(evt);
            }
        });

        jButtonCadastrarPredio.setText("Cadastrar");
        jButtonCadastrarPredio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarPredioActionPerformed(evt);
            }
        });

        jButtonCancelarPredio.setText("Cancelar");
        jButtonCancelarPredio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarPredioActionPerformed(evt);
            }
        });

        jButtonExcluirPredio1.setText("Excluir");
        jButtonExcluirPredio1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirPredio1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomePredio)
                            .addComponent(jTextFieldCampusPredio)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonNovoPredio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExcluirPredio, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jButtonExcluirPredio1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelarPredio)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCadastrarPredio)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluirPredio)
                    .addComponent(jButtonNovoPredio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextFieldNomePredio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldCampusPredio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrarPredio)
                    .addComponent(jButtonCancelarPredio)
                    .addComponent(jButtonExcluirPredio1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Predio", jPanel2);

        jTableSala.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sala", "Predio", "Campus"
            }
        ));
        jScrollPane3.setViewportView(jTableSala);

        jButtonExcluirSala.setText("Excluir");
        jButtonExcluirSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirSalaActionPerformed(evt);
            }
        });

        jButtonNovoSala.setText("Novo");
        jButtonNovoSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoSalaActionPerformed(evt);
            }
        });

        jLabel6.setText("Cadastrar sala");

        jLabel7.setText("Nome:");

        jLabel8.setText("Predio:");

        jLabel9.setText("Campus:");

        jLabel10.setText("Capacidade:");

        jTextFieldNomeSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeSalaActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonGraduacao);
        jRadioButtonGraduacao.setText("graduação");
        jRadioButtonGraduacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGraduacaoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonPosGraduacao);
        jRadioButtonPosGraduacao.setText("pós-graduação");
        jRadioButtonPosGraduacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPosGraduacaoActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonExtensao);
        jRadioButtonExtensao.setText("extensão");

        jButtonCadastrarSala.setText("Cadastrar");
        jButtonCadastrarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarSalaActionPerformed(evt);
            }
        });

        jButtonCancelarSala.setText("Cancelar");
        jButtonCancelarSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarSalaActionPerformed(evt);
            }
        });

        jButtonExcluirSala1.setText("Excluir");
        jButtonExcluirSala1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirSala1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeSala)
                            .addComponent(jTextFieldPredioSala)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jRadioButtonGraduacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonPosGraduacao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonExtensao)))
                        .addGap(0, 68, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldCapacidadeSala)
                            .addComponent(jTextFieldCampusSala)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButtonNovoSala, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExcluirSala, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jButtonExcluirSala1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelarSala)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCadastrarSala)))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluirSala)
                    .addComponent(jButtonNovoSala))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldNomeSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldPredioSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldCampusSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextFieldCapacidadeSala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonGraduacao)
                    .addComponent(jRadioButtonPosGraduacao)
                    .addComponent(jRadioButtonExtensao))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrarSala)
                    .addComponent(jButtonCancelarSala)
                    .addComponent(jButtonExcluirSala1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Sala", jPanel3);

        jTableDisciplina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Disciplina", "Campus"
            }
        ));
        jScrollPane4.setViewportView(jTableDisciplina);

        jButtonNovoDisciplina.setText("Novo");
        jButtonNovoDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoDisciplinaActionPerformed(evt);
            }
        });

        jButtonExcluirDisciplina.setText("Excluir");
        jButtonExcluirDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirDisciplinaActionPerformed(evt);
            }
        });

        jLabel11.setText("Cadastrar disciplina");

        jLabel12.setText("Nome:");

        jTextFieldNomeDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeDisciplinaActionPerformed(evt);
            }
        });

        jLabel13.setText("Campus:");

        jButtonCancelarDisciplina.setText("Cancelar");
        jButtonCancelarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarDisciplinaActionPerformed(evt);
            }
        });

        jButtonCadastrarDisciplina.setText("Cadastrar");
        jButtonCadastrarDisciplina.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarDisciplinaActionPerformed(evt);
            }
        });

        jLabel14.setText("Credito:");

        buttonGroup1.add(jRadioButtonGraduacao1);
        jRadioButtonGraduacao1.setText("graduação");
        jRadioButtonGraduacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonGraduacao1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonPosGraduacao1);
        jRadioButtonPosGraduacao1.setText("pós-graduação");
        jRadioButtonPosGraduacao1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonPosGraduacao1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButtonExtensao1);
        jRadioButtonExtensao1.setText("extensão");

        jButtonExcluirDisciplina1.setText("Excluir");
        jButtonExcluirDisciplina1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirDisciplina1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNomeDisciplina)
                            .addComponent(jTextFieldCampusDisciplina)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(16, 16, 16)
                        .addComponent(jTextFieldCredito))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jRadioButtonGraduacao1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonPosGraduacao1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButtonExtensao1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jButtonNovoDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonExcluirDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jButtonExcluirDisciplina1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCancelarDisciplina)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButtonCadastrarDisciplina)))))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluirDisciplina)
                    .addComponent(jButtonNovoDisciplina))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldNomeDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jTextFieldCampusDisciplina, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jTextFieldCredito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonGraduacao1)
                    .addComponent(jRadioButtonPosGraduacao1)
                    .addComponent(jRadioButtonExtensao1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCancelarDisciplina)
                    .addComponent(jButtonCadastrarDisciplina)
                    .addComponent(jButtonExcluirDisciplina1))
                .addContainerGap(131, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Disciplina", jPanel4);

        jTableTurma.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Turma", "Disciplina"
            }
        ));
        jScrollPane6.setViewportView(jTableTurma);

        jButtonExcluirTurma.setText("Excluir");
        jButtonExcluirTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirTurmaActionPerformed(evt);
            }
        });

        jButtonNovoTurma.setText("Novo");
        jButtonNovoTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovoTurmaActionPerformed(evt);
            }
        });

        jLabel15.setText("Cadastrar Turma");

        jLabel17.setText("Disciplina:");

        jLabel18.setText("Professor:");

        jLabel19.setText("Qtd. alunos:");

        jLabel20.setText("Dia:");

        jLabel21.setText("Horário:");

        jTextFieldProfessorTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldProfessorTurmaActionPerformed(evt);
            }
        });

        jButtonCadastrarTurma.setText("Cadastrar");
        jButtonCadastrarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCadastrarTurmaActionPerformed(evt);
            }
        });

        jButtonCancelarTurma.setText("Cancelar");
        jButtonCancelarTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelarTurmaActionPerformed(evt);
            }
        });

        jLabel22.setText("Campus:");

        jLabel23.setText("Nome:");

        jButtonExcluirTurma1.setText("Excluir");
        jButtonExcluirTurma1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirTurma1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(39, 39, 39)
                                .addComponent(jTextFieldHorario))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel19)
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldProfessorTurma)
                                    .addComponent(jTextFieldDia)
                                    .addComponent(jTextFieldQtdAlunosTurma)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel23))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldDisciplinaTurma)
                                    .addComponent(jTextFieldNomeTurma)))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(36, 36, 36)
                                .addComponent(jTextFieldCampusTurma))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jButtonNovoTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonExcluirTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                        .addComponent(jButtonExcluirTurma1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonCancelarTurma)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButtonCadastrarTurma)))))
                        .addContainerGap())))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExcluirTurma)
                    .addComponent(jButtonNovoTurma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNomeTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jTextFieldCampusTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jTextFieldDisciplinaTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jTextFieldProfessorTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(jTextFieldQtdAlunosTurma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(jTextFieldDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jTextFieldHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCadastrarTurma)
                    .addComponent(jButtonCancelarTurma)
                    .addComponent(jButtonExcluirTurma1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Turma", jPanel5);

        jTableMatriculado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Matriculado", "Ocupação", "Matricula"
            }
        ));
        jScrollPane5.setViewportView(jTableMatriculado);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Matriculados", jPanel6);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeCampusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeCampusActionPerformed

    private void jButtonNovoCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoCampusActionPerformed
        // TODO add your handling code here:
        jTextFieldNomeCampus.setEnabled(false);
        jButtonCampusExcluir1.setEnabled(false);
        jButtonCancelarCampus.setEnabled(false);
        jButtonCadastrarCampus.setEnabled(false);
    }//GEN-LAST:event_jButtonNovoCampusActionPerformed

    private void jButtonCancelarCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarCampusActionPerformed
        // TODO add your handling code here:
        jTextFieldNomeCampus.setEnabled(false);
        jButtonCancelarCampus.setEnabled(false);
        jButtonCadastrarCampus.setEnabled(false);
        
        jTextFieldNomeCampus.setText("");
    }//GEN-LAST:event_jButtonCancelarCampusActionPerformed

    private void jButtonCadastrarCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarCampusActionPerformed
        // TODO add your handling code here:
        String nome;
        nome = jTextFieldNomeCampus.getText();
        System.out.println(nome.length() + nome);
        unb.addCampus(nome);
        
        
        
        loadJTableCampus();
        
        
        jTextFieldNomeCampus.setEnabled(false);
        jButtonCancelarCampus.setEnabled(false);
        jButtonCadastrarCampus.setEnabled(false);
        
        jTextFieldNomeCampus.setText("");
    }//GEN-LAST:event_jButtonCadastrarCampusActionPerformed

    private void jButtonExcluirCampusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirCampusActionPerformed
        // TODO add your handling code here:
        /*int aux = jTableCampus.getSelectedRow();
        
        if(aux >= 0 && aux <= unb.campus.size()){
            unb.campus.remove(aux);
        }
        loadJTableCampus();
        loadJTablePredio();
        loadJTableSala();
        loadJTableDisciplina();
        loadJTableTurma();
        */
        jTextFieldNomeCampus.setEnabled(true);
        jButtonCampusExcluir1.setEnabled(true);
        jButtonCancelarCampus.setEnabled(true);
        jButtonCadastrarCampus.setEnabled(false);
    }//GEN-LAST:event_jButtonExcluirCampusActionPerformed

    private void jTextFieldNomePredioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomePredioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomePredioActionPerformed

    private void jButtonNovoPredioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoPredioActionPerformed
        // TODO add your handling code here:
        jTextFieldNomePredio.setEnabled(true);
        jTextFieldCampusPredio.setEnabled(true);
        jButtonCancelarPredio.setEnabled(true);
        jButtonCadastrarPredio.setEnabled(true);
        
        jTextFieldNomePredio.setText("");
        jTextFieldCampusPredio.setText("");
    }//GEN-LAST:event_jButtonNovoPredioActionPerformed

    private void jButtonCancelarPredioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarPredioActionPerformed
        // TODO add your handling code here:
        jTextFieldNomePredio.setEnabled(false);
        jTextFieldCampusPredio.setEnabled(false);
        jButtonExcluirPredio1.setEnabled(false);
        jButtonCancelarPredio.setEnabled(false);
        jButtonCadastrarPredio.setEnabled(false);
        
        jTextFieldNomePredio.setText("");
        jTextFieldCampusPredio.setText("");
    }//GEN-LAST:event_jButtonCancelarPredioActionPerformed

    private void jButtonCadastrarPredioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarPredioActionPerformed
         // TODO add your handling code here:
        String nomePredio;
        String nomeCampus;
        int aux;
        
        nomePredio = jTextFieldNomePredio.getText();
        nomeCampus = jTextFieldCampusPredio.getText();
        
        if(unb.getIDCampusStr(nomeCampus)>-1) {
            aux = unb.getIDCampusStr(nomeCampus);
            unb.campus.get(aux).addPredio(nomePredio);
	} else {
            System.out.println("Campus não encontrado!");
	}
        
        loadJTablePredio();
        
        
        
        jTextFieldNomePredio.setEnabled(false);
        jTextFieldCampusPredio.setEnabled(false);
        jButtonCancelarPredio.setEnabled(false);
        jButtonCadastrarPredio.setEnabled(false);
        
        jTextFieldNomePredio.setText("");
        jTextFieldCampusPredio.setText("");
    }//GEN-LAST:event_jButtonCadastrarPredioActionPerformed

    private void jRadioButtonGraduacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGraduacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonGraduacaoActionPerformed

    private void jRadioButtonPosGraduacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPosGraduacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPosGraduacaoActionPerformed

    private void jTextFieldNomeSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeSalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeSalaActionPerformed

    private void jButtonNovoSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoSalaActionPerformed
        // TODO add your handling code here:
        jTextFieldCampusSala.setEnabled(true);
        jTextFieldCapacidadeSala.setEnabled(true);
        jTextFieldNomeSala.setEnabled(true);
        jTextFieldPredioSala.setEnabled(true);
        jButtonExcluirSala1.setEnabled(false);
        jButtonCadastrarSala.setEnabled(true);
        jButtonCancelarSala.setEnabled(true);
        jRadioButtonExtensao.setEnabled(true);
        jRadioButtonGraduacao.setEnabled(true);
        jRadioButtonPosGraduacao.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoSalaActionPerformed

    private void jButtonCancelarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarSalaActionPerformed
        // TODO add your handling code here:
        jTextFieldCampusSala.setEnabled(false);
        jTextFieldCapacidadeSala.setEnabled(false);
        jTextFieldNomeSala.setEnabled(false);
        jTextFieldPredioSala.setEnabled(false);
        
        jButtonExcluirSala1.setEnabled(false);
        jButtonCadastrarSala.setEnabled(false);
        jButtonCancelarSala.setEnabled(false);
        
        jRadioButtonExtensao.setEnabled(false);
        jRadioButtonGraduacao.setEnabled(false);
        jRadioButtonPosGraduacao.setEnabled(false);
        
        jTextFieldCampusSala.setText("");
        jTextFieldCapacidadeSala.setText("");
        jTextFieldNomeSala.setText("");
        jTextFieldPredioSala.setText("");
    }//GEN-LAST:event_jButtonCancelarSalaActionPerformed

    private void jButtonCadastrarSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarSalaActionPerformed
        // TODO add your handling code here:
        String nomeSala;
        String capacidade;
        String nomeCampus;
        String nomePredio;
        String tipoAula = null;
        
        int i = 0;
        int aux;
        int aux1;
        
        nomeCampus = jTextFieldCampusSala.getText();
        capacidade = jTextFieldCapacidadeSala.getText();
        nomeSala = jTextFieldNomeSala.getText();
        nomePredio = jTextFieldPredioSala.getText();
        
        
        
        
        
        if(unb.getIDCampusStr(nomeCampus)>-1) {
            campus = unb.campus.get(unb.getIDCampusStr(nomeCampus));
            if(unb.campus.get(unb.getIDCampusStr(nomeCampus)).getIDPredioStr(nomePredio)>-1) {
                predio = campus.predios.get(campus.getIDPredioStr(nomePredio));
                try {
                    i = Integer.parseInt(capacidade); // Caso você queira tipo int, que é o usual.
       
                } catch (NumberFormatException e) {
                    System.out.println("Numero com formato errado!");
                }
                if(i != 0){
                        if(jRadioButtonGraduacao.isSelected()){
                            tipoAula = "Graduação";
                        }
                        else if(jRadioButtonPosGraduacao.isSelected()){
                            tipoAula = "pos-graduacao";
                        }
                        else if(jRadioButtonExtensao.isSelected()){
                            tipoAula = "Extensão";
                        }
                    } else {
                        System.out.println("Informações sobre a capacidade da sala estão incompletas");
                    }
                try {
                    predio.cadastrarSala(nomeSala, tipoAula, i, predio);
		} catch (TipoDeAulaNaoAtribuidoException e) {
                    //System.out.println(e.getInfo());
                    new ErroDisciplina().setVisible(true);
		}
                
            } else {
                System.out.println("Prédio não encontrado!");
            }
	} else {
            System.out.println("Campus não encontrado!");
	}
        
        
        
        
        
        
        /*if(jRadioButtonGraduacao.isSelected() || jRadioButtonPosGraduacao.isSelected() || jRadioButtonExtensao.isSelected() ){ 
                    try {
                            i = Integer.parseInt(capacidade); // Caso você queira tipo int, que é o usual.
       
                        } catch (NumberFormatException e) {
                          System.out.println("Numero com formato errado!");
                        }
                    if(i != 0){
                        aux1 = unb.campus.get(aux).getIDPredioStr(nomePredio);
                        if(jRadioButtonGraduacao.isSelected()){
                            tipoAula = "Graduação";
                        }
                        else if(jRadioButtonPosGraduacao.isSelected()){
                            tipoAula = "pos-graduacao";
                        }
                        else if(jRadioButtonExtensao.isSelected()){
                            tipoAula = "Extensão";
                        }
                        
                        unb.campus.get(aux).predios.get(aux1).addSala(nomeSala,i, tipoAula);
                        System.out.println("Cadastrada");
                    } else {
                        System.out.println("Informações sobre a capacidade da sala estão incompletas");
                    }
                } else {
                     System.out.println("Informações sobre tipo de aula que a sala terá estão incompletas");
                
                }*/
        
        
        
        
        
        
        
        
        
        
        
        
     
        
        loadJTableSala();
        
        
        
        jTextFieldCampusSala.setEnabled(false);
        jTextFieldCapacidadeSala.setEnabled(false);
        jTextFieldNomeSala.setEnabled(false);
        jTextFieldPredioSala.setEnabled(false);
        
        jButtonCadastrarSala.setEnabled(false);
        jButtonCancelarSala.setEnabled(false);
        
        jRadioButtonExtensao.setEnabled(false);
        jRadioButtonGraduacao.setEnabled(false);
        jRadioButtonPosGraduacao.setEnabled(false);
        
        jTextFieldCampusSala.setText("");
        jTextFieldCapacidadeSala.setText("");
        jTextFieldNomeSala.setText("");
        jTextFieldPredioSala.setText("");
    }//GEN-LAST:event_jButtonCadastrarSalaActionPerformed

    private void jButtonNovoDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoDisciplinaActionPerformed
        // TODO add your handling code here:
        jTextFieldNomeDisciplina.setEnabled(true);
        jTextFieldCampusDisciplina.setEnabled(true);
        jTextFieldCredito.setEnabled(true);
        jRadioButtonGraduacao1.setEnabled(true);
        jRadioButtonPosGraduacao1.setEnabled(true);
        jRadioButtonExtensao1.setEnabled(true);
        jButtonExcluirDisciplina1.setEnabled(false);
        jButtonCancelarDisciplina.setEnabled(true);
        jButtonCadastrarDisciplina.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoDisciplinaActionPerformed

    private void jTextFieldNomeDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeDisciplinaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeDisciplinaActionPerformed

    private void jButtonCancelarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarDisciplinaActionPerformed
        // TODO add your handling code here:
        jTextFieldNomeDisciplina.setEnabled(false);
        jTextFieldCampusDisciplina.setEnabled(false);
        jTextFieldCredito.setEnabled(false);
        jRadioButtonGraduacao1.setEnabled(false);
        jRadioButtonPosGraduacao1.setEnabled(false);
        jRadioButtonExtensao1.setEnabled(false);
        jButtonExcluirDisciplina1.setEnabled(false);
        jButtonCancelarDisciplina.setEnabled(false);
        jButtonCadastrarDisciplina.setEnabled(false);
        
        jTextFieldNomeDisciplina.setText("");
        jTextFieldCampusDisciplina.setText("");
        jTextFieldCredito.setText("");
    }//GEN-LAST:event_jButtonCancelarDisciplinaActionPerformed

    private void jButtonCadastrarDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarDisciplinaActionPerformed
        // TODO add your handling code here:
        String nomeDisciplina;
        String nomeCampus;
        String creditos;
        String tipoAula = null;
        
        int i = 0;
        int aux;
        
        nomeDisciplina = jTextFieldNomeDisciplina.getText();
        nomeCampus = jTextFieldCampusDisciplina.getText();
        creditos = jTextFieldCredito.getText();
        
        try {
            i = Integer.parseInt(creditos); // Caso você queira tipo int, que é o usual.
       
        } catch (NumberFormatException e){ 
            System.out.println("Numero com formato errado!");
        }
        
        
        
        
	if(unb.getIDCampusStr(nomeCampus)>-1) {
            aux = unb.getIDCampusStr(nomeCampus);
            if(jRadioButtonGraduacao1.isSelected()){
                tipoAula = "Graduação";
            }
            else if(jRadioButtonPosGraduacao1.isSelected()){
                tipoAula = "pos-graduacao";
            }
            else if(jRadioButtonExtensao1.isSelected()){
                tipoAula = "Extensão";
            }
            campus = unb.campus.get(aux);
            campus.addDisciplina(nomeDisciplina, i, tipoAula);
	} else {
            System.out.println("Campus não encontrado!");
	}
        
        loadJTableDisciplina();
        
        jTextFieldNomeDisciplina.setEnabled(false);
        jTextFieldCampusDisciplina.setEnabled(false);
        jTextFieldCredito.setEnabled(false);
        jRadioButtonGraduacao1.setEnabled(false);
        jRadioButtonPosGraduacao1.setEnabled(false);
        jRadioButtonExtensao1.setEnabled(false);
        jButtonCancelarDisciplina.setEnabled(false);
        jButtonCadastrarDisciplina.setEnabled(false);
        
        jTextFieldNomeDisciplina.setText("");
        jTextFieldCampusDisciplina.setText("");
        jTextFieldCredito.setText("");
    }//GEN-LAST:event_jButtonCadastrarDisciplinaActionPerformed

    private void jRadioButtonGraduacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonGraduacao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonGraduacao1ActionPerformed

    private void jRadioButtonPosGraduacao1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonPosGraduacao1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonPosGraduacao1ActionPerformed

    private void jTextFieldProfessorTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldProfessorTurmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldProfessorTurmaActionPerformed

    private void jButtonNovoTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovoTurmaActionPerformed
        // TODO add your handling code here:
        jTextFieldNomeTurma.setEnabled(true);
        jTextFieldCampusTurma.setEnabled(true);
        jTextFieldDisciplinaTurma.setEnabled(true);
        jTextFieldProfessorTurma.setEnabled(true);
        jTextFieldQtdAlunosTurma.setEnabled(true);
        jTextFieldDia.setEnabled(true);
        jTextFieldHorario.setEnabled(true);
        jButtonCancelarTurma.setEnabled(false);
        jButtonCancelarTurma.setEnabled(true);
        jButtonCadastrarTurma.setEnabled(true);
    }//GEN-LAST:event_jButtonNovoTurmaActionPerformed

    private void jButtonCancelarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelarTurmaActionPerformed
        // TODO add your handling code here:
        jTextFieldNomeTurma.setEnabled(false);
        jTextFieldCampusTurma.setEnabled(false);
        jTextFieldDisciplinaTurma.setEnabled(false);
        jTextFieldProfessorTurma.setEnabled(false);
        jTextFieldQtdAlunosTurma.setEnabled(false);
        jTextFieldDia.setEnabled(false);
        jTextFieldHorario.setEnabled(false);
        jButtonExcluirTurma1.setEnabled(false);
        jButtonCancelarTurma.setEnabled(false);
        jButtonCadastrarTurma.setEnabled(false);
        
        jTextFieldNomeTurma.setText("");
        jTextFieldCampusTurma.setText("");
        jTextFieldDisciplinaTurma.setText("");
        jTextFieldProfessorTurma.setText("");
        jTextFieldQtdAlunosTurma.setText("");
        jTextFieldDia.setText("");
        jTextFieldHorario.setText("");
    }//GEN-LAST:event_jButtonCancelarTurmaActionPerformed

    private void jButtonCadastrarTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadastrarTurmaActionPerformed
        // TODO add your handling code here:
        String nomeTurma;
        String nomeCampus;
        String nomeDisciplina;
        String nomeProfessor;
        String qtdAlunos;
        String dia;
        String horario;
        
        nomeTurma = jTextFieldNomeTurma.getText();
        nomeCampus = jTextFieldCampusTurma.getText();
        nomeDisciplina = jTextFieldDisciplinaTurma.getText();
        nomeProfessor = jTextFieldProfessorTurma.getText();
        qtdAlunos = jTextFieldQtdAlunosTurma.getText();
        dia = jTextFieldDia.getText();
        horario = jTextFieldHorario.getText();
        
        
        int qtdAlunos2 = 0;
        int dia2 = 0;
        int horario2 = 0;
        
        try {
            qtdAlunos2 = Integer.parseInt(qtdAlunos);
            dia2 = Integer.parseInt(dia);
            horario2 = Integer.parseInt(horario);
       
        } catch (NumberFormatException e){ 
            System.out.println("Numero com formato errado!");
        }
					
	if(unb.getIDCampusStr(nomeCampus)>-1) {
            
            campus = unb.campus.get(unb.getIDCampusStr(nomeCampus));
            try {
                
                campus.cadastrarTurma(nomeTurma, qtdAlunos2, horario2, dia2, nomeProfessor, nomeDisciplina);
                
                
            } catch (ProfessorNaoAtribuidoException | DisciplinaNaoInformadaException e) {
                //System.out.println(e.getInfo());
		new erroTurma().setVisible(true);
            }
            //System.out.println(e.getInfo());
            
	} else {
            System.out.println("Campus não encontrado!");
	}
        
        
        loadJTableTurma();
        
        
        
        
        jTextFieldNomeTurma.setEnabled(false);
        jTextFieldCampusTurma.setEnabled(false);
        jTextFieldDisciplinaTurma.setEnabled(false);
        jTextFieldProfessorTurma.setEnabled(false);
        jTextFieldQtdAlunosTurma.setEnabled(false);
        jTextFieldDia.setEnabled(false);
        jTextFieldHorario.setEnabled(false);
        jButtonCancelarTurma.setEnabled(false);
        jButtonCadastrarTurma.setEnabled(false);
        
        jTextFieldNomeTurma.setText("");
        jTextFieldCampusTurma.setText("");
        jTextFieldDisciplinaTurma.setText("");
        jTextFieldProfessorTurma.setText("");
        jTextFieldQtdAlunosTurma.setText("");
        jTextFieldDia.setText("");
        jTextFieldHorario.setText("");
    }//GEN-LAST:event_jButtonCadastrarTurmaActionPerformed

    private void jButtonExcluirPredioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirPredioActionPerformed
        // TODO add your handling code here:
        jTextFieldNomePredio.setEnabled(true);
        jTextFieldCampusPredio.setEnabled(true);
        jButtonExcluirPredio1.setEnabled(true);
        jButtonCancelarPredio.setEnabled(true);
        jButtonCadastrarPredio.setEnabled(false);
    }//GEN-LAST:event_jButtonExcluirPredioActionPerformed

    private void jButtonCampusExcluir1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCampusExcluir1ActionPerformed
        // TODO add your handling code here:
        if(unb.getIDCampusStr(jTextFieldNomeCampus.getText())>-1) {
            unb.campus.remove(unb.getIDCampusStr(jTextFieldNomeCampus.getText()));
        }
        else{
            System.out.println("Campus não encontrado!");
        } 
            
        loadJTableCampus();
        loadJTablePredio();
        loadJTableSala();
        loadJTableDisciplina();
        loadJTableTurma();
        
        jTextFieldNomeCampus.setEnabled(false);
        jButtonCancelarCampus.setEnabled(false);
        jButtonCadastrarCampus.setEnabled(false);
        
        jTextFieldNomeCampus.setText("");
    }//GEN-LAST:event_jButtonCampusExcluir1ActionPerformed

    private void jButtonExcluirPredio1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirPredio1ActionPerformed
        // TODO add your handling code here:
        
	if(unb.getIDCampusStr(jTextFieldCampusPredio.getText())>-1) {
            campus = unb.campus.get(unb.getIDCampusStr(jTextFieldCampusPredio.getText()));
            if(campus.getIDPredioStr(jTextFieldNomePredio.getText())>-1) {
		campus.removePredio(campus.getIDPredioStr(jTextFieldNomePredio.getText()));
            } else {
		System.out.println("Prédio não encontrado!");
            }
	} else {
            System.out.println("Campus não encontrado!");
	}
                                        
        loadJTablePredio();
        loadJTableSala();
        loadJTableDisciplina();
        loadJTableTurma();
        
        
        jTextFieldNomePredio.setEnabled(false);
        jTextFieldCampusPredio.setEnabled(false);
        jButtonExcluirPredio1.setEnabled(false);
        jButtonCancelarPredio.setEnabled(false);
        jButtonCadastrarPredio.setEnabled(false);
        
        jTextFieldNomePredio.setText("");
        jTextFieldCampusPredio.setText("");
    }//GEN-LAST:event_jButtonExcluirPredio1ActionPerformed

    private void jButtonExcluirSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirSalaActionPerformed
        // TODO add your handling code here:
        jTextFieldCampusSala.setEnabled(true);
        jTextFieldCapacidadeSala.setEnabled(false);
        jTextFieldNomeSala.setEnabled(true);
        jTextFieldPredioSala.setEnabled(true);
        jButtonExcluirSala1.setEnabled(true);
        jButtonCadastrarSala.setEnabled(false);
        jButtonCancelarSala.setEnabled(true);
        jRadioButtonExtensao.setEnabled(false);
        jRadioButtonGraduacao.setEnabled(false);
        jRadioButtonPosGraduacao.setEnabled(false);
    }//GEN-LAST:event_jButtonExcluirSalaActionPerformed

    private void jButtonExcluirSala1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirSala1ActionPerformed
        // TODO add your handling code here:
        
	if(unb.getIDCampusStr(jTextFieldCampusSala.getText())>-1) {
            campus = unb.campus.get(unb.getIDCampusStr(jTextFieldCampusSala.getText()));
            if(campus.getIDPredioStr(jTextFieldPredioSala.getText())>-1) {
		predio = campus.predios.get(campus.getIDPredioStr(jTextFieldPredioSala.getText()));
							
                if(predio.getIDSalaStr(jTextFieldNomeSala.getText())>-1) {
                    predio.salas.remove(predio.getIDSalaStr(jTextFieldNomeSala.getText()));
		} else {
                    System.out.println("Sala não encontrado!");
                }
            } else {
		System.out.println("Prédio não encontrado!");
            }
	} else {
            System.out.println("Campus não encontrado!");
	}
        
        loadJTableSala();
        loadJTableDisciplina();
        loadJTableTurma();
                                        
        jTextFieldCampusSala.setEnabled(false);
        jTextFieldCapacidadeSala.setEnabled(false);
        jTextFieldNomeSala.setEnabled(false);
        jTextFieldPredioSala.setEnabled(false);
        
        jButtonExcluirSala1.setEnabled(false);
        jButtonCadastrarSala.setEnabled(false);
        jButtonCancelarSala.setEnabled(false);
        
        jRadioButtonExtensao.setEnabled(false);
        jRadioButtonGraduacao.setEnabled(false);
        jRadioButtonPosGraduacao.setEnabled(false);
        
        jTextFieldCampusSala.setText("");
        jTextFieldCapacidadeSala.setText("");
        jTextFieldNomeSala.setText("");
        jTextFieldPredioSala.setText("");
    }//GEN-LAST:event_jButtonExcluirSala1ActionPerformed

    private void jButtonExcluirDisciplina1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirDisciplina1ActionPerformed
        // TODO add your handling code here:
        
        
        
        
	if(unb.getIDCampusStr(jTextFieldCampusDisciplina.getText())>-1) {
            campus = unb.campus.get(unb.getIDCampusStr(jTextFieldCampusDisciplina.getText()));
            if(campus.getIDDisciplinaStr(jTextFieldNomeDisciplina.getText())>-1) {
		campus.disciplinas.remove(campus.getIDDisciplinaStr(jTextFieldNomeDisciplina.getText()));
            } else {
		System.out.println("Disciplina não encontrada!");
            }
	} else {
            System.out.println("Campus não encontrado!");
        }
        
        
        loadJTableDisciplina();
        loadJTableTurma();
        
        jTextFieldNomeDisciplina.setEnabled(false);
        jTextFieldCampusDisciplina.setEnabled(false);
        jTextFieldCredito.setEnabled(false);
        jRadioButtonGraduacao1.setEnabled(false);
        jRadioButtonPosGraduacao1.setEnabled(false);
        jRadioButtonExtensao1.setEnabled(false);
        jButtonExcluirDisciplina1.setEnabled(false);
        jButtonCancelarDisciplina.setEnabled(false);
        jButtonCadastrarDisciplina.setEnabled(false);
        
        jTextFieldNomeDisciplina.setText("");
        jTextFieldCampusDisciplina.setText("");
        jTextFieldCredito.setText("");
    }//GEN-LAST:event_jButtonExcluirDisciplina1ActionPerformed

    private void jButtonExcluirDisciplinaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirDisciplinaActionPerformed
        // TODO add your handling code here:
        jTextFieldNomeDisciplina.setEnabled(true);
        jTextFieldCampusDisciplina.setEnabled(true);
        jTextFieldCredito.setEnabled(false);
        jRadioButtonGraduacao1.setEnabled(false);
        jRadioButtonPosGraduacao1.setEnabled(false);
        jRadioButtonExtensao1.setEnabled(false);
        jButtonExcluirDisciplina1.setEnabled(true);
        jButtonCancelarDisciplina.setEnabled(true);
        jButtonCadastrarDisciplina.setEnabled(false);
    }//GEN-LAST:event_jButtonExcluirDisciplinaActionPerformed

    private void jButtonExcluirTurma1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirTurma1ActionPerformed
        // TODO add your handling code here:
        
	if(unb.getIDCampusStr(jTextFieldCampusTurma.getText())>-1) {
            campus = unb.campus.get(unb.getIDCampusStr(jTextFieldCampusTurma.getText()));
            if(campus.getIDDisciplinaStr(jTextFieldDisciplinaTurma.getText())>-1) {
		disciplina = campus.disciplinas.get(campus.getIDDisciplinaStr(jTextFieldDisciplinaTurma.getText()));
		if(disciplina.getIDTurmaStr(jTextFieldNomeTurma.getText())>-1) {
                    
                    turma = disciplina.turmas.get(disciplina.getIDTurmaStr(jTextFieldNomeTurma.getText()));
                    disciplina = campus.disciplinas.get(campus.getIDDisciplinaStr(jTextFieldDisciplinaTurma.getText()));
                    disciplina.removeTurma(disciplina.getIDTurmaStr(jTextFieldNomeTurma.getText()));
                    turma.deallocate();
		} else {
                    System.out.println("Turma não encontrada!");
		}
            } else {
		System.out.println("Disciplina não encontrada!");
            }
        } else {
            System.out.println("Campus não encontrado!");
	}
        
        
        
        
        
        loadJTableTurma();
        
        jTextFieldNomeTurma.setEnabled(false);
        jTextFieldCampusTurma.setEnabled(false);
        jTextFieldDisciplinaTurma.setEnabled(false);
        jTextFieldProfessorTurma.setEnabled(false);
        jTextFieldQtdAlunosTurma.setEnabled(false);
        jTextFieldDia.setEnabled(false);
        jTextFieldHorario.setEnabled(false);
        jButtonExcluirTurma1.setEnabled(false);
        jButtonCancelarTurma.setEnabled(false);
        jButtonCadastrarTurma.setEnabled(false);
        
        jTextFieldNomeTurma.setText("");
        jTextFieldCampusTurma.setText("");
        jTextFieldDisciplinaTurma.setText("");
        jTextFieldProfessorTurma.setText("");
        jTextFieldQtdAlunosTurma.setText("");
        jTextFieldDia.setText("");
        jTextFieldHorario.setText("");
    }//GEN-LAST:event_jButtonExcluirTurma1ActionPerformed

    private void jButtonExcluirTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirTurmaActionPerformed
        // TODO add your handling code here:
        jTextFieldNomeTurma.setEnabled(true);
        jTextFieldCampusTurma.setEnabled(true);
        jTextFieldDisciplinaTurma.setEnabled(true);
        jTextFieldProfessorTurma.setEnabled(false);
        jTextFieldQtdAlunosTurma.setEnabled(false);
        jTextFieldDia.setEnabled(false);
        jTextFieldHorario.setEnabled(false);
        jButtonCancelarTurma.setEnabled(true);
        jButtonExcluirTurma1.setEnabled(true);
        jButtonCadastrarTurma.setEnabled(false);
    }//GEN-LAST:event_jButtonExcluirTurmaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UniversidadeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UniversidadeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UniversidadeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UniversidadeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UniversidadeInterface().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonCadastrarCampus;
    private javax.swing.JButton jButtonCadastrarDisciplina;
    private javax.swing.JButton jButtonCadastrarPredio;
    private javax.swing.JButton jButtonCadastrarSala;
    private javax.swing.JButton jButtonCadastrarTurma;
    private javax.swing.JButton jButtonCampusExcluir1;
    private javax.swing.JButton jButtonCancelarCampus;
    private javax.swing.JButton jButtonCancelarDisciplina;
    private javax.swing.JButton jButtonCancelarPredio;
    private javax.swing.JButton jButtonCancelarSala;
    private javax.swing.JButton jButtonCancelarTurma;
    private javax.swing.JButton jButtonExcluirCampus;
    private javax.swing.JButton jButtonExcluirDisciplina;
    private javax.swing.JButton jButtonExcluirDisciplina1;
    private javax.swing.JButton jButtonExcluirPredio;
    private javax.swing.JButton jButtonExcluirPredio1;
    private javax.swing.JButton jButtonExcluirSala;
    private javax.swing.JButton jButtonExcluirSala1;
    private javax.swing.JButton jButtonExcluirTurma;
    private javax.swing.JButton jButtonExcluirTurma1;
    private javax.swing.JButton jButtonNovoCampus;
    private javax.swing.JButton jButtonNovoDisciplina;
    private javax.swing.JButton jButtonNovoPredio;
    private javax.swing.JButton jButtonNovoSala;
    private javax.swing.JButton jButtonNovoTurma;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JRadioButton jRadioButtonExtensao;
    private javax.swing.JRadioButton jRadioButtonExtensao1;
    private javax.swing.JRadioButton jRadioButtonGraduacao;
    private javax.swing.JRadioButton jRadioButtonGraduacao1;
    private javax.swing.JRadioButton jRadioButtonPosGraduacao;
    private javax.swing.JRadioButton jRadioButtonPosGraduacao1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTableCampus;
    private javax.swing.JTable jTableDisciplina;
    private javax.swing.JTable jTableMatriculado;
    private javax.swing.JTable jTablePredio;
    private javax.swing.JTable jTableSala;
    private javax.swing.JTable jTableTurma;
    private javax.swing.JTextField jTextFieldCampusDisciplina;
    private javax.swing.JTextField jTextFieldCampusPredio;
    private javax.swing.JTextField jTextFieldCampusSala;
    private javax.swing.JTextField jTextFieldCampusTurma;
    private javax.swing.JTextField jTextFieldCapacidadeSala;
    private javax.swing.JTextField jTextFieldCredito;
    private javax.swing.JTextField jTextFieldDia;
    private javax.swing.JTextField jTextFieldDisciplinaTurma;
    private javax.swing.JTextField jTextFieldHorario;
    private javax.swing.JTextField jTextFieldNomeCampus;
    private javax.swing.JTextField jTextFieldNomeDisciplina;
    private javax.swing.JTextField jTextFieldNomePredio;
    private javax.swing.JTextField jTextFieldNomeSala;
    private javax.swing.JTextField jTextFieldNomeTurma;
    private javax.swing.JTextField jTextFieldPredioSala;
    private javax.swing.JTextField jTextFieldProfessorTurma;
    private javax.swing.JTextField jTextFieldQtdAlunosTurma;
    // End of variables declaration//GEN-END:variables

}
