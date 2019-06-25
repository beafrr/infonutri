package ifal.infonutri.infonutri;

public class InformacaoNutricional {

    private Integer id;
    private String nomeAlimento;
    private double porcao;
    private double valorEnergetico;
    private double carboidratos;
    private double gordurasTotais;
    private double gordurasSaturadas;
    private double gordurasTrans;
    private double fibraAlimentar;
    private double sodio;
    private String categoria;

    public InformacaoNutricional() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeAlimento() {
        return nomeAlimento;
    }

    public void setNomeAlimento(String nomeAlimento) {
        this.nomeAlimento = nomeAlimento;
    }

    public double getPorcao() {
        return porcao;
    }

    public void setPorcao(double porcao) {
        this.porcao = porcao;
    }

    public double getValorEnergetico() {
        return valorEnergetico;
    }

    public void setValorEnergetico(double valorEnergetico) {
        this.valorEnergetico = valorEnergetico;
    }

    public double getCarboidratos() {
        return carboidratos;
    }

    public void setCarboidratos(double carboidratos) {
        this.carboidratos = carboidratos;
    }

    public double getGordurasTotais() {
        return gordurasTotais;
    }

    public void setGordurasTotais(double gordurasTotais) {
        this.gordurasTotais = gordurasTotais;
    }

    public double getGordurasSaturadas() {
        return gordurasSaturadas;
    }

    public void setGordurasSaturadas(double gordurasSaturadas) {
        this.gordurasSaturadas = gordurasSaturadas;
    }

    public double getGordurasTrans() {
        return gordurasTrans;
    }

    public void setGordurasTrans(double gordurasTrans) {
        this.gordurasTrans = gordurasTrans;
    }

    public double getFibraAlimentar() {
        return fibraAlimentar;
    }

    public void setFibraAlimentar(double fibraAlimentar) {
        this.fibraAlimentar = fibraAlimentar;
    }

    public double getSodio() {
        return sodio;
    }

    public void setSodio(double sodio) {
        this.sodio = sodio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
