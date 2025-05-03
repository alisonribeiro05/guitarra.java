package guitarra;

public class guitarra {

    private String numeroSerie, fabricante, modelo, tipo, madeira;
    private double preco;

    
    public guitarra(
            String numeroSerie, String fabricante,
            String modelo, String tipo,
            String madeira, double preco) {
        this.numeroSerie = numeroSerie;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.tipo = tipo;
        this.madeira = madeira;
        this.preco = preco;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMadeira() {
        return madeira;
    }

    public void setMadeira(String madeira) {
        this.madeira = madeira;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    
    public static void main(String[] args) {
   classe para criar
      
        guitarra minhaguitarra = new guitarra("03052025", "song", "Dreadnought",
                "elétrica", "preto", 1750);
        System.out.println("Número de Série: " + minhaguitarra.getNumeroSerie());
        System.out.println("Fabricante: " + minhaguitarra.getFabricante());
        System.out.println("Modelo: " + minhaguitarra.getModelo());
        System.out.println("Tipo: " + minhaguitarra.getTipo());
        System.out.println("Madeira: " + minhaguitarra.getMadeira());
        System.out.println("Preço: " + minhaguitarra.getPreco());
    }
}
