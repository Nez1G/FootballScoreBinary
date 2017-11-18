
import java.util.Hashtable;



public class Equipa {

    private String nomeEquipa1;
    private String nomeEquipa2;
    private int count = 0;
    private Hashtable<Integer, Logs> Logs = new Hashtable<Integer, Logs>();
    
    public Equipa() {
        Logs l = new Logs();
        l.setGolos1(0);
        l.setGolos2(0);
        l.setNome("");
        Logs.put(count, l);
    }

    public synchronized void adicionaLogs(int golos1, int golos2, String nome){
        count += count;
        Logs l = new Logs();
        l.setGolos1(golos1);
        l.setGolos2(golos2);
        l.setNome(nome);
        Logs.put(count, l);
    }
    
    public Logs currentGameState(){
        return Logs.get(count);
    }
    
    public int getTamanhoNomeEquipa1() {
        return nomeEquipa1.length();
    }
    
    public int getTamanhoNomeEquipa2() {
        return nomeEquipa2.length();
    }
    
    public String getNomeEquipa1() {
        return nomeEquipa1;
    }
    
    public String getNomeEquipa2() {
        return nomeEquipa2;
    }

    public int getCount() {
        return count;
    }

    public void setNomeEquipa1(String nomeEquipa1) {
        this.nomeEquipa1 = nomeEquipa1;
    }

    public void setNomeEquipa2(String nomeEquipa2) {
        this.nomeEquipa2 = nomeEquipa2;
    }
    
    
}
class Logs{
    private int golos1 ;
    private int golos2;
    private String nome;

    public int getGolos1() {
        return golos1;
    }

    public void setGolos1(int golos1) {
        this.golos1 = golos1;
    }

    public int getGolos2() {
        return golos2;
    }

    public void setGolos2(int golos2) {
        this.golos2 = golos2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
}