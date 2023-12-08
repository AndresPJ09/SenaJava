package Entity;

public class Boleto {

    private int numero;
    private String color;
    private Persona persona;

    public Boleto(int numero, int color, Persona persona) {
        String colore;
        switch (color) {
            case 1:
                colore = "Blanco";
                break;
            case 2:
                colore = "Negro";
                break;
            case 3:
                colore = "Amarrillo";
                break;
            case 4:
                colore = "Rojo";
                break;
            case 5:
                colore = "Azul";
                break;
            default:
                throw new AssertionError();
        }
        this.setColor(colore);
        this.numero = numero;
        this.persona = persona;
    }

    public Persona getPersona() {
        return persona;
    }

    public void setPersona(Persona persona) {
        this.persona = persona;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}
