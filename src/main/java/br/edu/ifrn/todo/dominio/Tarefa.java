/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.todo.dominio;

import java.util.Date;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


/**
 *
 * @author italo
 */

@Getter
@Setter
@Builder
@EqualsAndHashCode
public class Tarefa {
   private Date prazo;
   private Date data;
   private String nome;
   private int prioridade;
   private boolean concluida;   
    
}
