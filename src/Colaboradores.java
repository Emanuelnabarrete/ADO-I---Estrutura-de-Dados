import java.util.Arrays;

public class Colaboradores {


    private Object[] colaborador;
    private int tamanho;


    public Colaboradores(int tamanho) {                               // FuncaoInicial
        this.colaborador = new Object[tamanho];
        this.tamanho = 0;
    }


    @Override
    public String toString() {                                        //toString
        StringBuilder s = new StringBuilder();
        s.append("[");
        for (int i = 0; i < tamanho - 1; i++) {
            s.append(this.colaborador[i]);
            s.append("| ");

        }
        if (this.tamanho > 0) {
            s.append(this.colaborador[this.tamanho - 1]);
        }
        s.append("]");

        return s.toString();
    }


    public void adiciona(Object colaboradores) {                    //1 - Adiciona
        this.adicionacapacidade();
        if (this.tamanho < this.colaborador.length) {
            this.colaborador[this.tamanho] = colaboradores;
            this.tamanho++;
        }


    }

    public int tamanho() {
        return this.tamanho;
    }

    public void exibir() {


    }

    public void adicionacapacidade() {
        if (this.tamanho == this.colaborador.length) {
            Object[] elementosNovos = new Object[this.colaborador.length * 2];
            for (int i = 0; i < this.colaborador.length; i++) {
                elementosNovos[i] = this.colaborador[i];
            }
            this.colaborador = elementosNovos;
        }
    }


    public void remover(String id) {  // 3 - remover
        int aux = bucarId(id);
        if (aux != -1) {
            for (int i = aux; i < tamanho -1; i++) {
                this.colaborador[i] = colaborador[i + 1];

            }
            this.tamanho--;

        } else {
            System.out.println("Id nao encontrado");
        }

    }

    private int bucarId(String id) {  //3 - remover
        for (int i = 0; i < tamanho; i++) {
            Informacoes info = (Informacoes) this.colaborador[i];
            if (info.getID().equals(id)) {
                return i;
            }
        }
        return -1;


    }

}