/*
Tamaño Grande - Dado un array, escribe una función que cambie todos los números positivos en él, por el string “big”. 
Ejemplo: grande([-1,3,5,-5]) devuelve [-1, “big”, “big”, -5].
*/

function tamanyoGrande(array){
    for(let i = 0; i < array.length; i++){
        if(array[i] > 0){
            array[i] = "big";
        }
    }
}

let array = [-1, 3, 5, -5];
tamanyoGrande(array);
console.log(array);