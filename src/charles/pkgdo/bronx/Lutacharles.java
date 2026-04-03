
package charles.pkgdo.bronx;

public class CharlesDoBronx {
    private String nome;
    private String nascionalidade;
    private int idade;
    private double altura;
    private double peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
 
    public () CharlesDoBronx  {
    }
 
    public CharlesDoBronx (String nome, String nascionalidade, int idade, double altura, double peso, int vitorias, int derrotas, int empates) {
        this.nome = nome;
        this.nascionalidade = nascionalidade;
        this.idade = idade;
        this.altura = altura;
        setPeso(peso);
        this.vitorias = vitorias;
        this.derrotas = derrotas;
        this.empates = empates;
    }
    public void apresentar(){
        //Mostrar atributos
        System.out.print("\nDiretamente do "+nascionalidade);
        System.out.print("\nCom "+idade+" anos de idade, medindo "+altura+" m de altura, pesando "+peso+" kg");
        System.out.print("\nRepresentando peso "+categoria);
        System.out.print("\nApresentando "+nome);
    }
 
 
    public void status(){
        //Mostrar status
        System.out.print("\nVitorias: "+getVitorias());
        System.out.print("\nDerrotas: "+getDerrotas());
        System.out.print("\nEmpates: "+getEmpates());
    }
    public void ganharLuta(){
        setVitorias(getVitorias()+1);
    }
    public void perderLuta(){
        setDerrotas(getDerrotas()+1);
    }
    public void empatarLuta(){
        setEmpates(getEmpates()+1);
    }
    public String getNome() {
        return nome;
    }
 
    public void setNome(String nome) {
        this.nome = nome;
    }
 
    public void setNascionalidade(String nascionalidade) {
        this.nascionalidade = nascionalidade;
    }
 
    public void setIdade(int idade) {
        this.idade = idade;
    }
 
    public void setAltura(double altura) {
        this.altura = altura;
    }
 
    public void setPeso(double peso) {
        this.peso = peso;
        setCategoria();
    }
 
    public void setCategoria() {
        if(getPeso() < 52){
            this.categoria = "Invalido";
        }else if (getPeso() < 70) {
            this.categoria = "Leve";
        }else if (getPeso() < 83) {
            this.categoria = "Médio";
 
        }else if(getPeso() < 110){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Invalido";
       }
    }
 
    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }
 
    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
 
    public void setEmpates(int empates) {
        this.empates = empates;
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
 
    public int getVitorias() {
        return vitorias;
    }
 
    public int getDerrotas() {
        return derrotas;
    }
 
    public int getEmpates() {
        return empates;
    }
} 
    
    
    
}