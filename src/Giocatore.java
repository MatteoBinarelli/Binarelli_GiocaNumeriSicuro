public class Giocatore implements Runnable {
    String nome;
    private String parola;
    private int punteggio;

    public Giocatore(String nome) {
        this.nome = nome;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getPunteggio() {
        return punteggio;
    }

    public void setPunteggio(int punteggio) {
        this.punteggio = punteggio;
    }

    public void gioca() throws InterruptedException {
        int numero = 19;
        String parola = "Divertiti";
        setParola(parola);

        for (int i = 0; i < numero; i++) {
            System.out.println("Giocatore: " + nome + " i: " + i);
            Thread.currentThread().sleep(5000);
        }

        setPunteggio(100);

        System.out.println("Giocatore: " + nome + "parola: " + getParola() + "punteggio: " + punteggio);

        //cifrare testo
        Cifratura cifratura = new Cifratura();
        cifratura.cifra(parola);
        System.out.println("La parola cifrata è: " + parola);
        //scrivere il testo cifrato in un file
    }

    public void comunica(){
        //scrittura del file
    }

    @Override
    public void run(){
        try {
            gioca();
            comunica();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
