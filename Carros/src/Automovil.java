public class Automovil {
    //Atributos o estados
    private String marca;
    private String modelo;
    private String color;
    private float cilindraje = 3.2f;

    //Constructores y Destructores


    public Automovil(String marca){
        this.marca = marca;
    }
    public Automovil(String marca, String modelo){
        this.marca = marca;
        this.modelo = modelo;
    }
    public Automovil(String marca, String modelo, String color){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }
    public Automovil(String marca, String modelo, String color, float cilindraje){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
    }

    public Automovil() {
    }

    //Metodos propios del lenguaje Java
    /*public String leermarca(){
        this.marca = marca;
        return this.marca;
    }

    public String ingresarMarca(String marca){
        this.marca = marca;
        return this.marca;
    }*/

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public float getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(float cilindraje) {
        this.cilindraje = cilindraje;
    }

    //Metodos propios del programador
    public String detalleVeh(){
        //String marca = "CHANGAN"
        /*String dv = "La marca es -> " + this.marca + "\n" +
                "El modelo es -> " + this.modelo + "\n" +
                "El color es -> " + this.color + "\n" +
                "El cilindraje es -> " + this.cilindraje;
        return dv;*/
        String dv = "La marca es -> " + marca + "\n" +
                "El modelo es -> " + this.modelo + "\n" +
                "El color es -> " + getColor() + "\n" +
                "El cilindraje es -> " + this.cilindraje;
        return dv;
    }

    public float consumoCombustible(float kmr, float gal){
        float kpg;
        kpg = kmr / gal;
        return kpg;
    }
    public double consumoCombustible(float kmr){
        double pcc;
        pcc = kmr * 0.7;
        return pcc;
    }
}
