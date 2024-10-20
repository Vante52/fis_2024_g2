package org.musify.model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.sql.Date;

@Entity
@DiscriminatorValue("admin")
public class Administrador extends Usuario{

    public Administrador() {
    }

    public Administrador(String idUsuario, String nombres, String apellidos, String nickname, String contraseña,
                          String email, Date fechaNacimiento, Date fechaRegistro, String estado,
                         Integer paisIdPais, Integer idiomaIdIdioma, String fotoPerfilUrl) {

        super(idUsuario, nombres, apellidos, nickname, contraseña, email, fechaNacimiento, fechaRegistro, estado, paisIdPais, idiomaIdIdioma, fotoPerfilUrl);
    }

    @Override
    public void mostrarTipoUsuario() {
        System.out.println("Tipo de usuario: Administrador");
    }
}
