import Domain.Pessoa;

import java.text.DateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa("Kauan", 19, "01-03-2004");
        System.out.println("Olá, meu nome é " + pessoa.getNome() + ", tenho " + pessoa.getIdade()
                + " anos, e nasci em " + pessoa.getDataNascimento());
    }
}