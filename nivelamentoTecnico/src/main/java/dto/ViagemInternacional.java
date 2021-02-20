package dto;

import enums.Destinos;
import utils.ArquivosUtils;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class ViagemInternacional extends Viagem{
    private String passaporte;

    public ViagemInternacional(Destinos lugarDeDestino){
        super(lugarDeDestino);
    }

    public String getPassaporte(){
        return this.passaporte;
    }

    public void setPassaporte(String passarporte){
        this.passaporte = passarporte;
    }

    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception{

        int limiteDeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedade("viagem.internacional.acompanhantes.limite"));

        if (acompanhantes.size() <=  limiteDeAcompanhantes){
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagens internacionais não podem ter mais que "+ limiteDeAcompanhantes +" acompanhante");
        }
    }
}
