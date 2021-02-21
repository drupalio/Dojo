const deadpool = { 
    nombre  :'Wade',
    apellido : 'Wilson',
    poder :'Regeneración',
    edad: 50,
    getNombre(){
        return `${this.nombre} ${this.apellido}`
    }
}

//SIn destructuración
//const nombre=deadpool.nombre;
//const apellido=deadpool.apellido
//const poder=deadpool.poder;
//console.log(nombre,apellido,poder);

//con desestructuración
//const {nombre,apellido,poder,edad=0} =deadpool;
//console.log(nombre,apellido,poder,edad);

/** 
function imprimeHeroe(heroe){
    const {nombre,apellido,poder,edad=0} =heroe;
    console.log(nombre,apellido,poder,edad);
}
imprimeHeroe(deadpool);
**/
function imprimeHeroe({nombre,apellido,poder,edad=0}){
    nombre='Ricardo'
    console.log(nombre,apellido,poder,edad);
}

imprimeHeroe(deadpool);

//Desestructuracion de arreglos
//Sin desestructurar
/** 
const heroes = ['Deadpool','Superman','Batman'];
const h1=heroes[0];
const h2=heroes[1]
const h3=heroes[2]
console.log(h1,h2,h3);
*/

//con desestructuracion
const heroes = ['Deadpool','Superman','Batman'];
const [ , ,h3]=heroes;

console.log(h3);