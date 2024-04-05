package br.ulbra.entity;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Numero {

    public ArrayList<Integer> numero;

    public Numero() {
        numero = new ArrayList();
    }

    //create - add
    public void salvar(int item) {
        numero.add(item);
        JOptionPane.showMessageDialog(null, "Salvo com Sucesso!");
    }

    //read - listar
    public String listar() {
        String res = "";
        if (!numero.isEmpty()) {
            for (int i = 0; i < numero.size(); i++) {
                res += ("Número - " ) + numero.get(i) + "\n";
            }

        } else {
            res = "Lista Vazia";
        }
        return res;

    }

    //delete
    public void excluir(int num) {
    if (numero.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Impossível excluir, a lista está vazia!");
    } else {
        if (num > 0 && num <= numero.size()) { // Ajuste aqui, permitindo que o índice comece em 0
            numero.remove(num-1); // Remova o "- 1" aqui
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!!");
        } else {
            JOptionPane.showMessageDialog(null, "Código não existe!");
        }
    }
}

    public void alterar(int num, int elemento) {
        if (!numero.isEmpty()) {
            if (num >= 0 && num <= numero.size()) {
                numero.set(num - 1, elemento);
                JOptionPane.showMessageDialog(null, "Alterado com sucesso!!");
            } else {
                JOptionPane.showMessageDialog(null, "Código não existe!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Impossível alterar, a lsita está vazia!");
        }
    }
    public void exibirMed (){
        int soma= 0;
        double med;
        int i= 0;
        while (i < numero.size()){
           soma += numero.get(i);
           i++;
        }
        med= soma/numero.size();
        JOptionPane.showMessageDialog(null, "a media dos numeros colocados é: "+med);
    }
    
    public void ord(){
        Collections.sort(numero);
        JOptionPane.showMessageDialog(null, "sua lista em ordem crescente: "+"\n"+numero);
        
    }
    
    public void search(int num){
        JOptionPane.showMessageDialog(null, "numero buscado: "+numero.get(num-1));
    }
    public void minMax(){
        int menor= Collections.min(numero);
        int maior= Collections.max(numero);
        JOptionPane.showMessageDialog(null, "numero minimo: "+menor+"\nnumero maximo: "+maior);
    }
}
