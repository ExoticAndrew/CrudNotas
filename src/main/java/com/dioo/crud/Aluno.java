package com.dioo.crud;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Data
public class Aluno {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;

            private String nome;
            private Double nota1;
            private Double nota2;

public String getMedia() {
    double media = (nota1+nota2) / 2;
    return media >= 7 ? "Aprovado" : "Reprovado";

}
}
