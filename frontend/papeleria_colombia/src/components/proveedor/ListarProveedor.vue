<template>
    <div>
        
    </div>
</template>

<script>
import axios from 'axios';

export default {
    name:'ListarProveedor',
    props:{
        proveedor:{
            type:{Array}
        }, 
    },

    methods: {
        eliminar(id_provedor){
            axios
            .delete('http://localhost:3000/api/proveedor/' + id_proveedor)
            .then((data)=>{
                console.log('res',data)
            })

            console.log(id_provedor);
        }
    },

}
</script>