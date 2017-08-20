function botao(num)
{
    document.getElementById('calc-result').value += num;
}

function limpar()
{
    document.getElementById('calc-result').value = '';
}

function calcula()
{
    var resultado = 0;
    resultado = document.getElementById('calc-result').value;
    document.getElementById('calc-result').value = '';
    document.getElementById('calc-result').value = eval(resultado);
}