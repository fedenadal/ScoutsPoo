package com.scoutspoo.scoutspoo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "scouts")
public class Scout {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long codigo;

    @Column(nullable = false)
    private String apodo;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String graduacion;
    
//    private Grupo grupo;
//    private Sede sede;
//    private Comunidad comunidad;

    //Para usar en caso de usar SpringSecurity
//    @Column(name = "is_enabled")
//    private boolean isEnabled;
//
//    @Column(name = "account_no_expired")
//    private boolean accountNoExpired;
//
//    @Column(name = "account_no_locked")
//    private boolean accountNoLocked;
//
//    @Column(name = "credential_no_expired")
//    private boolean credentialNoExpired;

}
