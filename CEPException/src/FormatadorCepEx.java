public class FormatadorCepEx {
    
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("05821080");
            System.out.println(cepFormatado);
    }
     catch(CepInvalidoException e){
        e.printStackTrace();
    }
}
    static String formatarCep(String cep) throws CepInvalidoException {

        if (cep.length() !=8)
        throw new CepInvalidoException();


        //simulando um cep formtado 
        return "05.821-080";
         
            
        


    }

}
