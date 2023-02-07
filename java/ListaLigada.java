public class ListaLigada implements EstruturaDeDados{
    public No inicio;

    // public void removeInicio (){
    //     if (inicio != null)
    //         inicio = inicio.getProximo();
    // }

    // public void removeFim (){
    //     if (inicio == null){
    //         return;
    //     }
    //     if (inicio.getProximo() == null){
    //         inicio = null;
    //     }
    //     removeFim(inicio);
    // }

    // public void removeFim (No n){
    //     No proximo = n.getProximo();
    //     if (proximo.getProximo() == null){
    //         n.setProximo(null);
    //         return;
    //     } else{
    //         removeFim(proximo);
    //     }
    // }

    // public void insereInicio (int valor){
    //     if(inicio == null){
    //         inicio = new No(valor);
    //         return;
    //     }
    //     No n = new No(valor);
    //     n.setProximo(inicio);
    //     inicio = n;

    // }

    // public void insereFim (int valor){
    //     if(inicio == null){
    //         inicio = new No(valor);
    //         return;
    //     }
    //     insere(inicio, valor);
    // }

    // public boolean procura (int valor){
    //     if (inicio == null){
    //         return false;
    //     } else {
    //         return procura(inicio, valor);
    //     }
    // }

    // public boolean procura (No n, int valor){
    //     if (n.getValor() == valor){
    //         return true;
    //     } else if (n.getProximo() == null){
    //         return false;
    //     } else {
    //         return procura(n.getProximo(), valor);
    //     }
    // }
    // public void insere (No n, int valor){
    //     if (n.getProximo() == null){
    //         No novo = new No(valor);
    //         n.setProximo(novo);
    //     } else {
    //         insere(n.getProximo(), valor);
    //     }
    // }

    // public void remover(int valor){
    //     if (inicio == null){
    //         return;
    //     }
    //     if (inicio.getValor() == valor){
    //         inicio = inicio.getProximo();
    //         return;
    //     }
    //     remover(inicio, valor);
    // }

    // public void remover(No n, int valor){
    //     No proximo = n.getProximo();
    //     if (proximo == null){
    //         return;
    //     }
    //     if (proximo.getValor() == valor){
    //         n.setProximo(proximo.getProximo());
    //     } else{
    //         remover(proximo, valor);
    //     }
    // }
    
    @Override
    public boolean insert(int chave)
    {
        No n = inicio;
        
        if(inicio.getProximo() == null)
        {
            this.inicio.setProximo(new No(chave)); 
            return true;
        }

        else
        {
            while(n.getProximo() != null)
            {
                if(n.getProximo() == null){
                    n.setProximo(new No(chave));
                }
            } 
            return true;
        }
        return false;
    }

    // @Override
    // public void createInicial(int chave)
    // {
    //     if(inicio == null)
    //     {
    //         inicio = new No(chave);
    //         return;
    //     }
    //     return;
    // }
    
    
    @Override
    public boolean delete(int chave) {
        No Save;

        Save = inicio;
        if(inicio.getValor() == chave){
            inicio = inicio.getProximo();
        }

        else
        {
        while(Save.getValor() != chave && Save.getProximo() != null)
        {
            if(Save.getProximo().getValor() == chave)
            {
                Save.setProximo(Save.getProximo().getProximo());
                return true;
            }
            Save = Save.getProximo();
        }
        
        return false;
        }
    }
    
    @Override
    public boolean search(int chave) {
        No Save;

        Save = inicio;
        if(Save.getValor() == chave){
            return true;
        }

        else{
            while(Save.getValor() != chave && Save.getProximo() != null){
                if(Save.getValor() == chave){
                    return true;
                }
                Save = Save.getProximo();
        }

        return false;
        }
    }

    @Override
    public int minimum() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int maximum() {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int sucessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    @Override
    public int prodessor(int chave) {
        // TODO Auto-generated method stub
        return 0;
    }
    
    public No getInicio(){
        return inicio;
    }

    
    public static void main(String[] args)
    {
        No Origem = ListaLigada.getInicio()
        
        // Origem = new No(0);

        // Origem.insert(2);


        
        
    
        // for (int i = 0; i < 100; i++) {
        //     System.out.println(i);
        //     if (i == 50){
        //         break;
        //     }
        // }
        // System.out.println("fim");
    }
}


