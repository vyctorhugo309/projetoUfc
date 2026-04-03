
package charles.pkgdo.bronx;


public class CharlesDoBronx { 
    private String nome;
    private String nascionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int   vitoria;
    private int  derrotas;
    private int  empate ;
    
    public CharlesDoBronx(){
    }

    public String getNome() {
        return nome;
    }

    public CharlesDoBronx(String nome, String nascionaliade, int idade, double altura, double peso, String categoria, int vitoria, int derrotas, int empate) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.categoria = categoria;
        this.vitoria = vitoria;
        this.derrotas = derrotas;
        this.empate = empate;
    }  
    public void apresentar(){
       System.out.print("nome: "+nome);
       System.out.print("nascionalidade "+nascionalidade);
       System.out.print("idade "+idade);
       System.out.print("altura: "+altura);
       System.out.print("idade "+idade);
       System.out.print("categoria "+categoria);
    }
    public void status(){
        //Mostrar status
        System.out.print("\nVitorias: "+vitoria);
        System.out.print("\nDerrotas: "+derrotas);
        System.out.print("\nEmpates: "+empate);
    }
    public void ganharLuta(){
        setVitoria(getVitoria()+1);
        System.out.print("FATALITY\n");
        System.out.print(nome+" Victory win\n");
        System.out.println(nome+" tem "+getVitoria()+" vitorias!");
    } 
     public void perderLuta(){
        setDerrotas(getDerrotas()+1);
        System.out.print(nome+" YOU LOSER\n");
        System.out.println(nome+" tem "+getDerrotas()+" derrotas!");  
     }
       public void empatarLuta(){
        setEmpate(getEmpate()+1);
        System.out.print("Amizade\n");
        System.out.println(nome+" tem "+getEmpate()+" empates!");
    }   
    public void nascionalidade(){
      System.out.print(nome);
    }

    public String getNascionalidade() {
        return nascionalidade;
    }
   

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getVitoria() {
        return vitoria;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public int getEmpate() {
        return empate;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNascionalidade(String nascionaliade) {
        this.nascionalidade = nascionaliade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public void setEmpate(int empate) {
        this.empate = empate;
    }
    
    
        
    }
    
    
        
        
    


