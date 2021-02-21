/** 
setTimeout(() => {
    console.log("Hola mundo");
}, 1000);
*/

const getUsuarioById = (id,callback) =>{
    const usuario={
        id,
        nombre:'Ricardo'
    }

    setTimeout(() => {
       callback(usuario);
    }, 1500);
}

getUsuarioById(10 , (usuario) =>{
    console.log(`Hola ${usuario.id}`);
    console.log(`Hola ${usuario.nombre.toUpperCase()}`);
});