public class ListaLigada implements EstruturaDeDados{
    public No inicio;
    public int MenorDeTodos = 0;

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
        No temporário = inicio;

        if(inicio == null){
            inicio = new No(chave);
            
            return true;
        }

        else if(inicio.getProximo() == null)
        {
            this.inicio.setProximo(new No(chave)); 
            return true;
        }

        else
        {
            while(temporário.getProximo() != null)
            {
                temporário = temporário.getProximo();
                if(temporário.getProximo() == null){
                    temporário.setProximo(new No(chave));
                    return true;
                }
            } 
            return false;
        }
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
        No Save = inicio;

        if(inicio.getValor() == chave){
            inicio = inicio.getProximo();
            return true;
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
    public boolean search(int chave)
    {
        No Save = inicio;

        if(Save.getValor() == chave){
            return true;
        }

        else{
            while(Save.getValor() != chave && Save.getProximo() != null){

                Save = Save.getProximo();
                if(Save.getValor() == chave){
                    return true;
                }
        }
        return false;
        }
    }

    @Override
    public int minimum(){
        No Save = inicio;
        int minimo = Save.getValor();

        while(Save.getProximo() != null){
            Save = Save.getProximo();
            if(Save.getValor() < minimo){
                minimo = Save.getValor();
            }
        }
        return minimo;
    }
    
    @Override
    public int maximum() {
                No Save = inicio;
        int maximo = Save.getValor();

        while(Save.getProximo() != null){
            Save = Save.getProximo();
            if(Save.getValor() > maximo){
                maximo = Save.getValor();
            }
        }
        return maximo;
    }
    
    @Override
    public int sucessor(int chave) {
        No Procurado = searchEspecifico(chave);
        if (Procurado.getValor() == chave && Procurado.getProximo() != null){
            return Procurado.getProximo().getValor();
        }
        
        return -1;
    }
    
    @Override
    public int prodessor(int chave) {
        if(inicio.getValor() == chave){
            return -1;
        }

        No Save = inicio;
        No Proximo = searchEspecifico(chave);

        while(Save.getProximo() != null){

            if(Save.getProximo() == Proximo){
                return Save.getValor();
            }
        }
        return -1;
    }

    public No searchEspecifico(int chave)
    {
        No Save = inicio;

        if(Save.getValor() == chave){
            return Save;
        }

        else{
            while(Save.getValor() != chave && Save.getProximo() != null){
                Save = Save.getProximo();
                if(Save.getValor() == chave){
                    return Save;
                }
        }
        return null;
        }
    }
    

    public static void main(String[] args)
    {
        ListaLigada Começo = new ListaLigada();
        
        Começo.insert(0);
        Começo.insert(1);
        Começo.insert(2);
        Começo.insert(3);

        Começo.delete(1);
        System.out.println(Começo.prodessor(0));
        
        
    }
}


