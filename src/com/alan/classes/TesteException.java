package com.alan.classes;

public class TesteException {

    public void lancaCheckedException(int a) throws Exception {

        if(a == 0)
            throw new Exception("Erro checked exception");

        System.out.println("Checked rodou com sucesso!");
    }

    public void lancaUnchekedException(int a) {
        if(a == 0)
            throw new RuntimeException("Erro unchecked exception");

        System.out.println("Unchecked rodou com sucesso!");
    }

    public void lancaUncheckedDeChecked(int a) {
        try {
            lancaCheckedException(a);
        } catch (Exception e) {
            throw  new RuntimeException(e.getMessage());
        }
    }

    public void lancaMinhaException(int a) {
        if(a == 0)
            throw new MinhaException("Erro unchecked exception");

        System.out.println("MinhaException rodou com sucesso!");
    }

}
