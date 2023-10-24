public class SuperHeroe implements ActionHuman {

    String nombre;
    String apellido;
    int vida;
    int velocidad;
    int resistencia;
    int energia;
    int energiaActual;
    int vidaActual;

    public SuperHeroe(String nombre, String apellido, int vida, int velocidad, int resistencia, int energia) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.vida = vida;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
        this.energia = energia;
    }

    public void volar() {
        moverse();
        saltar();
        usarManos();
        System.out.println("El superhéroe " + nombre + " está volando.");
        vidaActual();
    }

    public void lanzarRayos() {
        moverse();
        saltar();
        System.out.println("El superhéroe " + nombre + " está lanzando rayos.");
        energiaActual();
    }

    public void levantarObjetos() {
        usarManos();
        usarPies();
        moverse();
        saltar();


        System.out.println("El superhéroe " + nombre + " está levantando objetos pesados.");
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getResistencia() {
        return resistencia;
    }

    public void setResistencia(int resistencia) {
        this.resistencia = resistencia;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    @Override
    public void usarManos() {

    }

    @Override
    public void usarPies() {

    }

    @Override
    public void moverse() {

    }

    @Override
    public void saltar() {

    }

    @Override
    public void hablar() {

    }
    public void vidaActual(){
        this.vida=this.vida-40;
        System.out.println(this.vida);

    }
    public void energiaActual(){
        this.energia=this.energia-40;
        System.out.println(this.energia);

    }
}

