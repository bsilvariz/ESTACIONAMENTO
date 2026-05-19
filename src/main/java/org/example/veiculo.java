public class veiculo {

    private String placa;
    private String modelo;

    // Construtor
    public void veiculo(String placa, String modelo) {
        this.placa = placa;
        this.modelo = modelo;
    }

    // Getter e Setter da placa
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // Getter e Setter do modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}


