    public class MembroEquipe{

        private static int ProximoId= 1;

        private int id;
        private int Pontuacao;
        private String Nome;

    public MembroEquipe(String Nome,int Pontuacao){
        
        this.id=ProximoId;
        ProximoId++;

        this.Nome= Nome;
        this.Pontuacao= Pontuacao;
        }
    public String GetNome(){
        return this.Nome;
      }
    public int GetPontuacao(){
        return this.Pontuacao;
    }
    public int GetId(){
        return this.id;
    }
    }