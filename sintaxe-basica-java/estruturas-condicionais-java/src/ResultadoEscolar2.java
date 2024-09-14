public class ResultadoEscolar2 {
    public static void main(String[] args) {
        int nota = 6;
        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota < 7 ? "Recuperação" : "Reprovado";
        System.out.println(resultado);

    } /*
       * Em suma: a variável resultado, recebe as condições: SE nota maior ou igual a
       * 7, aprovado. SE (SE NÃO/ELSE IF), a nota fot maior ou igual a 5, e menor ou
       * iugal a 7, Recuperação. SE NÃO, "Reprovado". O uso de "?" define as
       * estruturas if/else if.
       */
}