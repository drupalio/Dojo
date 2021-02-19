console.log("inicio");

setTimeout(() => {
    console.log("primer timer out ");
},3000);

setTimeout(() => {
    console.log("segundo timer out ");
},0);


setTimeout(() => {
    console.log("tercero timer out ");
},0);

console.log("fin");