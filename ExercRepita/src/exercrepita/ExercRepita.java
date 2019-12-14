package exercrepita;

import javax.swing.JOptionPane;

public class ExercRepita {

    public static void main(String[] args) {
        int n = 0, media = 0, cont = 0, par = 0, impar = 0,maior = 0, tot = 0;
        do{
           n = Integer.parseInt (JOptionPane.showInputDialog("<html>Informe o numero: <hr>(0 encerra)</html>"));
           if(n % 2 == 0 && n != 0){
               par += 1;               
           }else if(n % 2 != 0 && n != 0){
               impar +=1;
           }
           if(n >= 100){
               maior +=1;
           }
           media += n;
           if(n != 0){
               tot++;
           }
        }while(n != 0);
            JOptionPane.showMessageDialog(null, "<html>Resultado:<hr>Total de valores: "+tot+"<br>total de pares: "+par+"<br>total de impares: "+impar+"<br>acima de 100: "+maior+"<br>media: "+(media/tot)+"</html>");
    }
    
}
