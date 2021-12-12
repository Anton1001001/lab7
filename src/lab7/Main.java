package lab7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String s, st, sub, subt, smin = "", wrd = "", sl = "", delete;
        String[] s1;
        int n, n1, i, bord, min;

        System.out.println("Введите строку: ");
        Scanner in = new Scanner(System.in);
        s = in.nextLine();
        st = s.trim();
        s1 = st.split("");
        n = st.length() - 1;
        n1 = n;



        do {
        n--;
        }while (!s1[n].equals(" "));
        bord = n;



        do {
            n++;
            wrd = wrd + s1[n];
        }while (n < n1);


        min = st.length();
        i = 0;
        sub = "";
        delete = "th";
        do {

            if(!s1[i].equals(" ")){
                sl = sl + s1[i];
            }else{
                if ( !wrd.equals(sl) ){
                    if ( (min > sl.length()) && (sl.length() != 0) ){
                        min = sl.length();
                        smin = sl;
                    }

                     sl = sl.replace(delete, "");

                    if (sl.length() != 0) {
                    sub = sub + sl + " ";}
                }
                sl = "";
            }
          i++;
        }while(i <= bord);

        subt = sub.trim();
        System.out.println("Слово с минимальной  длинной и отличное от последнего: " + smin);
        System.out.println("Измененная строка: " + subt);



        }
    }

