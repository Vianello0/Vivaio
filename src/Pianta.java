public class Pianta {
    public String nome;
    public String codiceP;
    public int data;
    public String genere;

    public void pianta(String nome, String codiceP, int data, String genere){
        this.nome=nome;
        this.codiceP=codiceP;
        this.data=data;
        this.genere=genere;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodiceP() {
        return codiceP;
    }

    public void setCodiceP(String codiceP) {
        this.codiceP = codiceP;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }
}
