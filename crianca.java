lass Crianca{
    public String nome;
    public int idade;
    public int velocidade;
    public int forca;
    public boolean imaginacao;
    
    public void pular(){
        System.out.println(
            "A criança está pulando a " +
            forca + " m/s");
        
    }

    public void brincar(){
        if(imaginacao){
            System.out.println(
            "A criança está brincando de faz de conta");      
        }else{
            System.out.println(
            "A criança está brincando de verdade");
        }
    }

    public void correr(){
        System.out.println(
            "A criança está correndo a" +
            velocidade + " m/s");
        
    }


    public static void main (String[] args){
        Crianca crianca01= new Crianca();

        crianca01.nome = "Theo";
        crianca01.idade = 8;
        crianca01.forca = 10;
        crianca01.velocidade = 3;
        crianca01.imaginacao = true;

        crianca01.brincar();
        crianca01.correr();
        crianca01.pular();
    }


}
