package app;


import dto.Acompanhante;
import dto.Viagem;
import dto.ViagemInternacional;
import dto.ViagemNacional;
import enums.Destinos;
import java.util.ArrayList;

import java.util.List;

public class App {
    public static void main (String[] args){
     Viagem viagem = new Viagem(Destinos.MARINGA);

    viagem.setDestino(Destinos.MANAUS);
    System.out.println("A viagem tem destino: " + viagem.getDestino().getCidade());

    Acompanhante acompanhante1 = new Acompanhante();
    acompanhante1.setNome("Priscila");
    acompanhante1.setConfirmouCadastro(true);

    Acompanhante acompanhante2 = new Acompanhante();
    acompanhante2.setNome("Isabele");
    acompanhante2.setConfirmouCadastro(false);

    List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();
    acompanhantes.add(acompanhante1);
    acompanhantes.add(acompanhante2);
        acompanhantes.add(acompanhante2);
        acompanhantes.add(acompanhante2);
        acompanhantes.add(acompanhante2);

    try {
        viagem.setAcompanhantes(acompanhantes);
    } catch (Exception excecao) {
        System.out.println("Ocorreu um erro");
        System.out.println(excecao.getMessage());
    }
        //mostra todos os Acompanhantes
    //System.out.println("Todos os acompanhantes: " + viagem.getAcompanhantes().);


        for (int iterador = 0 ; iterador < viagem.getAcompanhantes().size() ; iterador++){
            System.out.println("Nome: " + viagem.getAcompanhantes().get(iterador).getNome());
            System.out.println("Confirmou cadastro : " + viagem.getAcompanhantes().get(iterador).isConfirmouCadastro());
        }

        System.out.println("Outro jeito");

        for (Acompanhante acompanhante: viagem.getAcompanhantes()) {
            System.out.println("Nome: " + acompanhante.getNome());
            System.out.println("Confirmou cadastro : " + acompanhante.isConfirmouCadastro());
        }

        System.out.println("Outro jeito2 ");

        for (Acompanhante acompanhante: viagem.getAcompanhantes()) {
            System.out.println("Nome: " + acompanhante.getNome() + "e  Confirmou cadastro : " + acompanhante.isConfirmouCadastro());
        }


        acompanhantes.forEach(s -> System.out.println((String)  s.getNome()));
        //mostra a quantidade de acompanhamentes
    System.out.println("Qtde acompanhamentes: " + viagem.getAcompanhantes().size());
    //mostra o primeiro da lista
    System.out.println("Primeiro acompanhante: " + viagem.getAcompanhantes().get(0).getNome());

        //viagem.destino = "Maringá";
     //Viagem viagem2 = new Viagem("Osasco");
    // Viagem viagem2 = new Viagem();
     //viagem2.destino = "Osasco";
     //System.out.println("A viagem 2 tem destino: "+ viagem2.destino);

    ViagemNacional viagemNacional1 = new ViagemNacional(Destinos.MANAUS);
    //ViagemNacional viagemNacional1 = new ViagemNacional(Destinos.GOIAS);
    try {
    viagemNacional1.setAcompanhantes(acompanhantes);
    } catch (Exception excecao) {
        System.out.println("Ocorreu um erro");
        System.out.println(excecao.getMessage());
    }
    viagemNacional1.setCpf("123.123.123-12");

    ViagemInternacional viagemIntenacional1 = new ViagemInternacional(Destinos.ACAPULCO);
    //ViagemInternacional viagemIntenacional1 = new ViagemInternacional(Destinos.MIAMI);
    try {
    viagemIntenacional1.setAcompanhantes(acompanhantes);
    } catch (Exception excecao) {
        System.out.println("Ocorreu um erro");
        System.out.println(excecao.getMessage());
    }

    viagemIntenacional1.setPassaporte("123.456.789.1011-12");

    System.out.println(viagemNacional1.getDestino().getCidade());
    System.out.println(viagemIntenacional1.getDestino().getCidade());

    System.out.println("O cpf é: " + viagemNacional1.getCpf());
    System.out.println("O passaporte é: " + viagemIntenacional1.getPassaporte());

    System.out.println("------------------------------------------------------------------------");

        System.out.println("Dias para retorno Viagem Internacional: " + viagemIntenacional1.calcularPrevisaoDeDiasParaRetorno());
        System.out.println("Dias para retorno Viagem Nacional: " + viagemNacional1.calcularPrevisaoDeDiasParaRetorno());

    }
}
