import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Exercices {
    public List exercice1(List<String> liste){
        List<String> toList=liste.stream()
                .map((n)->n.toUpperCase())
                .collect(Collectors.toList());
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une nouvelle liste
        dont tous les éléments sont en majuscules
         */
        return toList;
    }

    public List exercice2(List<String> liste){
        List<String> toList=liste.stream()
                .filter((n)->!n.equals("INUTILE"))
                .collect(Collectors.toList());
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une nouvelle liste
        dont les string "INUTILE" ont été retirées
         */
        return toList;
    }

    public String exercice3(List<String> liste){
        String resultat=liste.stream()
                .reduce((acc,nouveau)->acc+nouveau)
                .get();
        /*
        Utilisez les streams sur la liste en paramètre pour retourner une string composée
        de toutes les string de la liste concaténées
         */
        return resultat;
    }


    public String exercice4(List<String> liste){
        List<String> toList=liste.stream()
                .map((n)->n.toUpperCase())
                .collect(Collectors.toList());
        toList=toList.stream()
                .filter((n)->!n.equals("AAA"))
                .collect(Collectors.toList());
        String resultat=toList.stream()
                .reduce((acc,nouveau)->acc+nouveau)
                .get();
        /*
        Utilisez les streams pour transformer la liste en paramètre de la façon suivante:
        1. Mettre tous les éléments de la liste en majuscule
        2. Retirer tous les éléments "AAA"
        3. Concaténer tous les éléments de la liste pour former une string
         */
        return resultat;
    }

    public List exercice5(List<Integer> liste){
        List<Integer> toList=liste.stream()
                .map((n)->n*2)
                .collect(Collectors.toList());
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner une nouvelle liste
        dont les éléments ont été doublés
         */
        return toList;
    }

    public Integer exercice6(List<Integer> liste){
        Integer resultat=liste.stream()
                .reduce((acc,nouveau)->acc*nouveau)
                .get();
        /*
        Utilisez les streams sur la liste en paramètre afin de retourner le produit des éléments de la liste.
         */
        return resultat;
    }

    public List exercice7(List<Integer> liste){
        List<Integer> toList=liste.stream()
                .filter((n)->n*n>50)
                .collect(Collectors.toList());
        /*
        Utilisez les streams pour trouver tous les éléments dont le carré est supérieur à 50. Retournez une liste.
         */
        return toList;
    }

    public List exercice8(List<Integer> liste){
        List<Character> toList=liste.stream()
                .map((n)->n*9)
                .map((n)->n.toString())
                .map((n)->n.charAt(0))
                .collect(Collectors.toList());
        /*
        Utilisez les streams pour trouver le premier chiffre des nombres de la liste passée en paramètre lorsqu'on
         les multiplie par 9.
         */
        return toList;
    }

    public List exercice9(){
        List<Integer> liste=IntStream.iterate(1,(n)->n+1)
                .filter((n)->n%3==0&&n%7==0)
                .limit(10)
                .boxed()
                .collect(Collectors.toList());
        /*
        Créez un stream infini d'entiers et utilisez le pour trouver les 10 premiers nombres divisibles par 3 et par 7.
         */
        return liste;
    }

    public List exercice10(){
        List<Integer> liste=IntStream.iterate(1,(n)->n+1)
                .map((n)->n*n)
                .limit(20)
                .boxed()
                .collect(Collectors.toList());
        /*
        Générez la liste des 20 premiers carrés parfaits grâce à un stream infini.
         */
        return liste;
    }
}
