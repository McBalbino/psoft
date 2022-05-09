public class Produto {
    public String id;
    public String nomeDoProduto;
    public String fabricante;

    public Produto(String nomeDoProduto, String fabricante, String id) {
        this.fabricante = fabricante;
        this.id = id;
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getNomeDoProduto() {
        return nomeDoProduto;
    }

    public void setNomeDoProduto(String nomeDoProduto) {
        this.nomeDoProduto = nomeDoProduto;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nomeDoProduto='" + nomeDoProduto + '\'' +
                ", fabricante='" + fabricante + '\'' +
                '}';
    }
}
