public class Carro {
    private String marca;
    private String modelo;
    private String placa;
    private Motor motor;
    private Condutor condutor;

    public Carro() {
        this.motor = new Motor();
        this.condutor = new Condutor();
    }

    public Carro(String marca, String modelo, String placa) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = new Motor();
        this.condutor = new Condutor();
    }

    public Carro(String marca, String modelo, String placa, Motor motor, Condutor condutor) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.motor = motor;
        this.condutor = condutor;
    }

    // marca
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    // modelo
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    // placa
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    // motor
    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor novoMotor) {
        this.motor = novoMotor;
    }

    // condutor
    public Condutor getCondutor() {
        return condutor;
    }

    public void setCondutor(Condutor novoCondutor) {
        this.condutor = novoCondutor;
    }

    public String toString(){
        String potenciaNaoCadastrada = "Não cadastrada";

        if(this.getMotor().getPotencia() == -1){
            return "Marca: " + this.marca + "\n" +
               "Modelo: " + this.modelo + "\n" +
               "Placa: " + this.placa + "\n" +
               "Tipo do motor: " + this.motor.getTipo() + "\n" +
               "Potência do motor: " + potenciaNaoCadastrada + "\n" +
               "Nome do condutor: " + this.condutor.getNome() + "\n" +
               "Nº da CNH do condutor: " + this.condutor.getNumeroDaCNH() + "\n";
        }

        return "Marca: " + this.marca + "\n" +
               "Modelo: " + this.modelo + "\n" +
               "Placa: " + this.placa + "\n" +
               "Tipo do motor: " + this.motor.getTipo() + "\n" +
               "Potência do motor: " + this.motor.getPotencia() + "\n" +
               "Nome do condutor: " + this.condutor.getNome() + "\n" +
               "Nº da CNH do condutor: " + this.condutor.getNumeroDaCNH() + "\n";
    }

}
