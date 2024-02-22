class Crianca{
    public String nome;
    public int idade, velocidade, forca;
    public boolean imaginacao;

    public void brincar(){
        if(imaginacao){
            System.out.println("Criança brinca com imaginação");
        }else{
            System.out.println("Criança brinca sem imaginação");
        }
    }
    
    public void correr(){
        System.out.println("Criança corre a " + velocidade + "m/s");
    }

    public void pular(){
        System.out.println("Criança pula com" + forca + "de forca");
    }
}    
