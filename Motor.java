public class Motor {

    private String tipo;
    private Integer potencia;

    public Motor (String tipo, Integer potencia){
        this.tipo = tipo;
        this.potencia = potencia;
    }

    public Motor(){
        this.tipo = "Não cadastrado";
        this.potencia = -1;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String carroMotor) {
        this.tipo = carroMotor;
    }

    public Integer getPotencia() {
        return potencia;
    }

    public void setPotencia(Integer carroPotencia) {
        this.potencia = carroPotencia;
    }

}