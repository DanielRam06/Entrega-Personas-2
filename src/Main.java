import java.util.ArrayList;
import java.util.Collections;

public class Main {
    private static ArrayList<Persona> personas = new ArrayList<>();
//personas
    public static void main(String[] args) {
        personas.add(new MamaLucha());
        personas.add(new Donatello());
        personas.add(new Leonardo());
        personas.add(new Michelangelo());
        personas.add(new Raphael());
        personas.add(new Naruto());
        personas.add(new HelenChufe());
        personas.add(new AlbaSura());
        personas.add(new Goku());
        personas.add(new Hinata());

        Collections.shuffle(personas);
    //evita las repeticiones de los atributos con almenos 2
        for (int i = 0; i < personas.size(); i++) {
            Persona p = personas.get(i);
            p.setTieneEspada(i % 2 == 0);
            p.setEsMillonario((i + 1) % 2 == 0);
            p.setEstaMamado((i + 2) % 2 == 0);
            p.setMiedoCucarachas((i + 3) % 2 == 0);
        }

        for (Persona p : personas) {
            System.out.println(p.getNombre() + ": " +" Tiene Espada=" + p.getTieneEspada() + ",  Es Millonario=" + p.getEsMillonario() + ",  Esta Mamado=" + p.getEstaMamado() + ", Miedo a cucarachas=" + p.getMiedoCucarachas());
            		}
        // comprobación de atributos
        int espadaCount = 0;
        int millonarioCount = 0;
        int mamadoCount = 0;
        int miedoCucarachasCount = 0;

        for (Persona p : personas) {
            if (p.getTieneEspada()) {
                espadaCount++;
            }
            if (p.getEsMillonario()) {
                millonarioCount++;
            }
            if (p.getEstaMamado()) {
                mamadoCount++;
            }
            if (p.getMiedoCucarachas()) {
                miedoCucarachasCount++;
            }
        }

        System.out.println("El Atributo Tiene Espada se repite: " + espadaCount);
        System.out.println("El Atributi es Millonario se repite: " + millonarioCount);
        System.out.println("El Atributo esta Mamado se repite: " + mamadoCount);
        System.out.println("El Atributo Miedo a cucarachas se repite: " + miedoCucarachasCount);
    }
    }