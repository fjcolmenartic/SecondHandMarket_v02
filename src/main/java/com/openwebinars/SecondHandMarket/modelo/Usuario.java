package com.openwebinars.SecondHandMarket.modelo;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import java.util.Date;
import java.util.Objects;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class Usuario {

    @Id
    @GeneratedValue
    @Min(value=0)
    private long id;

    @NotEmpty
    private String nombre;

    @NotEmpty
    private String apellidos;
    private String avatar;

    @CreatedDate
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaAlta;

    @Email
    private String email;
    @NotEmpty
    private String password;

    public Usuario() {}

    public Usuario(long id, String nombre, String apellidos, String avatar, Date fechaAlta, String email, String password) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.avatar = avatar;
        this.fechaAlta = fechaAlta;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return id == usuario.id && nombre.equals(usuario.nombre) && apellidos.equals(usuario.apellidos) && avatar.equals(usuario.avatar) && fechaAlta.equals(usuario.fechaAlta) && email.equals(usuario.email) && password.equals(usuario.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, apellidos, avatar, fechaAlta, email, password);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", avatar='" + avatar + '\'' +
                ", fechaAlta=" + fechaAlta +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
