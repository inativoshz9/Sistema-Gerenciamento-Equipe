import java.util.Scanner;
    public class Gerenciador {
        public static void main(String[] main){
            Scanner EntradaTeclado = new Scanner(System.in);
        MembroEquipe[] Equipe = new MembroEquipe[10];
          int MembrosAdicionados = 0;
          boolean Executando = true;

                System.out.printf("%nBem-vindos ao Sistema de Gerenciamento da Equipe!");
        while(Executando){
                System.out.println("\n----- Menu -----");
                System.out.println("\n 1. Adicionar novo membro");
                System.out.println("\n 2. Mostrar todos os membros");
                System.out.println("\n 3. Mostrar membro com maior Pontuação");
                System.out.println("\n 4. Sair");
                System.out.print(" Escolha uma opcao: ");

        int opcao= EntradaTeclado.nextInt();

        switch (opcao) {
        case 1:
                System.out.println("\n---- Adicionar membros ----");
            if(MembrosAdicionados < Equipe.length){
                System.out.println("\n Digite o nome do membro: ");
                    String nome= EntradaTeclado.next();
                
                System.out.println("\n Digite a pontuacao do membro: ");
                    int Pontuacao= EntradaTeclado.nextInt();

                MembroEquipe Novomembro = new MembroEquipe(nome, Pontuacao);

                Equipe [MembrosAdicionados]= Novomembro;
                MembrosAdicionados++;

                System.out.println("\n Membros Adicionado com sucesso! ");
            }else{
                System.out.printf("Nao foi possivel adicionar o membro, Equipe cheia!");
            }
              break;
        case 2:
                System.out.printf("\n ---- Membros Adicionados ----");
            for (int i=0; i< MembrosAdicionados; i++){
                System.out.printf("\nID: %d | Nome: %s | Pontuacao: %d",Equipe[i].GetId(),Equipe[i].GetNome(), Equipe[i].GetPontuacao());
            }
              break;
        case 3: 
                System.out.println("\n----  Destaque da Equipe ----");
            if (MembrosAdicionados > 0){
                MembroEquipe campeao = Equipe[0];
            for (int i=1; i < MembrosAdicionados;i++){
                if(Equipe[i].GetPontuacao()>campeao.GetPontuacao()){
                    campeao=Equipe[i];
                }
            }
                System.out.println("\n---- Membro Destaque: ----");
                System.out.printf(" Id: %d | Nome: %s | Pontuacao: %d", campeao.GetId(),campeao.GetNome(),campeao.GetPontuacao());
            }else{
                System.out.println("A Equipe ainda nao possui membros! ");
        }     break;
        case 4: 
                Executando= false;
              break;
        default:
       System.out.println("Opção invalida, Digite um numero entre 1 e 4 para acessar a Opção desejada! ");
   }
  }
}
    }