public abstract class Auto {
    private String marca;
    private String nveiculo;
    private int ano;
    private double valor;
    
    public Auto(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }
    //Getters & Setters manipular variavel
    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca = marca;
    }

    public String getNveiculo() {
        return nveiculo;
    }
    public void setNveiculo(String nveiculo) {
        this.nveiculo = nveiculo;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }


    
}
//contrutor quando liga tv vai automatico pra um canal coisa predefinida nãotem como mudar

