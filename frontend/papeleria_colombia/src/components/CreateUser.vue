<template>
    <div class="container">
        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h1 class="modal-title fs-5" id="exampleModalLabel">Modal title</h1>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">

                        <form @submit="guardar">
                            <div class="mb-3">
                                <label for="id_usuario" class="form-label">id</label>
                                <input type="number" name="id_usuario" class="form-control" id="id_usuario"
                                    aria-describedby="emailHelp">
                                <div id="emailHelp" class="form-text">Ingrese el id</div>
                            </div>
                            <div class="mb-3">
                                <label for="nombre" class="form-label">Nombre</label>
                                <input type="text" class="form-control" id="nombre">
                            </div>
                            <div class="mb-3">
                                <label for="fecha_nacimiento" class="form-label">Fecha de nacimiento</label>
                                <input type="date" class="form-control" id="fecha_nacimiento">
                            </div>
                            <div class="mb-3">
                                <label for="direccion" class="form-label">Direccion</label>
                                <input type="text" class="form-control" id="direccion">
                            </div>
                            <div class="mb-3">
                                <label for="cedula" class="form-label">Cedula</label>
                                <input type="number" class="form-control" id="cedula">
                            </div>
                            <div class="mb-3">
                                <label for="celular" class="form-label">Celular</label>
                                <input type="number" class="form-control" id="celular">
                            </div>
                            <div class="mb-3">
                                <label for="correo" class="form-label">Correo</label>
                                <input type="email" class="form-control" id="correo">
                            </div>
                           <!--  <div class="mb-3">
                                <label for="id_ciudad" class="form-label">Ciudad</label>
                                <input type="number" class="form-control" id="id_ciudad">
                            </div> -->
                            <div class="mb-3">
                                <label for="pass" class="form-label">Contraseña</label>
                                <input type="password" class="form-control" id="pass">
                            </div>
                            <div class="mb-3">
                                <label for="estado" class="form-label">Estado</label>
                                <input type="text" class="form-control" id="estado">
                            </div>
                             <!-- <div class="mb-3">
                                <label for="id_roles" class="form-label">Rol</label>
                                <input type="text" class="form-control" id="id_roles">
                            </div>  -->
                            <div class="mb-3 form-check">
                                <input type="checkbox" class="form-check-input" id="exampleCheck1">
                                <label class="form-check-label" for="exampleCheck1">Check me out</label>
                            </div>
                            <div class="modal-footer">
                                <button type="button" class="btn btn-secondary"
                                    data-bs-dismiss="modal">Cancelar</button>
                                <button type="submit" class="btn btn-success">Guardar</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
import axios from "axios";

export default {
    name: "CreateUser",
    data: function () {
        return {
            usuario: {
                id_usuario: "",
                nombre: "",
                fecha_nacimiento: "",
                direccion: "",
                cedula: "",
                celular: "",
                correo: "",
                //id_ciudad: "",
                pass: "",
                estado: "",
                //id_roles: ""
            },
        };
    },
    methods: {
        guardar() {
            axios
                .post('http://localhost:3000/api/usuario', this.usuario)
                .then((data) => {
                    console.log('res', data);
                    this.$emit("refresh");
                });
        },
/* 
        eliminar(id) {
            axios
                .delete('http://localhost:3000/api/usuario/' + id)
                .then((data) => {
                    console.log('res', data);
                    this.usuario.id_usuario = null;
                    this.$emit("refresh");
                })
                .catch(() => {
                    alert("Usuario no existe");
                });
            console.log(id);
        }, */

    },
};
</script>