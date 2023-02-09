public class Vinis extends Discos {
    double preco = 72.35;
    private boolean condicao;

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }

    public boolean getCondicao() {
        return condicao;
    }

    public void setCondicao(Boolean condicao) {
        this.condicao = condicao;
        if (condicao = true){
            preco = preco + 125.5;
        } 
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nArtista: " + this.artista + "\nPreco: R$" + this.preco + "\n";
    }

    
    
}