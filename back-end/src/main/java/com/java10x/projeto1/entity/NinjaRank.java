package com.java10x.projeto1.entity;

public enum NinjaRank {
    NENHUM(0),
    ALUNOS_ACADEMIA(1),
    GENNIN(2),
    CHUNNIN(3),
    PRIMEIRO_JONNIN(4),
    SEGUNDO_JONNIN(5);

    private final int codigo;

    NinjaRank(int codigo){
        this.codigo = codigo;
    }

    // -- methods for use in NinjaMapper and DTO

    public int getCodigo(){
        return codigo;
    }

    public static NinjaRank fromCodigo(int codigo){
        for (NinjaRank ninjaRank : NinjaRank.values()){
            if (ninjaRank.getCodigo() == codigo){
                return ninjaRank;
            }
        }
        throw new IllegalArgumentException("Rank invalido: " + codigo);
    }

}
