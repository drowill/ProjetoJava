public class CDs extends Discos {
    double preco = 23.75;
    private boolean edicao;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public boolean getEdicao() {
        return edicao;
    }

    public void setEdicao(boolean edicao) {
        this.edicao = edicao;
        if (edicao = true){
            preco = preco + 26.5;
        } 
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nArtista: " + this.artista + "\nPreco: " + this.preco+ "\n";
    }

}