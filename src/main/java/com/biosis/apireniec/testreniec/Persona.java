package com.biosis.apireniec.testreniec;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "persona")
public class Persona {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "dni") @NotNull
    private String dni;
    @Column(name = "nombres") @NotNull
    private String nombres;
    @Column(name = "apellidopaterno") @NotNull
    private String apellidopaterno;
    @Column(name = "apellidomaterno")
    private String apellidomaterno;

    public Persona() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidopaterno() {
        return apellidopaterno;
    }

    public void setApellidopaterno(String apellidopaterno) {
        this.apellidopaterno = apellidopaterno;
    }

    public String getApellidomaterno() {
        return apellidomaterno;
    }

    public void setApellidomaterno(String apellidomaterno) {
        this.apellidomaterno = apellidomaterno;
    }
}
