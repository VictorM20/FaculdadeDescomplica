function Enviar(){
    const valor1 = Number(document.getElementById('valor1').value);
    const valor2 = Number(document.getElementById('valor2').value);

    const resultado = valor1 + valor2
    
    

    if(resultado > 10){
        document.getElementById('resultado-output').innerHTML = 'Resultado: '+  resultado + 'Valor acima de 10'
    }
    else{
        document.getElementById('resultado-output').innerHTML = 'Resultado: '+  resultado + "Valor abaixo de 10"
    } 

}