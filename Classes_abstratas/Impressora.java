public abstract class Impressora {
    

    private String txt;

    public Impressora(String txt) { 
        this.txt = txt;
    }

    public String getTxt() {
        return this.txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

	public abstract String imprimir();
	
}
