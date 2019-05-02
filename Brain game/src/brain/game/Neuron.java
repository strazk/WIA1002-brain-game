/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain.game;

/**
 *
 * @author Admin
 */
public class Neuron <E>{
    
    E element;
    Neuron <E> next;
    Neuron <E> prev;
    
    public Neuron(){
        element=null;
        next=null;
        prev=null;
    }
    public Neuron (E item){
        element=item;
        next=null;
        prev=null;
    }
   }

