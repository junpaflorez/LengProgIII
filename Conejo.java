public class Conejo {
    private String orejas = "(|___/)";
    private String cara = "(='.'=)";
    private String patas = "(''|_/'')";

    public void pintarConejo(){
        System.out.println(this.orejas);
        System.out.println(this.cara);
        System.out.println(this.patas);
    }

    public void cambiarCara(String newface){
        this.cara = newface;
    }

    public void saludo(String nombre){
        String cara = this.cara;
        String saludo = cara +  "    Hola " + nombre;
        this.cara = saludo;
    }
}
