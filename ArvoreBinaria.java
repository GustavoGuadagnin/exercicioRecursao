/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
FEITO EM DUPLA COM MEU AMIGO VINICIUS GUIDOTTI, COM AUTORIZACAO DO PROF.
*/
package arvorebinaria;
import java.util.Scanner;


public class ArvoreBinaria {
 
public static int busca_binaria(int dado[],int x, int inferior,int superior){
    int meio;
    if(inferior>superior){
        return -1;
    }
    meio = (inferior + superior)/2;
    if(x == dado[meio]){
      return meio;
    }
    if(x<dado[meio]){
        return busca_binaria(dado,x,inferior,meio-1);
    }
    else{
        return busca_binaria(dado,x,meio+1,superior);
    }
}

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dado[] = new int[6];
        for(int i =0;i<6;i++){
            dado[i] = i+1;
        }
        int valor;
        System.out.println("Qual dado voce deseja buscar?\n");
        valor = scan.nextInt();
        int inf = 0;
        int sup = dado.length-1;
        int funcao = (busca_binaria(dado,valor,inf,sup));
        if(funcao == -1){
            System.out.println("O Numero nao existe no vetor");
        }
        else{
            System.out.println("Numero encontrado, indice: "+funcao);
        }
        
    }
    
}
