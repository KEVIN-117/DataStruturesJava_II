package N_12_LinkedList_to_Users_Tours;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Node header = null;
        int N = input.nextInt();
        for (int i = 0; i < N; i++) {
            if (header == null){
                header = new Node(new Users(input.next().toUpperCase(), input.nextInt(), input.next().toUpperCase(), input.next().toUpperCase(), input.next().toUpperCase(), input.next().toUpperCase()));
            }else{
                Node temp = new Node(new Users(input.next().toUpperCase(), input.nextInt(), input.next().toUpperCase(), input.next().toUpperCase(), input.next().toUpperCase(), input.next().toUpperCase()));
                temp.linked = header;
                header = temp;
            }
        }

        boolean isTrue = true;
        while (isTrue){
            System.out.println(FontsColor.morado+">>Please Choose a optyon<<".toUpperCase());
            System.out.println(FontsColor.naranja+"1.-Print everybody datas" +
                    FontsColor.celeste+"\n2.-Print the data of the user who is older"+
                    FontsColor.morado+"\n3.-Print the data of the minor user."+
                    FontsColor.celeste+"\n4.-Print data for Gender"+
                    FontsColor.naranja+"\n5.-Print data in alphabetical order"+
                    FontsColor.rojo+"\n0.-Exit The Program");
            int caso = input.nextInt();
            Node aux = header;
            switch (caso){
                case 0:
                    System.out.println(FontsColor.azul+"The process is over. Thank you for using our services. :)");
                    isTrue = false;
                    break;
                case 1:
                    while (aux != null){
                        System.out.println(aux.Data.printData());
                        aux = aux.linked;
                    }
                    break;
                case 2:
                    int bigerAge = 0;
                    Users seniorUser = null;
                    while (aux != null){
                        if (aux.Data.setAge() > bigerAge){
                            bigerAge = aux.Data.setAge();
                            seniorUser = aux.Data;
                        }
                        aux = aux.linked;
                    }
                    System.out.println(seniorUser.printData() + " ");
                    break;
                case 3:
                    int smallerAge = 500;
                    Users minorUser = null;
                    while (aux != null){
                        if (aux.Data.setAge() < smallerAge){
                            smallerAge = aux.Data.setAge();
                            minorUser = aux.Data;
                        }
                        aux = aux.linked;
                    }
                    System.out.println(minorUser.printData() + " ");
                    break;
                case 4:
                    System.out.println(FontsColor.morado+"1.-Print data to gender Female" + FontsColor.celeste+"\n2.-Print data to gender Male");
                    int caseGender = input.nextInt();
                    switch (caseGender){
                        case 1:
                            while (aux != null){
                                if (aux.Data.getGender().equals(FontsColor.morado+"FEMALE")){
                                    System.out.println(aux.Data.printData());
                                }
                                aux = aux.linked;
                            }
                            break;
                        case 2:
                            while (aux != null){
                                if (aux.Data.getGender().equals(FontsColor.azul+"MALE")){
                                    System.out.println(aux.Data.printData());
                                }
                                aux = aux.linked;
                            }
                            break;

                    }
                    break;
                case 5:
                    String[] names = new String[N];
                    int index = 0;
                    while (aux!= null){
                        names[index] = String.valueOf(aux.Data.getName());
                        index++;
                        aux = aux.linked;
                    }
                    Arrays.sort(names);
                    break;
            }
        }
    }
}
/*
male 102165 Kevin Rodriguez 17/12/2001 estudent
female 125369 Lorena cruz 4/5/1999 estudent
female 12444 Dona Dona 14/10/2000 Enginner
 */