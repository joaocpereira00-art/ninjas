package br.com.etec.ninjas.model;

import org.hibernate.validator.constraints.br.CPF;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
@Valid
@Table (name = "ninja")
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_ninja;
    @Column(name = "nome_ninja", nullable = false)
    @NotBlank(message = "Nome é obrigatório.")
    @Size (min = 3, max = 225, message = "Nome deve ter entre 3 e 225 caracteres.")
    private String nome;
    @Column(name = "cpf_ninja", nullable = false, unique = true)
    @CPF
    private String cpf;
    @Column(name = "email_ninja", nullable = false, unique = true)
    @Email(message = "Email inválido.!" )
    private String email;
    
}