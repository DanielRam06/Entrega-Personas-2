import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public abstract class Persona {
    private String nombre;
    private boolean tieneEspada;
    private boolean esMillonario;
    private boolean estaMamado;
    private boolean miedoCucarachas;
//encapsulamientos
    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean getTieneEspada() {
        return tieneEspada;
    }

    public void setTieneEspada(boolean tieneEspada) {
        this.tieneEspada = tieneEspada;
    }

    public boolean getEsMillonario() {
        return esMillonario;
    }

    public void setEsMillonario(boolean esMillonario) {
        this.esMillonario = esMillonario;
    }

    public boolean getEstaMamado() {
        return estaMamado;
    }

    public void setEstaMamado(boolean estaMamado) {
        this.estaMamado = estaMamado;
    }

    public boolean getMiedoCucarachas() {
        return miedoCucarachas;
    }

    public void setMiedoCucarachas(boolean miedoCucarachas) {
        this.miedoCucarachas = miedoCucarachas;
    }
}

class MamaLucha extends Persona {
    public MamaLucha() {
        super("Mamá Lucha");
    }
}

class Donatello extends Persona {
    public Donatello() {
        super("Donatello");
    }
}

class Leonardo extends Persona {
    public Leonardo() {
        super("Leonardo");
    }
}

class Michelangelo extends Persona {
    public Michelangelo() {
        super("Michelangelo");
    }
}

class Raphael extends Persona {
    public Raphael() {
        super("Raphael");
    }
}

class Naruto extends Persona {
    public Naruto() {
        super("Naruto");
    }
}

class HelenChufe extends Persona {
    public HelenChufe() {
        super("Helen Chufe");
    }
}

class AlbaSura extends Persona {
    public AlbaSura() {
        super("Alba Sura");
    }
}

class Goku extends Persona {
    public Goku() {
        super("Goku");
    }
}

class Hinata extends Persona {
    public Hinata() {
        super("Hinata");
    }
}   