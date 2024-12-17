package com.java10x.projeto1.entity;

public enum NinjaCargo {

    NENHUM(0),
    AMBU(1),
    OININ(2),
    COBRADOR(3),
    RYOUNIN(4),
    MENSAGEIRO(5);

    private final int codigo;

    NinjaCargo(int codigo){
        this.codigo = codigo;
    }

    // -- methods for use in NinjaMapper and DTO

    public int getCodigo(){
        return codigo;
    }

    public static NinjaCargo fromCodigo(int codigo){
        for (NinjaCargo ninjaCargo : NinjaCargo.values()) {
            if ((ninjaCargo.getCodigo() == codigo)) {
                return ninjaCargo;
            }
        }
        throw new IllegalArgumentException("Cargo invalido" + codigo);
    }

}
