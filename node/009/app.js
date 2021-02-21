const empleados = [
    {
        id:1,
        nombre:'Ricardo'
    },
    {
        id:2,
        nombre:'Jose'
    },
    {
        id:3,
        nombre:'Karen'
    },
]

const salarios =[ 
    {
        id:1,
        salario:1500
    },
    {
        id:2,
        salario:2500
    },
]

const getEmpleado=( id ,callback) => {
    const empleado= empleados.find(e => e.id=== id);
    if(empleado){
        callback(null,empleado)
    }
    else{ 
        callback(`El empleado ${ id} no existe`) 
    }
}

getEmpleado(1,(err,empleado) => {
    if(err){ 
        console.log('Error');
        return console.log(err)
    } 

    console.log('empleado existe');
    console.log(empleado)
});

getEmpleado(10,(err,empleado) => {
    if(err){ 
        console.log('Error');
        return console.log(err)
    } 

    console.log('empleado existe');
    console.log(empleado)
});