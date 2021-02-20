package dto;

import enums.Destinos;

import java.util.List;

public class Viagem {

    private Destinos destino;
    private List<Acompanhante> acompanhantes;



    //criar um construtor e que o destino vai ser passado por parametro
    public Viagem(Destinos lugarDestino){
        this.destino = lugarDestino;
    }

    public Destinos getDestino(){
     return destino;
    }

    public void setDestino(Destinos lugarDestino){
    this.destino = lugarDestino;
    }

    public List<Acompanhante> getAcompanhantes(){
    return this.acompanhantes;
    }

    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception{
    this.acompanhantes = acompanhantes;
    }
}
